/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connector.KetNoiSQL;
import Model.ThongTinHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class HoaDonDao {
     public List<ThongTinHoaDon> getAllHoaDonPhong() {
        List<ThongTinHoaDon> list = new ArrayList<>();

        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from HOADON order by DAY desc";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinHoaDon hoadon = new ThongTinHoaDon();
                hoadon.setId(rs.getInt("ID"));
                hoadon.setCCCD_CH(rs.getString("CCCD_CHUHO"));
                hoadon.setCCCD_NV(rs.getString("CCCD_NV"));
                hoadon.setDay(rs.getDate("DAY"));
                hoadon.setAmount(rs.getFloat("amount"));
                hoadon.setTrangThai(rs.getString("trangThai"));
              
                list.add(hoadon);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public void capNhatTrangThaiHD(String cccd_ch,String trangthai){
        try {
            Connection conn=KetNoiSQL.getConnection();
            String sql ="update HOADON set trangThai=? where CCCD_CHUHO=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, trangthai);
            ps.setString(2, cccd_ch);
             ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
     public List<Map> getAllHoaDonNuoc() {
      
         
         List<Map> list= new ArrayList<>();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from HOADON hd join BANGSDNUOC bsdn on hd.CCCD_CHUHO=bsdn.CCCD_CH and hd.DAY=bsdn.Days";
                    
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Map <String,String> data= new HashMap<>();
                data.put("CCCD_CHUHO",rs.getString("CCCD_CHUHO") );
                 data.put("CCCD_NV",rs.getString("CCCD_NV") );
                 String dateString = dateFormat.format(rs.getDate("DAY"));
                  data.put("DAY",dateString );
                  data.put("soNuocCu",rs.getString("SoNuocCu"));
                   data.put("soNuocMoi",rs.getString("SoNuocMoi"));
                   data.put("trangThai",rs.getString("trangThai"));
                  list.add(data);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
     public List<Map> searchBill(String tungay,  String trangthai, String maphong) {
      
         
         List<Map> list= new ArrayList<>();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from HOADON hd join BANGSDNUOC bsdn on hd.CCCD_CHUHO=bsdn.CCCD_CH and hd.DAY=bsdn.Days WHERE hd.DAY = ?  AND trangThai = ?";
        if (!maphong.equals("")) {
            sql += " AND CCCD_CHUHO = ?";
        }
        sql += " ORDER BY hd.[DAY] DESC";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tungay);
     //   ps.setString(2, denngay);
        ps.setString(2, trangthai);
        if (!maphong.equals("")) {
            ps.setString(3, maphong);
        }
            System.out.println("check ngay:  "+tungay);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Map <String,String> data= new HashMap<>();
                data.put("CCCD_CHUHO",rs.getString("CCCD_CHUHO") );
                 data.put("CCCD_NV",rs.getString("CCCD_NV") );
                 String dateString = dateFormat.format(rs.getDate("DAY"));
                  data.put("DAY",dateString );
                  data.put("soNuocCu",rs.getString("SoNuocCu"));
                   data.put("soNuocMoi",rs.getString("SoNuocMoi"));
                   data.put("trangThai",rs.getString("trangThai"));
                  list.add(data);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
     public boolean checkCCCDChuHo(String cccd) {
      
         
        boolean t= false;
        try {
         Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from CHUHO where CCCD_ChuHo=?";
                    
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cccd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t=true;
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }
     public void addBangSDNuoc(String days,String CCCD,String sonuoccu,String sonuocmoi){
        try {
          
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date date = df.parse(days);
            Connection conn=KetNoiSQL.getConnection();
            String sql ="insert into BANGSDNUOC (Days,CCCD_CH,SoNuocCu,SoNuocMoi) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1,new java.sql.Date(date.getTime()) );
            ps.setString(2, CCCD);
            ps.setString(3, sonuoccu);
            ps.setString(4, sonuocmoi);
             ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
     public void addHoaDonNuoc(String days,String CCCD,String sonuoccu,String sonuocmoi){
        try {
            float gianuoc=getDonGiaNuocLast();
            int snc=Integer.valueOf(sonuoccu);
            int snm=Integer.valueOf(sonuocmoi);
            int sonuocsudung=snm-snc;
            float tongtien=gianuoc*sonuocsudung;
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date date = df.parse(days);
            Connection conn=KetNoiSQL.getConnection();
            String sql ="insert into HOADON (DAY,CCCD_CHUHO,amount,trangThai,tongtien) values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1,new java.sql.Date(date.getTime()) );
            ps.setString(2, CCCD);
            ps.setInt(3, sonuocsudung);
            ps.setString(4, "Chưa thanh toán");
            ps.setFloat(5, tongtien);
             ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
     public float getDonGiaNuocLast()
     {
         float dongia=0;
           try {
               
           
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select top 1 * from GIANUOC order by createAt desc";
                    
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                
                dongia=rs.getFloat("donGia");
               
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
        return dongia;
     }
}
