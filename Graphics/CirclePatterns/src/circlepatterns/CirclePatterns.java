/* CirclePatterns.Java
 * Computer Science 111, Spring 2016
 * 
 * This code demonstrates a simple example of some computer art work.  
 * It draws a pattern of circles on the screen with a time delay between drawings.
 */ 

package circlepatterns;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class CirclePatterns 
{
        public static void main(String[] args) 
        {

        // create a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Circle Patterns");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame as a content panel
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
   
        int x;          // x coordinate  to locate circle
        int y;          // y coordinate  to locate circle

        int diameter;   // width of rectangle
        int i;          // loop counter
        int times;      // number of times the program is repesated

        for (times = 1; times <= 5; times++) 
        {
            // paint the canvas black
            graphics.setColor(Color.BLACK);
            graphics.fillRect(0, 0, 500, 500);

         
            for (i = 1; i <= 100; i++) 
            {
                // red circles
                graphics.setColor(new Color(255, 0, 0));
                x = 0 + i * 5;
                y = 0 + i * 5;
                diameter = 10 * i;
                graphics.drawOval(x, y, diameter, diameter);

                // blue circles
                graphics.setColor(new Color(0, 0, 255));
                x = 0 - i * 5;
                y = 0 + i * 5;
                diameter = 10 * i;
                graphics.drawOval(x, y, diameter, diameter);

                // green circles
                graphics.setColor(new Color(0, 255, 0));
                x = 0 + i * 5;
                y = 0 - i * 5;
                diameter = 10 * i;
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

        } // end while
    }  // end paint()
} // end class MyCanvas

    
    