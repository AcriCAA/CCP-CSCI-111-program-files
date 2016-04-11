/*
 * TextListenerSubmit.java 
 * CSCI 111 Spring 2016
 * 
 * This program shows an example of a GUI with a textfield
 * and a listener that gets the input from the field when submit is clicked
 */

package textlistenersubmit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextListenerSubmit 
{
  public static void main(String[] args) 
    {
        // create an instance of TextFieldListener
        TextFieldFrame myFrame = new TextFieldFrame();   
        
        myFrame.setTitle("Text Field Event");
        myFrame.setSize(256, 144);
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
    JLabel prompt = new JLabel("Type your name, then click [Submit]");
    JTextField jtfName = new JTextField(20);
    JButton jbtSubmit = new JButton("Submit"); 
  
    // a detailed constructor for TextFieldFrame objects 
    public TextFieldFrame() 
    {
        // give the TextFieldFrame a FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // add the components to TextFieldFrame 
        add(jlblNote);
        add(prompt);
        add(jtfName);
        
        jbtSubmit.setPreferredSize(new Dimension(76, 24) );
        add(jbtSubmit);

        // register TextFieldFrame (this method) as the listener for jbtSubmit
        jbtSubmit.addActionListener(this);

    } // end TextFieldFrame() constructor

    public void actionPerformed(ActionEvent e) 
    {
        // capture the name from the text field and reset the field
        String name = jtfName.getText();                
        jtfName.setText("");
        
        // output a message using the name to the console
        System.out.println("Hello "+ name);
        
        // dispose of the frame (this frame) 
        this.dispose();
        
        
    } // end actionPerformed(ActionEvent e)
      //********************************************************************
    
} // end class TextFieldFrame






