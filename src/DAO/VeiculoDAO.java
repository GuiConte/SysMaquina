
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class VeiculoDAO {
    
    
      public void gravarVeiculo(model.VeiculoModel veiculo) throws SQLException {
        String SQL = "insert into cad_veiculo(placa, descricao)"
                + " values (?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, veiculo.getPlaca());
        pst.setString(2, veiculo.getDescricao());        
        pst.execute();
        pst.close();
        con.close();
    
      }
    
    
    
    
    
}
