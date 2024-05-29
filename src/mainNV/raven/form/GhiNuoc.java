package mainNV.raven.form;

import Controller.DAO.W_MeterDetailDAO;
import static Controller.DAO.W_MeterDetailDAO.getaddressByIdmeter;
import Controller.DSNhanVienController.DSNhanVien;
import Controller.GhiNuoc.GhiNuocController;
import Controller.QLThongTinChungController.DSThongTinChung;
import Controller.SupportFunction.StringProcessing;
import UI.BangDanhSach;
import Model.Personal_Infos;
import Model.Staffs;
import Model.W_Meter_Details;
import View.AdminView.DSNhanVienView.DSNhanVienDialog.FilterLoaiDateDSNVDialog;
import View.AdminView.DSNhanVienView.DSNhanVienDialog.SortLoaiStringDSNVDialog;
import main.raven.model.Model_Card;
import main.raven.model.StatusType;
import main.raven.swing.ScrollBar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import login.raven.component.PanelLoginAndRegister;

public class GhiNuoc extends javax.swing.JPanel {
    private List<W_Meter_Details> listghinuoc;
    SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
    Date date =new Date();
    String _dateNow;
    int _idstaff;
    private W_Meter_Details _wMeter;
    int i=-1;
    public GhiNuoc() {
        initComponents();
        _idstaff=PanelLoginAndRegister._idStaff;
         String datestr=sp.format(date);
         datestr =new W_MeterDetailDAO().convertngay(datestr);
         _dateNow=datestr;
        listghinuoc= new GhiNuocController().KhoiTaoListCongTo(datestr,_idstaff);
       setTxtThoiGian();
        ShowThongTinTuDBS(BangGhiNuoc);
     //   System.out.println("id staff" + PanelLoginAndRegister._idStaff);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        TimKiemTf = new javax.swing.JTextField();
        TimKiemCb = new UI.ComboboxThuong();
        TimKiemBt = new UI.ButtonThuong();
        LamMoiBt = new UI.ButtonThuong();
        BangSrllp = new javax.swing.JScrollPane();
        BangGhiNuoc = new UI.BangDanhSach();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTuThang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTuNam = new com.toedter.calendar.JYearChooser();
        btnLocKetQua = new javax.swing.JButton();
        TimKiemBt1 = new UI.ButtonThuong();
        LamMoiBt1 = new UI.ButtonThuong();
        jLabel2 = new javax.swing.JLabel();
        TimKiemBt2 = new UI.ButtonThuong();

        setOpaque(false);

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        TimKiemTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TimKiemTf.setForeground(new java.awt.Color(102, 102, 102));
        TimKiemTf.setToolTipText("");
        TimKiemTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimKiemTf.setName(""); // NOI18N

        TimKiemCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Họ và tên", "CCCD", "Công tơ" }));
        TimKiemCb.setSelectedItem(null
        );
        TimKiemCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimKiemCb.setLabeText("(Tìm kiếm theo)");
        TimKiemCb.setLineColor(new java.awt.Color(0, 153, 255));
        TimKiemCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemCbActionPerformed(evt);
            }
        });

        TimKiemBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/raven/icon/search1.png"))); // NOI18N
        TimKiemBt.setText("Tìm kiếm");
        TimKiemBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtActionPerformed(evt);
            }
        });

        LamMoiBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/raven/icon/refesh.png"))); // NOI18N
        LamMoiBt.setText("Làm mới");
        LamMoiBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LamMoiBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiBtActionPerformed(evt);
            }
        });

        BangGhiNuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CCCD", "Họ và tên", "Số nước cũ", "Số nước mới", "Địa chỉ", "Công tơ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangGhiNuoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        BangGhiNuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BangGhiNuocMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BangGhiNuocMouseReleased(evt);
            }
        });
        BangSrllp.setViewportView(BangGhiNuoc);

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));

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

        txtTuNam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTuNamFocusLost(evt);
            }
        });
        txtTuNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTuNamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTuNamMousePressed(evt);
            }
        });

        btnLocKetQua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLocKetQua.setForeground(new java.awt.Color(19, 90, 118));
        btnLocKetQua.setText("Chọn");
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
                        .addComponent(txtTuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLocKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(39, 39, 39)
                .addComponent(btnLocKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        TimKiemBt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/raven/icon/letter.png"))); // NOI18N
        TimKiemBt1.setText("Ghi nước");
        TimKiemBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBt1ActionPerformed(evt);
            }
        });

        LamMoiBt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/raven/icon/edit.png"))); // NOI18N
        LamMoiBt1.setText("cập nhật");
        LamMoiBt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LamMoiBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiBt1ActionPerformed(evt);
            }
        });

        TimKiemBt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/raven/icon/delete.png"))); // NOI18N
        TimKiemBt2.setText("xóa");
        TimKiemBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BangSrllp, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TimKiemTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(128, 128, 128)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimKiemCb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TimKiemBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LamMoiBt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LamMoiBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TimKiemBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(TimKiemBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(panel)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimKiemCb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimKiemTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LamMoiBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimKiemBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimKiemBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LamMoiBt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimKiemBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BangSrllp, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiemCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemCbActionPerformed

    private void TimKiemBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtActionPerformed
        W_MeterDetailDAO wmd = new W_MeterDetailDAO();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(LayNgayThangTu());
            
        BangGhiNuoc.setSelectionMode(2);
        Object selected = TimKiemCb.getSelectedIndex();
        String textTimKiem=TimKiemTf.getText();
        if(TimKiemTf.getText().replaceAll(" ", "").equals("") || selected == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại tìm kiếm và không bỏ trống thông tin nhập!!!");
        }
         if((int)selected==0){
           listghinuoc= wmd.getListChiTietCongToByName(textTimKiem,date,_idstaff);
            ShowThongTinTuDBS(BangGhiNuoc);
        }
        if((int)selected==1){
           listghinuoc= wmd.getChiTietCongToByCCCD(textTimKiem,date,_idstaff);
            System.out.println("text + date + id stagffg "+ textTimKiem+date+_idstaff);
            ShowThongTinTuDBS(BangGhiNuoc);
        }
        if((int)selected==2){
           listghinuoc= wmd.getListChiTietCongToByIDMeter(textTimKiem,date,_idstaff);
            ShowThongTinTuDBS(BangGhiNuoc);
        }

        
     //   System.out.println("selectindex "+selected);
//        if(TimKiemTf.getText().replaceAll(" ", "").equals("") || selected == null){
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại tìm kiếm và không bỏ trống thông tin nhập!!!");
//        }else if(selected.equals("CCCD")){
//            if(!DSNhanVien.Searching(TimKiemTf.getText(), BangGhiNuoc, 1))
//            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có CCCD: " + TimKiemTf.getText());
//            else
//            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có CCCD: " + TimKiemTf.getText());
//        }else if(selected.equals("Họ và tên")){
//            if(!DSNhanVien.Searching(TimKiemTf.getText(), BangGhiNuoc, 2))
//            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có họ tên: " + TimKiemTf.getText());
//            else
//            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có họ tên: " + TimKiemTf.getText());
//        }else if(selected.equals("Địa chỉ")){
//            if(!DSNhanVien.Searching(TimKiemTf.getText(), BangGhiNuoc, 3))
//            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có địa chỉ: " + TimKiemTf.getText());
//            else
//            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có địa chỉ: " + TimKiemTf.getText());
//        }else if(selected.equals("SĐT")){
//            if(!DSNhanVien.Searching(TimKiemTf.getText(), BangGhiNuoc, 4))
//            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có SĐT: " + TimKiemTf.getText());
//            else
//            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có SĐT: " + TimKiemTf.getText());
//        }else if(selected.equals("Account")){
//            if(!DSNhanVien.Searching(TimKiemTf.getText(), BangGhiNuoc, 5))
//            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có Account: " + TimKiemTf.getText());
//            else
//            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có Account: " + TimKiemTf.getText());
//        }
    }//GEN-LAST:event_TimKiemBtActionPerformed

    private void LamMoiBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiBtActionPerformed
      //  MainAdminview.setForm(new DSNhanVienMainView(MainAdminview));
      i=-1;
      refreshTable();
    }//GEN-LAST:event_LamMoiBtActionPerformed

    private void BangGhiNuocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangGhiNuocMousePressed
       i = BangGhiNuoc.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangGhiNuoc.getModel();
        String idCongTo=(String) model.getValueAt(i, 5);
        
        W_Meter_Details wmd =new W_MeterDetailDAO().getaddressByIdmeter(idCongTo,_dateNow);
   //     System.out.println("mdafmsdf "+wmd.getCurrent_num());
