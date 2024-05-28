
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
import java.util.UUID;

/**
 *
 * @author DELL
 */
public class W_MeterDetailDAO {
    public  List<W_Meter_Details> getChiTietCongTo(String ngay,int idstaff) {
    List<W_Meter_Details> list =new ArrayList<>();
        String SQL="select * from W_METER_DETAILS where Creating_Date=? and ID_Staff_Input=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, ngay);
            ps.setInt(2,idstaff);
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
                  tmp.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
                  tmp.setId(rs.getInt("ID"));
                  list.add(tmp);
                  
              
              
            }
               
        } catch (Exception e) {
        }
          
        
          
        return list;
    }
    
    public  List<W_Meter_Details> getListChiTietCongToByIDMeter(String idct,String ngay,int idStaff) {
    List<W_Meter_Details> list =new ArrayList<>();
        String SQL="select * from W_METER_DETAILS where ID_W_METER like ? and Creating_Date=? and ID_Staff_Input=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1, "%" +idct+ "%");
            ps.setString(2, ngay);
            ps.setInt(3, idStaff);
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
                  tmp.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
                  tmp.setId(rs.getInt("ID"));
                  list.add(tmp);
                  
              
              
            }
               
        } catch (Exception e) {
        }
          
        
          
        return list;
    }
    
    
    public  List<W_Meter_Details> getChiTietCongToByCCCD(String CCCD,String date,int idstaff) {
    List<W_Meter_Details> list =new ArrayList<>();
                String SQL="SELECT * FROM W_METERS wm \n" +
"        JOIN CUSTOMERS ctm ON wm.ID_Customer = ctm.ID\n" +
"        join ACCOUNTS acc on acc.Account_Username=ctm.Account_Customer  \n" +
"        join W_METER_DETAILS wmdt on wmdt.ID_W_METER=wm.ID_W_METER\n" +
"        where CCCD Like ? and Creating_Date=? and wmdt.ID_Staff_Input=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
           ps.setString(1, "%" + CCCD + "%");
            ps.setString(2, date);
             ps.setInt(3, idstaff);
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
                  tmp.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
                  tmp.setId(rs.getInt("ID"));
                  list.add(tmp);
                  
              
              
            }
               
        } catch (Exception e) {
        }
          
        
          
        return list;
    }
    
     public  List<W_Meter_Details> getListChiTietCongToByName(String Name,String date,int idStaff) {
    List<W_Meter_Details> list =new ArrayList<>();
                String SQL="SELECT * FROM W_METERS wm \n" +
"JOIN CUSTOMERS ctm ON wm.ID_Customer = ctm.ID \n" +
"join ACCOUNTS acc on acc.Account_Username=ctm.Account_Customer \n" +
"join W_METER_DETAILS wmdt on wmdt.ID_W_METER=wm.ID_W_METER\n" +
"join PERSON_INFOS psif on psif.CCCD=acc.CCCD  where CONCAT(Firstname, ' ',  Middlename,' ',Lastname ) like ? and Creating_Date=? and wmdt.ID_Staff_Input=?";
           try {
            
             Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
           ps.setString(1, "%" + Name + "%");
            ps.setString(2, date);
              ps.setInt(3,idStaff);
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
                  tmp.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
                  tmp.setId(rs.getInt("ID"));
                  list.add(tmp);
                  
              
              
            }
               
        } catch (Exception e) {
        }
          
        
          
        return list;
    }
    
     public static W_Meter_Details getaddressByIdmeter(String idmt,String date) {
        W_Meter_Details wmd= new W_Meter_Details();
        String SQL="select * from W_METER_DETAILS where ID_W_METER=? and Creating_Date=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmt);
              ps.setString(2,date);
          
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
               wmd.setId(rs.getInt("ID"));
                wmd.setID_W_Meter(rs.getString("ID_W_METER"));
                 wmd.setCurrent_num(rs.getInt("Current_Num"));
                  wmd.setCreating_Date(rs.getDate("Creating_Date"));
                   wmd.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
      
            }
               
        } catch (Exception e) {
        }

        return wmd;
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
    
       public int getOnlyMonth(String date)
    {
        String[] parts = date.split("-");
       int k= Integer.valueOf(parts[1]);
       k=k-1;
       String MM = String.valueOf(k);

       return k;
    }
           public int getOnlyYear(String date)
    {
        String[] parts = date.split("-");
       int k= Integer.valueOf(parts[0]);
      
       return k;
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
      public static String getaddressByIdmeter(String idmt) {
        String addr="";
        String SQL="select * from W_METERS where ID_W_METER=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmt);
          
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                addr=rs.getString("Address");
      
            }
               
        } catch (Exception e) {
        }
          
        
          
        return addr;
    }
     public boolean checkExistWMetter(String idmt){
         boolean check= false;
         String SQL="select * from W_METERS where ID_W_METER=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmt);
          
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
               check=true;
      
            }
               
        } catch (Exception e) {
        }
           return check;
         
     }
      public void AddWmetter(String idmt,int currentnum,int idstaff,String date){
        //Thêm Account vào một Account mới 
        String SQL = "INSERT INTO W_METER_DETAILS (ID_W_METER,Current_Num,ID_Staff_Input,Creating_Date) VALUES(?, ?, ?,?);";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
            rs.setString(1, idmt);
            rs.setInt(2, currentnum);
            rs.setInt(3, idstaff);
            rs.setString(4, date);
       
            int rowsAffected = rs.executeUpdate();
        
            
        } catch (Exception ex) {
            ex.printStackTrace();
//            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - AddDAO");
        }
      }
      
      public static void UpdateSoNuoc(String idmt,int currentnum,String date){
        //Thêm Account vào một Account mới 
        String SQL = "update W_METER_DETAILS set Current_Num=? where Creating_Date=? and ID_W_METER=?";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
           
            rs.setInt(1, currentnum);
              rs.setString(2, date);
             rs.setString(3, idmt);

            int rowsAffected = rs.executeUpdate();
        
            
        } catch (Exception ex) {
            ex.printStackTrace();
//            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - AddDAO");
        }
      }
         public int getPrivilegeByUsername(String username) {
        int role=0;
        String SQL="select * from ACCOUNTS where Account_Username=? ";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,username);
            
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                role=rs.getInt("Privilege");
      
            }
               
        } catch (Exception e) {
        }

        return role;
    }
         
         public int getIDstaffByUsername(String username) {
        int id=0;
        String SQL="select * from ACCOUNTS acc join STAFFS stf on acc.Account_Username =stf.Account_Staffs where Account_Username=? ";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,username);
            
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
                id=rs.getInt("ID");
      
            }
               
        } catch (Exception e) {
        }

        return id;
    }
         
          public boolean checkIdStaff(int idstaff,String idmt) {
       boolean t= false;
        String SQL="select * from CUSTOMERS ctm \n" +
"join W_METERS wm on ctm.ID = wm.ID_Customer where ID_Staff_Input=? and ID_W_METER=? ";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setInt(1,idstaff);
             ps.setString(2,idmt);
            
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
               t=true;
      
            }
               
        } catch (Exception e) {
        }

        return t;
    }
          
         public boolean checkExistWMDetail(String idmt,String date) {
       boolean t= false;
        String SQL="select * from W_METER_DETAILS where ID_W_METER=? and Creating_Date=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmt);
             ps.setString(2,date);
            
            ResultSet rs = ps.executeQuery();
       
            while(rs.next()){
                 
               t=true;
      
            }
               
        } catch (Exception e) {
        }

        return t;
    }
           public void DeleteWMDetail(String idmt,String date) {
       boolean t= false;
        String SQL="delete from W_METER_DETAILS where ID_W_METER=? and Creating_Date=?";
           try {
            
                 Connection con = new DBS().getConnection();
             PreparedStatement ps = con.prepareStatement(SQL);
             ps.setString(1,idmt);
             ps.setString(2,date);
            
            ps.executeUpdate();
            ps.close();
            con.close();
           
        } catch (Exception e) {
        }

      
    }
       
        
     
       public static void main(String[] args)
     {
       
      //   System.out.println("i : "+ checkExistWMDetail("005","2024-05-01")) ;
        
//        W_Meter_Details wmd = getaddressByIdmeter("001","2024-04-01");
//                 System.out.println("i : "+wmd.getCurrent_num());
      //   String k=convertngay("2000-02-03");
        //    AddWmetter("001",2,2,"2000-2-4");
//           String date ="2024-04-01";
//         int k=getSonuoccu("2024-03-01","001");
//         System.out.println("i : "+k);
//         String addr= getaddressByIdmeter("001");
//           System.out.println("i : "+addr);
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

