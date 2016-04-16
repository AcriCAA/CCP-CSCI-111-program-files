/* CirclePatterns.Java
 * Computer Science 111, Spring 2016
 * 
 * 
 * This code demonstrates how to draws a pattern of concentric circles. 
 *
 * Circle are drawn inside a bounding rectangle that is actually
 * a bounding square, with the same width and height. 
 * 
 * To draw concentric cicles, , move the x and y coordinates for each suscessive circle 
 * up and to the right by a factor of k, and at the same time, increase the size 
 * of the biounding square by a factor of 2K.
 * 
 */ 

package concentriccircles;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class ConcentricCircles 
{
        public static void main(String[] args) 
        {

        // create a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Concentric Circles");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame 
        frame.add(canvas1);
        frame.setVisible(true);
    } // end main()

} // end class

class MyCanvas extends Canvas 
{

    public MyCanvas() 
    { }  // end MyCanvas() constructor

    public void paint(Graphics graphics) 
    {
        

        int x;  // x coordinate  to locate circle
        int y;  // y coordinate  to locate circle

        int diameter;  // width of rectangle
        int i; // loop counter

       
            // paint the canvas black
            graphics.setColor(Color.BLACK);
            graphics.fillRect(0, 0, 500, 500);

         
            for (i = 0; i < 50; i++) {
                // red circles
                graphics.setColor(new Color(64, 64, 255));
                x = 250  - i * 8;
                y = 250 - i * 8;
                diameter = 16 * i;
                graphics.drawOval(x, y, diameter, diameter);
           
                // The sleep command delays the drawing to make it more interesting
                // It must be in try-cathc blocks for error handling (discussed in chap. 12)
                try 
                {
                    TimeUnit.MILLISECONDS.sleep(20);
                } // end try
                catch (Exception e) 
                {
                    System.out.println("Exception caught");
                } // end catch

            
            
            } // end for

            
            
            
            
       }  // end paint()
} // end class MyCanvas

    
    