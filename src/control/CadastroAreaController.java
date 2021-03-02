
package control;

import DAO.AreaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Area;


public class CadastroAreaController {
    
   
  view.CadTabela_Area view_area;
    DAO.AreaDAO dao_area;
    model.AreaModel model_area;
    
    
   
    public CadastroAreaController() throws ParseException, SQLException {

        dao_area = new AreaDAO();       
        view_area = new CadTabela_Area();
        view_area.desenharTelaNovo();
        
     view_area.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_area = view_area.getCadTabela_Area();
            try {
                dao_area.gravarArea(model_area);
                 JOptionPane.showMessageDialog(null, "Area Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroAreaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       }   
    }
