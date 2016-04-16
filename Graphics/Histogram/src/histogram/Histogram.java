/* Histogram.Java
 * Computer Science 111, Spring 2016
 * 
 * 
 * This code demonstrates how to draw a histogram in aJFrame 
 * using Java Graphics class objects.
 * 
 * With a little work, it could be transformed into a general-purpose
 * program to read data and labels from a data file then create a  hsitogram 
 * based on the data.
 * 
 * When analyzing this code, remember, the screen uses inverted Cartesian coordinates.
 */
package histogram;

import java.awt.*;
import javax.swing.*;

public class Histogram 
{

    public static void main(String[] args) 
    {

        // create a MyCanvas object
        MyJPanel myPanel = new MyJPanel();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Enrollment Histogram");
        frame.setSize(300, 280);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the panel to the frame  
        frame.add(myPanel);
        frame.setVisible(true);
        

    } // end main()
} // end class

class MyJPanel extends JPanel 
{

    public MyJPanel() 
    { }  // end MyCanvas() constructor

    public void paint(Graphics graphics) 
    {
        int i;  // a loop counter
        int x; // x coordinate for drawing
        int y; // y coordinate for drawing

        /* parallel arrays of data -- This could also be done as an object with 
         * enrollment and year properties.  With more than two properties, 
         * objects are probably better.  The data could be read in from a file.
         */
        int[] enrollment = {106, 115, 142, 324}; // array of enrollment figures
        String[] year = {"2013", "2014", "2015", "2016"};  // array of years for labels

        // paint the canvas white
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 300, 280);

        // add a logo to the canvas
        Image logo = new ImageIcon("logo.jpg").getImage();
        graphics.drawImage(logo, 5, 5, null);

        // draw chart title
        graphics.setColor(Color.black);
        graphics.setFont(new Font("Times New Roman", Font.BOLD, 16));
        graphics.drawString("Course Enrollment", 85, 30);

        // draw  horizintal lines and unit labels
        graphics.setFont(new Font("Arial", Font.PLAIN, 12));
        graphics.setColor(Color.gray);
        for (i = 0; i <= 7; i++) {
            // lines and labels every 20 units from 200 up 
            y = 200 - (20 * i); // caculate y coordinate for each line  

            // draw each line across
            graphics.drawLine(50, y, 250, y);
            // place label for each line; +5 adjustment to align labels and lines
            graphics.drawString(Integer.toString(i * 50), 20, y + 5);

        } // end for

        // draw vertical lines on left and right of chart
        graphics.drawLine(50, 200, 50, 60);
        graphics.drawLine(250, 200, 250, 60);

        // draw data bars and place year labels
        graphics.setColor(new Color(128, 0, 0));
        for (i = 1; i <= 4; i++) {
            x = 40 + (40 * i);                   // space bars 40 pixels apart   
            y = (enrollment[i - 1] * 140) / 350;   // caculate height of bar based on data
            graphics.fillRect(x, 200 - y, 20, y);   // draw bars 

            // put year under each bar, 20 pixels below bar, x-5 to align labels and bars 
            graphics.drawString(year[i - 1], x - 5, 220);

        } // end for

    }  // end paint()
} // end class MyJPanel
