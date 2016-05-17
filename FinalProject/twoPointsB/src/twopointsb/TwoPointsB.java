/* Distance between two points - alternative programming style
 * CSCI 111 Spring 2016  
 */
package twopointsb;
import java.util.Scanner;


public class TwoPointsB {

    // The main method calls a methods to calculate the distance between 
    // two points, then prints that distance and the quadrant of each point
    public static void main(String[] args)    {

         double x1,y1,x2,y2;    
         double dist;           
         
         // input coordinates
         x1 = inCor("x", "1");
         y1 = inCor("y", "1");
         x2 = inCor("x", "2");
         y2 = inCor("y", "2");
         
         dist = Math.hypot( (x1-x2), (y1-y2) );

         System.out.println("\nPoint 1 is ("+ x1 + "," + y1 + ")");
         System.out.println("Point 2 is ("+ x2 + "," + y2 + ")\n");
         System.out.printf("The distance between the two points is: %-8.2f%n", dist ); 
         printQuadrant("1", x1 , y1);
         printQuadrant("2", x2 , y2);
     } 
     
       // this method gets as input a single the coordinate of a point
	public static double inCor(String axis, String point) {
         
     	// set up instance of Scanner for input
	Scanner kb = new Scanner(System.in);
        // get coordinate with prompt 
     	System.out.print("Enter the " + axis + " coordinate of point " + point + " :");
	return kb.nextDouble();
     } 

     // this method returns which quadrant a point is in
     public static void printQuadrant(String P, double x,double y) {
     
        if ( (x >= 0.0) && (y >= 0.00) )   
            System.out.println( "Point "+ P + " is in Quadrant I");  
        else if ( (x < 0.0 ) && ( y >= 0) )  
            System.out.println( "Point "+ P + " is in Quadrant II");
        else if ( (x < 0) && (y < 0) )   
            System.out.println( "Point "+ P + " is in Quadrant III");  
        else // ( (x >= 0) && (y < 0) )   
            System.out.println( "Point "+ P + " is in Quadrant IV");
     } 
}
