package Takrim;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Userregistration  {


                Userregistration() {

                  
    
                        JFrame frame = new JFrame("USER Registration ");
                        frame.setSize(400,500);
                        frame.getContentPane().setBackground(new Color(44,62,80));
                        frame.setDefaultCloseOperation(3);
                        frame.setLayout(null);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);

                        JPanel panel1= new JPanel();
                        panel1.setBounds(5, 5, 376, 60);
                        panel1.setBackground(new Color(248,148,6));
                        frame.add (panel1);

                        JLabel labelreg = new JLabel("REGISTRATION FORM");
                     
                        labelreg.setFont(new Font("Arial",Font.BOLD,32));
                        panel1.add(labelreg);


                       


                        JLabel name = new JLabel("NAME:");
                        name.setBounds(20, 80, 130, 30);
                        name.setForeground(new Color(236,240,241));
                        frame.add(name);


                        JTextField tf1 = new JTextField();
                        tf1.setBounds(160, 80, 200, 25);
                        tf1.setBackground(new Color(236,240,241));
                        frame.add(tf1);


                        JLabel email = new JLabel("EMAIL:");
                        email.setBounds(20, 130, 130, 30);
                        email.setForeground(new Color(236,240,241));
                        frame.add(email);

                        JTextField tf2 = new JTextField();
                        tf2.setBounds(160, 130, 200, 25);
                        tf2.setBackground(new Color(236,240,241));
                        frame.add(tf2);

                        JLabel mobile = new JLabel("MOBILE:");
                        mobile.setBounds(20, 180, 130, 30);
                        mobile.setForeground(new Color(236,240,241));
                        frame.add(mobile);

                        JTextField tf3 = new JTextField();
                        tf3.setBounds(160, 180, 200, 25);
                        tf3.setBackground(new Color(236,240,241));
                        frame.add(tf3);



                        
                        JLabel username = new JLabel("USERNAME:");
                        username.setBounds(20, 230, 130, 30);
                        username.setForeground(new Color(236,240,241));
                        frame.add(username);

                        JTextField tf4 = new JTextField();
                        tf4.setBounds(160,230, 200, 25);
                        tf4.setBackground(new Color(236,240,241));
                        frame.add(tf4);


                       JLabel password = new JLabel("PASSWORD:");
                       password.setBounds(20, 280, 130,30);
                       password.setForeground(new Color(236,240,241));
                       frame.add(password);

                       JPasswordField tf5 = new JPasswordField();
                       tf5.setBounds(160, 280, 200, 25);
                       tf5.setBackground(new Color(236,240,241));
                       frame.add(tf5);

                       JLabel repassword =  new JLabel("RE-PASSWORD:");
                       repassword.setBounds(20, 330, 130,30);
                       repassword.setForeground(new Color(236,240,241));
                       frame.add(repassword);

                       JPasswordField tf6 = new JPasswordField();
                       tf6.setBounds(160, 330, 200, 25);
                       tf6.setBackground(new Color(236,240,241));
                       frame.add(tf6);


                       JButton subbtn = new JButton("REGISTER");
                       subbtn.setBounds(240, 375 , 120, 30);
                       subbtn.setBackground(new Color(248,148,6));
                       frame.add(subbtn);

                       
                       subbtn.addActionListener(new ActionListener(){
                        public void actionPerformed (ActionEvent e)
                          {

                               String s1=tf1.getText();
                               String s2=tf2.getText();
                               String s3=tf3.getText();
                               String s4=tf4.getText();
                               String s5=tf5.getText();
                               String s6=tf6.getText();

                               if(s1.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Enter Your Name.");

                               }
                              else  if(s2.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Enter Your Email.");

                               }
                              else  if(s3.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Enter Your Mobile.");

                               }
                             else  if(s4.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Enter Your Username.");

                               }
                              else if(s5.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Enter Your Password.");

                               }
                              else if(s6.isEmpty())
                               {

                                JOptionPane.showMessageDialog(null, "Please Re-type your Password.");

                               }
                               /*
                               else if(s5!=s6){

                                JOptionPane.showMessageDialog(null, "Your Re-type Password is incorrect");
                               }*/
                               else
                               {
                                     
                                     try{

                                      
                                      String query="INSERT INTO `user`(`NAME`, `EMAIL`, `MOBILE`, `USERNAME`, `PASSWORD`, `RE-PASSWORD`) VALUES (?,?,?,?,?,?)";
                                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/userinfo","root","");
                                      PreparedStatement pst = con.prepareStatement(query);

                                      pst.setString(1,tf1.getText());
                                      pst.setString(2,tf2.getText());
                                      pst.setString(3,tf3.getText());
                                      pst.setString(4,tf4.getText());
                                      pst.setString(5,tf5.getText());
                                      pst.setString(6,tf6.getText());
                                      pst.executeUpdate();
                                      JOptionPane.showMessageDialog(null,"Registration Succesful");
                                      
                                       }
                                       catch(Exception ex){

                                        JOptionPane.showMessageDialog(null,ex);
                                       }
                      
                                      }
                               
                          }
                          });
                                   
                                
                       JButton backbtn = new JButton("BACK");
                       backbtn.setBounds(30,375,70,30);
                       backbtn.setBackground(new Color(248,148,6));
                       frame.add(backbtn);

                       backbtn.addActionListener(new ActionListener(){
                        public void actionPerformed (ActionEvent e)
                          {
                            frame.dispose();
                            new Userlogin();
                            
                          }
                    
                    }
                    );
                    
                
                }
                        
            
        }



