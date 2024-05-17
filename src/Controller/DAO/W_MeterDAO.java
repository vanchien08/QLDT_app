
package Controller.DAO;

import Controller.DBS;
import Model.Accounts;
import Model.W_Meters;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class W_MeterDAO {
    private List<W_Meters> listWmeters=new ArrayList<>();
    
    public List<W_Meters> getAll() throws Exception{
        this.listWmeters.clear();
        String SQL="SELECT * FROM W_METERS";
           try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  W_Meters tmp =new W_Meters();
                  tmp.setID_W_Meter(rs.getString("ID_W_METER"));
                  tmp.setID_Customer(rs.getInt("ID_Customer"));
                  tmp.setAddress(rs.getString("Address"));
                  tmp.setType_Living(rs.getString("Type_Living"));
                  tmp.setStatus(rs.getBoolean("Status"));

                  this.listWmeters.add(tmp);
            }
        }
           System.out.println("Chieu dai cua e meter ben DAO: "+this.listWmeters.size());
        return listWmeters;
    }
}
