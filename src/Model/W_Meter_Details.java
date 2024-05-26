
package Model;

import java.sql.Date;

public class W_Meter_Details {
     private String ID_W_Meter;
     private int Current_num;
     private Date Creating_Date;
     private int id;
     private int staff_input;

    public int getId() {
        return id;
    }

    public int getStaff_input() {
        return staff_input;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStaff_input(int staff_input) {
        this.staff_input = staff_input;
    }
    
     
    public String getID_W_Meter() {
        return ID_W_Meter;
    }

    public void setID_W_Meter(String ID_W_Meter) {
        this.ID_W_Meter = ID_W_Meter;
    }

    public int getCurrent_num() {
        return Current_num;
    }

    public void setCurrent_num(int Current_num) {
        this.Current_num = Current_num;
    }

    public Date getCreating_Date() {
        return Creating_Date;
    }

    public void setCreating_Date(Date Creating_Date) {
        this.Creating_Date = Creating_Date;
    }
     
     
}
