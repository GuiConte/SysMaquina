
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ViagemCategoriaDAO {
    
    public void gravarViagem(model.ViagemCategoriaModel viagem) throws SQLException {
        String SQL = "insert into viagem_categoria(descricao)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, viagem.getDescricao());
        pst.execute();
        pst.close();
        con.close();
    
      }
}
