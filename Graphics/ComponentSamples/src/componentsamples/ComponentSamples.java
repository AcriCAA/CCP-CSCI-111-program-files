/*
 * ComponentSamples.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows examples of some Swing components 
 * in a JFrame  using a GridLayout
 * 
 * It is an example of a one-time GUI, not defined as a class
 * No events have been added to the GUI, it only shows components
 */

package componentsamples;  
import javax.swing.*;     
import java.awt.*;

public class ComponentSamples 
{
    
    public static void main(String[] args) 
    {
    
        // create a frame to hold our components
        JFrame myJFrame = new JFrame();

        // create a new a grid layout for the frame - 5 rows  x 2 cols, gaps=20
        GridLayout myLayout = new GridLayout(5,2);
        myLayout.setHgap(20);    
        myLayout.setVgap(20);
   
        // assign myLayout to be the layout for MyJFrame
        myJFrame.setLayout(myLayout);
        
        // Create a label with text "Please enter your name:"    
        JLabel  jlName = new JLabel("Please enter your name:"); 
        
        // Create a text field with text "enter your name here"    
        JTextField jtfName = new JTextField("Enter your name here");
        
        ButtonGroup buttons = new ButtonGroup(); 
        
        // Create a radio button for Statistics
        JRadioButton jrbStat = new JRadioButton("Statistics"); 

        // Create a radio button for Linear Algebra
        JRadioButton jrbLinear = new JRadioButton("Linear Algebra");
        
        
       buttons.add(jrbStat);
       buttons.add(jrbLinear);
        
        // Create a check box for Computer Science
        JCheckBox jcbCSCI = new JCheckBox("Computer Science"); 

        // Create a default slider -- it has no labels
        JSlider jlsSample = new JSlider(); 
    
        // create a String array for the list box and combo box
        String[] languages  = new String[] {"Java", "C++", "Python", "Visual Basic"};
            
        // Create a list using the language array
        JList jlLanguages = new JList(languages);
       
        
        // Create a combo box using the language array
        JComboBox jcombLanguages = new JComboBox(languages);
          
        // Create a button with text OK 
        JButton jbtOK = new JButton("OK"); 
        
        // Create a button with text Cancel    
        JButton jbtCancel = new JButton("Cancel"); 
       
        
        // add components to MyGridLayout  (in order)
           
        myJFrame.add(jlName); // Add the label to MyGridLayout
        myJFrame.add(jtfName); // Add the text field to MyGridLayout

        myJFrame.add(jrbStat); // Add the Statistics radio button to MyGridLayout 
        myJFrame.add(jrbLinear); // Add the Linear Algebra radio button to MyGridLayout 

        myJFrame.add(jcbCSCI); // Add the Computer Science check box to MyGridLayout
        myJFrame.add(jlsSample); // Add the sample default slider to MyGridLayout

        myJFrame.add(jlLanguages); // Add the languages list to MyGridLayout
        myJFrame.add(jcombLanguages); // Add the languages combobox to MyGridLayout
           
        myJFrame.add(jbtOK); // Add the OK button to MyGridLayout
        myJFrame.add(jbtCancel); // Add the Cancel button to MyGridLayout
 
        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Components in a Grid Layout");
        myJFrame.setSize(360, 480);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // make the frame visible (activate the frame)
        myJFrame.setVisible(true); 

        
    } // end main()
} // end class

