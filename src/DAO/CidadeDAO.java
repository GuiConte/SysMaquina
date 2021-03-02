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
import model.CidadeModel;

/**
 *
 * @author Guilherme
 */
public class CidadeDAO {

    public ArrayList<model.CidadeModel> listaCidades(int idEstado) throws SQLException {
        ArrayList<model.CidadeModel> listaCidades = new ArrayList<model.CidadeModel>();
        String SQL = "select * from cidade where cod_estado = " + idEstado;
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            listaCidades.add(new CidadeModel(rs.getInt("cod_cidade"), rs.getString("cidade")));
        }

        return listaCidades;
    }
}
