package Model;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class ThongTinHoaDon {
   private int id;
   private String CCCD_CH;
   private String CCCD_NV;
   private Date Day;
   private float amount;
   private String trangThai;

    public int getId() {
        return id;
    }

    public String getCCCD_CH() {
        return CCCD_CH;
    }

    public String getCCCD_NV() {
        return CCCD_NV;
    }

    public Date getDay() {
        return Day;
    }

    public float getAmount() {
        return amount;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setCCCD_CH(String CCCD_CH) {
        this.CCCD_CH = CCCD_CH;
    }

    public void setCCCD_NV(String CCCD_NV) {
        this.CCCD_NV = CCCD_NV;
    }

    public void setDay(Date Day) {
        this.Day = Day;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
