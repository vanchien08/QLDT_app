/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.GhiNuoc;

import Controller.DAO.AccountsDAO;
import Controller.DAO.W_MeterDetailDAO;

import Controller.QLPhanQuyenTKController.DSTaiKhoanPhanQuyen;
import static Controller.QLPhanQuyenTKController.DSTaiKhoanPhanQuyen.setListAccount;
import Model.Accounts;
import Model.W_Meter_Details;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class GhiNuocController {
    private List <W_Meter_Details> listWM;
    
     public static List <W_Meter_Details> KhoiTaoListCongTo(String k) {
        try {
            Date date =new Date();
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        String datestr=sp.format(date);
            
         List <W_Meter_Details> listWM = new W_MeterDetailDAO().getChiTietCongTo(k);
            return listWM;
        } catch (Exception ex) {
            Logger.getLogger(DSTaiKhoanPhanQuyen.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
     
     public static void main(String[] args)
     {
//   
//          List <W_Meter_Details> list =KhoiTaoListCongTo();
//          for(W_Meter_Details i : list)
//          {
//              System.out.println("i : "+i.getID_W_Meter());
//          }
     } 
      
}
