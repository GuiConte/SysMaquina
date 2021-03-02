
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FormaPagamentoDAO {
    
    
    
    
      public void gravarFormaPagamento(model.FormaPagamentoModel forma) throws SQLException {
        String SQL = "insert into formapagamento(forma)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, forma.getForma());
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}
