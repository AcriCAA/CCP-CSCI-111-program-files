/*
 * ButtonEventDemo.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a GUI with a simple button event.
 * "Hello World" is printed to the console when a button is pressed.
 */
package buttoneventdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   // Required import statement

public class ButtonEventDemo 
{
    // main method for the ButtonEventDemo class
    public static void main(String[] args) 
    {
        HelloFrame myFrame = new HelloFrame();   // create an instance of HelloFrame
        
        myFrame.setTitle("Button Event Demo");
        myFrame.setSize(256, 100);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    
    }  // end main()
} // end class ButtonEventDemo
//********************************************************************

// create a subclass of JFrames named HelloFrame 
class HelloFrame extends JFrame 
{
    // a constructor for HelloFrame objects that will define the object in detail
    public HelloFrame() 
    {
        // give the HelloFrame a FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Create a label for the demo
        JLabel jlblNote = new JLabel("Button Event Demo");

        // Create the Hello button for the demo
        JButton jbtHello = new JButton("Say  'Hello World'");
        jbtHello.setPreferredSize(new Dimension(144, 32) );

        // add components to HelloFrame objects
        add(jlblNote);
        add(jbtHello);

        // create an instance of the HelloListener class (implements ActionListener)
        JbtListener helloListener = new JbtListener();
        
        // Register the listener for the Hello button
        jbtHello.addActionListener(helloListener);

    }  // end HelloFrame detailed constructor
    //********************************************************************

    // create a listener for the JbtHello button as an inner class of HelloFrame
    class JbtListener implements ActionListener 
    {
        // create an event handler for the Hello Button
        public void actionPerformed(ActionEvent e) 
        {
            JOptionPane.showMessageDialog(null,"Hello World!");
        } // end actionPerformed(ActionEvent e)
    }  // end inner class HelloListener
    //********************************************************************
} // end class HelloFrame

