/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connector.KetNoiSQL;
import Model.ThongTinHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDonDao {
     public List<ThongTinHoaDon> getAllHoaDonPhong() {
        List<ThongTinHoaDon> list = new ArrayList<>();

        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from HOADON order by DAY desc";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinHoaDon hoadon = new ThongTinHoaDon();
                hoadon.setId(rs.getInt("ID"));
                hoadon.setCCCD_CH(rs.getString("CCCD_CHUHO"));
                hoadon.setCCCD_NV(rs.getString("CCCD_NV"));
                hoadon.setDay(rs.getDate("DAY"));
                hoadon.setAmount(rs.getFloat("amount"));
                hoadon.setTrangThai(rs.getString("trangThai"));
              
                list.add(hoadon);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
