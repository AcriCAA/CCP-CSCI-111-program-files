/*
 * CheckBoxCode.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a GUI with check boxes
 * using a an itemListener implementation
 */

package checkboxcode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxCode {
   public static void main(String[] args) 
    {
        // create an instance of CheckBoxFrame
        CheckBoxFrame myFrame = new CheckBoxFrame();   
        
        myFrame.setTitle("Check Boxes");
        myFrame.setSize(212, 168);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    
    }  // end main()
} // end class CheckboxCode
//********************************************************************

// create a subclass of JFrames named CheckBoxFrame 
class CheckBoxFrame extends JFrame implements ItemListener
{
    
    // add components to the frame
    JLabel heading = new JLabel("CheckBox Demonstration");
    JCheckBox redBox = new JCheckBox("Red");
    JCheckBox yellowBox = new JCheckBox("Yellow");
    JCheckBox blueBox = new JCheckBox("Blue");
    JLabel redLabel = new JLabel();
    JLabel yellowLabel = new JLabel();
    JLabel blueLabel = new JLabel();
    
      
    // a detailed constructor for CheckBoxFrame objects 
    public CheckBoxFrame()  
    {
        // give the CheckBoxFrame a BorderLayout
        setLayout( new FlowLayout() );

        // add the components to the frame
        
        add (heading);
        add(redBox);
        add(yellowBox);
        add(blueBox);
        add(redLabel);
        add(yellowLabel);
        add(blueLabel);
        
        // register CheckBoxFrame (this method) at the listener for the check boxes
        redBox.addItemListener(this);
        yellowBox.addItemListener(this);
        blueBox.addItemListener(this);
        
    } // end CheckBoxFrame() constructor

    public void itemStateChanged(ItemEvent e) 
    {
        // react to specific boxs
        if (e.getSource() == redBox ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                redLabel.setText("Red box selected.");
                redLabel.setForeground(Color.red);
            }
            
            else
            {
                redLabel.setText("Red box deselected.");
                redLabel.setForeground(Color.black);
            }
        } // end if

        if (e.getSource() == yellowBox ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                yellowLabel.setText("Yellow box selected.");
                yellowLabel.setForeground(Color.yellow);
            }
            else
            {
                yellowLabel.setText("Yellow box deselected.");
                yellowLabel.setForeground(Color.black);
            }
            
        } // end if

        if (e.getSource() == blueBox ) 
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                blueLabel.setText("Blue box selected.");
                blueLabel.setForeground(Color.blue);
            }
            else
            {
                blueLabel.setText("Blue box deselected.");
                blueLabel.setForeground(Color.black);
            }
            
        } // end if
        
                
    } // end itemStateChanged(ItemEvent e) 
      //********************************************************************
    
} // end class CheckBoxFrame
