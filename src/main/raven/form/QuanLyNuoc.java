/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.raven.form;
//


import Model.ThongTinHoaDon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.raven.swing.ScrollBar;

/**
 *
 * @author Phan Tien
 */
public class QuanLyNuoc extends javax.swing.JPanel {

    private DefaultTableModel Model;
    private int count = -1;
    private List<ThongTinHoaDon> list;
    private String ngayLoc;
   
    private List<Map> listhd;
    /**
     * Creates new form QuanLyDienNuoc
     */
    public QuanLyNuoc() {
        initComponents();
        Model = (DefaultTableModel) tablehd.getModel();
        tablehd.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablehd.getTableHeader().setOpaque(false);
        tablehd.getTableHeader().setBackground(new Color(19, 90, 118));
        tablehd.getTableHeader().setForeground(new Color(225, 225, 225));
         jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.getVerticalScrollBar().setBackground(Color.WHITE);
         jScrollPane1.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        jScrollPane1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
     
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
//            Model.addRow(new Object[]{"Việt Trung", "viettrung@gmail.com", "Subscriber", "25 Apr,2018", "sddf"});
            
        try {
           showTable();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        buttonDonGiaDienNuoc = new javax.swing.JButton();
        buttonGhiSoDienNuoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablehd = new main.raven.swing.Table();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTuThang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTuNam = new com.toedter.calendar.JYearChooser();
        jLabel7 = new javax.swing.JLabel();
        cbThanhToan = new javax.swing.JCheckBox();
        btnLocKetQua = new javax.swing.JButton();
        txtCCCD_CH = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        buttonTTHD = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(19, 90, 112));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NƯỚC ĐÔ THỊ");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(237, 50, 55));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("QUẢN LÝ HÓA ĐƠN DỊCH VỤ");

        buttonDonGiaDienNuoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDonGiaDienNuoc.setForeground(new java.awt.Color(19, 90, 118));
        buttonDonGiaDienNuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-compose-48.png"))); // NOI18N
        buttonDonGiaDienNuoc.setText("SỬA ĐƠN GIÁ NƯỚC");
        buttonDonGiaDienNuoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDonGiaDienNuoc.setOpaque(true);
        buttonDonGiaDienNuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDonGiaDienNuocActionPerformed(evt);
            }
        });

        buttonGhiSoDienNuoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonGhiSoDienNuoc.setForeground(new java.awt.Color(19, 90, 118));
        buttonGhiSoDienNuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-compose-48.png"))); // NOI18N
        buttonGhiSoDienNuoc.setText(" GHI CHỈ SỐ ĐIỆN NƯỚC");
        buttonGhiSoDienNuoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGhiSoDienNuoc.setOpaque(true);
        buttonGhiSoDienNuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGhiSoDienNuocActionPerformed(evt);
            }
        });

        tablehd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablehd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CCCD Chủ hộ", "SỐ NƯỚC MỚI", "SỐ NƯỚC CŨ", "TỔNG TIỀN", "TRẠNG THÁI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablehd.setGridColor(new java.awt.Color(19, 90, 118));
        tablehd.setRowHeight(25);
        tablehd.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tablehd.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablehd.setShowGrid(true);
        tablehd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablehdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablehd);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setText("Bộ lọc :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 90, 118));
        jLabel3.setText("Từ tháng :");

        txtTuThang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtTuThang.setForeground(new java.awt.Color(19, 90, 118));
        txtTuThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        txtTuThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuThangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 90, 118));
        jLabel4.setText("Từ năm :");

        txtTuNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTuNamMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 90, 118));
        jLabel7.setText("CCCD_CH");

        cbThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        cbThanhToan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbThanhToan.setForeground(new java.awt.Color(19, 90, 118));
        cbThanhToan.setText("Đã thanh toán");

        btnLocKetQua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLocKetQua.setForeground(new java.awt.Color(19, 90, 118));
        btnLocKetQua.setText("LỌC KẾT QUẢ");
        btnLocKetQua.setOpaque(true);
        btnLocKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocKetQuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTuThang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtTuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLocKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCCCD_CH))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbThanhToan)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTuThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtTuNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCCCD_CH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbThanhToan)
                .addGap(18, 18, 18)
                .addComponent(btnLocKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(19, 90, 118));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-48.png"))); // NOI18N
        buttonDelete.setText("Xóa hóa đơn");
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.setRequestFocusEnabled(false);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonTTHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonTTHD.setForeground(new java.awt.Color(19, 90, 118));
        buttonTTHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-compose-48.png"))); // NOI18N
        buttonTTHD.setText("CẬP NHẬT ");
        buttonTTHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTTHD.setOpaque(true);
        buttonTTHD.setPreferredSize(new java.awt.Dimension(204, 39));
        buttonTTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTTHDActionPerformed(evt);
            }
        });

        buttonReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(19, 90, 118));
        buttonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-update-48.png"))); // NOI18N
        buttonReset.setText("Làm mới");
        buttonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(buttonTTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonGhiSoDienNuoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonDonGiaDienNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonGhiSoDienNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDonGiaDienNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        add(main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDonGiaDienNuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDonGiaDienNuocActionPerformed
        // TODO add your handling code here:

      //  JDialogDonGiaDienNuoc capnhat = new JDialogDonGiaDienNuoc(true);
      //  capnhat.setVisible(true);
    }//GEN-LAST:event_buttonDonGiaDienNuocActionPerformed

    private void buttonGhiSoDienNuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGhiSoDienNuocActionPerformed
        // TODO add your handling code here:
//        main.setVisible(false);
//        this.jPanelDienNuoc.setVisible(true);
//        this.jPanelDienNuoc.AddComboboxPhong();
//        this.jPanelDienNuoc.showTable();
      SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
      SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");
            String tungay = formatter.format(LayNgayThangTu());
            String tungay2 = formatter2.format(LayNgayThangTu());
            ngayLoc=tungay;
            String ngayLoc2=tungay2;
            System.out.println("ngay2"+tungay2);
        JDialogGhiSoNuoc jdln =new JDialogGhiSoNuoc(true);
        jdln.setVisible(true);
        Map<String,Object> dataHD =new HashMap<>();
        dataHD.put("thangghi",tungay2);
        dataHD.put("thangghi1",ngayLoc2);
        jdln.setData(dataHD);
        
        
        
        



    }//GEN-LAST:event_buttonGhiSoDienNuocActionPerformed

    private void tablehdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablehdMouseClicked
        // TODO add your handling code here:
        count = tablehd.getSelectedRow();
    }//GEN-LAST:event_tablehdMouseClicked

    private void btnLocKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocKetQuaActionPerformed
        // TODO add your handling code here:
