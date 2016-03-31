/*
 * ComponentBorderDemo.java 
 * CSCI 111 Spring 2016
 * 
 * This program shows how to manipulate GUI component borders
 */

package componentborderdemo;
import javax.swing.*;     
import java.awt.*;
import javax.swing.border.*;  // Imports Border interface  


public class ComponentBorderDemo  
{
    public static void main(String[] args) 
    {
        // create a frame to hold our components
        JFrame myJFrame = new JFrame();

        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Component Border Demo");
        myJFrame.setSize(480, 320);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create a new a grid layout for the frame - 3 rows x 2 columns, gaps=20
        GridLayout myLayout = new GridLayout(3,2);
        myLayout.setHgap(20);    
        myLayout.setVgap(20);
   
        // assign mylayout to be the layout for MyJFrame
        myJFrame.setLayout(myLayout);
                
        // declare and intialize Border variables
        Border blackLine = BorderFactory.createLineBorder(Color.black, 2) ;        
        Border raisedEtched  = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);        
        Border loweredEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);        
        Border raisedBevel = BorderFactory.createRaisedBevelBorder();        
        Border loweredBevel = BorderFactory.createLoweredBevelBorder();        
        Border empty = BorderFactory.createEmptyBorder(); 
        
        // declare and  initialize a font for the buttons        
        Font  buttonFont = new Font("Georgia", Font.PLAIN, 20);
                
        // Create the buttons 
        JButton  jb1  = new JButton("line border");
        jb1.setBorder(blackLine);
        jb1.setFont(buttonFont);
        
        JButton  jb2  = new JButton("raised etched border");
        jb2.setBorder(raisedEtched);
        jb2.setFont(buttonFont);
        
        JButton  jb3  = new JButton("lowered etched border");
        jb3.setBorder(loweredEtched);
        jb3.setFont(buttonFont);
        
        JButton  jb4  = new JButton("raised bevel border");
        jb4.setBorder(raisedBevel);
        jb4.setFont(buttonFont);
    
        JButton  jb5  = new JButton("lowered bevel border");
        jb5.setBorder(loweredBevel);
        jb5.setFont(buttonFont);    
        
        JButton  jb6  = new JButton("empty border");
        jb6.setBorder(empty);
        jb6.setFont(buttonFont);

          
        // add the buttons to the frame   
        myJFrame.add(jb1); 
        myJFrame.add(jb2); 
        myJFrame.add(jb3); 
        myJFrame.add(jb4); 
        myJFrame.add(jb5); 
        myJFrame.add(jb6); 
        
        
        // make the frame visible (activate the frame)
        myJFrame.setVisible(true); 
        
    } // end main()
} // end class
