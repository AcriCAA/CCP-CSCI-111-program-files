/*
 * BorderlayoutDemo.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a JFrame with a BorderLayout
 * 
 * It is an example of a one-time GUI, not defined as a class
 * No events have been added to the GUI, it only shows components
 */
package borderlayoutdemo;
import javax.swing.*;     
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) 
    {
    
        // create a frame to hold our components
        JFrame myJFrame = new JFrame();

        // create a new BorderLayout
        BorderLayout myLayout = new BorderLayout();
        
   
        // assign mylayout to be the layout for MyJFrame
        myJFrame.setLayout(myLayout);
        
        // Create a label with text "Center" for the central zone   
        JLabel  jlCenter = new JLabel("Center"); 
        jlCenter.setHorizontalAlignment(JLabel.CENTER);
        
        // Create a radio button for the North zone
        JRadioButton jrbNorth = new JRadioButton("North zone"); 
        jrbNorth.setHorizontalAlignment(JLabel.CENTER);

        // Create a radio button for the South zone
        JRadioButton jrbSouth = new JRadioButton("South zone"); 
        jrbSouth.setHorizontalAlignment(JLabel.CENTER);

        // create a String array for the list box and combo box
        String[] languages  = new String[] {"Java", "C++", "Python", "Visual Basic"};
            
        // Create a list using the language array 
        JList jlLanguages = new JList(languages);
        
        // Create a combo box using the language array 
        JComboBox jcombLanguages = new JComboBox(languages);
                  
        
        // add components to BorderLayout  )
           
        myJFrame.add(jlCenter, BorderLayout.CENTER); // Add label to Center zone        
        myJFrame.add(jrbNorth, BorderLayout.NORTH); // Add button to North zone
        myJFrame.add(jrbSouth, BorderLayout.SOUTH); // Add button to South zone
        myJFrame.add(jlLanguages, BorderLayout.EAST); // Add list to East zone
        myJFrame.add(jcombLanguages, BorderLayout.WEST); // Add combo box the West zone
        
        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Border Layout Demo");
        myJFrame.setSize(400, 160);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // make the frame visible (activate the frame)
        myJFrame.setVisible(true); 

        
    } // end main()
} // end class