//        if (LayNgayThangTu().compareTo(LayNgayThangDen()) > 0) {
//            JOptionPane.showMessageDialog(null, "Ngày bắt đầu lọc lớn hơn ngày kết thúc lọc. Vui lòng nhập lại!");
//        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String tungay = formatter.format(LayNgayThangTu());
           // String denngay = formatter.format(LayNgayThangDen());
            String maphong = txtCCCD_CH.getText();
            String trangthai="Chưa thanh toán";
            if (cbThanhToan.isSelected()) {
                trangthai = "Đã thanh toán";
            }
            if (maphong.equals("Tất cả")) {
             //   LocKetQuaAll(tungay, denngay, trangthai);
            } else {
                LocKetQua(tungay, trangthai, maphong);

            }
     //   }
    }//GEN-LAST:event_btnLocKetQuaActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hóa đơn để xóa");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hóa đơn không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                ThongTinHoaDon hdp = list.get(count);
                deleteHoaDon(hdp);

                showTable();
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonTTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTTHDActionPerformed
       //  TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hóa đơn để cập nhật trạng thái hóa đơn");
        } else {
            int count1 = tablehd.getSelectedRow();
            JDialogCapNhatHoaDon capnhathd = new JDialogCapNhatHoaDon(true);
            Map <String,String> i=listhd.get(count1);
          
              float snm = Float.parseFloat((String) i.get("soNuocMoi"));
             float snc = Float.parseFloat((String) i.get("soNuocCu"));

            float tongtien=(snm-snc)*5;
            String tongtienstr = String.valueOf(tongtien);
           //  System.out.println("hoa don"+ hdp.getCCCD_CH());
            capnhathd.dataHoaDon(i,tongtienstr);
            capnhathd.setVisible(true);
            count = -1;
            showTable();
        }
    }//GEN-LAST:event_buttonTTHDActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        count = -1;
        showTable();
