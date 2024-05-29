
package Controller.DAO;

import Controller.DBS;
import Model.W_Meter_Details;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.DBS;
import java.sql.Connection;

public class W_Meter_DetailsDAO {
    
   private List<W_Meter_Details>listEmeterDetail=new ArrayList<>();
   
    public List<W_Meter_Details> getAll() throws Exception{
        this.listEmeterDetail.clear();
        String SQL="SELECT * FROM W_METER_DETAILS";
           try(
            Connection con = new DBS().getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
        ){
            while(rs.next()){
                  W_Meter_Details tmp =new W_Meter_Details();
                  tmp.setId(rs.getInt("ID"));
                  tmp.setID_W_Meter(rs.getString("ID_W_METER"));
                  tmp.setCurrent_num(rs.getInt("Current_Num"));
                  tmp.setCreating_Date(rs.getDate("Creating_Date"));
                  tmp.setID_Staff_Input(rs.getInt("ID_Staff_Input"));
                  this.listEmeterDetail.add(tmp);
            }
        }
        return listEmeterDetail;
    }
}
