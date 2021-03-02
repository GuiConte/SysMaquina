
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CamaraFriaDAO {
    
    
    
       public void gravarCamaraFria(model.CamaraFriaModel camarafria) throws SQLException {
        String SQL = "insert into cad_camarafria(descricao)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, camarafria.getDescricao());
        pst.execute();
        pst.close();
        con.close();
    
      }
    
    
    
}
