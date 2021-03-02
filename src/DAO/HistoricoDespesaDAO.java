
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HistoricoDespesaDAO {
    
     
       public void gravarDespesa(model.HistoricoDespesaModel despesa) throws SQLException {
        String SQL = "insert into cad_histdespesa(descricao, ativo)"
                + " values (?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, despesa.getDescricao());
        pst.setString(2, String.valueOf(despesa.getAtivo()));
        pst.execute();
        pst.close();
        con.close();
    
      }
    
}
