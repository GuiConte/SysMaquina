
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MaquinaModel;


public class MaquinaDAO {
    
    
     public void gravarMaquina(model.MaquinaModel maquina) throws SQLException {
        String SQL = "insert into maquinas(maquina)"
                + " values (?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, maquina.getMaquina());
        pst.execute();
        pst.close();
        con.close();
        
        
    
    }
     
     public void alterarMaquina(model.MaquinaModel maquina) throws SQLException {
        String SQL = "update maquinas set maquina = ? where cod_maquina = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, maquina.getMaquina());
        pst.setInt(2, maquina.getCod_maquina());
        pst.execute();
        pst.close();
        con.close();
     }
     
     
      public ResultSet consultarTodasMaquinas() throws SQLException {
        String SQL = "SELECT * from maquinas ";             
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
     
      
     public MaquinaModel consultarMaquinaEspecifico(int id) throws SQLException {
        String SQL = "select maq.* from maquinas maq "
               +" where cod_maquina = " + id;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();

        if (rs.first()) {
            model.MaquinaModel maquina = new MaquinaModel(rs.getInt("cod_maquina"),
                    rs.getString("maquina"));
              
                    
            return maquina;
        }

        return null;

    }
     
     public void exclusaoLogica(int id) throws SQLException {
        String SQL = "update maquinas set excluido = 1 where cod_maquina = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setInt(1, id);
        pst.execute();
        pst.close();
        con.close();

    }
     
}
