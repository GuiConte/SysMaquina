/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.ClienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.ConsultaCliente;

/**
 *
 * @author Guilherme
 */
public class ConsultaClienteController {

    private view.ConsultaCliente view_conscliente;
    private DAO.ClienteDAO dao_cliente;
    private ResultSet clientes;

    public ConsultaClienteController() throws SQLException {
        this.view_conscliente = new ConsultaCliente();
        this.dao_cliente = new ClienteDAO();
        clientes = dao_cliente.consultarTodosClientes();
        view_conscliente.desenharTela();
        view_conscliente.addAlterarListener(new AlterarListener());
        view_conscliente.addExcluirListener(new ExcluirListener());
        view_conscliente.addNovoListener(new NovoListener());
        view_conscliente.addSairListener(new SairListener());
        view_conscliente.preencherTabela(clientes);
    }

    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_conscliente.obterIdCliente();
            if (id != -1) {
                try {
                    control.CadastroClienteController cadastro = new CadastroClienteController(id);
                } catch (ParseException ex) {
                    Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view_conscliente.fecharTela();
            }
        }

    }

    class ExcluirListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_conscliente.obterIdCliente();
            if (id != -1) {
                if (JOptionPane.showConfirmDialog(null, "Deseja excluir o cliente?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        dao_cliente.exclusaoLogica(id);
                        JOptionPane.showMessageDialog(null, "Cliente Excluido", "Exclusão de Cliente", JOptionPane.INFORMATION_MESSAGE);
                        clientes = dao_cliente.consultarTodosClientes();
                        view_conscliente.preencherTabela(clientes);
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
            }
        }
    }

    class NovoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                control.CadastroClienteController cadastro = new CadastroClienteController();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view_conscliente.fecharTela();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_conscliente.fecharTela();
        }

    }

}
