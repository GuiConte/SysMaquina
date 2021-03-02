
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TabProdutorDAO {
    

       public void gravarTabProdutor(model.TabProdutorModel produtor) throws SQLException {
        String SQL = "insert into cad_produtor(produtor, ativo)"
                + " values (?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, produtor.getProdutor());
        pst.setString(2, String.valueOf(produtor.getAtivo()));
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}