//        this.St = st;
//        DangChonTf.setText(St.getCCCD());
    }//GEN-LAST:event_BangGhiNuocMousePressed

    private void BangGhiNuocMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangGhiNuocMouseReleased
//        int i = BangGhiNuoc.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel) BangGhiNuoc.getModel();
//        Staffs st = DSNhanVien.SearchObjCCCD((String) model.getValueAt(i, 0));
//        
//        this.St = st;
//        DangChonTf.setText(St.getCCCD());
    }//GEN-LAST:event_BangGhiNuocMouseReleased

    private void txtTuThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuThangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTuThangActionPerformed

    private void txtTuNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTuNamMouseClicked
        // TODO add your handling code here:
        System.out.print("helooo");
    }//GEN-LAST:event_txtTuNamMouseClicked

    private void btnLocKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocKetQuaActionPerformed
        // TODO add your handling code here:
        //        if (LayNgayThangTu().compareTo(LayNgayThangDen()) > 0) {
            //            JOptionPane.showMessageDialog(null, "Ngày bắt đầu lọc lớn hơn ngày kết thúc lọc. Vui lòng nhập lại!");
            //        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String tungay = formatter.format(LayNgayThangTu());
            // String denngay = formatter.format(LayNgayThangDen());
      //      System.out.println("lay ngay -ghinuoc = "+tungay);
          //  String maphong = txtCCCD_CH.getText();
            String trangthai="Chưa thanh toán";
          
            
                LocKetQua(tungay, trangthai);
                      ShowThongTinTuDBS(BangGhiNuoc);
          
            //   }
    }//GEN-LAST:event_btnLocKetQuaActionPerformed

    private void TimKiemBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBt1ActionPerformed
        // TODO add your handling code here:
        JDialogGhiSoNuoc jdl =new JDialogGhiSoNuoc(true);
        jdl.setVisible(true);
      
    }//GEN-LAST:event_TimKiemBt1ActionPerformed

    private void txtTuNamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTuNamFocusLost
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtTuNamFocusLost

    private void txtTuNamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTuNamMousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtTuNamMousePressed

    public void setTxtThoiGian(){
        String datenow =_dateNow;
        W_MeterDetailDAO wmd = new W_MeterDetailDAO();
        txtTuThang.setSelectedIndex(wmd.getOnlyMonth(datenow));
        txtTuNam.setYear(wmd.getOnlyYear(datenow));
//        int tuthang = txtTuThang.getSelectedIndex() + 1;
//        int tunam = txtTuNam.getYear();
//        String tungay = tunam + "-" + tuthang + "-01";
//
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = formatter.parse(String.valueOf(tungay));
//        } catch (Exception e) {
//        }
      
    }
    public void refreshTable(){
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String tungay = formatter.format(LayNgayThangTu());
      String datestr=sp.format(date);
         datestr =new W_MeterDetailDAO().convertngay(datestr);
        listghinuoc= new GhiNuocController().KhoiTaoListCongTo(tungay,_idstaff);
       ShowThongTinTuDBS(BangGhiNuoc);
    }
    private void LamMoiBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiBt1ActionPerformed
        // TODO add your handling code here:
