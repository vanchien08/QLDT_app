/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connector.KetNoiSQL;
import Model.ThongTinChuHo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */

public class AccountDao {
//    Map<String,String> =
      public void addAccountChuHo(Map a)
    {
        Connection con = KetNoiSQL.getConnection();
        String sql="insert into ACCOUNT (CCCD,username,password,priviledge,trangThai) values(?,?,?,?,?)";
        int row = 0;
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1, (String) a.get("CCCD"));
            ps.setString(2,(String) a.get("username"));

            ps.setString(3, (String) a.get("password"));
            
            ps.setString(4,"CH");
           ps.setString(5,(String) a.get("trangThai"));
        
            
           
            row = ps.executeUpdate();

            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ChuHoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
      public boolean KiemTraUsername(String userName) {
        
        Connection con = KetNoiSQL.getConnection();
        String sql ="select * from ACCOUNT where username='"+userName+"' ";
        try {

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
       public String getPasswordByUserName(String username) {
           String password="";
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ACCOUNT where username  ='" + username + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               password=rs.getString("password");
               
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return password;
    }
}
