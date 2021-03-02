
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AreaDAO {
    

       public void gravarArea(model.AreaModel area) throws SQLException {
        String SQL = "insert into cad_area(descricao, ativo)"
                + " values (?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, area.getDescricao());
        pst.setString(2, String.valueOf(area.getAtivo()));
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}
