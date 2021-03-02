
package control;

import DAO.ViagemSubDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Viagem_SubCategoria;


public class ViagemSubController {
    
    
    view.Viagem_SubCategoria view_viagem;
    DAO.ViagemSubDAO dao_viagem;
    model.ViagemSubModel model_viagem;
    
    
   
    public ViagemSubController() throws ParseException, SQLException {

        dao_viagem = new ViagemSubDAO();       
        view_viagem = new Viagem_SubCategoria ();
        view_viagem.desenharTelaNovo();
        
     view_viagem.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_viagem = view_viagem.getViagemSubCategoria();
            try {
                dao_viagem.gravarSubViagem(model_viagem);
                 JOptionPane.showMessageDialog(null, "Sub Viagem Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ViagemSubController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}

    
    
    
    

