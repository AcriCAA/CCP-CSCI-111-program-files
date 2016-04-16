/*
 * Author: Corey Acri @AcriCAA
 * Date: April 13, 2016
 * RemoteControlInterfaceEventListener.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a TV remote control and places the user
 * inputs at the top of the text field in the remote.
 * 
 * */
package RemoteControlInterfaceEventListener;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class RemoteControlInterfaceEventListener {

    public static void main(String[] args) {

        //        1. create a frame to hold the components
        RemoteFieldsFrame myJFrame = new RemoteFieldsFrame();

        // 2 Set the properties for the container, size, location, exit behavior
        myJFrame.setTitle("Remote Control");
        myJFrame.setSize(400, 700);
        myJFrame.setLocation(200, 400);
        myJFrame.setDefaultCloseOperation(myJFrame.EXIT_ON_CLOSE); //default action is HIDE_ON_CLOSE

        // make the frame visible (activate the frame)
        myJFrame.setVisible(true);

    } // end main()

} // end class

// create a subclass of JFrame named RemoteFieldsFrame 
class RemoteFieldsFrame extends JFrame implements ActionListener {

    // Create a center justified textField to display channel entered
    JTextField jtResult = new JTextField(20);

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
    public RemoteFieldsFrame() {

        // give the TextFieldFrame a FlowLayout
        // create a Borderlayout and assign it to the JFrame
        setLayout(new BorderLayout());

        // add buttons to topButtonsPanel
        topButtonsPanel.add(powerButton, BorderLayout.WEST);
        topButtonsPanel.add(blankLabel1, BorderLayout.NORTH);
        topButtonsPanel.add(inputsButton, BorderLayout.EAST);
        topButtonsPanel.add(jtResult, BorderLayout.SOUTH);

// add buttons to bottomButtonsPanel *******************************
        bottomButtonsPanel.add(volumeButton, BorderLayout.WEST);
        bottomButtonsPanel.add(channelButton, BorderLayout.EAST);
        bottomButtonsPanel.add(enterButton, BorderLayout.NORTH);

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
        for (int i = 0; i < 10; i++) {
            numberButton[i].addActionListener(this);
        }

        powerButton.addActionListener(this);

        inputsButton.addActionListener(this);

        deleteButton.addActionListener(this);

        blankButton.addActionListener(this);
        volumeButton.addActionListener(this);
        channelButton.addActionListener(this);
        enterButton.addActionListener(this);
        jtResult.addActionListener(this);

    } // end RemoteFieldFrame() constructor

    // create an event listener method
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getSource().toString());

        if (e.getSource() == numberButton[0]) {
            jtResult.setText("0");
        }

        if (e.getSource() == numberButton[1]) {

            jtResult.setText("1");

        }

        if (e.getSource() == numberButton[2]) {

            jtResult.setText("2");

        }

        if (e.getSource() == numberButton[3]) {

            jtResult.setText("3");

        }

        if (e.getSource() == numberButton[4]) {

            jtResult.setText("4");

        }

        if (e.getSource() == numberButton[5]) {

            jtResult.setText("5");

        }

        if (e.getSource() == numberButton[6]) {

            jtResult.setText("6");

        }

        if (e.getSource() == numberButton[7]) {

            jtResult.setText("7");

        }

        if (e.getSource() == numberButton[8]) {

            jtResult.setText("8");

        }

        if (e.getSource() == numberButton[9]) {

            jtResult.setText("9");

        }

        if (e.getSource() == powerButton) {

            jtResult.setText("POWER");

        }

        if (e.getSource() == blankLabel1) {

            jtResult.setText(" ");

        }

        if (e.getSource() == volumeButton) {

            jtResult.setText("Volume button");

        }

        if (e.getSource() == inputsButton) {

            jtResult.setText("Inputs");

        }

        if (e.getSource() == channelButton) {

            jtResult.setText("Channel button");

        }

        if (e.getSource() == enterButton) {

            jtResult.setText("ENTER");

        }

        if (e.getSource() == deleteButton) {

            jtResult.setText(" ");

        }
        
    } // end actionPerformed(ActionEvent e)
    //********************************************************************

} // end class TextFieldFrame

