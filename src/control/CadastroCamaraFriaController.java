
package control;

import DAO.CamaraFriaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_CamaraFria;


public class CadastroCamaraFriaController {
    
    
    
    
 view.CadTabela_CamaraFria view_camarafria;
    DAO.CamaraFriaDAO dao_camarafria;
    model.CamaraFriaModel model_camarafria;
    
    
   
    public CadastroCamaraFriaController() throws ParseException, SQLException {

        dao_camarafria = new CamaraFriaDAO();       
        view_camarafria = new CadTabela_CamaraFria();
        view_camarafria.desenharTelaNovo();
        
     view_camarafria.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_camarafria = view_camarafria.getCadTabela_CamaraFria();
            try {
                dao_camarafria.gravarCamaraFria(model_camarafria);
                 JOptionPane.showMessageDialog(null, "Camara Fria Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroCamaraFriaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}