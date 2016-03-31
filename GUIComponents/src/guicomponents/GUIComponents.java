/*
 * @author AcriCAA (Corey Acri) 
 * Course: CSCI 111
 * Date: March 29, 2016
 * Description: This program goes over the steps for setting up a GUI
 */
package guicomponents;

import javax.swing.*;
import java.awt.*; 


public class GUIComponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // JFrame ==> Frame ==> Window ==> Container
     // Steps for initiating a GUI 
     
     // 1 Instantiate a container object 
     JFrame myFrame = new JFrame(); 
     
     
     // 2 Set the properties for the container, size, location, exit behavior
     
     myFrame.setTitle("My Sample GUI");
     myFrame.setSize(400,400);
     myFrame.setLocation(100,400);
     myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE); //default action is HIDE_ON_CLOSE
     
     // 3 Instantiate layout manager for the container and assign it to the container (flow, border,grid)
     
     FlowLayout myLayout = new FlowLayout(FlowLayout.LEFT); // FlowLayout.LEFT will flow left to right
     myFrame.setLayout(myLayout);
     
     // 4 Create any components for the interface 
     JButton myButton = new JButton("Hello World");
     JLabel myLabel = new JLabel("My Label");
     JTextField myText = new JTextField("Enter text: ");
     
     
     
     // 5 Add the components to the container 
     
            // for flow you want to add them in the order that you want them displayed on your computer
            myFrame.add(myButton);
            myFrame.add(myLabel);
            myFrame.add(myText); 
            
            
     // 6 Activate the container to make it visible 
     
     myFrame.setVisible(true);
     
     
     
     
    }
    
}
