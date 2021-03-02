/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class Conexao {

    public static String status = "Sem conexao...";
    private static Connection c = null;

    public static java.sql.Connection getConnectionMySQL() {

        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);

            String url = "jdbc:mysql://localhost:3307/sys_coragem";

            c = DriverManager.getConnection(url, "root", "");

            if (c != null) {

                status = ("STATUS--->Conectado com sucesso!");
                System.out.println(status);
            } else {

                status = ("STATUS--->Não foi possivel realizar conexão");
                System.out.println(status);
            }
            return c;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public static void closeConnection() throws SQLException {
        c.close();
    }

}
