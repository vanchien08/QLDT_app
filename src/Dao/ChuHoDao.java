/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connector.KetNoiSQL;
import Model.ThongTinChuHo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ChuHoDao {
   
    public void addThongTinChuHo(ThongTinChuHo ttch)
    {
        Connection con = KetNoiSQL.getConnection();
        String sql="insert into PERSON_INFOS (CCCD,Name,DOB,Address,Phone,Sex) values(?,?,?,?,?,?)";
        int row = 0;
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,ttch.getCCCD_CH());
            ps.setString(2,ttch.getName());
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            
//             System.out.println("ngay sinh consolelog in CHUHODAO ttch.getDOB()"+ttch.getDOB());
//            String date = sdf.format(ttch.getDOB().getDate());
            ps.setDate(3, new java.sql.Date(ttch.getDOB().getTime()) );
            
            ps.setString(4,ttch.getAddress());
            ps.setString(5,ttch.getPhoneNum());
            ps.setBoolean(6,ttch.getGioitinh());
            row = ps.executeUpdate();
//            if (row > 0) {
//                JOptionPane.showMessageDialog(this, "Thêm Tài khoản thành công");
//            } else {
//                JOptionPane.showMessageDialog(this, "Nhap ma xhua dung");
//            }

            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ChuHoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
     public boolean KiemTraCCCD(String CCCD) {
        
        Connection con = KetNoiSQL.getConnection();
        String sql ="select * from PERSON_INFOS where CCCD='"+CCCD+"' ";
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
      public boolean KiemTraPhoneNum(String phoneNum) {
        
        Connection con = KetNoiSQL.getConnection();
        String sql ="select * from PERSON_INFOS where Phone='"+phoneNum+"' ";
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
      public boolean KiemTraUsername(String userName) {
        
        Connection con = KetNoiSQL.getConnection();
        String sql ="select * from ACCOUNTS where Account_Username='"+userName+"' ";
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

}
