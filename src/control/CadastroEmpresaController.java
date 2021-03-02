package control;

import DAO.CidadeDAO;
import DAO.EmpresaDAO;
import DAO.EstadoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadEmpresa;

public class CadastroEmpresaController {

    view.CadEmpresa view_cadempresa;
    DAO.EmpresaDAO dao_empresa;
    DAO.EstadoDAO dao_estado;
    DAO.CidadeDAO dao_cidade;
    model.EmpresaModel model_empresa;

    public CadastroEmpresaController() throws ParseException, SQLException {

        dao_empresa = new EmpresaDAO();
        dao_estado = new EstadoDAO();
        dao_cidade = new CidadeDAO();
        view_cadempresa = new CadEmpresa();
        view_cadempresa.desenharTela();
        view_cadempresa.preencheComboBoxEstado(dao_estado.listaEstados());
        view_cadempresa.preencheComboBoxCidade(dao_cidade.listaCidades(view_cadempresa.retornaIndiceComboEstado()));

        view_cadempresa.addSelecionarEstadoListener(new SelecionarEstadoListener());
        view_cadempresa.addGravarListener(new GravarListener());

    }

    CadastroEmpresaController(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    class SelecionarEstadoListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = view_cadempresa.retornaIndiceComboEstado();
                try {
                    view_cadempresa.preencheComboBoxCidade(dao_cidade.listaCidades(index));
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
    
     class GravarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model_empresa = view_cadempresa.getCadastroEmpresa();
            try {
                dao_empresa.gravarEmpresa(model_empresa);
                 JOptionPane.showMessageDialog(null, "Empresa Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroEmpresaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
    }
     
    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                model_empresa = view_cadempresa.getCadastroEmpresa();
                dao_empresa.alterarEmpresa(model_empresa);
                JOptionPane.showMessageDialog(null, "Empresa Alterada", "Confirmação de Alteração", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

} 


