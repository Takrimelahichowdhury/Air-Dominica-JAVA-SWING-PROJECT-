package Takrim;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

  
public class Main extends JFrame {
      
         
         JFrame frame;
         JLabel displayfield;
         ImageIcon image;
         JProgressBar bar;

         public Main()
         {
               frame = new JFrame("DashBoard");
               frame.setDefaultCloseOperation(3);
               bar = new JProgressBar();
               bar.setBounds(45, 500, 1000, 30);
               bar.setStringPainted(true);
               frame.add(bar);
               try{
                       image = new ImageIcon(getClass().getResource("Image1.jpg"));
                       displayfield = new JLabel(image);
                       frame.add(displayfield);

               }catch(Exception e)
               {
                       System.out.println("image not found!");
               }
               frame.pack();
               frame.setVisible(true);
               fill();
               
               
        }

        public void fill()
        {
                int counter=0;
                while(counter<=100)
                {
                        bar.setValue(counter);
                        try{
                                Thread.sleep(50);
                                
                        }catch (InterruptedException e)
                        {
                                e.printStackTrace();
                        }
                        counter+=2;

                }
                bar.setString("WELCOME TO AIR DOMINICA");
                bar.setFont(new Font("My Boli",Font.BOLD,25));
                bar.setForeground(Color.BLACK);
        
        }

        public static void main(String[] args) {

                
                
                new Main();
                new selection();
                

        
        }      
        
}
