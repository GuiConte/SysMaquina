
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EstoqueDAO {
    

      public void gravarEstoque(model.EstoqueModel estoque) throws SQLException {
        String SQL = "insert into cad_estoque(estoque)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, estoque.getEstoque());
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}
