/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.CidadeDAO;
import DAO.EstadoDAO;
import DAO.ProdutorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadProdutor;

/**
 *
 * @author Guilherme
 */
public class CadastroProdutorController {

    private model.ProdutorModel model_produtor;
    private model.Conta_ProdutorModel model_conta_produtor;
    private ArrayList<model.Conta_ProdutorModel> contasBancarias;
    private view.CadProdutor view_cadprodutor;
    private DAO.ProdutorDAO dao_produtor;
    private DAO.EstadoDAO dao_estado;
    private DAO.CidadeDAO dao_cidade;

    public CadastroProdutorController() throws ParseException, SQLException {
        this.view_cadprodutor = new CadProdutor();
        this.dao_produtor = new ProdutorDAO();
        this.dao_estado = new EstadoDAO();
        this.dao_cidade = new CidadeDAO();

        view_cadprodutor.desenharTela();

        view_cadprodutor.preencheComboBoxEstado(dao_estado.listaEstados());
        view_cadprodutor.preencheComboBoxCidade(dao_cidade.listaCidades(view_cadprodutor.retornaIndiceComboEstado()));

        view_cadprodutor.addGravarListener(new GravarListener());
        view_cadprodutor.addCancelarListener(new CancelarListener());
        view_cadprodutor.addSairListener(new SairListener());
        view_cadprodutor.addSelecionarTipoPessoaListener(new SelecionarTipoPessoaListener());
        view_cadprodutor.addSelecionarEstadoListener(new SelecionarEstadoListener());

        view_cadprodutor.iniciarListaContasBancarias();

        view_cadprodutor.addGravarBancoListener(new GravarBancoOnCreateListener());
        view_cadprodutor.addCancelarBancoListener(new CancelarBancoListener());
        view_cadprodutor.addAlterarBancoListener(new AlterarBancoOnCreateListener());
        view_cadprodutor.addExcluirBancoListener(new ExcluirBancoOnCreateListener());
        view_cadprodutor.addClickTableListener(new ClickTableListener());
    }

    //Selecionar cliente especifico
    public CadastroProdutorController(int id) throws ParseException, SQLException {
        this.view_cadprodutor = new CadProdutor();
        this.dao_produtor = new ProdutorDAO();
        this.dao_estado = new EstadoDAO();
        this.dao_cidade = new CidadeDAO();

        model_produtor = dao_produtor.consultarProdutorEspecifico(id);
        contasBancarias = dao_produtor.consultarContasProdutorEspecifico(id);
        view_cadprodutor.desenharTela();

        view_cadprodutor.preencheTxts(model_produtor);
        view_cadprodutor.preencheComboBoxEstado(dao_estado.listaEstados());
        view_cadprodutor.preencheComboBoxCidade(dao_cidade.listaCidades(view_cadprodutor.retornaIndiceComboEstado()));
        view_cadprodutor.preencherTabela(contasBancarias);

        view_cadprodutor.addSelecionarEstadoListener(new SelecionarEstadoListener());
        view_cadprodutor.addGravarListener(new AlterarListener());
        // view_cadcliente.addCancelarListener(new CancelarListener());
        view_cadprodutor.addSairListener(new SairListener());
        view_cadprodutor.addSelecionarTipoPessoaListener(new SelecionarTipoPessoaListener());
        view_cadprodutor.addClickTableListener(new ClickTableListener());

        view_cadprodutor.selecionaEstadoProdutor(model_produtor.getCod_estado());
        view_cadprodutor.alteraCidadeProdutor(model_produtor.getCod_cidade());

        view_cadprodutor.addGravarBancoListener(new GravarBancoOnUpdateListener());
        view_cadprodutor.addCancelarBancoListener(new CancelarBancoListener());
        view_cadprodutor.addAlterarBancoListener(new AlterarBancoOnUpdateListener());
        view_cadprodutor.addExcluirBancoListener(new ExcluirBancoOnUpdateListener());

    }

