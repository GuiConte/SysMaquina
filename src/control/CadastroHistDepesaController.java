
package control;

import DAO.HistoricoDespesaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_HistoricoDespesa;


public class CadastroHistDepesaController {
    
  view.CadTabela_HistoricoDespesa view_despesa;
    DAO.HistoricoDespesaDAO dao_despesa;
    model.HistoricoDespesaModel model_despesa;
    
    
   
    public CadastroHistDepesaController() throws ParseException, SQLException {

        dao_despesa = new HistoricoDespesaDAO();       
        view_despesa = new CadTabela_HistoricoDespesa();
        view_despesa.desenharTelaNovo();
        
     view_despesa.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_despesa = view_despesa.getCadTabela_HistDespesa();
            try {
                dao_despesa.gravarDespesa(model_despesa);
                 JOptionPane.showMessageDialog(null, "Despesa Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroHistDepesaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
