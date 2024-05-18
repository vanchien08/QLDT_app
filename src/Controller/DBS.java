package Controller;



import Controller.DAO.AccountsDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBS {
        public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Tmp_TienNuoc;encrypt=false;";
        String username = "sa";
        String password = "1234567";
        //12345
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
         public static boolean kiemTraKetNoi() throws Exception {
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
 
    public static void main(String[] args) throws Exception {
      
        if (DBS.kiemTraKetNoi()) {
            System.out.println("connect success!");
        } else {
           System.out.println("Can't connect DB!");
        }
    }
    

}
