
package Model;

import java.sql.Date;

public class W_Meter_Details {
     private String ID_W_Meter;
     private int Current_num;
     private Date Creating_Date;

    public W_Meter_Details(String ID_W_Meter, int Current_num, Date Creating_Date) {
        this.ID_W_Meter = ID_W_Meter;
        this.Current_num = Current_num;
        this.Creating_Date = Creating_Date;
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
