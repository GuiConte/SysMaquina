
package control;


import DAO.VeiculoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Veiculo;

public class CadastroVeiculoController {
    
    
 view.CadTabela_Veiculo view_veiculo;
    DAO.VeiculoDAO dao_veiculo;
    model.VeiculoModel model_veiculo;
    
    
   
    public CadastroVeiculoController() throws ParseException, SQLException {

        dao_veiculo = new VeiculoDAO();       
        view_veiculo = new CadTabela_Veiculo();
        view_veiculo.desenharTelaNovo();
        
     view_veiculo.addGravarListener(new GravarListener());        
        
    
    
    }
        
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_veiculo = view_veiculo.getCadTabela_Veiculo();
            try {
                dao_veiculo.gravarVeiculo(model_veiculo);
                 JOptionPane.showMessageDialog(null, "Veiculo Cadastrado com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroVeiculoController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         }
}
