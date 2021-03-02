
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class VendedorDAO {
    
    
       public void gravarVendedor(model.VendedorModel vendedor) throws SQLException {
        String SQL = "insert into cad_vendedor(vendedor)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, vendedor.getVendedor());
        pst.execute();
        pst.close();
        con.close();
    
      }
    
    
    
}
