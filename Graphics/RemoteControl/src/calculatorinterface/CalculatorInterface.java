/*
 * CalculatorInterface.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of an interface for a calculator.
 * 
 * It uses a BorderLayout with a JPanel that has a 
 * GridLayout for buttons in the Center zone
 * 
 * */
package calculatorinterface;

import java.awt.*;
import javax.swing.*;

public class CalculatorInterface 
{
    public static void main(String[] args) 
    {   
        // create a frame to hold the components
        JFrame myJFrame = new JFrame();

        // create a Borderlayout and assign it to the JFrame
        myJFrame.setLayout(new BorderLayout());
          
        // Create a panel for the number buttons  
        // Grid with 4 columns and 4 rows
	JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));
        
        // Declare an array of 10 JButtons for digits 0-9
        JButton[] numberButton = new JButton[10];
        
        // Create buttons for arithmetic operations
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("x");
        JButton divButton = new JButton("/");
        JButton equButton = new JButton("=");
        
        // define and add buttons to the first row:  7 8 9 +
        // define and add buttons for 1-3 to the panel
        for (int i = 1; i <= 3  ; i++) 
            {
                numberButton[i] = new JButton(""+i);
            	buttonsPanel.add(numberButton[i]);
            }
        
        // add the plus button
        buttonsPanel.add(addButton);
        
        // define and add buttons to the second row:  4 5 6 -
        // define and add buttons for 4-6 to the panel
        for (int i = 4; i <= 6 ; i++) 
            {
                numberButton[i] = new JButton(""+i);
            	buttonsPanel.add(numberButton[i]);
            }		
        
        // add the subtract button
        buttonsPanel.add(subButton);
        
        // define and add buttons to the third row:  7 8 9 X
        // define and add buttons for 7-9 to the panel
        for (int i = 7; i <= 9 ; i++) 
            {
                numberButton[i] = new JButton(""+i);
            	buttonsPanel.add(numberButton[i]);
            }		
        
        // add the multiplication button
        buttonsPanel.add(mulButton);

        // define and add buttons to the fourth row:  []0[]/
        // add the a blank placeholder label
        JLabel blankLabel1 = new JLabel("");
        buttonsPanel.add(blankLabel1);
        
        // add the zero button
        numberButton[0] = new JButton("0");
        buttonsPanel.add(numberButton[0]);

        // add the a blank placeholder label
        JLabel blankLabel2 = new JLabel("");
        buttonsPanel.add(blankLabel2);
               
        // add the division button
        buttonsPanel.add(divButton);
                
        // add the main button panel to the JFrame
        myJFrame.add(buttonsPanel, BorderLayout.CENTER);

        // add the large equals button to the JFrame
        myJFrame.add(equButton, BorderLayout.EAST);
        
        // Create a right justified textField to display the result
        JTextField jtResult = new JTextField("0.0");
        jtResult.setHorizontalAlignment(JTextField.RIGHT);
        
        // add the result text field to the JFrame
        myJFrame.add(jtResult, BorderLayout.NORTH);
                 
        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Calculator Interface Demo");
        myJFrame.setSize(280, 200);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        // make the frame visible (activate the frame)
        myJFrame.setVisible(true); 
        
    } // end main()
} // end class
