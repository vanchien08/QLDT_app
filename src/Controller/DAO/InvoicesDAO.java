
package Controller.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.DBS;
import Controller.ProgramVariableAndFunction;
import Helper.DateDBToString;
import Model.Invoices;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
public class InvoicesDAO {
    private List<Invoices>invoiceslist=new ArrayList<>();
    
    public List<Invoices> getAll() throws Exception{
        this.invoiceslist.clear();
        String SQL="SELECT * FROM INVOICES";
           try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  Invoices tmp =new Invoices();
                  tmp.setId(rs.getInt("ID"));
                  tmp.setInvoice_Date(rs.getString("Invoice_Date"));
                  tmp.setInvoice_Status(rs.getBoolean("Invoice_Status"));
                  tmp.setStart_Num(rs.getInt("Start_Num"));
                  tmp.setEnd_Num(rs.getInt("End_Num"));
                  tmp.setTotal_Price(rs.getDouble("Total_Price"));
                  tmp.setID_W_Meter_Details(rs.getInt("ID_Details"));
                  tmp.setID_Staff_Write(rs.getInt("ID_Staff_Write"));
                  this.invoiceslist.add(tmp);
            }
        }
        return invoiceslist;
    } 
    
    
   public static List<Invoices> getAllInvoiceChuHo(String username) {
    List<Invoices> invoiceslist = new ArrayList<>();
    String SQL = "SELECT *\n" +
"FROM W_METERS wm\n" +
"JOIN CUSTOMERS ctm ON wm.ID_Customer = ctm.ID\n" +
"JOIN ACCOUNTS acc ON acc.Account_Username = ctm.Account_Customer\n" +
"JOIN W_METER_DETAILS wmdt ON wmdt.ID_W_METER = wm.ID_W_METER\n" +
"JOIN INVOICES inv ON inv.ID_Details = wmdt.ID where acc.Account_Username= ?";
    try {
        Connection con = new DBS().getConnection();
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, username);
        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Invoices tmp = new Invoices();
            tmp.setId(rs.getInt("ID")); // Thay đổi tên cột theo đúng tên trong cơ sở dữ liệu
            tmp.setInvoice_Date(DateDBToString.DateToString(rs.getDate("Invoice_Date"))); // Tên cột giả định
            tmp.setInvoice_Status(rs.getBoolean("Invoice_Status")); // Tên cột giả định
//            tmp.setLevel(rs.getInt("inv.level")); // Bỏ comment nếu cần
            tmp.setStart_Num(rs.getInt("Start_Num"));
              tmp.setEnd_Num(rs.getInt("End_Num"));
            tmp.setTotal_Price(rs.getDouble("Total_Price")); // Tên cột giả định
            
            invoiceslist.add(tmp);
        }
    } catch (SQLException ex) {
        Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (Exception ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return invoiceslist;
}

    
    
    
    
       public static void main(String[] args) 
     {
       
       System.out.println("i : "+ getAllInvoiceChuHo("NguyenVanK").get(0).getTotal_Price()) ;
        
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

    public List<Invoices> getAllInCase(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
              
              
    
}
