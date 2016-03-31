/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changingflowlayouttoborderlayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author AcriCAA
 */
public class ChangingFlowLayouttoBorderLayout {

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
     
     BorderLayout myLayout = new BorderLayout(); // 
     myFrame.setLayout(myLayout);
     
     // 4 Create any components for the interface 
     JButton myButton = new JButton("North");
     JButton myButton1 = new JButton("South");
     JButton myButton2 = new JButton("East");
     JButton myButton3 = new JButton("West");
     JLabel myLabel = new JLabel("My Label");
     JTextField myText = new JTextField("Enter text: ");
     
     
     
     // 5 Add the components to the container 
     
    // for BorderLayout you have to set the region
    myFrame.add(myButton, BorderLayout.NORTH); // if you do not specify a region it defaults to CENTER PANE
    myFrame.add(myButton1, BorderLayout.SOUTH);
    myFrame.add(myButton2, BorderLayout.EAST);
    myFrame.add(myButton3, BorderLayout.WEST);
    myFrame.add(myLabel, BorderLayout.NORTH);
    myFrame.add(myText); 
            
            
     // 6 Activate the container to make it visible 
     
     myFrame.setVisible(true);
     
    }
    
}
