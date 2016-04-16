/*
 * CSCI 111 - Spring 2016
 * This program demonstrates how to draw basic shapes 
 * usng the Graphics class methods
 */
package drawdemo;

import java.awt.*;
import javax.swing.*;

public class DrawDemo {

    public static void main(String[] args) {

        // create a MyJPanel object
        MyJPanel panel = new MyJPanel();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Using Common Graphics Class Methods");
        frame.setSize(512,546);
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
    
        
        graphics.drawRect(20, 40, 100, 200);
        graphics.drawOval(140, 20, 100, 100);
        graphics.drawRoundRect(260, 20, 100, 200, 20, 20);
        graphics.drawArc(340, 20, 100, 100, 0, 90);
        graphics.drawLine(20, 240, 400, 280);
                
        // draw a gray square as a shadow under a red squareoutlined in black
        // draw a gray squareto be used as a shadow, offset down and right 5 pixels
        graphics.setColor(new Color(160,160,160));
        graphics.fillRect(25, 305, 100, 100);

        // put the red square over the gray shadow
        graphics.setColor(Color.red);
        graphics.fillRect(20, 300, 100, 100);

        // out line the filled red square with a black square
        graphics.setColor(Color.black);
        graphics.drawRect(20, 300, 100, 100);

        graphics.setColor(Color.green);
        graphics.fillOval(140, 300, 100, 200);
        
        graphics.setColor(Color.blue);
        graphics.fillRoundRect(260, 300, 100, 200, 60, 60);
        
        graphics.setColor(new Color(128,0,128));
        graphics.fillArc(340, 340, 100, 100, 0, 90);
        
        // draw a parallelogram
        int n = 4;
        int[] x = {20, 100, 140, 60};
        int[] y = {420, 420, 480, 480};
        graphics.drawPolygon(x, y, n);

        // draw some text
        graphics.setColor(Color.black);
        graphics.setFont(new Font("Times New Roman", Font.BOLD, 12));
        graphics.drawString("Hello World!", 390, 150);

        // add a logo to the canvas
        Image logo = new ImageIcon("logo.jpg").getImage();
        graphics.drawImage(logo, 390, 440, null);

    }  // end paint()
} // end class MyCanvas
