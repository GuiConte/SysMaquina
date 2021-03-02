
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

public class ConsultaMaquinaController {
      
    private view.CadTabela_Maquina view_maquina;
     private DAO.MaquinaDAO dao_maquina;
    private ResultSet maquina;
    
public ConsultaMaquinaController() throws SQLException {
    
    
        this.view_maquina = new CadTabela_Maquina();
        this.dao_maquina = new MaquinaDAO();
        maquina = dao_maquina.consultarTodasMaquinas();
        view_maquina.desenharTela();
        
        
        
        view_maquina.addExcluirListener(new ExcluirListener());
        view_maquina.addAlterarListener(new AlterarListener());        
        view_maquina.addNovoListener(new NovoListener());
        view_maquina.addSairListener(new SairListener());        
        view_maquina.preencherTabela(maquina);
    }
    
    
    
 class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_maquina.obterIdMaquinas();
            if (id != -1) {
              
                
                try {                
                    control.CadastroMaquinaController cadastro = new CadastroMaquinaController(id);                    
                } catch (ParseException ex) {
                    Logger.getLogger(ConsultaMaquinaController.class.getName()).log(Level.SEVERE, null, ex);                    
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaMaquinaController.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        }

    }

    class NovoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                control.CadastroMaquinaController cadastro = new CadastroMaquinaController();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaMaquinaController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaMaquinaController.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        }

    }
    class CancelarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
             view_maquina.limparTXT();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_maquina.fecharTela();
        }

    }
class ExcluirListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_maquina.obterIdMaquinas();
            if (id != -1) {
                if (JOptionPane.showConfirmDialog(null, "Deseja excluir?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        dao_maquina.exclusaoLogica(id);
                        JOptionPane.showMessageDialog(null, "Maquina Excluida", "Exclusão de Maquina", JOptionPane.INFORMATION_MESSAGE);
                        maquina = dao_maquina.consultarTodasMaquinas();
                        view_maquina.preencherTabela(maquina);
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsultaClienteController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
            }
        }
    }
}