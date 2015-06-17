package plist.conn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author salgado
 */
public class ConnectionFactory {
    private String connectionString = "jdbc:postgresql://127.0.0.1:5432/postgres";
    private String user="postgres";
    private String pass="admin";
    public Connection getConnection() {
        try {
            return DriverManager.getConnection( connectionString, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
