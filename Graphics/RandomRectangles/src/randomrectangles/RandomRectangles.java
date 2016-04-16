/* RandomRectangles.Java
 * Computer Science 111, Spring 2016
 * 
 *  
 * This code demonstrates a simplew example of some computer art work.  
 * It draws 100 random rectangles on the screen with a time delay between drawings.
 * 
 */ 
package randomrectangles;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class RandomRectangles
{
        public static void main(String[] args) 
        {

        // create a MyCanvas object
        MyCanvas canvas1 = new MyCanvas();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Random rectangles");
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
        
        int r;  // red Color factor
        int g;  // green Color factor
        int b;  // blue Color factor

        int x;  // x coordinate  to locate rectangle
        int y;  // y coordinate  to locate rectangle
        
        int width;  // width of rectangle
        int height;  // height of rectangle
        int i; // loop counter
        
        // paint the canvas black
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 500, 500);
        
        for(i=1;  i<=100; i++)
        {        
            // randomly generate and set a color
            r = (int) (Math.random() * 256);
            g = (int) (Math.random() * 256);
            b = (int) (Math.random() * 256);
            graphics.setColor(new Color(r, g, b));

            // randomly generate and draw a rectangle
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 500);
            width = (int) (Math.random() * 250);
            height = (int) (Math.random() * 250);
            graphics.drawRoundRect(x, y, width, height, 20, 20);

            // The sleep command delays the drawing to make it more interesting
            // It must be in try-catch blocks for error handling (discussed in chap. 12)
            try 
            {
                TimeUnit.MILLISECONDS.sleep(20);
            } 
            catch (Exception e) 
            {
                System.out.println("Exception caught");
            }


   
        
        }
        
    }  // end paint()
} // end class MyCanvas
