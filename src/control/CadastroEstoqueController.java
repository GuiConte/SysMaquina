
package control;

import DAO.CamaraFriaDAO;
import DAO.EstoqueDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_CamaraFria;
import view.CadTabela_Estoque;


public class CadastroEstoqueController {
    
view.CadTabela_Estoque view_estoque;
    DAO.EstoqueDAO dao_estoque;
    model.EstoqueModel model_estoque;
    
    
   
    public CadastroEstoqueController() throws ParseException, SQLException {

        dao_estoque = new EstoqueDAO();       
        view_estoque = new CadTabela_Estoque();
        view_estoque.desenharTelaNovo();
        
     view_estoque.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_estoque = view_estoque.getCadTabela_Estoque();
            try {
                dao_estoque.gravarEstoque(model_estoque);
                 JOptionPane.showMessageDialog(null, "Esoque Cadastrado com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroEstoqueController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}
