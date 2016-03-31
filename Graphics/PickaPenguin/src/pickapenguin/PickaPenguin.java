/*
 * PickaPenguin.java 
 * CSCI 111 Spring 2016
 * 
 * This program demonstrates the use or images with JButtons
 * 
 * It uses a GridLayout with four JButtons, each with a picture of penguin
 * an alternate image appears when each JButton is pressed
 */
package pickapenguin;
import javax.swing.*;
import java.awt.*;

public class PickaPenguin {

    public static void main(String[] args) 
    {
     // create a frame to hold our components
        JFrame myJFrame = new JFrame();
        
        // set the title, size, location and exit behavior
        myJFrame.setTitle("Pick a Penguin");
        myJFrame.setSize(270, 450);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create and assign a 2 row, 2 column Gridlayout for the frame         
        myJFrame.setLayout(new GridLayout(2,2));
    
        // Create Jlabels with images  and pressed images
        JButton jbGentoo = new JButton(new ImageIcon("img/Gentoo.jpg"));
        jbGentoo.setPressedIcon(new ImageIcon("img/Gentoo2.jpg"));
        
        JButton jbKing = new JButton(new ImageIcon("img/King.jpg"));
        jbKing.setPressedIcon(new ImageIcon("img/King2.jpg"));
        
        JButton jbChinstrap = new JButton(new ImageIcon("img/Chinstrap.jpg"));
        jbChinstrap.setPressedIcon(new ImageIcon("img/Chinstrap2.jpg"));
        
        JButton jbAd = new JButton(new ImageIcon("img/Ad.jpg"));
        jbAd.setPressedIcon(new ImageIcon("img/Ad2.jpg"));            
        
        // add tool tips to the JButtons 
        jbGentoo.setToolTipText("Gentoo Penguin, Falkland Islands");
        jbKing.setToolTipText("King Penguin, South Georgia Island");
        jbChinstrap.setToolTipText("Chinstrap Penguin, Antarctic Peninsula");
        jbAd.setToolTipText("Adélie Penguin and chicks, Petermann Island");
        
        // add the buttons to MyGridLayout (in order)   
        myJFrame.add(jbGentoo);    // Add thelabel to MyGridLayout
        myJFrame.add(jbKing);      // Add thelabel to MyGridLayout
        myJFrame.add(jbChinstrap); // Add thelabel to MyGridLayout
        myJFrame.add(jbAd);        // Add thelabel to MyGridLayout
            
        
        // make the frame visible (activate the GUI frame)
        myJFrame.setVisible(true); 

    } // end main()
} // end class
