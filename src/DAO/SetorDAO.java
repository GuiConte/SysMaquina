
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SetorDAO {
    
    
      public void gravarSetor(model.SetorModel setor) throws SQLException {
        String SQL = "insert into setores(setor)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, setor.getSetor());
        pst.execute();
        pst.close();
        con.close();
    
    }
}
