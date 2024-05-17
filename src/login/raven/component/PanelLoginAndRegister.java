package login.raven.component;

import Controller.DAO.AccountsDAO;
import Controller.DAO.Personal_InfosDAO;
import Model.Accounts;
import Model.Personal_Infos;
import Model.ThongTinChuHo;
import View.Main;
import View.Login;
import login.raven.swing.Button;
import login.raven.swing.MyPasswordField;
import login.raven.swing.MyTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {
    private ActionListener event;

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }
  
    private void initRegister() {
     //   register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
      register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]10[]10[]10[]10[]10[]10[]10[]25[]push"));
     JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
       label.setForeground(new Color(73, 108, 168));
        register.add(label);
       
               MyTextField txtten = new MyTextField();
       // txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/user.png")));
        txtten.setHint("   Tên");
        register.add(txtten, "w 60%");
        
        MyTextField txtho = new MyTextField();
       // txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/user.png")));
        txtho.setHint("   Họ");
        register.add(txtho, "w 29%, split 2");
         MyTextField txthodem = new MyTextField();
       // txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/user.png")));
        txthodem.setHint("   Họ đệm");
        register.add(txthodem, "w 29.5%");

        
        MyTextField txtCCCD = new MyTextField();
       // txtCCCD.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtCCCD.setHint("   Căn cước công dân");
        register.add(txtCCCD, "w 60%");
        MyTextField txtDOB = new MyTextField();
       // txtDOB.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtDOB.setHint("   Ngày Sinh dd/MM/yyyy");
        register.add(txtDOB, "w 60%");
        MyTextField txtAddress = new MyTextField();
       // txtAddress.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtAddress.setHint("   Địa chỉ");
        register.add(txtAddress, "w 60%");
        MyTextField txtPhonenum = new MyTextField();
       // txtPhonenum.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/mail.png")));
        txtPhonenum.setHint("   Số điện thoại");
        register.add(txtPhonenum, "w 60%");
        
        MyTextField txtGTinh = new MyTextField();
      //  txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtGTinh.setHint("   Giới tính (NAM/NU)");
        register.add(txtGTinh, "w 60%");
        
        MyTextField txtUsername = new MyTextField();
      //  txtUsername.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtUsername.setHint("   Tên tài khoản");
        register.add(txtUsername, "w 60%");
        
        MyPasswordField txtPass = new MyPasswordField();
      //  txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/com/raven/icon/pass.png")));
        txtPass.setHint("   Mật khẩu");
        register.add(txtPass, "w 60%");
        
        Button cmd = new Button();
        //cmd.setBackground(new Color(7, 164, 121));
        cmd.setBackground(new Color(73, 108, 168));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN UP");
        
        
        cmd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          //  ChuHoDao CHD= new ChuHoDao();
        Personal_InfosDAO psd =new Personal_InfosDAO(); 
            
           // Login loginjframe= new Login();
            
