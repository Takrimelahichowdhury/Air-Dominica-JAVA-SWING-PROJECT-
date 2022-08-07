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


public class Useroptionselection  {

    Useroptionselection(){


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

        try{

          
            String query = "SELECT FLIGHTNAME, FRM, DEST, TIM "
            + "FROM flight_f";
  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/flightschedule_f","root","");
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);
           
            String data  = "";
            while (rs.next()) {
                
                  
                  data = data  + rs.getString("FLIGHTNAME")+",";
                  data = data  + rs.getString("FRM")+",";
                  data = data  + rs.getString("DEST")+",";
                  data = data  + rs.getString("TIM")+",";
  
            
                    
            }
  
  
           
            
            int numberOfFields = 0;
            for(int j=0;j<data.length();j++){
                  if(data.charAt(j)==',') numberOfFields++;
            }
            String datasFinal [][] = new String[numberOfFields/4+2][4+2];
            String tempField="";
            int raw=1;
            int col=0;
  
  
            String stt[] =  {"FLIGHTNAME","FRM","DEST","TIM"};
            datasFinal[0]=stt;
  
  
            for(int j=0;j<data.length();j++){
                  
                  if(data.charAt(j)==','){
                        
                        datasFinal[raw][col]=tempField;
                        tempField="";
                        col++;
                  }
                  else{
                        tempField = tempField + data.charAt(j);
                  }
  
                  if((col)%4==0 && col>0){
                        col = 0;
                        raw++;
                  } 
                  
                 
                  
            }
            
            
  
            String column[]={"FLIGHTNAME","FRM","DEST","TIM"};  
            JTable jt=new JTable(datasFinal,column);   
            jt.setBounds(5,110,976,470);   
            
            frame.add(jt);    
  
  
            
  
      }
      catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
          




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
        btn3.addMouseListener((MouseListener) new MouseInputAdapter()  
                  {  
                        public void mouseClicked(MouseEvent e)  
                        {  
                              frame.dispose();
                              new Travelhelp();
                              
                        }  
                  });











        






                








    }

           



    
}
