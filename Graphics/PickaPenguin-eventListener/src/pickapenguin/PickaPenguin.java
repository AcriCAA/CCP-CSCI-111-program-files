/*
 * PickaPenguin.java 
 * CSCI 111 Spring 2016
 * 
 * This program demonstrates the use or images with JButtons
 * 
 * It uses a GridLayout with four JButtons, each with a picture of penguin
 * an alternate image appears when each JButton is pressed
 */
package pickapenguin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PickaPenguin {

    public static void main(String[] args) 
    {
    
       
        // create an instance of TextFieldListener
        PenguinTextFieldFrame myJFrame = new PenguinTextFieldFrame();   
        
        
        
        // set the title, size, location and exit behavior
        myJFrame.setTitle("Pick a Penguin");
        myJFrame.setSize(1000, 500);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        
        
        
        
        
            
        
        // make the frame visible (activate the GUI frame)
        myJFrame.setVisible(true); 
        
        

    } // end main()
    
    
    
    
} // end Penguin class

     // create a subclass of JFrames named TextFieldFrame 
class PenguinTextFieldFrame extends JFrame implements ActionListener
{
    
    
        // Create Jlabels with images  and pressed images
        JButton jbGentoo = new JButton(new ImageIcon("img/Gentoo.jpg"));
//        jbGentoo.setPressedIcon(new ImageIcon("img/Gentoo2.jpg"));
        
        
        JButton jbKing = new JButton(new ImageIcon("img/King.jpg"));
//        jbKing.setPressedIcon(new ImageIcon("img/King2.jpg"));
        
        JButton jbChinstrap = new JButton(new ImageIcon("img/Chinstrap.jpg"));
//        jbChinstrap.setPressedIcon(new ImageIcon("img/Chinstrap2.jpg"));
        
        JButton jbAd = new JButton(new ImageIcon("img/Ad.jpg"));
//        jbAd.setPressedIcon(new ImageIcon("img/Ad2.jpg"));            
        
        // add tool tips to the JButtons 
//        jbGentoo.setToolTipText("Gentoo Penguin, Falkland Islands");
//        jbKing.setToolTipText("King Penguin, South Georgia Island");
//        jbChinstrap.setToolTipText("Chinstrap Penguin, Antarctic Peninsula");
//        jbAd.setToolTipText("Adélie Penguin and chicks, Petermann Island");
        
        
        // create text panel 
        JTextField jtfName = new JTextField(50);
        
        
        
       
  
    // a detailed constructor for TextFieldFrame objects 
    public PenguinTextFieldFrame() 
    {
        // give the TextFieldFrame a FlowLayout
        setLayout(new FlowLayout(FlowLayout.CENTER));


        // add the buttons to layout (in order)   
        add(jbGentoo);    // Add thelabel 
        add(jbKing);      // Add thelabel 
        add(jbChinstrap); // Add thelabel 
        add(jbAd);        // Add thelabel 
        add(jtfName);     // add text box 
        
        
        // register TextFieldFrame (this method) as the listener for 
        jbGentoo.addActionListener(this);
        jbKing.addActionListener(this);
        jbChinstrap.addActionListener(this);
        jbAd.addActionListener(this);
        

    } // end TextFieldFrame() constructor

    public void actionPerformed(ActionEvent e) 
    {
        // capture the name from the buttons field and reset the field
        
       
        
        if (e.getSource() == jbGentoo) {
        
        jtfName.setText("Gentoo Penguin, Falkland Islands");
            
            
        }
     
        
           
        if (e.getSource() == jbKing) {
        
        jtfName.setText("King Penguin, South Georgia Island");
            
            
        }
        
        if (e.getSource() == jbChinstrap) {
        
        jtfName.setText("Chinstrap Penguin, Antarctic Peninsula");
            
            
        }
        
        if (e.getSource() == jbAd) {
        
        jtfName.setText("Adélie Penguin and chicks, Petermann Island");
            
            
        }
     
        
        
        
        
        
        // dispose of the frame (this frame) 
//        this.dispose();
        
        
    } // end actionPerformed(ActionEvent e)
      //********************************************************************
    
} // end class TextFieldFrame