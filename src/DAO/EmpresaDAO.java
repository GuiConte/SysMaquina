
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.EmpresaModel;


public class EmpresaDAO {
    
      public void gravarEmpresa (model.EmpresaModel empresa) throws SQLException {
        String SQL = "insert into empresa(empresa,fantasia,cnpj,ie,"
                + "endereco,bairro,cod_cidade,cep,telefone,mensagem)"
                + " values (?,?,?,?,?,?,?,?,?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, empresa.getEmpresa());
        pst.setString(2, empresa.getFantasia());
        pst.setString(3, empresa.getCnpj());
        pst.setString(4, empresa.getIe());
        pst.setString(5, empresa.getEndereco());
        pst.setString(6, empresa.getBairro());
        pst.setInt(7, empresa.getCod_cidade());
        pst.setString(8, empresa.getCep());
        pst.setString(9, empresa.getTelefone());
        pst.setString(10, empresa.getMensagem());       
        pst.execute();
        pst.close();
        con.close();

    }
      
       public void alterarEmpresa(model.EmpresaModel empresa) throws SQLException {
        String SQL = "update empresa set empresa = ?, fantasia = ?, cnpj = ?, ie = ?, endereco = ?, bairro = ?,"
                + "cod_cidade = ?, telefone = ?, mensagem = ?"                
                + "where cod_empresa = ?";
       Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, empresa.getEmpresa());
        pst.setString(2, empresa.getFantasia());
        pst.setString(3, empresa.getCnpj());
        pst.setString(4, empresa.getIe());
        pst.setString(5, empresa.getEndereco());
        pst.setString(6, empresa.getBairro());
        pst.setInt(7, empresa.getCod_cidade());
        pst.setString(8, empresa.getCep());
        pst.setString(9, empresa.getTelefone());
        pst.setString(10, empresa.getMensagem());       
        pst.execute();
        pst.close();
        con.close();

    }

    public ResultSet consultarTodasEmpresas() throws SQLException {
        String SQL = "SELECT * from empresa ";             
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        return rs;
    }

     public model.EmpresaModel consultarEmpresaEspecifica(int id) throws SQLException {
        String SQL = "SELECT * from empresa  = " + id;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();

        if (rs.first()) {
            model.EmpresaModel empresa = new EmpresaModel(rs.getInt("cod_empresa"),
                    rs.getString("empresa"),
                    rs.getString("fantasia"),                    
                    rs.getString("cnpj"),
                    rs.getString("ie"),
                    rs.getInt("endereco"),
                    rs.getString("bairro"),
                    rs.getInt("cod_cidade"),
                    rs.getString("cep"),
                    rs.getString("telefone"),
                    rs.getString("mensagem"));

            return empresa;
        }

        return null;

    } 

}
    
    
    
    
    
    
    
    
    