    class GravarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                model_produtor = view_cadprodutor.getCadastroProdutor();
                contasBancarias = view_cadprodutor.getContasBancarias();
                int id = dao_produtor.consultarID();
                dao_produtor.gravarProdutor(model_produtor);
                Iterator<model.Conta_ProdutorModel> it = contasBancarias.iterator();
                while (it.hasNext()) {
                    model.Conta_ProdutorModel conta = it.next();
                    dao_produtor.gravarContas(id, conta);
                }
                JOptionPane.showMessageDialog(null, "Produtor Cadastrado", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                view_cadprodutor.limparTXT();
                view_cadprodutor.limpaTxtContasBancos();
                view_cadprodutor.limparTabela();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    class CancelarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadprodutor.limparTXT();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                control.ConsultaProdutorController cons = new ConsultaProdutorController();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view_cadprodutor.fecharJanela();
        }

    }

    class SelecionarTipoPessoaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (view_cadprodutor.SelecionarTipoPessoa() == 1) {
                try {
                    view_cadprodutor.PessoaJuridica();
                } catch (ParseException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (view_cadprodutor.SelecionarTipoPessoa() == 0) {
                try {
                    view_cadprodutor.PessoaFisica();
                } catch (ParseException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    class SelecionarEstadoListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = view_cadprodutor.retornaIndiceComboEstado();
                try {
                    view_cadprodutor.preencheComboBoxCidade(dao_cidade.listaCidades(index));
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                model_produtor = view_cadprodutor.getCadastroProdutor();
                dao_produtor.alterarProdutor(model_produtor);
                JOptionPane.showMessageDialog(null, "Produtor Alterado", "Confirmação de Alteração", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    class GravarBancoOnCreateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadprodutor.adicionarContaBancaria();
            view_cadprodutor.limpaTxtContasBancos();
        }

    }

    class GravarBancoOnUpdateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                dao_produtor.gravarContas(view_cadprodutor.obterIdProdutor(), view_cadprodutor.getConta_Produtor());
                view_cadprodutor.limparTabela();
                contasBancarias = dao_produtor.consultarContasProdutorEspecifico(view_cadprodutor.obterIdProdutor());
                view_cadprodutor.preencherTabela(contasBancarias);
                view_cadprodutor.limpaTxtContasBancos();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutorController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    class CancelarBancoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadprodutor.limpaTxtContasBancos();
        }

    }

    class AlterarBancoOnCreateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadprodutor.alterarContaBancaria(view_cadprodutor.obterIndiceLinhaBanco());
            view_cadprodutor.limparTabela();
            try {
                view_cadprodutor.preencherTabela(view_cadprodutor.retornarContasBancarias());
                view_cadprodutor.limpaTxtContasBancos();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    class AlterarBancoOnUpdateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (view_cadprodutor.obterIndiceLinhaBanco() != -1) {
                model_conta_produtor = contasBancarias.get(view_cadprodutor.obterIndiceLinhaBanco());
                int id = model_conta_produtor.getCod_produtor_conta();
                model_conta_produtor = view_cadprodutor.getConta_Produtor();
                try {
                    dao_produtor.alterarConta(id, model_conta_produtor);
                    view_cadprodutor.limparTabela();
                    contasBancarias = dao_produtor.consultarContasProdutorEspecifico(view_cadprodutor.obterIdProdutor());
                    view_cadprodutor.preencherTabela(contasBancarias);
                    view_cadprodutor.limpaTxtContasBancos();
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutorController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    class ExcluirBancoOnCreateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadprodutor.removerContaBancaria();
        }

    }

    class ExcluirBancoOnUpdateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            model_conta_produtor = contasBancarias.get(view_cadprodutor.obterIndiceLinhaBanco());
            int id = model_conta_produtor.getCod_produtor_conta();
            try {
                dao_produtor.excluirConta(id);
                view_cadprodutor.limparTabela();
                contasBancarias = dao_produtor.consultarContasProdutorEspecifico(view_cadprodutor.obterIdProdutor());
                view_cadprodutor.preencherTabela(contasBancarias);
                view_cadprodutor.limpaTxtContasBancos();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    class ClickTableListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            view_cadprodutor.preencherTxtsBancos();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }
}
