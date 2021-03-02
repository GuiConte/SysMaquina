
package control;

import DAO.EmpresaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ConsultaEmpresa;


public class ConsultaEmpresaController {
    
    private view.ConsultaEmpresa view_consempresa;
     private DAO.EmpresaDAO dao_empresa;
    private ResultSet empresa;
    
public ConsultaEmpresaController() throws SQLException {
        this.view_consempresa = new ConsultaEmpresa();
        this.dao_empresa = new EmpresaDAO();
        empresa = dao_empresa.consultarTodasEmpresas();
        view_consempresa.desenharTela();
        view_consempresa.addAlterarListener(new AlterarListener());
      
        view_consempresa.addNovoListener(new NovoListener());
        view_consempresa.addSairListener(new SairListener());
        view_consempresa.preencherTabela(empresa);
    }

    class AlterarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int id = view_consempresa.obterIdEmpresa();
            if (id != -1) {
                
                control.CadastroEmpresaController cadastro = new CadastroEmpresaController(id);                
                view_consempresa.fecharTela();
            }
        }

    }

    
    

    class NovoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                control.CadastroEmpresaController cadastro = new CadastroEmpresaController();
            } catch (ParseException ex) {
                Logger.getLogger(ConsultaEmpresaController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaEmpresaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            view_consempresa.fecharTela();
        }

    }

    class SairListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            view_consempresa.fecharTela();
        }

    }

}
