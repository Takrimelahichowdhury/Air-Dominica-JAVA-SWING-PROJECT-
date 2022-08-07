package Takrim;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.event.MouseInputAdapter;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TicketBooking {


    TicketBooking() {

      JFrame frame = new JFrame("Air Dominca");
      frame.setSize(900,580);
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

      JLabel  btn1 = new JLabel("FLIGHT SCHEDULE----");
      btn1.setBounds(250, 15,120, 40);
      btn1.setFont(new Font("Arial",Font.BOLD,12));
      btn1.setBackground(new Color(44,62,80));
      panel2.add(btn1);
      panel2.addMouseListener((MouseListener) new MouseInputAdapter()  
                  {  
                        public void mouseClicked(MouseEvent e)  
                        {  
                              frame.dispose();
                              new Useroptionselection();
                              
                        }  
                  });


      




      JLabel  btn2 = new JLabel("BOOK TICKET----");
      btn2.setBounds(500, 15, 120, 40);
      btn2.setFont(new Font("Arial",Font.BOLD,12));
      btn2.setBackground(new Color(44,62,80));
      panel2.add(btn2);


      JLabel  btn3 = new JLabel("TRAVEL HELP");
      btn3.setBounds(750, 15, 120, 40);
      btn3.setFont(new Font("Arial",Font.BOLD,12));
      btn3.setBackground(new Color(44,62,80));
      panel2.add(btn3);






      JLabel label = new JLabel("FIRST NAME:");
      label.setForeground(new Color(236,240,241));
      label.setBounds(20,120,150,20);
      frame.add(label);

       JTextField tff = new JTextField();
       tff.setBounds(130,120,150,20);
       tff.setBackground(new Color(236,240,241));
       frame.add(tff);


       JLabel label1 = new JLabel("LAST NAME:");
      label1.setForeground(new Color(236,240,241));
      label1.setBounds(480,120,150,20);
      frame.add(label1);
         

       JTextField tff1 = new JTextField();
       tff1.setBounds(630,120,150,20);
       tff1.setBackground(new Color(236,240,241));
       frame.add(tff1);


        JLabel label2 = new JLabel("MOBILE:");
        label2.setForeground(new Color(236,240,241));
        label2.setBounds(20,170,100,20);
        frame.add(label2);

        JTextField tff2 = new JTextField();
        tff2.setBounds(130,170,150,20);
        tff2.setBackground(new Color(236,240,241));
        frame.add(tff2);

        JLabel label3 = new JLabel("GENDER:");
        label3.setForeground(new Color(236,240,241));
        label3.setBounds(20,220,100,20);
        frame.add(label3);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(130, 220, 80, 20);
        female.setBounds(220, 220, 80, 20);
        male.setSelected(true);
        frame.add(male);
        frame.add(female);
        
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        JLabel label4 = new JLabel("DOB:");
        label4.setBounds(20, 270, 100, 20);
        label4.setForeground(new Color(236,240,241));
        frame.add(label4);

        String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        String years[]={"2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990"};

        JComboBox day = new JComboBox<>(days);
        JComboBox month = new JComboBox<>(months);
        JComboBox year = new JComboBox<>(years);

        day.setBounds(130, 270, 50, 20);
        month.setBounds(190, 270, 50, 20);
        year.setBounds(250, 270, 60, 20);

        frame.add(day);
        frame.add(month);
        frame.add(year);

        JLabel label5 = new JLabel("NATIONALITY:");
        label5.setBounds(20, 320, 100, 20);
        label5.setForeground(new Color(236,240,241));
        frame.add(label5);

        String countrys[]={"Australia","Austria","Albania","Armenia","The Bahamas","Bangladesh","Belgium","Brazil","China","Croatia","Denmark","Dominica","Ecuador","El Salvador","Finland","Germany","Greece","India","Italy","Japan","United Arab Emirates","United Kingdom","United States"};
        JComboBox country = new JComboBox<>(countrys);

        country.setBounds(130, 320, 100, 20);
        frame.add(country);


        JLabel label6 = new JLabel("PASSPORT ID:");
        label6.setBounds(20, 370, 100, 20);
        label6.setForeground(new Color(236,240,241));
        frame.add(label6);

        JTextField tff6 = new JTextField();
        tff6.setBounds(130,370,150,20);
        tff6.setBackground(new Color(236,240,241));
        frame.add(tff6);
        

        JLabel label7 = new JLabel("VISA ID:");
        label7.setBounds(20, 420, 100, 20);
        label7.setForeground(new Color(236,240,241));
        frame.add(label7);

        JTextField tff7 = new JTextField();
        tff7.setBounds(130,420,150,20);
        tff7.setBackground(new Color(236,240,241));
        frame.add(tff7);


        JLabel label8 = new JLabel("CURRENT CITY:");
        label8.setBounds(480, 170, 200, 20);
        label8.setForeground(new Color(236,240,241));
        frame.add(label8);

        JTextField tff8 = new JTextField();
        tff8.setBounds(630,170,150,20);
        tff8.setBackground(new Color(236,240,241));
        frame.add(tff8);
        
        JLabel label9 = new JLabel("DESTINATION:");
        label9.setBounds(480, 220, 200, 20);
        label9.setForeground(new Color(236,240,241));
        frame.add(label9);

        JTextField tff9 = new JTextField();
        tff9.setBounds(630,220,150,20);
        tff9.setBackground(new Color(236,240,241));
        frame.add(tff9);

        JLabel label10 = new JLabel("PASSENGERS NUMBER:");
        label10.setBounds(480, 270, 200, 20);
        label10.setForeground(new Color(236,240,241));
        frame.add(label10);

        JTextField tff10 = new JTextField();
        tff10.setBounds(630,270,150,20);
        tff10.setBackground(new Color(236,240,241));
        frame.add(tff10);

        JLabel label11 = new JLabel("SEAT STATUS: ");
        label11.setBounds(480, 320, 200, 20);
        label11.setForeground(new Color(236,240,241));
        frame.add(label11);
        

        String seats[]={"Economy","Buisness","VIP"};
        JComboBox seat = new JComboBox<>(seats);
        seat.setBounds(630, 320, 100, 20);
        frame.add(seat);


        JLabel label12 = new JLabel("PAYMENT: ");
        label12.setBounds(480, 370, 200, 20);
        label12.setForeground(new Color(236,240,241));
        frame.add(label12);

        JRadioButton visa = new JRadioButton("Visa card");
        JRadioButton master = new JRadioButton("Master Card");

        visa.setBounds(630, 370, 80, 20);
        master.setBounds(720, 370, 120, 20);
        visa.setSelected(true);
        frame.add(visa);
        frame.add(master);
        
        ButtonGroup pay = new ButtonGroup();
        pay.add(visa);
        pay.add(master);


        JLabel label13 = new JLabel("TRANSACTION ID: ");
        label13.setBounds(480, 420, 200, 20);
        label13.setForeground(new Color(236,240,241));
        frame.add(label13);


        JTextField tff13 = new JTextField();
        tff13.setBounds(630,420,150,20);
        tff13.setBackground(new Color(236,240,241));
        frame.add(tff13);


        JCheckBox term = new JCheckBox("Please accept terms and condition");
        term.setBounds(300,470,250,20);
        frame.add(term);

        JButton submit = new JButton("BOOK YOUR TICKET");
        submit.setBounds(330,500, 200, 20);
        submit.setBackground(new Color(248,148,6));
        frame.add(submit);
        submit.addActionListener(new ActionListener(){
          public void actionPerformed (ActionEvent e){
          if(term.isSelected()){
            String s1 = tff.getText();
            String s2= tff1.getText();
            String s3 = tff2.getText();
            String s4 = "Male";
            if(female.isSelected())
            {
                  s4="female";
            }
            
            String s5 = day.getSelectedItem().toString()+"-"+month.getSelectedItem().toString()+"-"+year.getSelectedItem().toString();
            String s6 = (String) country.getSelectedItem();
            String s7 = tff6.getText();
            String s8 = tff7.getText();
            String s9=  tff8.getText();
            String s10= tff9.getText();
            String s11=tff10.getText();
            String s12 = (String) seat.getSelectedItem();
            
            String s13 = "Visa Card";
            if(master.isSelected())
            {
                s13="Master Card";
            }

            String s14 = tff13.getText();
            
            if ( s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty() || s10.isEmpty() || s11.isEmpty() || s12.isEmpty() || s13.isEmpty() || s14.isEmpty() )
            {
                  JOptionPane.showMessageDialog(null, "Please full fill the Form correctly.");
            }
            else{
                 
                  try{ 
                        String query="INSERT INTO `bookinginfo`(`FIRSTNAME`, `LASTNAME`, `MOBILE`, `GENDER`, `DOB`, `NATIONALITY`, `PASSPRTID`, `VISAID`, `CURRENT`, `DESTINATION`, `TOTALPASSENGERS`, `SEATTYPE`, `PAYMENT`, `TRANSACTIONID`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ticketbooking","root","");
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, tff.getText());
                        pst.setString(2, tff1.getText());
                        pst.setString(3, tff2.getText());
                        pst.setString(4, s4);
                        pst.setString(5, s5);
                        pst.setString(6, s6);
                        pst.setString(7, tff6.getText());
                        pst.setString(8, tff7.getText());
                        pst.setString(9, tff8.getText());
                        pst.setString(10,tff9.getText());
                        pst.setString(11,tff10.getText());
                        pst.setString(12, s12 );
                        pst.setString(13, s13);
                        pst.setString(14, tff13.getText());

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Booking Succesful.");

                   }
                   catch(Exception ex)
                   {
                        JOptionPane.showMessageDialog(null,ex);
                   }

           

            }
         }

        }
      });

}
    
}
