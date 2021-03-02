/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.CidadeDAO;
import DAO.ClienteDAO;
import DAO.EstadoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadastroCliente;

/**
 *
 * @author Guilherme
 */
public class CadastroClienteController {

    private model.ClienteModel model_cliente;
    private view.CadastroCliente view_cadcliente;
    private DAO.ClienteDAO dao_cliente;
    private DAO.EstadoDAO dao_estado;
    private DAO.CidadeDAO dao_cidade;

    public CadastroClienteController() throws ParseException, SQLException {
        this.view_cadcliente = new CadastroCliente();
        this.dao_cliente = new ClienteDAO();
        this.dao_estado = new EstadoDAO();
        this.dao_cidade = new CidadeDAO();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        view_cadcliente.desenharTela();
        view_cadcliente.preencheComboBoxEstado(dao_estado.listaEstados());
        view_cadcliente.preencheComboBoxCidade(dao_cidade.listaCidades(view_cadcliente.retornaIndiceComboEstado()));
        view_cadcliente.preencherDataCadastro(dateFormat.format(date));

        view_cadcliente.addGravarListener(new GravarListener());
        view_cadcliente.addCancelarListener(new CancelarListener());
        view_cadcliente.addSairListener(new SairListener());
        view_cadcliente.addSelecionarTipoPessoaListener(new SelecionarTipoPessoaListener());
        view_cadcliente.addSelecionarEstadoListener(new SelecionarEstadoListener());
    }

    //Selecionar cliente especifico
    public CadastroClienteController(int id) throws ParseException, SQLException {
        this.view_cadcliente = new CadastroCliente();
        this.dao_cliente = new ClienteDAO();
        this.dao_estado = new EstadoDAO();
        this.dao_cidade = new CidadeDAO();

        model_cliente = dao_cliente.consultarClienteEspecifico(id);
        view_cadcliente.desenharTela();
        view_cadcliente.preencheTxts(model_cliente);
        view_cadcliente.preencheComboBoxEstado(dao_estado.listaEstados());
        view_cadcliente.preencheComboBoxCidade(dao_cidade.listaCidades(view_cadcliente.retornaIndiceComboEstado()));

        view_cadcliente.addSelecionarEstadoListener(new SelecionarEstadoListener());
        view_cadcliente.addGravarListener(new AlterarListener());
        // view_cadcliente.addCancelarListener(new CancelarListener());
        view_cadcliente.addSairListener(new SairListener());
        view_cadcliente.addSelecionarTipoPessoaListener(new SelecionarTipoPessoaListener());

        view_cadcliente.selecionaEstadoCliente(model_cliente.getCod_estado());
        view_cadcliente.alteraCidadeCliente(model_cliente.getCod_cidade());

    }

    class GravarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                model_cliente = view_cadcliente.getCadastroCliente();
                dao_cliente.gravarCliente(model_cliente);
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                view_cadcliente.limparTXT();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    class CancelarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_cadcliente.limparTXT();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                control.ConsultaClienteController cons = new ConsultaClienteController();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view_cadcliente.fecharJanela();
        }

    }

    class SelecionarTipoPessoaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (view_cadcliente.SelecionarTipoPessoa() == 1) {
                try {
                    view_cadcliente.PessoaJuridica();
                } catch (ParseException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (view_cadcliente.SelecionarTipoPessoa() == 0) {
                try {
                    view_cadcliente.PessoaFisica();
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
                int index = view_cadcliente.retornaIndiceComboEstado();
                try {
                    view_cadcliente.preencheComboBoxCidade(dao_cidade.listaCidades(index));
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                model_cliente = view_cadcliente.getCadastroCliente();
                dao_cliente.alterarCliente(model_cliente);
                JOptionPane.showMessageDialog(null, "Cliente Alterado", "Confirmação de Alteração", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