//        JDialogCapNhatHoaDon jdl = new JDialogCapNhatHoaDon(true);
//        jdl.setVisible(true);
      
           if (i == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hóa đơn để cập nhật trạng thái hóa đơn");
        } else {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String tungay = formatter.format(LayNgayThangTu());
//            int count1 = tablehd.getSelectedRow();
              JDialogCapNhatHoaDon capnhathd = new JDialogCapNhatHoaDon(true);
//            Map <String,String> i=listhd.get(count1);
//          
//              float snm = Float.parseFloat((String) i.get("soNuocMoi"));
//             float snc = Float.parseFloat((String) i.get("soNuocCu"));
//
//            float tongtien=(snm-snc)*5;
//            String tongtienstr = String.valueOf(tongtien);
//           //  System.out.println("hoa don"+ hdp.getCCCD_CH());
      //      capnhathd.dataHoaDon(i,tongtienstr);
               i = BangGhiNuoc.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangGhiNuoc.getModel();
        String idCongTo=(String) model.getValueAt(i, 5);
        
        W_Meter_Details wmd =new W_MeterDetailDAO().getaddressByIdmeter(idCongTo,tungay);
            capnhathd.setdataHoaDon(wmd);
            capnhathd.setVisible(true);
//            count = -1;
//            showTable();
           }
    }//GEN-LAST:event_LamMoiBt1ActionPerformed

    private void TimKiemBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBt2ActionPerformed
        // TODO add your handling code here:
        if(i==-1)
        {
              JOptionPane.showMessageDialog(null, "Vui lòng chọn công tơ để xóa!");
        }
        
        else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa bảng ghi hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String tungay = formatter.format(LayNgayThangTu());
                    DefaultTableModel model = (DefaultTableModel) BangGhiNuoc.getModel();
                String idCongTo=(String) model.getValueAt(i, 5);
                new W_MeterDetailDAO().DeleteWMDetail(idCongTo, tungay);
                refreshTable();
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa bảng ghi thành công");
            }
        }
       
       
        
    }//GEN-LAST:event_TimKiemBt2ActionPerformed
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
    public void ShowThongTinTuDBS(BangDanhSach bangDS){
        
        W_MeterDetailDAO wmtd= new W_MeterDetailDAO();
        DefaultTableModel model = (DefaultTableModel) BangGhiNuoc.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); 
         
     //   listghinuoc = DSThongTinChung.getListPersonal_Infos();
   //     listghinuoc= new GhiNuocController().KhoiTaoListCongTo();
   //     System.err.println("vô dược rồi  "+listghinuoc.size());
        model.setRowCount(0);    
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        for(W_Meter_Details ps : listghinuoc){
  //          String Gioi_tinh;
        //    String name = ps.getFirstname() + " " + ps.getMiddleName()+ " " + ps.getLastname();
//            String Ten = new StringProcessing().Name(name);
//            if(ps.isSex())
//                Gioi_tinh = "Nam";
//            else
//                Gioi_tinh = "Nữ";
        String thangnay=dateFormat1.format(ps.getCreating_Date());
        String cccd=wmtd.getCCCDByIDMeter(ps.getID_W_Meter());
        String hoten =wmtd.getHotenByCCCD(cccd);
        String thangcu = wmtd.thangnuoccu(thangnay);
        int sonuoccu=wmtd.getSonuoccu(thangcu,ps.getID_W_Meter());
        String address= wmtd.getaddressByIdmeter(ps.getID_W_Meter());
     //       System.err.println("fsdgsd"+ps.getId());
            Object[] rowData = {
              cccd,hoten,sonuoccu,ps.getCurrent_num(),address,ps.getID_W_Meter()
            };

            model.addRow(rowData);
        }   
        StringProcessing.StringSortingTable(BangGhiNuoc, 0, true);
        model.fireTableDataChanged();
    }
     private void LocKetQua(String tungay, String trangthai) {
      listghinuoc = new GhiNuocController().KhoiTaoListCongTo(tungay,_idstaff);

//       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
//        Model.setRowCount(0);
//
//        
//        for (Map i :listhd) {
//            float snm = Float.parseFloat((String) i.get("soNuocMoi"));
//             float snc = Float.parseFloat((String) i.get("soNuocCu"));
//
//            float tongtien=(snm-snc)*5;
//            String tongtienstr = String.valueOf(tongtien);
//
//            Model.addRow(new Object[]{
//            i.get("CCCD_CHUHO"),i.get("soNuocMoi"),i.get("soNuocCu"),tongtienstr,i.get("trangThai")
//               
//           });
//    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.BangDanhSach BangGhiNuoc;
    private javax.swing.JScrollPane BangSrllp;
    private UI.ButtonThuong LamMoiBt;
    private UI.ButtonThuong LamMoiBt1;
    private UI.ButtonThuong TimKiemBt;
    private UI.ButtonThuong TimKiemBt1;
    private UI.ButtonThuong TimKiemBt2;
    private UI.ComboboxThuong TimKiemCb;
    private javax.swing.JTextField TimKiemTf;
    private javax.swing.JButton btnLocKetQua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane panel;
    private com.toedter.calendar.JYearChooser txtTuNam;
    private javax.swing.JComboBox<String> txtTuThang;
    // End of variables declaration//GEN-END:variables
}
