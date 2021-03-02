
package control;

import DAO.SetorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Setor;


public class CadastroSetorController {
    view.CadTabela_Setor view_setor;
    DAO.SetorDAO dao_setor;
    model.SetorModel model_setor;
    
    
   
    public CadastroSetorController() throws ParseException, SQLException {

        dao_setor = new SetorDAO();       
        view_setor = new CadTabela_Setor();
        view_setor.desenharTelaNovo();
        
     view_setor.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_setor = view_setor.getCadTabela_Setor();
            try {
                dao_setor.gravarSetor(model_setor);
                 JOptionPane.showMessageDialog(null, "Setor Cadastrado com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroSetorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
    

