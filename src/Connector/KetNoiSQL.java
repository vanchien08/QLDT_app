/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class KetNoiSQL {
    private Connection con = null;
    static String instance = "";
    static String serverName = "localhost";
    static String portNumber = "1433";
    static String dbName = "quanliktx1";
    static String userID = "sa";
    static String password = "1234567";

    public static Connection getConnection() {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,userID,password);
            
        } catch (Exception e) {
        }
        return con;
    }
}
