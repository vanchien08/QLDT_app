package Controller.DAO;

import Controller.DBS;
import Controller.ProgramVariable;
import Model.Accounts;
import Model.Customers;
import Model.Personal_Infos;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class Personal_InfosDAO {
    private List<Personal_Infos> ListPersonal_InfosDAO = new ArrayList<>();
    
    public List<Personal_Infos> getAll() throws Exception{
        ListPersonal_InfosDAO.clear();
        String SQL = "SELECT * FROM [dbo].[PERSON_INFOS]";
        try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  Personal_Infos Ps = new Personal_Infos();
                  Ps.setCCCD(rs.getString("CCCD"));
                  Ps.setFirstname(rs.getString("Firstname"));
                  Ps.setLastname(rs.getString("Lastname"));
                  Ps.setMiddleName(rs.getString("Middlename"));
                  Ps.setDOB(rs.getDate("DOB"));
                  Ps.setAddress(rs.getString("Address"));
                  Ps.setPhone(rs.getString("Phone"));
                  Ps.setSex(rs.getBoolean("Sex"));                
                  
                  ListPersonal_InfosDAO.add(Ps);
            }
        }
        return ListPersonal_InfosDAO;
    }
    
    public void AddDAO(Personal_Infos Ps){
        String SQL = "INSERT INTO [dbo].[PERSON_INFOS]\n" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection con = new DBS().getConnection();
            PreparedStatement rs = con.prepareStatement(SQL);
            
            rs.setString(1, Ps.getCCCD());
            rs.setString(2, Ps.getFirstname());
            rs.setString(3, Ps.getLastname());
            rs.setString(4, Ps.getMiddleName());
            rs.setDate(5, Ps.getDOB());            
            rs.setString(6, Ps.getAddress());
            rs.setString(7, Ps.getPhone());
            rs.setBoolean(8, Ps.isSex());               
            
            int rowsAffected = rs.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Đã thêm người dùng vào hệ thống!!!");
                Accounts Acc = new Accounts();
                Acc.setAccount_Username("User-" + Ps.getCCCD());
                Acc.setAccount_Password("null");
                Acc.setCCCD(Ps.getCCCD());
                Acc.setPrivilege(-1);
                Acc.setStatus(false);
                new AccountsDAO().AddDAO(Acc);
            } else {
                System.out.println("Lỗi không thể thêm người dùng vào hệ thống!!!");
            }            
            
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Lỗi hệ thống!!! (Personal_InfosDAO) - AddDAO");
        }
    }
    
    public void Update_NoCCCDDAO(Personal_Infos Ps){
        String SQL = "UPDATE [dbo].[PERSON_INFOS]\n" +
                     "SET [Firstname] = ?,\n" +
                     "	  [Lastname] = ?,\n" +
                     "	  [Middlename] = ?,\n" +
                     "	  [DOB] = ?,\n" +
                     "	  [Address] = ?,\n" +
                     "	  [Phone] = ?,\n" +
                     "	  [Sex] = ?\n" +
                     "    WHERE [CCCD] = ?";
      try {
            Connection con = new DBS().getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL);
            
            stmt.setString(1, Ps.getFirstname());
            stmt.setString(2, Ps.getLastname());
            stmt.setString(3, Ps.getMiddleName());
            stmt.setDate(4, Ps.getDOB());
            stmt.setString(5, Ps.getAddress());
            stmt.setString(6, Ps.getPhone());
            stmt.setBoolean(7, Ps.isSex());
            stmt.setString(8, Ps.getCCCD());

            int affectedRows = stmt.executeUpdate();
        
            if (affectedRows > 0) {
                System.out.println("Thông báo hệ thống đã cập nhật người dùng có CCCD: " + Ps.getCCCD() + " thành công!");
            } else {
                System.out.println("Cập nhật người dùng có CCCD: " + Ps.getCCCD() + " trên hệ thống thất bại!!!");
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Lỗi hệ thống!!! (Personal_InfosDAO) - UpdateNoCCCD");
        }        
    }
    
    public void UpdateCCCDDAO(String CCCD_Cu, String CCCD_Moi){
        String SQL = "UPDATE [dbo].[PERSON_INFOS]\n" +
                     "SET [CCCD] = ? \n" +
                     "WHERE [CCCD] = ?";
      try {
            Connection con = new DBS().getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL);
            
            stmt.setString(1, CCCD_Moi);
            stmt.setString(2, CCCD_Cu);

            int affectedRows = stmt.executeUpdate();
        
            if (affectedRows > 0) {
                System.out.println("Thông báo hệ thống đã cập nhật CCCD người dùng có CCCD cũ là: " + CCCD_Cu + " thành công!");
            } else {
                System.out.println("Cập nhật người dùng có CCCD: " + CCCD_Cu + " trên hệ thống thất bại!!!");
            }
        } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Lỗi hệ thống!!! (Personal_InfosDAO) - UpdateCCCD");
        }        
    }
    public List<Personal_Infos> getAllStaffGhincInfo()throws Exception{
//            String SQL= "SELECT * FROM PERSON_INFOS p WHERE p.CCCD IN (SELECT A.CCCD FROM ACCOUNTS A WHERE A.Account_Username IN (SELECT S.Account_Staffs FROM STAFFS S WHERE S.Role = 1) AND A.Status = 0);";
            String SQL="SELECT P.CCCD, P.Firstname, P.Lastname, P.Middlename, P.DOB, P.Address, P.Phone, P.Sex \n" +
                        "FROM STAFFS S\n" +
                        "JOIN ACCOUNTS A ON S.Account_Staffs = A.Account_Username\n" +
                        "JOIN PERSON_INFOS P ON A.CCCD = P.CCCD\n" +
                        "WHERE S.Role = 0;";
        try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  Personal_Infos Ps = new Personal_Infos();
                  Ps.setCCCD(rs.getString("CCCD"));
                  Ps.setFirstname(rs.getString("Firstname"));
                  Ps.setLastname(rs.getString("Lastname"));
                  Ps.setMiddleName(rs.getString("Middlename"));
                  Ps.setDOB(rs.getDate("DOB"));
                  Ps.setAddress(rs.getString("Address"));
                  Ps.setPhone(rs.getString("Phone"));
                  Ps.setSex(rs.getBoolean("Sex"));                
                  
                  ListPersonal_InfosDAO.add(Ps);
            }
        }
        return ListPersonal_InfosDAO;     
    }
    public Personal_Infos getStaffInfosbyID(int id) throws Exception{
         String SQL = "SELECT " +
             "    P.CCCD, " +
             "    P.Firstname, " +
             "    P.Lastname, " +
             "    P.Middlename, " +
             "    P.DOB, " +
             "    P.Address, " +
             "    P.Phone, " +
             "    P.Sex " +
             "FROM " +
             "    STAFFS S " +
             "JOIN " +
             "    ACCOUNTS A ON S.Account_Staffs = A.Account_Username " +
             "JOIN " +
             "    PERSON_INFOS P ON A.CCCD = P.CCCD " +
             "WHERE S.ID = ?";
          Personal_Infos Ps = new Personal_Infos();

            try (
                Connection con = new DBS().getConnection();
                PreparedStatement stmt = con.prepareStatement(SQL);
               
            ) {
                // Set the parameter value for S.ID
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        
                        Ps.setCCCD(rs.getString("CCCD"));
                        Ps.setFirstname(rs.getString("Firstname"));
                        Ps.setLastname(rs.getString("Lastname"));
                        Ps.setMiddleName(rs.getString("Middlename"));
                        Ps.setDOB(rs.getDate("DOB"));
                        Ps.setAddress(rs.getString("Address"));
                        Ps.setPhone(rs.getString("Phone"));
                        Ps.setSex(rs.getBoolean("Sex"));                

                        ListPersonal_InfosDAO.add(Ps);
                    }
                }
            }
            return Ps;
    }   
}
