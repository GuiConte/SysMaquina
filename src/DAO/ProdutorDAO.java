/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Conta_ProdutorModel;
import model.ProdutorModel;

/**
 *
 * @author Guilherme
 */
public class ProdutorDAO {

    private ArrayList<model.Conta_ProdutorModel> contas;

    public void gravarProdutor(model.ProdutorModel produtor) throws SQLException {
        String SQL = "insert into produtor(nome,fantasia,tipo_pessoa,endereco,bairro,cod_cidade,cep,"
                + "telefone,cpf_cnpj,rg_ie,obs,usuario,bloqueado)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, produtor.getNome());
        pst.setString(2, produtor.getFantasia());
        pst.setInt(3, produtor.getTipo_pessoa());
        pst.setString(4, produtor.getEndereco());
        pst.setString(5, produtor.getBairro());
        pst.setInt(6, produtor.getCod_cidade());
        pst.setString(7, produtor.getCep());
        pst.setString(8, produtor.getTelefone());
        pst.setString(9, produtor.getCpf_cnpj());
        pst.setString(10, produtor.getRg_ie());
        pst.setString(11, produtor.getObs());
        pst.setInt(12, produtor.getUsuario());
        pst.setString(13, String.valueOf(produtor.getBloqueado()));
        pst.execute();
        pst.close();
        con.close();

    }

    public void alterarProdutor(model.ProdutorModel produtor) throws SQLException {
        String SQL = "update produtor set nome = ?, fantasia = ?, tipo_pessoa = ?, endereco = ?, bairro = ?, cod_cidade = ?,"
                + "cep = ?, telefone = ?, cpf_cnpj = ?, rg_ie = ?, obs = ?, usuario = ?, bloqueado = ?"
                + "where cod_produtor = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, produtor.getNome());
        pst.setString(2, produtor.getFantasia());
        pst.setInt(3, produtor.getTipo_pessoa());
        pst.setString(4, produtor.getEndereco());
        pst.setString(5, produtor.getBairro());
        pst.setInt(6, produtor.getCod_cidade());
        pst.setString(7, produtor.getCep());
        pst.setString(8, produtor.getTelefone());
        pst.setString(9, produtor.getCpf_cnpj());
        pst.setString(10, produtor.getRg_ie());
        pst.setString(11, produtor.getObs());
        pst.setInt(12, produtor.getUsuario());
        pst.setString(13, String.valueOf(produtor.getBloqueado()));
        pst.setInt(14, produtor.getCod_produtor());
        pst.execute();
        pst.close();
        con.close();

    }

    public ResultSet consultarTodosProdutores() throws SQLException {
        String SQL = "select prod.*, cid.cidade,est.estado_abreviado from produtor prod "
                + "natural join cidade cid natural join estado est where excluido = 0 order by prod.cod_produtor asc;";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public model.ProdutorModel consultarProdutorEspecifico(int id) throws SQLException {
        String SQL = "select prod.*, est.cod_estado from produtor prod "
                + "natural join cidade cid natural join estado est where cod_produtor = " + id;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();

        if (rs.first()) {
            model.ProdutorModel produtor = new ProdutorModel(rs.getInt("cod_produtor"),
                    rs.getString("nome"),
                    rs.getString("fantasia"),
                    rs.getInt("tipo_pessoa"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getInt("cod_cidade"),
                    rs.getString("cep"),
                    rs.getString("telefone"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("rg_ie"),
                    rs.getString("obs"),
                    rs.getInt("usuario"),
                    rs.getString("bloqueado"),
                    rs.getInt("est.cod_estado"));

            return produtor;
        }

        return null;

    }

    public ArrayList<model.Conta_ProdutorModel> consultarContasProdutorEspecifico(int id) throws SQLException {
        contas = new ArrayList<>();
        String SQL = "select * from produtor_conta where cod_produtor = " + id;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        if (rs.first()) {
            do {
                contas.add(new Conta_ProdutorModel(rs.getInt("cod_produtor_conta"),
                        rs.getInt("cod_produtor"),
                        rs.getString("banco"),
                        rs.getString("agencia"),
                        rs.getString("conta_corrente"),
                        rs.getString("titular"),
                        rs.getString("cpf")
                ));
            }while (rs.next());
        }

        return contas;

    }

    public void exclusaoLogica(int id) throws SQLException {
        String SQL = "update cliente set excluido = 1 where cod_cliente = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setInt(1, id);
        pst.execute();
        pst.close();
        con.close();

    }

    public int consultarID() throws SQLException {
        String SQL = "SELECT AUTO_INCREMENT FROM information_schema.tables "
                + "WHERE table_name = 'produtor' AND table_schema = 'sys_coragem' ;";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        int id = -1;
        if (rs.first()) {
            id = rs.getInt("AUTO_INCREMENT");
        }
        return id;
    }

    public void gravarContas(int idProdutor, model.Conta_ProdutorModel conta) throws SQLException {
        String SQL = "insert into produtor_conta(cod_produtor,banco,agencia,conta_corrente,titular,cpf)"
                + " values (?,?,?,?,?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setInt(1, idProdutor);
        pst.setString(2, conta.getBanco());
        pst.setString(3, conta.getAgencia());
        pst.setString(4, conta.getConta_corrente());
        pst.setString(5, conta.getTitular());
        pst.setString(6, conta.getCpf());
        pst.execute();
        pst.close();
        con.close();

    }
    
    public void alterarConta(int id, model.Conta_ProdutorModel conta) throws SQLException{
        String SQL = "update produtor_conta set banco = ?, agencia = ?, conta_corrente = ?,"
                + "titular = ?, cpf = ?"
                + "where cod_produtor_conta = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, conta.getBanco());
        pst.setString(2, conta.getAgencia());
        pst.setString(3, conta.getConta_corrente());
        pst.setString(4, conta.getTitular());
        pst.setString(5, conta.getCpf());
        pst.setInt(6, id);
        pst.execute();
        pst.close();
        con.close();
    }
    
    public void excluirConta(int id) throws SQLException{
        String SQL = "delete from produtor_conta where cod_produtor_conta = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setInt(1, id);
        pst.execute();
        pst.close();
        con.close();
    }
}