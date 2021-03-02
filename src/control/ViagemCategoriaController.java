
package control;

import DAO.ViagemCategoriaDAO;
import DAO.ViagemSubDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Viagem_Categoria;
import view.Viagem_SubCategoria;


public class ViagemCategoriaController {
    

    view.Viagem_Categoria view_viagem;
    DAO.ViagemCategoriaDAO dao_viagem;
    model.ViagemCategoriaModel model_viagem;
    
    
   
    public ViagemCategoriaController() throws ParseException, SQLException {

        dao_viagem = new ViagemCategoriaDAO();       
        view_viagem = new Viagem_Categoria ();
        view_viagem.desenharTelaNovo();
        
     view_viagem.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_viagem = view_viagem.getViagem();
            try {
                dao_viagem.gravarViagem(model_viagem);
                 JOptionPane.showMessageDialog(null, "Viagem Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ViagemCategoriaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}
