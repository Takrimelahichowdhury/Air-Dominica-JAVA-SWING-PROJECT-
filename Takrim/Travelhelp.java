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
import javax.swing.*;

public class Travelhelp {
    Travelhelp()
    {


             
        JFrame frame = new JFrame("Air Dominca");
        frame.setSize(900,580);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(236,240,241));;
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
        btn1.addMouseListener((MouseListener) new MouseInputAdapter()  
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
        
        btn2.addMouseListener((MouseListener) new MouseInputAdapter()  
                  {  
                        public void mouseClicked(MouseEvent e)  
                        {  
                              frame.dispose();
                              new TicketBooking();
                              
                        }  
                  });


        JLabel  btn3 = new JLabel("TRAVEL HELP");
        btn3.setBounds(750, 15, 120, 40);
        btn3.setFont(new Font("Arial",Font.BOLD,12));
        btn3.setBackground(new Color(44,62,80));
        panel2.add(btn3);

        

        JLabel l1= new JLabel();
        l1.setBounds(5, 110, 1000,30);
        l1.setBackground(new Color(236,240,241));
        l1.setText("1.Check-in deadlines can vary by airline and airport.");

        JLabel l2= new JLabel();
        l2.setBounds(5, 120, 1000,30);
        l2.setBackground(new Color(236,240,241));
        l2.setText("2.Passengers who look like they are 18 or over should bring a government-issued photo ID.");
        
        JLabel l3= new JLabel();
        l3.setBounds(5, 130, 1000,30);
        l3.setBackground(new Color(236,240,241));
        l3.setText("3.Don’t bring sharp items on your person or in your carry-on bag.");
        
        JLabel l4= new JLabel();
        l4.setBounds(5, 140, 1000,30);
        l4.setBackground(new Color(236,240,241));
        l4.setText("4.If the problem is with local weather, all flights will probably be late and there is not much you or the airline can do to speed up your departure.");
        
        JLabel l5= new JLabel();
        l5.setBounds(5, 150, 1000,30);
        l5.setBackground(new Color(236,240,241));
        l5.setText("5.If your flight is canceled,airlines will rebook you on their next flight to your destination on which space is available, at no additional charge.");
        
        JLabel l6= new JLabel();
        l6.setBounds(5, 160, 1000,30);
        l6.setBackground(new Color(236,240,241));
        l6.setText(  "7.Airlines must provide operational lavatories, and medical care if needed.");
        
        
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        frame.add(l4);
        frame.add(l5);
        frame.add(l6);


        




    }
    
}
