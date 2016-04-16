/* PieChart.Java
 * Computer Science 111, Spring 2016
 * 
 * This code demonstrates how to draw a pie chart in aJFrame 
 * using Java Graphics class objects.
 * 
 * The chart can handle up to 8 integer values, read in from a data file.  
 * This code reads a local data file named "PieData.txt"
 * The first line inthe file contains the title of the chart.
 * Follwing that, there should be a line with a label, followed by a line with 
 * the data that matches that label.
 * 
 * The colors of the chart are harcooded into the program.
 * When analyzing this code, remember, the screen uses inverted Cartesian coordinates.
 */
package piechart;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PieChart {

    public static void main(String[] args) throws Exception
    {
        // create a PieChartCanvas object named canvas1
        PieChartCanvas canvas1 = new PieChartCanvas();

        // read data into variables for the canvas1 object 
        canvas1.ReadChartdata();

        // set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Pie Chart Demo" );
        frame.setSize(500, 400);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas to the frame as a content panel
        frame.add(canvas1);
        frame.setVisible(true);    
        
    } // end main()
} // end PieChart
    
class PieChartCanvas extends Canvas 
{
    String title;                           // chart title
    int count;                              // number of slices
    double sum;                                // sum of the values in the chart
    String[] sliceLabel = new String[10];   // array of labels for the chart
    double [] sliceValue= new double [10];          // array of values for the chart

    // array of colors for each slice 
    Color[] sliceColor = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA,
        Color.ORANGE, Color.GRAY, Color.CYAN, Color.PINK};

    public PieChartCanvas() 
    { }  // end MyCanvas() constructor

    public void ReadChartdata()throws Exception 
    {
      // Create a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(new java.io.File("PieChartData.txt"));

        // read title
        title  = infile.nextLine();
        System.out.println(title);
        // initialize count and sum
        sum = 0.0;
        count = 0;
        
        // read data for each slice
        while (infile.hasNextLine())
        {
            
            sliceLabel[count] = infile.nextLine();
            sliceValue[count] = Double.parseDouble(infile.nextLine());
            System.out.println(sliceValue[count]);

            // update count and sum
            sum = sum + sliceValue[count];
            count++;
        } // end while (infile.hasNext())

    }  // end ReadChartdata()

    public void paint(Graphics graphics) 
    {
        int i;      // a loop counter
        int start = 0;  // the starting angle for each pie chart slice
        double size;       // the size of the arc for each slice (in degrees)
        
        int x = 10;      // x coordinate of the bounding square for the pie's circle
        int y = 40;      // y coordinate of the bounding square for the pie's circle
        int side = 200;   // side of the bounding square for the pie's circle 
                
        // draw title
        graphics.setFont(new Font("Cambria", Font.BOLD, 18));
        graphics.drawString(title, 130, 24);

        // set a smaller font for the legend in the following loop
        graphics.setFont(new Font("Arial", Font.BOLD, 12));
        
        // loop to draw pie chart and legend
        for( i = 0; i < count; i++)
        {
        
            // calculate size of slice
            size = sliceValue[i]/sum * 360.0 ;
            // set the color for arc 
            graphics.setColor(sliceColor[i]);

            // draw slice
            graphics.fillArc(x, y, side, side, start, (int) Math.round(size));
            System.out.println(size);
            
            // draw the square in the legend for this slice 
            graphics.fillRect(240, 40+40*i, 15, 15);
        
            // identify the color with label and value the legend 
            graphics.setColor(Color.BLACK);
            graphics.drawString(sliceLabel[i], 265, 50+40*i);        
            graphics.drawString( Integer.toString((int)sliceValue[i]), 425, 50+40*i);        
            
            
            // calculate the value of start for the next slice
            start = start + (int)Math.round(size) ;            
        }
        
        
        
    }  // end paint()
} // end class MyCanvas