//           loginjframe.init();
           
        
             String cccd="";
             String phonenum="";
             String username="";
            String ngaysinh="";
            cccd = txtCCCD.getText().trim();
        String ho = txtho.getText().trim();
        String ten=txtten.getText().trim();
        String hodem=txthodem.getText().trim();
       ngaysinh = txtDOB.getText().trim();
        String address = txtAddress.getText().trim();
         phonenum = txtPhonenum.getText().trim();
         username = txtUsername.getText().trim();
        String password = txtPass.getText().trim();
        String gioitinh = txtGTinh.getText().trim();
       // System.out.println("check data"+cccd+name);
         String yccccd = "^([0-9]{9})*([0-9]{12})*$";
          String ycsdt = "^[0]{1}[0-9]{9}";
       
          boolean kiemtracccd = psd.KiemTraCCCD(cccd);
          boolean kiemtraphonenum = psd.KiemTraPhoneNum(phonenum);
          boolean kiemtrausername = psd.KiemTraUsername(username);
          
          if (ho.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống họ tên. Vui lòng điền thông tin đầy đủ!");
        }
          else if (cccd.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống Căn cước công dân. Vui lòng điền thông tin đầy đủ!");
        }
           else if (!cccd.matches(yccccd)) {
            JOptionPane.showMessageDialog(login, "Vui lòng nhập đúng định dạng.Căn cước công dân gồm 12 chữ số và chứng minh nhân dân gồm 9 chữ số!");
        }
          else if (kiemtracccd) {
            JOptionPane.showMessageDialog(login, "căn cước công dân này đã tồn tại!");
        }
          else if (ngaysinh.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống ngày sinh. Vui lòng điền thông tin đầy đủ!");
        }
          else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống địa chỉ. Vui lòng điền thông tin đầy đủ!");
        }
          
          else if (phonenum.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống số điện thoại. Vui lòng điền thông tin đầy đủ!");
        }
          else if (!phonenum.matches(ycsdt)) {
            JOptionPane.showMessageDialog(login, "Vui lòng nhập đúng định dạng.Số điện thoại gồm 10 chữ số!");
        }
           else if (kiemtraphonenum) {
            JOptionPane.showMessageDialog(login, "Số điện thoại này đã tồn tại!");
        }
          else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống tên đăng nhập. Vui lòng điền thông tin đầy đủ!");
        }
          else if (kiemtrausername) {
            JOptionPane.showMessageDialog(login, "Tên đăng nhập này đã tồn tại!");
        }
           else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống mật khẩu. Vui lòng điền thông tin đầy đủ!");
        }
            else if (gioitinh.isEmpty()) {
            JOptionPane.showMessageDialog(login, "Không để trống giới tính. Vui lòng điền thông tin đầy đủ!");
        }
           else{
            Login loginFrame = (Login) SwingUtilities.getWindowAncestor((Component) e.getSource());
           // loginFrame.init();
            loginFrame.handelSignUp();
            
            
//            Map<String,String> account = new HashMap<>();
//            account.put("username", ho);
//            account.put("password", password);
//             account.put("CCCD", cccd );
//             account.put("trangThai", "0");
           // System.out.print("username password: " + account.get("username") + " " + account.get("password"));
           int k=0;
           Accounts acc = new Accounts();
           acc.setAccount_Password(password);
           acc.setAccount_Username(username);
           acc.setCCCD(cccd);
           acc.setPrivilege(k);
            System.out.print("prrrrr"+acc.getPrivilege());
           acc.setStatus(true);
           
           
            String dobText = txtDOB.getText();


            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            try {
             
            Date dob = dateFormat.parse(dobText);
                  
                  AccountsDAO accdao = new AccountsDAO();
                  
//            ThongTinChuHo CH = new ThongTinChuHo();
//            CH.setName(ho);
//            CH.setCCCD_CH(cccd);
//            CH.setDOB(dob);
//            CH.setAddress(address);
//            CH.setPhoneNum(phonenum);
                Personal_Infos ps= new Personal_Infos();
                ps.setAddress(address);
                ps.setCCCD(cccd);
                ps.setDOB(new java.sql.Date(dob.getTime()));
                ps.setFirstname(ten);
                ps.setLastname(ho);
                ps.setMiddleName(hodem);
                ps.setPhone(phonenum);
            if(gioitinh.equals("NAM"))
            {
                ps.setSex(true);
            }
            else{
                 ps.setSex(false);
            }
             
              psd.AddDAO(ps);
//            acd.addAccountChuHo(account);
            accdao.AddDAO(acc);
                JOptionPane.showMessageDialog(login,"Đăng ký tài khoản thành công!");
//                System.out.println("add chu ho success !");
//                System.out.println("chu ho"+CH.getDOB());
            } catch (ParseException pe) {
            // Handle parsing errors
         //   pe.printStackTrace();
                System.out.println("add chu ho fail !");
        }
           }
          
          
         
          
           
   
        }
    });
        
        register.add(cmd, "w 40%, h 40");
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(73, 108, 168));
        
        login.add(label);
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/login/raven/icon/mail.png")));
        txtEmail.setHint("Username");
        login.add(txtEmail, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/login/raven/icon/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%");
        JButton cmdForget = new JButton("Forgot your password ?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        Button cmd = new Button();
        cmd.setBackground(new Color(73, 108, 168));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN IN");
        cmd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Code to handle the button click event
            // You can perform actions like registering a user here

            // For example, let's print a message to the console
            String username=txtEmail.getText().trim();
            String password=txtPass.getText().trim();
           AccountsDAO acd= new AccountsDAO();
           if(acd.KiemTraUsername(username))
           {
               if(acd.getPasswordByUserName(username).equals(password))
               {
                    View.Main main =new Main();
            main.show(true);
               }
               else{
               JOptionPane.showMessageDialog(register, "Mật khẩu không đúng!");
           }
           }
           else{
               JOptionPane.showMessageDialog(register, "Tài khoản không đúng!");
           }
           
           

            // You can add your logic to handle user registration here
        }
    });
        
        login.add(cmd, "w 40%, h 40");
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
