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

/**
 *
 * @author Guilherme
 */
public class EstadoDAO {

    public ArrayList<String> listaEstados() throws SQLException {
        ArrayList<String> listaEstados = new ArrayList<String>();
        String SQL = "select * from estado";
        Connection con = new Conexao().getConnectionMySQL();
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            listaEstados.add(rs.getString("estado_abreviado"));
        }

        return listaEstados;
    }
}
