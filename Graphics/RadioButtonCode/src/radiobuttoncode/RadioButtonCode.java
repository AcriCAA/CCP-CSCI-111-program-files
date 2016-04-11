/*
 * RadioButtonCode.java 
 * CSCI 111 Spring 2016
 * 
 * This program shows an example of a GUI with radio button
 * using a an actionListener implementation
 */

package radiobuttoncode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonCode {

    public static void main(String[] args) 
    {
            // create an instance of RadioButtonsFrame
        RadioButtonFrame myFrame = new RadioButtonFrame();   
        
        myFrame.setTitle("Radio Buttons");
        myFrame.setSize(224, 168);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    
    }  // end main()
} // end class RadioButtonCode
//********************************************************************

// create a subclass of JFrames named RadioButtonFrame 
class RadioButtonFrame extends JFrame 
{
    
    // add components to the frame
    JLabel heading = new JLabel("Radio Button Demonstration");
    JRadioButton redButton = new JRadioButton("Red");
    JRadioButton yellowButton = new JRadioButton("Yellow");
    JRadioButton blueButton = new JRadioButton("Blue");
    JLabel redLabel = new JLabel();
    JLabel yellowLabel = new JLabel();
    JLabel blueLabel = new JLabel();
    
      
    // a detailed constructor for RadioButtonFrame objects 
    public RadioButtonFrame()  
    {
        // give the RadioButtonFrame a BorderLayout
        setLayout( new FlowLayout() );

        // add the components to the frame
       
        add (heading);
        add(redButton);
        add(yellowButton);
        add(blueButton);
        add(redLabel);
        add(yellowLabel);
        add(blueLabel);
        
        // create a button group
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(redButton);
        colorGroup.add(yellowButton);
        colorGroup.add(blueButton);
        
        JrdbListener listen = new JrdbListener();
        
        // register listen as the listener for the check buttons
        redButton.addItemListener(listen);
        yellowButton.addItemListener(listen);
        blueButton.addItemListener(listen);
        
    } // end RadioButtonFrame() constructor

    // Inner class JrdbListener
    class JrdbListener implements ItemListener{
        
    public void itemStateChanged(ItemEvent e) 
    {
        // react to specific button
        if (e.getSource() == redButton ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                redLabel.setText("Red button selected.");
                redLabel.setForeground(Color.red);
            }
            
            else
            {
                redLabel.setText("Red button deselected.");
                redLabel.setForeground(Color.black);
            }
        } // end if

        if (e.getSource() == yellowButton ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                yellowLabel.setText("Yellow button selected.");
                yellowLabel.setForeground(Color.yellow);
            }
            else
            {
                yellowLabel.setText("Yellow button deselected.");
                yellowLabel.setForeground(Color.black);
            }
            
        } // end if

        if (e.getSource() == blueButton ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                blueLabel.setText("Blue button selected.");
                blueLabel.setForeground(Color.blue);
            }
            else
            {
                blueLabel.setText("Blue button deselected.");
                blueLabel.setForeground(Color.black);
            }
            
        } // end if
        
    } // end itemStateChanged(ItemEvent e) 
      //********************************************************************

}  // end Inner class JrdbListener
    
    
} // end class RadioButtonsFrame 
