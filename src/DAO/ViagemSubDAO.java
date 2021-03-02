
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ViagemSubDAO {
    
    public void gravarSubViagem(model.ViagemSubModel subviagem) throws SQLException {
        String SQL = "insert into viagem_subcategoria(descricao)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, subviagem.getDescricao());
        pst.execute();
        pst.close();
        con.close();
    
      }
}
