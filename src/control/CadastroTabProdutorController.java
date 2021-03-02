
package control;


import DAO.TabProdutorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Produtor;



public class CadastroTabProdutorController {
    
 view.CadTabela_Produtor view_produtor;
    DAO.TabProdutorDAO dao_produtor;
    model.TabProdutorModel model_produtor;
    
    
   
    public CadastroTabProdutorController() throws ParseException, SQLException {

        dao_produtor = new TabProdutorDAO();       
        view_produtor = new CadTabela_Produtor();
        view_produtor.desenharTelaNovo();
        
     view_produtor.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_produtor = view_produtor.getCadTabela_Produtor();
            try {
                dao_produtor.gravarTabProdutor(model_produtor);
                 JOptionPane.showMessageDialog(null, "Produtor Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroTabProdutorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
