package Takrim;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import com.mysql.cj.log.Log;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.Font;
import javax.swing.*;


public class Adminflightschedule {

    Adminflightschedule()
    {
        JFrame frame = new JFrame("Air Dominca");
        frame.setSize(900,350);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(44,62,80));
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setVisible(true);

        JPanel panel= new JPanel();
        panel.setBounds(5, 5, 876, 60);
        panel.setBackground(new Color(248,148,6));
        frame.add (panel);
        
        JLabel labelreg = new JLabel("EXPLORE THE WORLD WITH AIR DOMINICA");
        labelreg.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(labelreg);

        JPanel panel2 = new JPanel();
        panel2.setBounds(5, 72, 876, 30);
        panel2.setBackground(new Color(248,148,6));
        frame.add (panel2);

        JLabel  btn1 = new JLabel("Manageuser----");
        btn1.setBounds(250, 15,120, 40);
        btn1.setFont(new Font("Arial",Font.BOLD,12));
        btn1.setBackground(new Color(44,62,80));
        panel2.add(btn1);
        panel2.addMouseListener((MouseListener) new MouseInputAdapter()  
        {  
              public void mouseClicked(MouseEvent e)  
              {  
                    frame.dispose();
                    new AdminUi();
                    
              }  
        });

        //flight making
           
        
        JLabel label = new JLabel("FLIGHT NAME:");
        label.setForeground(new Color(236,240,241));
        label.setBounds(20,120,150,20);
        frame.add(label);
  
         JTextField tff = new JTextField();
         tff.setBounds(130,120,150,20);
         tff.setBackground(new Color(236,240,241));
         frame.add(tff);

        JLabel label1 = new JLabel("FROM:");
       label1.setForeground(new Color(236,240,241));
       label1.setBounds(480,120,150,20);
       frame.add(label1);

       JTextField tff1 = new JTextField();
       tff1.setBounds(630,120,150,20);
       tff1.setBackground(new Color(236,240,241));
       frame.add(tff1);

       JLabel label2 = new JLabel("TO:");
        label2.setForeground(new Color(236,240,241));
        label2.setBounds(20,170,100,20);
        frame.add(label2);

        JTextField tff2 = new JTextField();
        tff2.setBounds(130,170,150,20);
        tff2.setBackground(new Color(236,240,241));
        frame.add(tff2);

        JLabel label8 = new JLabel("TIME:");
        label8.setBounds(480, 170, 200, 20);
        label8.setForeground(new Color(236,240,241));
        frame.add(label8);

        JTextField tff8 = new JTextField();
        tff8.setBounds(630,170,150,20);
        tff8.setBackground(new Color(236,240,241));
        frame.add(tff8);



        JButton  btn2 = new JButton("FLIGHT SCHEDULE");
       
        btn2.setBounds(350,270, 200, 30);
        btn2.setBackground(new Color(248,148,6));
        frame.add(btn2);

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e)
              {  
                    
                String s1=tff.getText();
                String s2=tff1.getText();
                String s3=tff2.getText();
                String s4=tff8.getText();    

                if ( s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() )
            {
                  JOptionPane.showMessageDialog(null, "Please full fill the Form correctly.");
            }



            else{

                try{

                                      
                    String query="INSERT INTO `flight_f`(`FLIGHTNAME`, `FRM`, `DEST`, `TIM`) VALUES (?,?,?,?)";
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/flightschedule_f","root","");
                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1,tff.getText());
                    pst.setString(2,tff1.getText());
                    pst.setString(3,tff2.getText());
                    pst.setString(4,tff8.getText());
                    
                    pst.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null,"Flight Schedule Added Successfully!");
                    frame.dispose();
                    
                     }
                     catch(Exception ex){

                      JOptionPane.showMessageDialog(null,ex);
                     }


            }


              }  
        });






             





    }
     
}
