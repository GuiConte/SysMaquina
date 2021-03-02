
package control;



import DAO.MaquinaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadTabela_Maquina;


public class CadastroMaquinaController {
    view.CadTabela_Maquina view_maquina;
    DAO.MaquinaDAO dao_maquina;
    model.MaquinaModel model_maquina;
    
    
   
    public CadastroMaquinaController() throws ParseException, SQLException {

        dao_maquina = new MaquinaDAO();       
        view_maquina = new CadTabela_Maquina();
        view_maquina.desenharTelaNovo();
         
        view_maquina.addCancelarListener(new CancelarListener());
        view_maquina.addGravarListener(new GravarListener()); 
        
    }

    CadastroMaquinaController(int id) throws ParseException, SQLException {
        
        
        this.view_maquina = new CadTabela_Maquina();
        this.dao_maquina = new MaquinaDAO();
         

        model_maquina = dao_maquina.consultarMaquinaEspecifico(id);
        view_maquina.desenharTelaNovo();
        view_maquina.preencheTxts(model_maquina);
       
        
        
        view_maquina.addGravarListener(new AlterarListener());
        view_maquina.addCancelarListener(new CancelarListener());
      
    }

    class CancelarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_maquina.limparTXT();
        }

    }

     
    
    
         class GravarListener implements ActionListener {       
        public void actionPerformed(ActionEvent e) {
            model_maquina = view_maquina.getCadTabela_Maquina();
            try {
                dao_maquina.gravarMaquina(model_maquina);
                 JOptionPane.showMessageDialog(null, "Maquina Cadastrada com Sucesso!", "Confirmação de Cadastro", JOptionPane.INFORMATION_MESSAGE);                               
                 view_maquina.preencherTabela(dao_maquina.consultarTodasMaquinas());           
            } catch (SQLException ex) {
                Logger.getLogger(CadastroMaquinaController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       
        }
   }
            class AlterarListener implements ActionListener {

      public void actionPerformed(ActionEvent e) {

            try {
                model_maquina = view_maquina.getCadTabela_Maquina();
                dao_maquina.alterarMaquina(model_maquina);
                JOptionPane.showMessageDialog(null, "Maquina Alterada", "Confirmação de Alteração", JOptionPane.INFORMATION_MESSAGE);
             } catch (SQLException ex) {
                Logger.getLogger(CadastroMaquinaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
      
    
    
        
    
    

