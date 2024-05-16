/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import main.raven.event.EventMenuSelected;
import main.raven.form.Form_1;
import main.raven.form.Form_2;
import main.raven.form.Form_3;
import main.raven.form.Form_Home;
import main.raven.form.Form_HomePage;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import main.raven.form.Form_4;
import main.raven.form.Form_5;
import main.raven.form.KhoanPhi;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Form_Home home;
    private Form_1 form1;
    private Form_2 form2;
    private Form_3 form3;
     private Form_4 form4;
      private Form_5 form5;
    private KhoanPhi khoanphi;
    private Form_HomePage homepage;
    private JPanel MainPanel;
    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        home = new Form_Home();
        form1 = new Form_1();
        form2 = new Form_2();
        form3 = new Form_3();
        form4 = new Form_4();
        form5 = new Form_5();
        khoanphi= new KhoanPhi();
        homepage= new Form_HomePage();
        
       menu.initMoving(Main.this);
        menu.addEventMenuSelected((int index) -> {
            if (index == 0) {
                setForm(homepage);
            } else if (index == 1) {
                setForm(form1);
            }
             else if (index == 2) {
                setForm(form3);
            }else if (index == 3) {
                setForm(form2);
            } else if (index == 4) {
                setForm(home);
            }
          
            else if (index == 5) {
                setForm(form4);
            }
            else if (index == 6) {
                setForm(form5);
            }
        });
        //  set when system open start with home form
        setForm(new Form_HomePage());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new main.raven.swing.PanelBorder();
        menu = new main.raven.component.Menu();
        mainPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(Logo, java.awt.BorderLayout.CENTER);
        mainPanel.add(Logo1, java.awt.BorderLayout.PAGE_START);

        Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Name.setText("CTY Dịch Vụ Nước Thủ Đức");
        Name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }
 public JPanel getMainPanel() {
        
        return mainPanel;
    }
   public void setMainPanel(JPanel MainPanel) {
        this.MainPanel = MainPanel;
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel mainPanel;
    private main.raven.component.Menu menu;
    private main.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
