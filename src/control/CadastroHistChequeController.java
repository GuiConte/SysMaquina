
package control;

import DAO.HistoricoChequeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_HistoricoCheque;


public class CadastroHistChequeController {
    
    view.CadTabela_HistoricoCheque view_cheque;
    DAO.HistoricoChequeDAO dao_cheque;
    model.HistoricoChequeModel model_cheque;
    
    
   
    public CadastroHistChequeController() throws ParseException, SQLException {

        dao_cheque = new HistoricoChequeDAO();       
        view_cheque = new CadTabela_HistoricoCheque();
        view_cheque.desenharTelaNovo();
        
     view_cheque.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_cheque = view_cheque.getCadTabela_HistCheque();
            try {
                dao_cheque.gravarHistCheque(model_cheque);
                 JOptionPane.showMessageDialog(null, "Cheque Cadastrado com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroSetorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
