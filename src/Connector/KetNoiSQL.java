/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class KetNoiSQL {
    private Connection con = null;
    static String instance = "";
    static String serverName = "localhost";
    static String portNumber = "1433";
    static String dbName = "Tmp_TienNuoc";
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
    public static boolean kiemTraKetNoi() {
        Connection connection = getConnection();
        if (connection != null) {
            try {
               
                connection.close();
            } catch (SQLException e) {
            }
            return true;
        } else {
           
            return false;
        }
    }
 
    public static void main(String[] args) {
        if (KetNoiSQL.kiemTraKetNoi()) {
            System.out.println("connect success!");
        } else {
           System.out.println("Can't connect DB!");
        }
    }


}
