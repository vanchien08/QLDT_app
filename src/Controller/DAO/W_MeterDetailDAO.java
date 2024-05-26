/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.DAO;

import Controller.DBS;
import Model.W_Meter_Details;
import Model.W_Meters;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class W_MeterDetailDAO {
    public  List<W_Meter_Details> getChiTietCongTo(String ngay) {
    List<W_Meter_Details> list =new ArrayList<>();
        String SQL="select * from W_METER_DETAILS where Creating_Date=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, ngay);
//               SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//             Date parsedDate = dateFormat.parse(ngay);
//            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
//            
//            ps.setDate(1, sqlDate);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 
                  W_Meter_Details tmp =new W_Meter_Details();
                  tmp.setID_W_Meter(rs.getString("ID_W_METER"));
                  tmp.setCurrent_num(rs.getInt("Current_Num"));
                  tmp.setCreating_Date(rs.getDate("Creating_Date"));
                  tmp.setStaff_input(rs.getInt("ID_Staff_Input"));
                  tmp.setId(rs.getInt("ID"));
                  list.add(tmp);
                  
              
              
            }
               
        } catch (Exception e) {
        }
          
        
          
        return list;
    }
    public static String getCCCDByIDMeter(String idmeter) {
        String cccd="";
        String SQL="SELECT * FROM W_METERS wm JOIN CUSTOMERS ctm ON wm.ID_Customer = ctm.ID join ACCOUNTS acc on acc.Account_Username=ctm.Account_Customer where ID_W_METER=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmeter);
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                cccd=rs.getString("CCCD");
      
            }
               
        } catch (Exception e) {
        }
          
        
          
        return cccd;
    }
    public static String getHotenByCCCD(String cccd) {
        String hoten="";
        String SQL="SELECT CONCAT(Firstname, ' ',  Middlename,' ',Lastname ) AS Fullname FROM PERSON_INFOS where CCCD=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,cccd);
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                hoten=rs.getString("Fullname");

            }
               
        } catch (Exception e) {
        }

        return hoten;
    }
    
    public String convertngay(String date)
    {
        String dayy="01";
       String result = date.substring(0, date.length() - 2);
       result=result+dayy;
       return result;
    }
    
    public static String thangnuoccu(String date)
    {
        String[] parts = date.split("-");
       int k= Integer.valueOf(parts[1]);
       k=k-1;
       String MM = String.valueOf(k);
       if(MM.length()!=2)
       {
            MM="0"+MM;
       }
      
       String rs=parts[0]+"-"+MM+"-"+parts[2];
        
       return rs;
    }
     public static int getSonuoccu(String ngay,String idmt) {
        int sonuoc=0;
        String SQL="select * from W_METER_DETAILS where Creating_Date=? and ID_W_METER=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,ngay);
             ps.setString(2,idmt);
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                sonuoc=rs.getInt("Current_Num");
      
            }
               
        } catch (Exception e) {
        }
          
        
          
        return sonuoc;
    }
     
       public static void main(String[] args)
     {
      //   String k=convertngay("2000-02-03");
 
//           String date ="2024-04-01";
         int k=getSonuoccu("2024-03-01","001");
         System.out.println("i : "+k);
//          List <W_Meter_Details> list =getChiTietCongTo(date);
//          
//          for(W_Meter_Details i : list)
//          {
//              System.out.println("i : "+i.getID_W_Meter());
//          }
//         System.out.println("i : "+getCCCDByIDMeter("001"));
 //         System.out.println("i : "+getHotenByCCCD("012345678905"));
     } 
}
