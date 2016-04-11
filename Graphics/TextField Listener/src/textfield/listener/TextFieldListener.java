/*
 * TextFieldListener.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a GUI with a textfield
 * and a listener that gets the input from the field
 */

package textfield.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldListener 
{
    public static void main(String[] args) 
    {
        // create an instance of TextListenerSubmit
        TextFieldFrame myFrame = new TextFieldFrame();   
        
        myFrame.setTitle("Text Field Event");
        myFrame.setSize(256, 128);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    
    }  // end main()
} // end class TwoButtonsOneListeners
//********************************************************************

    
    // create a subclass of JFrames named TextFieldFrame 
class TextFieldFrame extends JFrame implements ActionListener
{
    JLabel jlblNote = new JLabel("This GUI gets data from a text field");
    JLabel prompt = new JLabel("Please enter your name");
    JTextField jtfName = new JTextField(20);
    
    
    // a detailed constructor for TextFieldFrame objects 
    public TextFieldFrame() 
    {
        // give the TextFieldFrame a FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // add the components to TextFieldFrame 
        add(jlblNote);
        add(prompt);
        add(jtfName);

        // register TextFieldFrame (this method) as the listener for jtfName
        jtfName.addActionListener(this);

    } // end TextFieldFrame() constructor

    public void actionPerformed(ActionEvent e) 
    {
        // capture the name from the text field and reset the field
        String name = jtfName.getText();                
        jtfName.setText("");
        
        // output a message using the name to the console
        JOptionPane.showMessageDialog(null, "Hello "+ name);
        // dispose of the frame (this frame) 
        this.dispose();
        
        
    } // end actionPerformed(ActionEvent e)
      //********************************************************************
    
} // end class TextFieldFrame
