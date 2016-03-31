/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayoutdemo;

import javax.swing.*;     
import java.awt.*;


/**
 *
 * @author AcriCAA
 */
public class GridLayoutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        
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
     
     
     GridLayout myLayout = new GridLayout(5,2); 
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
    myFrame.add(myButton);
    myFrame.add(myButton1);
    myFrame.add(myButton2);
    myFrame.add(myButton3);
    myFrame.add(myLabel);
    myFrame.add(myText); 
            
            
     // 6 Activate the container to make it visible 
     
     myFrame.setVisible(true);
    }
    
}
