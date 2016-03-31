/*
 * ImageIconDemo.java
 * CSCI 111 Spring 2016
 * 
 * This program shows an example of adding an image to a JLabel component.
 *
 */

package imageicondemo;
import javax.swing.*;
import java.awt.*;

public class ImageIconDemo {

    public static void main(String[] args) {
        
        // IMAGE CLASS WILL ONLY WORK WITH JPEG, PNG, and GIF)
        // create a frame to hold our components
        JFrame myJFrame = new JFrame();
        
        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("ImageIcon Demo");
        myJFrame.setSize(240, 200);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create and assign a FlowLayout for myFrame
        myJFrame.setLayout(new FlowLayout());
    
        // Create a label with an image icon
        JLabel jlCSCI = new JLabel(new ImageIcon("CSCI.jpg"));
        
        // add the Label to the frame 
        myJFrame.add(jlCSCI); // Add thelabel to MyGridLayout
     
        // make the frame visible (activate the GUI frame)
        myJFrame.setVisible(true); 
    } // end main()
} // end class
