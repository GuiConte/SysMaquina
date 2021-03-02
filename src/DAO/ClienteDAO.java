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
import model.ClienteModel;

/**
 *
 * @author Guilherme
 */
public class ClienteDAO {

    public void gravarCliente(model.ClienteModel cliente) throws SQLException {
        String SQL = "insert into cliente(nome,endereco,cod_cidade,cep,telefone,rg_ie,data_cadastro,obs,celular,usuario,"
                + "bloqueado,prazo,email,numero,bairro,complemento,cpf_cnpj,tipo_pessoa,limite_credito,fantasia,nfe)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getEndereco());
        pst.setInt(3, cliente.getCod_cidade());
        pst.setString(4, cliente.getCep());
        pst.setString(5, cliente.getTelefone());
        pst.setString(6, cliente.getRg_ie());
        pst.setString(7, cliente.getData_cadastro());
        pst.setString(8, cliente.getObs());
        pst.setString(9, cliente.getCelular());
        pst.setInt(10, cliente.getUsuario());
        pst.setString(11, String.valueOf(cliente.getBloqueado()));
        pst.setString(12, String.valueOf(cliente.getPrazo()));
        pst.setString(13, cliente.getEmail());
        pst.setString(14, cliente.getNumero());
        pst.setString(15, cliente.getBairro());
        pst.setString(16, cliente.getComplemento());
        pst.setString(17, cliente.getCpf_cnpj());
        pst.setInt(18, cliente.getTipo_pessoa());
        pst.setFloat(19, cliente.getLimite_credito());
        pst.setString(20, cliente.getFantasia());
        pst.setString(21, String.valueOf(cliente.getNfe()));
        pst.execute();
        pst.close();
        con.close();

    }

    public void alterarCliente(model.ClienteModel cliente) throws SQLException {
        String SQL = "update cliente set nome = ?, endereco = ?, cod_cidade = ?, cep = ?, telefone = ?, rg_ie = ?,"
                + "data_cadastro = ?, obs = ?, celular = ?, usuario = ?, bloqueado = ?, prazo = ?, email = ?, numero = ?,"
                + "bairro = ?, complemento = ?, cpf_cnpj = ?, tipo_pessoa = ?, limite_credito = ?,fantasia = ?, nfe = ?"
                + "where cod_cliente = ?";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getEndereco());
        pst.setInt(3, cliente.getCod_cidade());
        pst.setString(4, cliente.getCep());
        pst.setString(5, cliente.getTelefone());
        pst.setString(6, cliente.getRg_ie());
        pst.setString(7, cliente.getData_cadastro());
        pst.setString(8, cliente.getObs());
        pst.setString(9, cliente.getCelular());
        pst.setInt(10, cliente.getUsuario());
        pst.setString(11, String.valueOf(cliente.getBloqueado()));
        pst.setString(12, String.valueOf(cliente.getPrazo()));
        pst.setString(13, cliente.getEmail());
        pst.setString(14, cliente.getNumero());
        pst.setString(15, cliente.getBairro());
        pst.setString(16, cliente.getComplemento());
        pst.setString(17, cliente.getCpf_cnpj());
        pst.setInt(18, cliente.getTipo_pessoa());
        pst.setFloat(19, cliente.getLimite_credito());
        pst.setString(20, cliente.getFantasia());
        pst.setString(21, String.valueOf(cliente.getNfe()));
        pst.setInt(22, cliente.getCod_cliente());
        pst.execute();
        pst.close();
        con.close();

    }

    public ResultSet consultarTodosClientes() throws SQLException {
        String SQL = "select cli.*, cid.cidade,est.estado_abreviado from cliente"
                + " cli natural join cidade cid natural join estado est where excluido = 0 order by cli.cod_cliente asc;";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public model.ClienteModel consultarClienteEspecifico(int id) throws SQLException {
        String SQL = "select cli.*, est.cod_estado from cliente cli "
                + "natural join cidade cid natural join estado est where cod_cliente = " + id;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();

        if (rs.first()) {
            model.ClienteModel cliente = new ClienteModel(rs.getInt("cod_cliente"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getInt("cod_cidade"),
                    rs.getString("cep"),
                    rs.getString("telefone"),
                    rs.getString("rg_ie"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("data_cadastro"),
                    rs.getString("obs"),
                    rs.getString("celular"),
                    rs.getInt("usuario"),
                    rs.getString("bloqueado"),
                    rs.getInt("prazo"),
                    rs.getString("email"),
                    rs.getString("numero"),
                    rs.getString("bairro"),
                    rs.getString("complemento"),
                    rs.getInt("tipo_pessoa"),
                    rs.getInt("limite_credito"),
                    rs.getString("fantasia"),
                    rs.getString("nfe"),
                    rs.getInt("est.cod_estado"));

            return cliente;
        }

        return null;

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

}
