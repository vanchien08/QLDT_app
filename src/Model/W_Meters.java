package Model;

import java.util.List;

public class W_Meters {
    private String ID_W_Meter;
    private int ID_Customer;
    private String Address;
    private String Type_Living;
    private boolean Status ;
    
    private List <Invoices> ListInvoice;

    public List<Invoices> getListInvoice() {
        return ListInvoice;
    }

    public void setListInvoice(List<Invoices> ListInvoice) {
        this.ListInvoice = ListInvoice;
    }
    
    public W_Meters() {}

    public W_Meters(int ID_Customer, String Address, String Type_Living, boolean Status, List<Invoices> ListInvoice) {
        this.ID_Customer = ID_Customer;
        this.Address = Address;
        this.Type_Living = Type_Living;
        this.Status = Status;
        this.ListInvoice = ListInvoice;
    }

    public W_Meters(String ID_W_Meter, int ID_Customer, String Address, String Type_Living, boolean Status, List<Invoices> ListInvoice) {
        this.ID_W_Meter = ID_W_Meter;
        this.ID_Customer = ID_Customer;
        this.Address = Address;
        this.Type_Living = Type_Living;
        this.Status = Status;
        this.ListInvoice = ListInvoice;
    }

    public String getID_W_Meter() {
        return ID_W_Meter;
    }

    public int getID_Customer() {
        return ID_Customer;
    }

    public String getAddress() {
        return Address;
    }

    public String getType_Living() {
        return Type_Living;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setID_W_Meter(String ID_W_Meter) {
        this.ID_W_Meter = ID_W_Meter;
    }

    public void setID_Customer(int ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setType_Living(String Type_Living) {
        this.Type_Living = Type_Living;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    

   
    
}
