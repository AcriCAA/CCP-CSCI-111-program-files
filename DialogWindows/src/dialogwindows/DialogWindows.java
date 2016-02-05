/**
 * @author CSCI 111
 * Spring 2016
 * This is a sample program to demonstrate the JOptionPane class
 */
package dialogwindows;

import javax.swing.*;             // Import the Swing package

// Can import just the class (uncomment the line below). But don't need both.
//import javax.swing.JOptionPane; // Import the JOptionPane class 
//Here is my DialogWindows class
public class DialogWindows {

    // Start of main method to demonstrate different types of dialog windows
    public static void main(String[] args) {

        // Basic dialog window to display a message
        JOptionPane.showMessageDialog(null, "This is a simple dialog window.");

        // Dialog window with arguments to allow for custom window title
        JOptionPane.showMessageDialog(null, "Here's a more customized window.",
                "Custom Window Title", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Here's a more customized window.",
                "Custom Window Title", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "Here's a more customized window.",
                "Custom Window Title", JOptionPane.ERROR_MESSAGE);

        // Variable declarations to store user-entered Strings
        String name;   // User's name
        String winner; // User-entered choice of winning team

        // Use showInputDialog method to prompt and input user name
        name = JOptionPane.showInputDialog("What is your name?");

        // Use showInputDialog method to prompt and input preferred team
        winner = JOptionPane.showInputDialog("Hello " + name + ", who do you "
                + "think will win on Sunday: the Panthers or the Broncos?");

        // Dialog window with customized message for user.
        JOptionPane.showMessageDialog(null, "Well, " + name + " I hope "
                + winner + " get(s) the WIN on Sunday!", "Lets go, " + winner + "!",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // ends input sequence, 0 is the standard int value indicating your program has run successfully

    } // End main method

} // End DialogWindows class
