package cn.edu.hcnu.Client;

import cn.edu.hcnu.ui.Md5;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 登录线程
 */
public class LoginThread extends Thread {
    private JFrame loginf;
    private JTextField t;

    public void run() {
        /*
         * 设置登录界面
         */
        loginf = new JFrame();
        loginf.setResizable(false);
        loginf.setLocation(300, 200);
        loginf.setSize(400, 150);
        loginf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginf.setTitle("聊天室" + " - 登录");

        t = new JTextField("Version " + "1.1.0" + "  By liwei");
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setEditable(false);
        loginf.getContentPane().add(t, BorderLayout.SOUTH);

        JPanel loginp = new JPanel(new GridLayout(3, 2));
        loginf.getContentPane().add(loginp);

        JTextField t1 = new JTextField("登录名:");
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setEditable(false);
        loginp.add(t1);

        final JTextField loginname = new JTextField("zgl");
        loginname.setHorizontalAlignment(JTextField.CENTER);
        loginp.add(loginname);

        JTextField t2 = new JTextField("密码:");
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setEditable(false);
        loginp.add(t2);

        final JTextField loginPassword = new JTextField("zgl1234");
        loginPassword.setHorizontalAlignment(JTextField.CENTER);
        loginp.add(loginPassword);
        /*
         * 监听退出按钮(匿名内部类)
         */
        JButton b1 = new JButton("退  出");
        loginp.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        final JButton b2 = new JButton("登  录");
        loginp.add(b2);

        loginf.setVisible(true);

        /**
         * 监听器,监听"登录"Button的点击和TextField的回车
         */
        class ButtonListener implements ActionListener {
            private Socket s;
            public void actionPerformed(ActionEvent e) {
                String username = loginname.getText();
                String password = loginPassword.getText();
                String sql = "SELECT password FROM users WHERE username=?";
                try {
                    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
                    String username_db = "opts";
                    String password_db = "opts1234";
                    Connection conn = DriverManager.getConnection(url, username_db, password_db);
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1,username);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        String encodePassword = rs.getString("PASSWORD");
                        if (Md5.checkpassword(password, encodePassword)) {
                           loginf.setVisible(false);
//                            ChatWindow chatWindow=new ChatWindow();
                           //获取ip地址
                            InetAddress inetAddress = InetAddress.getLocalHost();
                            String IP=inetAddress.getHostAddress();
                            int port=8888;
                            DatagramSocket datagramSocket=null;
                            while (true){
                                try{
                                    datagramSocket=new DatagramSocket(8888);
                                    ChatWindow chatWindow=new ChatWindow(username,datagramSocket);
                                   break;
                                }
                                catch(IOException e1){
                                    port +=1;
                                     e1.printStackTrace();
                                }
                            }
                            String  UpSql="update users set ip=?,port=? where username=? ";
                            PreparedStatement ps = conn.prepareStatement(UpSql);
                            ps.setString(1,IP);
                            ps.setInt(2,port);
                            ps.setString(3,username);
                            int result = ps.executeUpdate();
                            if(result>0){

                            }else {
                                System.out.println("更新失败");
                            }
                        } else {
                            System.out.println("登录失败");
                        }

                    }
                } catch (SQLException ee) {
                    ee.printStackTrace();
                } catch (NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                }
				/*
				1、根据用户去数据库把加密后的密码拿到
				SELECT password FROM users WHERE username='liwei';
				2、把登录界面输入的密码和数据库里加密后的进行比对（调用MD5类的checkpassword方法）
				 */
            }
        }
        ButtonListener bl = new ButtonListener();
        b2.addActionListener(bl);
        loginname.addActionListener(bl);
        loginPassword.addActionListener(bl);
    }


}

