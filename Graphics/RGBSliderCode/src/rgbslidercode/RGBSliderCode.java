/*
 * RGBSliderCode.java 
 * CSCI 111 Spring 2016 
 * 
 * This program shows an example of a GUI with sliders for RGB color selection
 * using a an actionListener implementation
 */

package rgbslidercode;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class RGBSliderCode 
{
    public static void main(String[] args) 
    {
           // create an instance of SliderFrame
        SliderFrame myFrame = new SliderFrame();   
        
        myFrame.setTitle("RGB Sliders to select colors");
        myFrame.setSize(360, 180);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        
    }  // end main()
} // end class ChecksliderCode
//********************************************************************

// create a subclass of JFrames named SliderFrame 
class SliderFrame extends JFrame implements ChangeListener

{   
    // declrae components for the frame
    JLabel heading = new JLabel("Sliders for Color Selection");
    JSlider redSlider = new JSlider();
    JSlider greenSlider = new JSlider();
    JSlider blueSlider = new JSlider();
    JLabel colorZone = new JLabel("Colors");    
    
    // a detailed constructor for SliderFrame objects 
    public SliderFrame()  
    {
        // give the SliderFrame a FlowLayout
        setLayout(new BorderLayout());


        // set parameters for red slider
        redSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        redSlider.setMajorTickSpacing(64);
        redSlider.setMinorTickSpacing(32);
        redSlider.setPaintTicks(true);
        redSlider.setPaintLabels(true);
        redSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

        greenSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        greenSlider.setMajorTickSpacing(64);
        greenSlider.setMinorTickSpacing(32);
        greenSlider.setPaintTicks(true);
        greenSlider.setPaintLabels(true);
        greenSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

        // set parameters for blue slider
        blueSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
        blueSlider.setMajorTickSpacing(64);
        blueSlider.setMinorTickSpacing(32);
        blueSlider.setPaintTicks(true);
        blueSlider.setPaintLabels(true);
        blueSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        blueSlider.setPreferredSize(new Dimension(100, 100));

        // add the components to the frame
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setFont(new Font("Garamond", Font.BOLD, 24));
        add(heading, BorderLayout.NORTH);

        add(redSlider, BorderLayout.WEST);
        add(greenSlider, BorderLayout.CENTER);
        add(blueSlider, BorderLayout.EAST);

        colorZone.setHorizontalAlignment(JLabel.CENTER);
        add(colorZone, BorderLayout.SOUTH);

        // register SliderFrame (this method) at the listener for the sliders
        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

    } // end SliderFrame() constructor

    public void stateChanged (ChangeEvent e) 
    {
        int r = redSlider.getValue();   // green Color value
        int g = greenSlider.getValue(); // green Color value
        int b = blueSlider.getValue();  // blue Color value

        heading.setForeground(new Color (r, g, b));
        colorZone.setText("Red = "+r+"   "+"Green = " +g+"   "+"Blue = "+b );
    } // end itemStateChanged(ItemEvent e) 
      //********************************************************************
    
} // end class SliderFrame
 
        