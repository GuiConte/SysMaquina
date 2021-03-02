
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HistoricoChequeDAO {
    
    
     public void gravarHistCheque(model.HistoricoChequeModel cheque) throws SQLException {
        String SQL = "insert into historicocheque(cheque)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, cheque.getCheque());
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}
    

