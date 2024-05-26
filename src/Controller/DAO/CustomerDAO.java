
package Controller.DAO;

import Model.Customers;
import java.util.ArrayList;
import java.util.List;
import Controller.DBS;
import Model.Accounts;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAO {
    private List<Customers>listcustomer =new ArrayList<Customers>();
      // Lấy thông tin của tất cả chủ hộ  
      public List<Customers> getAll() throws Exception{
        listcustomer.clear();
        String SQL = """
                     SELECT P.CCCD, P.Firstname, P.Lastname, P.Middlename, P.DOB, P.Address, P.Phone, P.Sex ,C.ID_Staff_Input
                     FROM CUSTOMERS C
                     JOIN ACCOUNTS A ON C.Account_Customer = A.Account_Username
                     JOIN PERSON_INFOS P ON A.CCCD = P.CCCD
                     WHERE A.Status=0;""";
        try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  Customers tmp=new Customers();
                  tmp.setCCCD(rs.getString("CCCD"));
                  tmp.setFirstname(rs.getString("Firstname"));
                  tmp.setLastname(rs.getString("Lastname"));
                  tmp.setMiddleName(rs.getString("Middlename")); 
                  tmp.setDOB(rs.getDate("DOB"));
                  tmp.setAddress(rs.getString("Address"));
                  tmp.setPhone(rs.getString("Phone"));
                  tmp.setSex(rs.getBoolean("Sex"));
                  tmp.setId_Staff(rs.getInt("ID_Staff_Input"));
                  listcustomer.add(tmp);
            }
        }
        return listcustomer;
    }    
    public int getIdCustomerbyCCCD(String CCCD){
        int customerID=0;
        String SQL="SELECT ID \n" +
                    "FROM ACCOUNTS A \n" +
                    "JOIN CUSTOMERS C ON A.Account_Username = C.Account_Customer \n" +
                    "WHERE A.CCCD = ?";
        
        try {
            Connection cnn = DBS.getConnection();
            PreparedStatement pre = cnn.prepareStatement(SQL);
            pre.setString(1, CCCD);
            ResultSet re=pre.executeQuery();
            while(re.next()){
                customerID=re.getInt("ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      return  customerID;
    }
    
}
