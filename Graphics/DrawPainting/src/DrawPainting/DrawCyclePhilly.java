/* Author: Corey Acri
 * CSCI 111 - Spring 2016
 * This program demonstrates how to draw basic shapes 
 * usng the Graphics class methods
 */
package DrawPainting;

import java.awt.*;
import javax.swing.*;

public class DrawCyclePhilly {

    public static void main(String[] args) {

        // create a MyJPanel object
        MyJPanel panel = new MyJPanel();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Using Common Graphics Class Methods");
        frame.setSize(821,821);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame as a content pane
        frame.add(panel);
        frame.setVisible(true);

    } // end main()
} // end class ThreeRectangles

class MyJPanel extends JPanel {

    public MyJPanel() {
    }  // end MyCanvas() constructor

    public void paint(Graphics graphics) {
    
        
        graphics.drawRect(0, 0, 821, 821);
        graphics.drawOval(140, 20, 100, 100);

// draw the background
        
        graphics.setColor(new Color(255,255,255)); //white bg
        graphics.fillRect(0, 0, 821,821);


// draw top chevron 

        graphics.setColor(new Color(33,167,201)); //turquoise
        int nTopChevron = 3; 
                // left bottom, top, right bottom
        int[] xTopChevron = {180,400,630};
        int[] yTopChevron = {150,80,150};
        graphics.fillPolygon(xTopChevron,yTopChevron,nTopChevron);
        

// draw white chevron to cover part of top chevron

        graphics.setColor(Color.white); 
        int nWhiteChevron1 = 3; 
                // left bottom, top, right bottom
        int[] xWhiteChevron1 = {180,400,630};
        int[] yWhiteChevron1 = {170,100,170};
        graphics.fillPolygon(xWhiteChevron1,yWhiteChevron1,nWhiteChevron1); 
        
// draw bottom chevron 

        graphics.setColor(new Color(42,108,173)); //cyclephilly blue
        int nBottomChevron = 3; 
                // left bottom, top, right bottom
        int[] xBottomChevron = {180,400,630};
        int[] yBottomChevron = {200,120,200};
        graphics.fillPolygon(xBottomChevron,yBottomChevron,nBottomChevron); 
        
        
// draw bottom white chevron to cover part of bottom chevron

        graphics.setColor(Color.white); 
        int nWhiteChevron2 = 3; 
                // left bottom, top, right bottom
        int[] xWhiteChevron2 = {180,400,630};
        int[] yWhiteChevron2 = {220,140,220};
        graphics.fillPolygon(xWhiteChevron2,yWhiteChevron2,nWhiteChevron2);        
        
 // draw a black bg just for formatting and positioning for now
 
//      graphics.setColor(Color.gray);
//      graphics.fillRect(181,221,450, 450);      
      
// draw handlebars 

    graphics.setColor(new Color(42,108,173)); //cyclephilly blue
    graphics.fillRect(295,221,85,15);      
    
// draw seat

    graphics.setColor(new Color(42,108,173)); //cyclephilly blue
    graphics.fillRect(440,250,70,16);      

// draw left wheel exterior

      graphics.setColor(new Color(42,108,173)); //cyclephilly blue
      graphics.fillOval(181,350,175,175);   
      
      
      graphics.setColor(Color.white); //white
      graphics.fillOval(190,360,155,155);   
      

      
// draw right wheel exterior

      graphics.setColor(new Color(42,108,173)); //cyclephilly blue
      graphics.fillOval(450,350,175,175);      
     
      graphics.setColor(Color.white); //white
      graphics.fillOval(461,360,155,155);  
      
      
// draw bike frame parralellogram 
        
        graphics.setColor(new Color(42,108,173)); //cyclephilly blue
        int nCenterFrame = 4; 
               
        int[] xCenterFrame = {310,490,565,390};
        int[] yCenterFrame = {315,315,440,440};
        graphics.fillPolygon(xCenterFrame,yCenterFrame,nCenterFrame);  
        
// draw left triagle in frame        

        graphics.setColor(Color.white); 
        int nCenterFrameTriangle = 3; 
                // left bottom, top, right bottom
        int[] xCenterFrameTriangle = {330,390,460};
        int[] yCenterFrameTriangle = {325,425,325};
        graphics.fillPolygon(xCenterFrameTriangle,yCenterFrameTriangle,nCenterFrameTriangle);  
        
// draw right triagle in frame        

        graphics.setColor(Color.white); 
        int nCenterFrameTriangle1 = 3; 
                // left bottom, top, right bottom
        int[] xCenterFrameTriangle1 = {400,475,545};
        int[] yCenterFrameTriangle1 = {430,325,430};
        graphics.fillPolygon(xCenterFrameTriangle1,yCenterFrameTriangle1,nCenterFrameTriangle1); 
        
// draw seat tube

        
        graphics.setColor(new Color(42,108,173)); //cyclephilly blue
        int nSeatTube = 4; 
                // left top, left bottom, right top, right bottom
        int[] xSeatTube = {520,500,380,400};
        int[] ySeatTube = {250,250,425,425};
        graphics.fillPolygon(xSeatTube,ySeatTube,nSeatTube);  
        

// fork
        
        graphics.setColor(new Color(42,108,173)); //cyclephilly blue
        int nFork = 4; 
                // left top, left bottom, right top, right bottom
        int[] xFork = {355,345,258,270};
        int[] yFork = {235,235,430,430};
        graphics.fillPolygon(xFork,yFork,nFork);  
        
        graphics.setColor(new Color(42,108,173)); //cyclephilly blue
        graphics.setFont(new Font("Sans",Font.BOLD,100)); 
        graphics.drawString("CyclePhilly",150,650);
        



    }  // end paint()
} // end class MyCanvas
