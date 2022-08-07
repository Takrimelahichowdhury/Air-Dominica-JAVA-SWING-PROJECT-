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

public class AdminUi {

          AdminUi()
          {
            JFrame frame = new JFrame("Air Dominca");
            frame.setSize(1000,580);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().setBackground(new Color(44,62,80));
            frame.setDefaultCloseOperation(3);
            frame.setLayout(null);
            frame.setVisible(true);
      
            JPanel panel= new JPanel();
            panel.setBounds(5, 5, 976, 60);
            panel.setBackground(new Color(248,148,6));
            frame.add (panel);
            
            JLabel labelreg = new JLabel("EXPLORE THE WORLD WITH AIR DOMINICA");
            labelreg.setFont(new Font("Arial",Font.BOLD,32));
            panel.add(labelreg);
      
            JPanel panel2 = new JPanel();
            panel2.setBounds(5, 72, 976, 30);
            panel2.setBackground(new Color(248,148,6));
            frame.add (panel2);
      
            JLabel  btn1 = new JLabel("MANAGE USER----");
            btn1.setBounds(250, 15,120, 40);
            btn1.setFont(new Font("Arial",Font.BOLD,14));
            btn1.setBackground(new Color(44,62,80));
            panel2.add(btn1);


            try{

            
                  String query = "SELECT FIRSTNAME, LASTNAME, MOBILE, GENDER, DOB, NATIONALITY, PASSPRTID, VISAID, CURRENT, DESTINATION, TOTALPASSENGERS, SEATTYPE, PAYMENT, TRANSACTIONID "
                  + "FROM bookinginfo";
      
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ticketbooking","root","");
                  Statement stmt  = conn.createStatement();
                  ResultSet rs    = stmt.executeQuery(query);
                 
                  String data  = "";
                  while (rs.next()) {
                      
                        
                        data = data  + rs.getString("FIRSTNAME")+",";
                        data = data  + rs.getString("LASTNAME")+",";
                        data = data  + rs.getString("MOBILE")+",";
                        data = data  + rs.getString("GENDER")+",";
                        data = data  + rs.getString("DOB")+",";
                        data = data  + rs.getString("NATIONALITY")+",";
                        data = data  + rs.getString("PASSPRTID")+",";
                        data = data  + rs.getString("VISAID")+",";
                        data = data  + rs.getString("CURRENT")+",";
                        data = data  + rs.getString("DESTINATION")+",";
                        data = data  + rs.getString("TOTALPASSENGERS")+",";
                        data = data  + rs.getString("SEATTYPE")+",";
                        data = data  + rs.getString("PAYMENT")+",";
                        data = data  + rs.getString("TRANSACTIONID")+",";
      
                  
                          
                  }
      
      
                 
                  
                  int numberOfFields = 0;
                  for(int j=0;j<data.length();j++){
                        if(data.charAt(j)==',') numberOfFields++;
                  }
                  String datasFinal [][] = new String[numberOfFields/14+2][14+2];
                  String tempField="";
                  int raw=1;
                  int col=0;
      
      
                  String stt[] =  {"FIRSTNAME","LASTNAME","MOBILE","GENDER","DOB","NATIONALITY","PASSPRTID","VISAID","CURRENT","DESTINATION","TOTALPASSENGERS","SEATTYPE","PAYMENT","TRANSACTIONID"};
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
      
                        if((col)%14==0 && col>0){
                              col = 0;
                              raw++;
                        } 
                        
                       
                        
                  }
                  
                  
      
                  String column[]={"FIRSTNAME","LASTNAME","MOBILE","GENDER","DOB","NATIONALITY","PASSPRTID","VISAID","CURRENT","DESTINATION","TOTALPASSENGERS","SEATTYPE","PAYMENT","TRANSACTIONID"};     
                  JTable jt=new JTable(datasFinal,column);   
                  jt.setBounds(5,110,976,470);   
                  
                  frame.add(jt);    
      
      
                  
      
            }
            catch(Exception e){
                  JOptionPane.showMessageDialog(null,e);
            }

           




            JLabel  btn2 = new JLabel("--SCHEDULE FLIGHT");
            btn2.setBounds(500, 15, 120, 40);
            btn2.setFont(new Font("Arial",Font.BOLD,14));
            btn2.setBackground(new Color(44,62,80));
            panel2.add(btn2);
            btn2.addMouseListener((MouseListener) new MouseInputAdapter()  
                  {  
                        public void mouseClicked(MouseEvent e)  
                        {  
                              
                              
                              frame.dispose();
                              new Adminflightschedule();
                              
                        }  
                  });
      




          } 
        }
