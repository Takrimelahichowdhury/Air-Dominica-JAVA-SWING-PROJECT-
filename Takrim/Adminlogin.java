package Takrim;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.Font;

public class Adminlogin {
    
      int flag=0;

    Adminlogin(){


        JFrame frame = new JFrame("ADMIN LOGIN");
        frame.setSize(400,350);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(44,62,80));
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setVisible(true);

        JPanel panel2= new JPanel();
        panel2.setBounds(5, 5, 376, 60);
        panel2.setBackground(new Color(248,148,6));
        frame.add (panel2);

        JLabel labellog = new JLabel("ADMIN LOGIN");
        labellog.setFont(new Font("Arial",Font.BOLD,32));
        panel2.add(labellog);

    
    
        JLabel label = new JLabel("ADMIN NAME: ");
        label.setBounds(50,70,100,100);
        label.setForeground(new Color(236,240,241));
        frame.add(label);
    
    
        JLabel label1 = new JLabel("PASSWORD: ");
        label1.setBounds(50,110,100,100);
        label1.setForeground(new Color(236,240,241));
        frame.add(label1); 

       
    
        JTextField tf1 = new JTextField();
        tf1.setBounds(160,110,130,25);
        tf1.setBackground(new Color(236,240,241));
        frame.add(tf1);
    
        JPasswordField tf2 = new JPasswordField();
        tf2.setBounds(160,150,130,25);
        tf2.setBackground(new Color(236,240,241));
        frame.add(tf2);
    
    
        JButton btn = new JButton("Login");
        btn.setBounds(180,190,70,30);
        btn.setBackground(new Color(248,148,6));
        frame.add(btn);
    
    
    
        btn.addActionListener(new ActionListener(){
    
        public void actionPerformed (ActionEvent e)
        {
                String s= tf1.getText();
                String s1=tf2.getText();
                
                if(s.isEmpty())
                {
                      JOptionPane.showMessageDialog(null, "Please Enter Your Admin Name.");
                }
                else if(s1.isEmpty())
                {
                      JOptionPane.showMessageDialog(null,"Please Enter Password.");
                }
                else
                {
                  
                  try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admininfo","root", "");
                        String adminname = tf1.getText();
                        String adminpassword = tf2.getText();

                        java.sql.Statement stmt = con.createStatement();

                        String sql= "select * from adm where ADMINNAME='"+adminname+"'and PASSWORD='"+adminpassword+"'";
                        ResultSet rs = stmt.executeQuery(sql);
                       if(rs.next()){
                          
                              frame.dispose();
                              new AdminUi();
                              //featurepage
                        }
                        
                        
                     
                       else{

                              JOptionPane.showMessageDialog(null,"Your Admin name or Passwoerd is Wrong!");
                        }
                         } catch (Exception e1) {
                      
                        e1.printStackTrace();
                  }
            }

            }
 
            });

       JLabel label3 = new JLabel("If you don't have an account?Click here.....");
       label3.setBounds(100, 200, 250, 100);
       label3.setForeground(new Color(236,240,241));
       frame.add(label3);
       label3.addMouseListener((MouseListener) new MouseInputAdapter()  
                  {  
                        public void mouseClicked(MouseEvent e)  
                        {  
                              frame.dispose();
                              new AdminRegistration();
                              
                        }  
                  });

    }
  
}    

    

