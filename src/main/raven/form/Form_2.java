/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.raven.form;

/**
 *
 * @author RAVEN
 */
public class Form_2 extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public Form_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimKiemTf = new javax.swing.JTextField();
        TimKiemCb = new LayMotSoUIdepTaiDay.ComboboxThuong();
        jSeparator1 = new javax.swing.JSeparator();
        LocCkb = new LayMotSoUIdepTaiDay.ComboboxThuong();
        SapXepCkb = new LayMotSoUIdepTaiDay.ComboboxThuong();
        DangChonLbl = new javax.swing.JLabel();
        DangChonTf = new javax.swing.JTextField();
        BangSrllp = new javax.swing.JScrollPane();
        BangDSChuHo = new LayMotSoUIdepTaiDay.BangDanhSach();
        SapXepBt1 = new LayMotSoUIdepTaiDay.ButtonThuong();
        LocBt = new LayMotSoUIdepTaiDay.ButtonThuong();
        TimKiemBt = new LayMotSoUIdepTaiDay.ButtonThuong();
        LamMoiBt = new LayMotSoUIdepTaiDay.ButtonThuong();

        setOpaque(false);

        TimKiemTf.setBackground(new java.awt.Color(204, 204, 204));
        TimKiemTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TimKiemTf.setForeground(new java.awt.Color(102, 102, 102));
        TimKiemTf.setToolTipText("");
        TimKiemTf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TimKiemTf.setName(""); // NOI18N

        TimKiemCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CCCD", "Họ và tên", "Địa chỉ", "SĐT", "Account" }));
        TimKiemCb.setSelectedItem(null
        );
        TimKiemCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimKiemCb.setLabeText("(Tìm kiếm theo)");
        TimKiemCb.setLineColor(new java.awt.Color(0, 153, 255));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        LocCkb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Theo ngày sinh" }));
        LocCkb.setSelectedItem(null);
        LocCkb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LocCkb.setLabeText("(Chọn thuộc tính cần lọc)");

        SapXepCkb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Theo CCCD", "Theo họ và tên", "Theo địa chỉ", "Theo SĐT", "Theo ngày sinh", "Theo Account" }));
        SapXepCkb.setSelectedItem(null);
        SapXepCkb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SapXepCkb.setLabeText("(Chọn thuộc tính cần sắp xếp)");

        DangChonLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DangChonLbl.setText("Đang chọn (CCCD):");

        DangChonTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DangChonTf.setForeground(new java.awt.Color(102, 102, 102));
        DangChonTf.setText("NULL");
        DangChonTf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        BangDSChuHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CCCD", "Họ và tên", "Ngày sinh", "Địa chỉ", "SĐT", "Account", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangDSChuHo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        BangDSChuHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BangDSChuHoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BangDSChuHoMouseReleased(evt);
            }
        });
        BangSrllp.setViewportView(BangDSChuHo);

        SapXepBt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sort.png"))); // NOI18N
        SapXepBt1.setText("Sắp xếp");
        SapXepBt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SapXepBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SapXepBt1ActionPerformed(evt);
            }
        });

        LocBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/filter.png"))); // NOI18N
        LocBt.setText("Lọc");
        LocBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LocBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocBtActionPerformed(evt);
            }
        });

        TimKiemBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        TimKiemBt.setText("Tìm kiếm");
        TimKiemBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtActionPerformed(evt);
            }
        });

        LamMoiBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        LamMoiBt.setText("Làm mới");
        LamMoiBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LamMoiBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DangChonLbl)
                                .addGap(18, 18, 18)
                                .addComponent(DangChonTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimKiemTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(TimKiemCb, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TimKiemBt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LamMoiBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SapXepCkb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LocCkb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SapXepBt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BangSrllp)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LocCkb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SapXepCkb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SapXepBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(11, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TimKiemCb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TimKiemBt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LamMoiBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(TimKiemTf))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DangChonLbl)
                                .addComponent(DangChonTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BangSrllp, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BangDSChuHoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangDSChuHoMousePressed
        int i = BangDSChuHo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangDSChuHo.getModel();
        Customers cs = DSChuHo.SearchObjCCCD((String) model.getValueAt(i, 0));
        this.Cs = cs;
        DangChonTf.setText(Cs.getCCCD());
    }//GEN-LAST:event_BangDSChuHoMousePressed

    private void BangDSChuHoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangDSChuHoMouseReleased
        int i = BangDSChuHo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) BangDSChuHo.getModel();
        Customers cs = DSChuHo.SearchObjCCCD((String) model.getValueAt(i, 0));
        this.Cs = cs;
        DangChonTf.setText(Cs.getCCCD());
    }//GEN-LAST:event_BangDSChuHoMouseReleased

    private void SapXepBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SapXepBt1ActionPerformed
        Object selected = SapXepCkb.getSelectedItem();
        if(selected == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thuộc tính cần sắp xếp!!!");
        }else{
            SortLoaiStringDSCHDialog sortLoaiStringDSCHDialog = new SortLoaiStringDSCHDialog(this.MainAdminview, this, true);
            sortLoaiStringDSCHDialog.setVisible(true);
        }
    }//GEN-LAST:event_SapXepBt1ActionPerformed

    private void LocBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocBtActionPerformed
        Object selected = LocCkb.getSelectedItem();
        if(selected == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thuộc tính cần lọc!!!");
        }else if(selected.equals("Theo ngày sinh")){
            FilterLoaiDateDSCHDialog filterLoaiDateDSCHDialog = new FilterLoaiDateDSCHDialog(this.MainAdminview, this, true);
            filterLoaiDateDSCHDialog.setVisible(true);
        }
    }//GEN-LAST:event_LocBtActionPerformed

    private void TimKiemBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtActionPerformed
        BangDSChuHo.setSelectionMode(2);
        Object selected = TimKiemCb.getSelectedItem();
        if(TimKiemTf.getText().replaceAll(" ", "").equals("") || selected == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại tìm kiếm và không bỏ trống thông tin nhập!!!");
        }else if(selected.equals("CCCD")){
            if(!DSChuHo.Searching(TimKiemTf.getText(), BangDSChuHo, 1))
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có CCCD: " + TimKiemTf.getText());
            else
            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có CCCD: " + TimKiemTf.getText());
        }else if(selected.equals("Họ và tên")){
            if(!DSChuHo.Searching(TimKiemTf.getText(), BangDSChuHo, 2))
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có họ tên: " + TimKiemTf.getText());
            else
            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có họ tên: " + TimKiemTf.getText());
        }else if(selected.equals("Địa chỉ")){
            if(!DSChuHo.Searching(TimKiemTf.getText(), BangDSChuHo, 3))
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có địa chỉ: " + TimKiemTf.getText());
            else
            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có địa chỉ: " + TimKiemTf.getText());
        }else if(selected.equals("SĐT")){
            if(!DSChuHo.Searching(TimKiemTf.getText(), BangDSChuHo, 4))
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có SĐT: " + TimKiemTf.getText());
            else
            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có SĐT: " + TimKiemTf.getText());
        }else if(selected.equals("Account")){
            if(!DSChuHo.Searching(TimKiemTf.getText(), BangDSChuHo, 5))
            JOptionPane.showMessageDialog(this, "Không tìm thấy người dùng có Account: " + TimKiemTf.getText());
            else
            JOptionPane.showMessageDialog(this, "Đã tìm thấy người dùng có Account: " + TimKiemTf.getText());
        }
    }//GEN-LAST:event_TimKiemBtActionPerformed

    private void LamMoiBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiBtActionPerformed
        MainAdminview.setForm(new DSChuHoMainView(MainAdminview));
    }//GEN-LAST:event_LamMoiBtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.BangDanhSach BangDSChuHo;
    private javax.swing.JScrollPane BangSrllp;
    private javax.swing.JLabel DangChonLbl;
    private javax.swing.JTextField DangChonTf;
    private LayMotSoUIdepTaiDay.ButtonThuong LamMoiBt;
    private LayMotSoUIdepTaiDay.ButtonThuong LocBt;
    private LayMotSoUIdepTaiDay.ComboboxThuong LocCkb;
    private LayMotSoUIdepTaiDay.ButtonThuong SapXepBt1;
    private LayMotSoUIdepTaiDay.ComboboxThuong SapXepCkb;
    private LayMotSoUIdepTaiDay.ButtonThuong TimKiemBt;
    private LayMotSoUIdepTaiDay.ComboboxThuong TimKiemCb;
    private javax.swing.JTextField TimKiemTf;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
