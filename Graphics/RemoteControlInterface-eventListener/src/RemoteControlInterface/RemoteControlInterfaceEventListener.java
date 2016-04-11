/*
 * Author: Corey Acri @AcriCAA
 * Date: April 1, 2016
 * RemoteControlInterfaceEventListener.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a TV remote control.
 * 
 * */
package RemoteControlInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;


public class RemoteControlInterfaceEventListener {

    public static void main(String[] args) {
        
        RemoteFieldsFrame myJFrame = new RemoteFieldsFrame();
        
//        1. create a frame to hold the components
//        JFrame myJFrame = new JFrame();

        // 2 Set the properties for the container, size, location, exit behavior
        myJFrame.setTitle("Remote Control");
        myJFrame.setSize(400,700);
        myJFrame.setLocation(200, 400);
        myJFrame.setDefaultCloseOperation(myJFrame.EXIT_ON_CLOSE); //default action is HIDE_ON_CLOSE

        // create a Borderlayout and assign it to the JFrame
//        myJFrame.setLayout(new BorderLayout());
        
        // create FONT instances
        Font title = new Font("Arial", Font.BOLD, 28);
        Font regular = new Font("Sans Serif", Font.BOLD, 16);
        Font small = new Font("TRUETYPE", Font.ITALIC, 15);

        // Create a center justified textField to display channel entered
//        JTextField jtResult = new JTextField("Enter Channel Number");
        
        
          
//        
// // Create a panel for power and input buttons
// // Grid with 1 row and 3 columns
//         JPanel topButtonsPanel = new JPanel(new BorderLayout());
//
//         // Create buttons for power, blank and inputs  operations
//        JButton powerButton = new JButton(" P ");
//        JLabel blankLabel1 = new JLabel("");
//        JButton inputsButton = new JButton("Inputs");
//        
//        
//        
//    
//
//        // Create a panel for the number buttons
//        // Grid with 4 rows and 3 columns
//        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3));
//
//        // Declare an array of 10 JButtons for digits 0-9
//        JButton[] numberButton = new JButton[10];
//
//        // Create buttons for blanks, delete and bottom row operations
//        JButton deleteButton = new JButton(" < ");
//        
//        JButton blankButton = new JButton("  ");
//        
//         // Create a panel for enter and volume and channel up down buttons
//        JPanel bottomButtonsPanel = new JPanel(new BorderLayout());
//
//         // Create buttons for power, blank and inputs  operations
//        JButton volumeButton = new JButton(new ImageIcon("img/volume.png"));
//        JButton channelButton = new JButton(new ImageIcon("img/channel.png"));
//        JButton enterButton = new JButton("ENTER");
//        
//        
//            // add buttons to topButtonsPanel
//        topButtonsPanel.add(powerButton, BorderLayout.WEST);
//        topButtonsPanel.add(blankLabel1,BorderLayout.NORTH);
//        topButtonsPanel.add(inputsButton, BorderLayout.EAST);
//        topButtonsPanel.add(jtResult, BorderLayout.SOUTH);
//       
//        
//        
//        
//        // add buttons to bottomButtonsPanel
//       
//        bottomButtonsPanel.add(volumeButton,BorderLayout.WEST);
//        bottomButtonsPanel.add(channelButton,BorderLayout.EAST);
//        bottomButtonsPanel.add(enterButton,BorderLayout.NORTH);
//        
//
//
//        // define and add buttons to the first row:  7 8 9 +
//        // define and add buttons for 1-3 to the panel
//        for (int i = 1; i <= 3; i++) {
//            numberButton[i] = new JButton("" + i);
//            numberButton[i].setForeground(Color.RED);
//         
//
//        }
//        
//         for (int i = 1; i <= 3; i++) {
//           
//            buttonsPanel.add(numberButton[i]);
//
//        }
//
//        // define and add buttons to the second row:  4 5 6 -
//        // define and add buttons for 4-6 to the panel
//        for (int i = 4; i <= 6; i++) {
//            numberButton[i] = new JButton("" + i);
//            buttonsPanel.add(numberButton[i]);
//
//        }
//
//        // define and add buttons to the third row:  7 8 9 X
//        // define and add buttons for 7-9 to the panel
//        for (int i = 7; i <= 9; i++) {
//            numberButton[i] = new JButton("" + i);
//            buttonsPanel.add(numberButton[i]);
//
//        }
//
//        // define and add buttons to the fourth row:  []0[]/
//        // add the a blank placeholder label
//        buttonsPanel.add(blankButton);
//
//        // add the zero button
//        numberButton[0] = new JButton("0");
//        buttonsPanel.add(numberButton[0]);
//
//        // add the delete button
//        buttonsPanel.add(deleteButton);

       
        // Apply title font appearance to number buttons
//        applyFontStyles(myJFrame, 
//                powerButton,
//                inputsButton,
//                volumeButton,
//                channelButton,
//                deleteButton, 
//                enterButton, 
//                blankButton, 
//                numberButton, 
//                jtResult,
//                title, 
//                regular, 
//                small);


        // set button panel background colors to black
//        buttonsPanel.setBackground(Color.BLACK);
//        topButtonsPanel.setBackground(Color.BLACK);
//        bottomButtonsPanel.setBackground(Color.BLACK);
        
        
//         // add the main button panel to the JFrame
//        myJFrame.add(buttonsPanel, BorderLayout.CENTER);
//
//
//
//        // add the result text field to the JFrame
//        myJFrame.add(topButtonsPanel, BorderLayout.NORTH);
//
//        // add the delete button
//        myJFrame.add(bottomButtonsPanel, BorderLayout.SOUTH);

        // make the frame visible (activate the frame)
        myJFrame.setVisible(true);

    } // end main()

//******************************************************************************
//                                 METHODS     
//****************************************************************************** 
    
    
//******************************************************************************        
// this method applies font and other styles 
//******************************************************************************    
    public static void applyFontStyles(JFrame applyJFrame,
            JButton powerButton, 
            JButton inputsButton, 
            JButton volumeButton,
            JButton channelButton,
            JButton applyDeleteButton,
            JButton applyEnterButton,
            JButton applyBlankButton,
            JButton applyNumbersButton[],
            JTextField jtResult,
            Font title,
            Font regular,
            Font small) {
        
     
        

        Color teal = new Color(0,128,128);
                
        // JFRAME
        applyJFrame.setFont(title);
        
      
        
        
        //power button
        powerButton.setFont(title);
        powerButton.setForeground(Color.RED);
      
        
        
        //inputs button
        inputsButton.setFont(small);
        inputsButton.setForeground(Color.LIGHT_GRAY);
        
        
        //jtResult text field 
        jtResult.setFont(small);
        jtResult.setHorizontalAlignment(JTextField.CENTER);
        jtResult.setForeground(Color.LIGHT_GRAY);
        
        
        // delete button 
        applyDeleteButton.setFont(regular);
        applyDeleteButton.setForeground(Color.RED);
        
        //Enter Button
        applyEnterButton.setFont(title);
        applyEnterButton.setForeground(Color.RED);
        
        // Blank button 
        applyBlankButton.setFont(regular);
        applyBlankButton.setForeground(Color.RED); 

        for (int i = 0; i < 10; i++) {
            applyNumbersButton[i].setFont(regular);
            applyNumbersButton[i].setForeground(Color.RED);
        } // end setting styles for number buttons
    }
// END METHODS SECTION**********************************************************  

} // end class



