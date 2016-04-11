package RemoteControlInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AcriCAA
 */
// create a subclass of JFrame named RemoteFieldsFrame 
public class RemoteFieldsFrame extends JFrame implements ActionListener
{
    // Create a center justified textField to display channel entered
        JTextField jtResult = new JTextField("Enter Channel Number");
        JPanel topButtonsPanel = new JPanel(new BorderLayout());

         // Create buttons for power, blank and inputs  operations
        JButton powerButton = new JButton(" P ");
        JLabel blankLabel1 = new JLabel("");
        JButton inputsButton = new JButton("Inputs");
        

        // Create a panel for the number buttons
        // Grid with 4 rows and 3 columns
        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3));

        // Declare an array of 10 JButtons for digits 0-9
        JButton[] numberButton = new JButton[10];

        // Create buttons for blanks, delete and bottom row operations
        JButton deleteButton = new JButton(" < ");
        
        JButton blankButton = new JButton("  ");
        
         // Create a panel for enter and volume and channel up down buttons
        JPanel bottomButtonsPanel = new JPanel(new BorderLayout());

         // Create buttons for power, blank and inputs  operations
        JButton volumeButton = new JButton(new ImageIcon("img/volume.png"));
        JButton channelButton = new JButton(new ImageIcon("img/channel.png"));
        JButton enterButton = new JButton("ENTER");
                
      
    
    // a detailed constructor for TextFieldFrame objects 
    public RemoteFieldsFrame() 
    {
        
        // give the TextFieldFrame a FlowLayout
         // create a Borderlayout and assign it to the JFrame
        setLayout(new BorderLayout());
        
        
         
        
        // add buttons to topButtonsPanel
        topButtonsPanel.add(powerButton, BorderLayout.WEST);
        topButtonsPanel.add(blankLabel1,BorderLayout.NORTH);
        topButtonsPanel.add(inputsButton, BorderLayout.EAST);
        topButtonsPanel.add(jtResult, BorderLayout.SOUTH);
       
         
        // add buttons to bottomButtonsPanel
       
        bottomButtonsPanel.add(volumeButton,BorderLayout.WEST);
        bottomButtonsPanel.add(channelButton,BorderLayout.EAST);
        bottomButtonsPanel.add(enterButton,BorderLayout.NORTH);
        
          // define and add buttons for 1-3 to the panel
        for (int i = 1; i <= 3; i++) {
            numberButton[i] = new JButton("" + i);
            numberButton[i].setForeground(Color.RED);
         

        }
        
         for (int i = 1; i <= 3; i++) {
           
            buttonsPanel.add(numberButton[i]);

        }

        // define and add buttons to the second row:  4 5 6 -
        // define and add buttons for 4-6 to the panel
        for (int i = 4; i <= 6; i++) {
            numberButton[i] = new JButton("" + i);
            buttonsPanel.add(numberButton[i]);

        }

        // define and add buttons to the third row:  7 8 9 X
        // define and add buttons for 7-9 to the panel
        for (int i = 7; i <= 9; i++) {
            numberButton[i] = new JButton("" + i);
            buttonsPanel.add(numberButton[i]);

        }

        // define and add buttons to the fourth row:  []0[]/
        // add the a blank placeholder label
        buttonsPanel.add(blankButton);

        // add the zero button
        numberButton[0] = new JButton("0");
        buttonsPanel.add(numberButton[0]);

        // add the delete button
        buttonsPanel.add(deleteButton);

        // add the main button panel to the JFrame
        add(buttonsPanel, BorderLayout.CENTER);



        // add the result text field to the JFrame
        add(topButtonsPanel, BorderLayout.NORTH);

        // add the delete button
        add(bottomButtonsPanel, BorderLayout.SOUTH);


        // register RemoteFieldsFrame (this method) as the listener for jtfName
        
        for(int i = 0; i<10;i++)
            numberButton[i].addActionListener(this);
        
        powerButton.addActionListener(this);
       
        inputsButton.addActionListener(this);
        
        deleteButton.addActionListener(this);
        
        blankButton.addActionListener(this);
        volumeButton.addActionListener(this);
        channelButton.addActionListener(this);
        enterButton.addActionListener(this);
        jtResult.addActionListener(this);
        
        
        

    } // end RemoteFieldFrame() constructor

    public void actionPerformed(ActionEvent e) 
    {
        
        System.out.println(e.getSource().toString());
       
        
        
    } // end actionPerformed(ActionEvent e)
      //********************************************************************
    
} // end class TextFieldFrame