//        AddComboboxPhong();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void txtTuThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuThangActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtTuThangActionPerformed

    private void txtTuNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTuNamMouseClicked
        // TODO add your handling code here:
        System.out.print("helooo");
    }//GEN-LAST:event_txtTuNamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocKetQua;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDonGiaDienNuoc;
    private javax.swing.JButton buttonGhiSoDienNuoc;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonTTHD;
    private javax.swing.JCheckBox cbThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
    private javax.swing.JTable tablehd;
    private javax.swing.JTextField txtCCCD_CH;
    private com.toedter.calendar.JYearChooser txtTuNam;
    private javax.swing.JComboBox<String> txtTuThang;
    // End of variables declaration//GEN-END:variables

    void showTable() {
       // list = new HoaDonDao().getAllHoaDonNuoc();
       listhd=new HoaDonDao().getAllHoaDonNuoc();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
        Model.setRowCount(0);

        
        for (Map i :listhd) {
            float snm = Float.parseFloat((String) i.get("soNuocMoi"));
             float snc = Float.parseFloat((String) i.get("soNuocCu"));

            float tongtien=(snm-snc)*5;
            String tongtienstr = String.valueOf(tongtien);

            Model.addRow(new Object[]{
            i.get("CCCD_CHUHO"),i.get("soNuocMoi"),i.get("soNuocCu"),tongtienstr,i.get("trangThai")
               
           });


}
        
        
    }

    void deleteHoaDon(ThongTinHoaDon hdp) {
        hdp=list.get(count);
        Connection conn = KetNoiSQL.getConnection();
        String sql = "delete from HOADON where ID = ?";

      
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hdp.getId());
         //  ps.setString(2, ngaythang);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xóa hóa đơn thành công");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Date LayNgayThangTu() {
        int tuthang = txtTuThang.getSelectedIndex() + 1;
        int tunam = txtTuNam.getYear();
        String tungay = tunam + "-" + tuthang + "-01";

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = formatter.parse(String.valueOf(tungay));
        } catch (Exception e) {
        }
        return date;
    }

//    private Date LayNgayThangDen() {
//        int tuthang = txtDenThang.getSelectedIndex() + 1;
//        int tunam = txtDenNam.getYear();
//        String tungay = tunam + "-" + tuthang + "-01";
//
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = formatter.parse(String.valueOf(tungay));
//        } catch (Exception e) {
//        }
//        return date;
//    }

    private void LocKetQua(String tungay, String trangthai, String phong) {
        listhd = new HoaDonDao().searchBill(tungay,  trangthai, phong);
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
        Model.setRowCount(0);

        
        for (Map i :listhd) {
            float snm = Float.parseFloat((String) i.get("soNuocMoi"));
             float snc = Float.parseFloat((String) i.get("soNuocCu"));

            float tongtien=(snm-snc)*5;
            String tongtienstr = String.valueOf(tongtien);

            Model.addRow(new Object[]{
            i.get("CCCD_CHUHO"),i.get("soNuocMoi"),i.get("soNuocCu"),tongtienstr,i.get("trangThai")
               
           });
    }
    }
//
//    private void LocKetQuaAll(String tungay, String denngay, byte trangthai) {
//        list = new HoaDonPhongDAO().searchHoaDonPhongAll(tungay, denngay, trangthai);
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
//        Model.setRowCount(0);
//        for (HoaDonPhong hd : list) {
//            Date date = null;
//            try {
//                date = formatter.parse(String.valueOf(hd.getNgayThang()));
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            String trangthaihd;
//            String ngayThang = formatter1.format(date);
//            if (hd.getTrangThai() == 1) {
//                trangthaihd = "Đã thanh toán";
//            } else {
//                trangthaihd = "Chưa thanh toán";
//            }
//
//            Model.addRow(new Object[]{
//                ngayThang, hd.getMaPhong(), hd.getSoNuocTieuThu(), hd.getSoDienTieuThu(), hd.getTongTien(), trangthaihd
//            });
//        }
//    }
//
//    public void AddComboboxPhong() {
//
//        txtMaPhong.removeAllItems();
//        txtMaPhong.addItem("Tất cả");
//        List<ThongTinPhong> listphong = new PhongDAO().getAllThongTinPhong();
//
//        for (ThongTinPhong phong : listphong) {
//            txtMaPhong.addItem(phong.getMaPhong());
//        }
//    }
//
//    void deleteDichVuPhong(HoaDonPhong hdp) {
//        Connection conn = KetNoiSQL.getConnection();
//        String sql = "delete from dichvuphong where maPhong = ? and ngayThang = ?";
//
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
//
//        Date date = null;
//        try {
//            date = formatter.parse(String.valueOf(hdp.getNgayThang()));
//        } catch (Exception e) {
//        }
//        String ngaythang = formatter.format(date);
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, hdp.getMaPhong());
//            ps.setString(2, ngaythang);
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Xóa hóa đơn thành công");
//            ps.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
