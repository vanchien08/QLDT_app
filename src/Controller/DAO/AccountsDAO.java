package Controller.DAO;

import Controller.DBS;
import Model.Accounts;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountsDAO {
    private List<Accounts> ListAccountDAO = new ArrayList<>();

    public List<Accounts> getListAccountDAO() {
        return ListAccountDAO;
    }

    public void setListAccountDAO(List<Accounts> ListAccountDAO) {
        this.ListAccountDAO = ListAccountDAO;
    }
    
    public List<Accounts> getAll() throws Exception{
        ListAccountDAO.clear();
        String SQL = "SELECT * FROM [dbo].[ACCOUNTS]";
        try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  Accounts Acc = new Accounts();
                  Acc.setAccount_Username(rs.getString("Account_Username"));
                  Acc.setCCCD(rs.getString("CCCD"));
                  Acc.setAccount_Password(rs.getString("Account_Password"));
                  Acc.setPrivilege(rs.getInt("Privilege"));          
                  Acc.setStatus(rs.getBoolean("Status"));  
                  
                  ListAccountDAO.add(Acc);
            }
        }
        return ListAccountDAO;
    }    
    
    public void AddDAO(Accounts Acc){
        //Thêm Account vào một Account mới 
        String SQL = "INSERT INTO [dbo].[ACCOUNTS] \n" +
                     "VALUES(?, ?, ?, ?, 0);";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
            rs.setString(1, Acc.getAccount_Username());
            rs.setString(2, Acc.getCCCD());
            rs.setString(3, Acc.getAccount_Password());
            rs.setInt(4, Acc.getPrivilege());    
       
            int rowsAffected = rs.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Đã thêm người dùng vào hệ thống!!!");
            } else {
                System.out.println("Lỗi không thể thêm người dùng vào hệ thống!!!");
            }            
            
        } catch (Exception ex) {
            ex.printStackTrace();
//            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - AddDAO");
        }
        // Thêm đối tượng vào trong Customer table và Staff
        String SQL2="";
        
         List list = new ArrayList();
        AccountsDAO acd =new AccountsDAO();
        list =acd.getIDNV();
        Random random = new Random();
        int randomm = random.nextInt(list.size()+1);
        
        try {
             Connection con = new DBS().getConnection();

            
             if(Acc.getPrivilege()==0){
            
            SQL2="INSERT INTO CUSTOMERS ( Account_Customer,ID_Staff_Input)\n" +
                    "VALUES (?,?);";
     PreparedStatement rs = con.prepareStatement(SQL2); 
            rs.setString(1, Acc.getAccount_Username());
            rs.setInt(2, (int)list.get(randomm));
            
            int rowsAffected = rs.executeUpdate();
        }else if(Acc.getPrivilege()==1){
            SQL2="INSERT INTO STAFFS (Account_Staffs) VALUES (?)";
        PreparedStatement rs = con.prepareStatement(SQL2); 
            rs.setString(1, Acc.getAccount_Username());
            
            int rowsAffected = rs.executeUpdate();

        }
           
           
//            if (rowsAffected > 0) {
//                System.out.println("Đã thêm đối tượng nhân viên và chủ hộ vào hệ thống!!!");
//            } else {
//                System.out.println("Lỗi không thể thêm đối tượng nhân viên vào hệ thống!!!");
//            }            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - AddDAO");
        }
    }
    
    public void DeleteDAO(String Account){
        String SQL = "UPDATE [dbo].[ACCOUNTS]\n" +
                     "SET [Status] = 1\n" +
                     "WHERE [Account_Username] = ?";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
            rs.setString(1, Account);
            
           int rowsAffected = rs.executeUpdate();
           
           if (rowsAffected > 0) {
                System.out.println("Đã khóa account người dùng có Account: " + Account + "trên hệ thống!!!");
                
            } else {
                System.out.println("Lỗi không thể khóa account người dùng có Account: " + Account + " trên hệ thống!!!");
            }  
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - DeleteDAO");
        }
    }
 
    public void UnlockDAO(String Account){
        String SQL = "UPDATE [dbo].[ACCOUNTS]\n" +
                     "SET [Status] = 0\n" +
                     "WHERE [Account_Username] = ?";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
            rs.setString(1, Account);
            
           int rowsAffected = rs.executeUpdate();
           
           if (rowsAffected > 0) {
                System.out.println("Đã mở khóa account người dùng có Account: " + Account + "trên hệ thống!!!");
                
            } else {
                System.out.println("Lỗi không thể mở khóa account người dùng có Account: " + Account + " trên hệ thống!!!");
            }  
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Lỗi hệ thống!!! (AccountsDAO) - DeleteDAO");
        }
    }    
    
    public void UpdateTTCDAO(Accounts Acc){
        String SQL = "UPDATE [dbo].[ACCOUNTS]\n" +
                     "SET [Account_Username] = ?, \n" +
                     "    [Account_Password] = ?  \n" +
                     "WHERE [CCCD] = ? AND [Privilege] = ?";
      try {
            Connection con = new DBS().getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL);
            
            stmt.setString(1, Acc.getAccount_Username());
            stmt.setString(2, Acc.getAccount_Password());
            stmt.setString(3, Acc.getCCCD());
            stmt.setInt(4, Acc.getPrivilege());            
            int affectedRows = stmt.executeUpdate();
        
            if (affectedRows > 0) {
                System.out.println("Thông báo hệ thống đã cập nhật Account người dùng có CCCD: " + Acc.getCCCD() + " thành công!");
            } else {
                System.out.println("Cập nhật Account người dùng có CCCD: " + Acc.getCCCD() + " trên hệ thống thất bại!!!");
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Lỗi hệ thống!!! (AccountsDAO) - UpdateDAO");
        }           
    }
    
    public void UpdatePrivilegeDAO(Accounts Acc){
        String SQL = "UPDATE [dbo].[ACCOUNTS]\n" +
                     "SET [Privilege] = ? \n" +
                     "WHERE [Account_Username] = ?";
      try {
            Connection con = new DBS().getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL);
 
            stmt.setInt(1, Acc.getPrivilege());            
            stmt.setString(2, Acc.getAccount_Username());
            
            int affectedRows = stmt.executeUpdate();
        
            if (affectedRows > 0) {
                System.out.println("Thông báo hệ thống đã cập nhật Account người dùng có CCCD: " + Acc.getCCCD() + " thành công!");
            } else {
                System.out.println("Cập nhật Account người dùng có CCCD: " + Acc.getCCCD() + " trên hệ thống thất bại!!!");
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Lỗi hệ thống!!! (AccountsDAO) - UpdateDAO");
        }           
    }
    public boolean KiemTraUsername(String userName) {
        
       
        try {
                 Connection con = new DBS().getConnection();
        String sql ="select * from ACCOUNTS where Account_Username='"+userName+"' ";
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
       
        try {
             Connection conn = new DBS().getConnection();
        String sql = "select * from ACCOUNTS where Account_Username  ='" + username + "'";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               password=rs.getString("Account_Password");
               
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return password;
    }
     public List<Integer> getIDNV() {
        List list = new ArrayList<>();
        String SQL = "SELECT ID FROM [dbo].[STAFFS]";
        
        try (
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ) {
            while (rs.next()) {
                

                list.add(rs.getInt("ID"));
            }
        } catch (Exception e) {
            e.printStackTrace(); // Xử lý ngoại lệ (ví dụ: ghi log)
        }
        return list;
    }

    
    
}
