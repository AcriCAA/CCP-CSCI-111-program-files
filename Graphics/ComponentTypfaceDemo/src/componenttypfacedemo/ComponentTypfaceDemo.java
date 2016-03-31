/*
 * ComponentTyefaceDemo.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows how to manipulate GUI component fonts * 
 */
package componenttypfacedemo;
import javax.swing.*;     
import java.awt.*;

public class ComponentTypfaceDemo {
public static void main(String[] args) {
// create a frame to hold our components
        JFrame myJFrame = new JFrame();

        // create a new a BorderLayout for the frame 
        BorderLayout myLayout = new BorderLayout();
   
        // assign mylayout to be the layout for MyJFrame
        myJFrame.setLayout(myLayout);
        
        // declare and intialize a Font variable
        Font  heading = new Font("Georgia", Font.BOLD, 18);
        
        // Create buttons for each zone, with specified fonts
        
        JButton  jbCenter = new JButton("Center");
        jbCenter.setFont( new Font("Courier New", Font.PLAIN, 24) );
        
        JButton  jbWest = new JButton("West"); 
        jbWest.setFont( heading);
        
        JButton  jbEast = new JButton("East"); 
        jbEast.setFont( heading);
        
        JButton  jbNorth = new JButton("North"); 
        jbNorth.setFont( heading);
        
        JButton  jbSouth = new JButton("South"); 
        jbSouth.setFont( heading);
        
        
        // add components to the Jframe in the specified zones)
           
        myJFrame.add(jbCenter, BorderLayout.CENTER); // Add label to Center zone        
        myJFrame.add(jbWest, BorderLayout.WEST); // Add list to East zone
        myJFrame.add(jbEast, BorderLayout.EAST); // Add combo box the West zone
        myJFrame.add(jbNorth, BorderLayout.NORTH); // Add button to North zone
        myJFrame.add(jbSouth, BorderLayout.SOUTH); // Add button to South zone
        
        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Font Demo");
        myJFrame.setSize(400, 200);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // make the frame visible (activate the frame)
        myJFrame.setVisible(true); 

        
    } // end main()
} // end class
