/* Author: Corey Acri
 * CSCI 111 - Spring 2016
 * This program demonstrates how to draw basic shapes 
 * usng the Graphics class methods
 */
package DrawPainting;

import java.awt.*;
import javax.swing.*;

public class DrawPainting {

    public static void main(String[] args) {

        // create a MyJPanel object
        MyJPanel panel = new MyJPanel();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Using Common Graphics Class Methods");
        frame.setSize(700,431);
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
    
        
        graphics.drawRect(0, 0, 700, 431);
        graphics.drawOval(140, 20, 100, 100);
//        graphics.drawRoundRect(260, 20, 100, 200, 20, 20);
//        graphics.drawArc(340, 20, 100, 100, 0, 90);
//        graphics.drawLine(20, 240, 400, 280);
                
// draw the background
        
        graphics.setColor(new Color(0,0,0));
        graphics.fillRect(0, 0, 700, 431);

// draw the house body

        graphics.setColor(new Color(148,56,56));
        
        graphics.fillRect(200, 150, 200, 200);
        
// draw a left window
        
        graphics.setColor(Color.yellow);
        graphics.fillRect(225, 170, 30, 30);
        
// draw a middle window
        
        graphics.setColor(Color.gray);
        graphics.fillRect(300, 170, 85, 30);        

// draw a right window
        
        graphics.setColor(Color.gray);
        graphics.fillRect(325, 170, 30, 30); 
        
// draw a door
        
        graphics.setColor(Color.RED);
        graphics.fillRect(315, 275, 50, 75);         
        
// draw the chiminey *****************************

        graphics.setColor(Color.RED);
        graphics.fillRect(350, 85, 25, 50);
                //        x, y, width, height
        graphics.setColor(Color.GREEN);
        
// end chiminey **********************************    

// the roof ***************************************

        graphics.setColor(new Color(191,81,80));
        int nRoof = 3; 
                // left bottom, top, right bottom
        int[] xRoof = {200,300,400};
        int[] yRoof = {150,80,150};
        graphics.fillPolygon(xRoof,yRoof,nRoof);


// end roof ***************************************

// a moon 
    
    graphics.setColor(Color.white);
    graphics.fillOval(120, 30, 100, 100);    
    
// cover part of the a moon 
    
    graphics.setColor(Color.black);
    graphics.fillOval(145, 25, 100, 100);  
    
// a star 
    
    graphics.setColor(Color.yellow);
    graphics.fillOval(75, 30, 10, 10);       

// a star 
    
    graphics.setColor(Color.blue);
    graphics.fillOval(10, 40, 5, 5);    
    

// a star 
    
    graphics.setColor(Color.yellow);
    graphics.fillOval(350, 45, 5, 5);      
    
// a star 
    
    graphics.setColor(Color.white);
    graphics.fillOval(400, 49, 5, 5);     
    
//  shooting stars 

int xStar = 450; 
        
int yStar = 20;
int count = 0; 
int width = 5; 
int height = 5; 
while (count <= 10){

    graphics.fillOval(xStar,yStar, width, height);     
    xStar+=5;
    yStar+=11;
    width++;
    height++;
    count++;

}

        
    
       

// a tree (left) ****************************************        
        
        //tree top
        graphics.setColor(Color.GREEN);
        int n = 3; 
                // left bottom, top, right bottom
        int[] x = {30,42,60};
        int[] y = {300,200,300};
        graphics.fillPolygon(x,y,n);
        
        
        // tree trunk
        graphics.setColor(new Color(92,9,9));
        graphics.fillRect(40, 301, 10, 50);
        
// end tree **************************************   


// a tree (left) ****************************************        
        
        //tree top
        graphics.setColor(Color.GREEN);
        int nRightTree = 3; 
                // left bottom, top, right bottom
        int[] xRightTree = {500,512, 530};
        int[] yRightTree = {300,200,300};
        graphics.fillPolygon(xRightTree,yRightTree,nRightTree);
        
        
        // tree trunk
        graphics.setColor(new Color(92,9,9));
        graphics.fillRect(510, 301, 10, 50);
        
// end tree **************************************   


        

        // out line the filled red square with a black square
//        graphics.setColor(Color.black);
//        graphics.drawRect(20, 300, 100, 100);

//        graphics.setColor(Color.green);
//        graphics.fillOval(140, 300, 100, 200);
        
//        graphics.setColor(Color.blue);
//        graphics.fillRoundRect(260, 300, 100, 200, 60, 60);
        
//        graphics.setColor(new Color(128,0,128));
//        graphics.fillArc(340, 340, 100, 100, 0, 90);
        
        // draw a parallelogram
//        int n = 4;
//        int[] x = {20, 100, 140, 60};
//        int[] y = {420, 420, 480, 480};
//        graphics.drawPolygon(x, y, n);

        // draw some text
//        graphics.setColor(Color.black);
//        graphics.setFont(new Font("Times New Roman", Font.BOLD, 12));
//        graphics.drawString("Hello World!", 390, 150);

        // add a logo to the canvas
//        Image logo = new ImageIcon("logo.jpg").getImage();
//        graphics.drawImage(logo, 390, 440, null);

    }  // end paint()
} // end class MyCanvas
