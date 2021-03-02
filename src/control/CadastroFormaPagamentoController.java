
package control;

import DAO.FormaPagamentoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_FormaPagamento;



public class CadastroFormaPagamentoController {
    
    
      view.CadTabela_FormaPagamento view_forma;
    DAO.FormaPagamentoDAO dao_forma;
    model.FormaPagamentoModel model_forma;
    
    
   
    public CadastroFormaPagamentoController() throws ParseException, SQLException {

        dao_forma = new FormaPagamentoDAO();       
        view_forma = new CadTabela_FormaPagamento();
        view_forma.desenharTelaNovo();
        
     view_forma.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_forma = view_forma.getCadTabela_FormaPgto();
            try {
                dao_forma.gravarFormaPagamento(model_forma);
                 JOptionPane.showMessageDialog(null, "Forma de Pagamento Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroSetorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
    
    

