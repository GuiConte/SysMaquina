
package control;

import DAO.VendedorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Vendedor;


public class CadastroVendedorController {
    
view.CadTabela_Vendedor view_vendedor;
    DAO.VendedorDAO dao_vendedor;
    model.VendedorModel model_vendedor;
    
    
   
    public CadastroVendedorController() throws ParseException, SQLException {

        dao_vendedor = new VendedorDAO();       
        view_vendedor = new CadTabela_Vendedor();
        view_vendedor.desenharTelaNovo();
        
     view_vendedor.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_vendedor = view_vendedor.getCadTabela_Vendedor();
            try {
                dao_vendedor.gravarVendedor(model_vendedor);
                 JOptionPane.showMessageDialog(null, "Vendedor Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroVendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}
