/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.ClienteDAO;
import DAO.ProdutorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.ConsultaProdutorFornecedor;

/**
 *
 * @author Guilherme
 */
public class ConsultaProdutorController {
    private view.ConsultaProdutorFornecedor view_consprodutor;
    private DAO.ProdutorDAO dao_produtor;
    private ResultSet produtor;

    public ConsultaProdutorController() throws SQLException {
        this.view_consprodutor = new ConsultaProdutorFornecedor();
        this.dao_produtor = new ProdutorDAO();
        produtor = dao_produtor.consultarTodosProdutores();
        view_consprodutor.desenharTela();
        view_consprodutor.addAlterarListener(new AlterarListener());
        view_consprodutor.addExcluirListener(new ExcluirListener());
        view_consprodutor.addNovoListener(new NovoListener());
        view_consprodutor.addSairListener(new SairListener());
        view_consprodutor.preencherTabela(produtor);
    }

    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_consprodutor.obterIdProdutor();
            if (id != -1) {
                try {
                    control.CadastroProdutorController cadastro = new CadastroProdutorController(id);
                } catch (ParseException ex) {
                    Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view_consprodutor.fecharTela();
            }
        }

    }

    class ExcluirListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_consprodutor.obterIdProdutor();
            if (id != -1) {
                if (JOptionPane.showConfirmDialog(null, "Deseja excluir o produtor?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        dao_produtor.exclusaoLogica(id);
                        JOptionPane.showMessageDialog(null, "Produtor Excluido", "Exclusão de Produtor", JOptionPane.INFORMATION_MESSAGE);
                        produtor = dao_produtor.consultarTodosProdutores();
                        view_consprodutor.preencherTabela(produtor);
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
                control.CadastroProdutorController cadastro = new CadastroProdutorController();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view_consprodutor.fecharTela();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_consprodutor.fecharTela();
        }

    }
}
