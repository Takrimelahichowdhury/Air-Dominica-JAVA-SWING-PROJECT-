package Takrim;
import java.awt.Color;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selection extends JFrame {

           JFrame selectionFrame;
           ImageIcon img;
           JLabel displayfield1;
           JButton loginbtn,adminbtn2;


            selection(){

                selectionFrame = new JFrame("Welcome to Air Dominica");
                selectionFrame.setVisible(true);
                selectionFrame.setSize(500,500);                
                selectionFrame.setDefaultCloseOperation(3);
                selectionFrame.setLocationRelativeTo(null);

                loginbtn = new JButton("USER LOGIN");
                loginbtn.setBounds(200, 200, 120, 40);
                loginbtn.setBackground(new Color(248,148,6));
                selectionFrame.add(loginbtn);
                loginbtn.addActionListener(new ActionListener(){
                    public void actionPerformed (ActionEvent e)
                      {
                        selectionFrame.dispose();
                        new Userlogin();
                        
                      }
                
                }
                );

                adminbtn2 = new JButton("ADMIN LOGIN");
                adminbtn2.setBounds(200, 250, 120, 40);
                adminbtn2.setBackground(new Color(248,148,6));
                selectionFrame.add(adminbtn2);
                adminbtn2.addActionListener(new ActionListener(){
                  public void actionPerformed (ActionEvent e)
                    {
                      selectionFrame.dispose();
                      new Adminlogin();
                      
                    }
              
              }
              );
                


                try{
                img = new ImageIcon(getClass().getResource("Image2.jpg"));
                displayfield1 = new JLabel(img);
                selectionFrame.add(displayfield1);
                }catch (Exception e)
                {
                    System.out.println("image not found!");

                }
                selectionFrame.pack();
                selectionFrame.setVisible(true);

                

            }
  }
