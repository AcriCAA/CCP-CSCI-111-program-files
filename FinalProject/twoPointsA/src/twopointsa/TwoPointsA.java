/*
 * Program to calculate the distance between two points
 * CSCI 111 Spring 2016
 * 
 */
package twopointsa;
import java.util.Scanner;


public class TwoPointsA {

    // The main method gets x and y for two points
    // Calls methods to calculate the distance between the two
    // and to determine the quadrant of each point
    // then outputs the result
    public static void main(String[] args) 
     {
         //declare variables

         double x1,y1,x2,y2;    // coordinates of (x1,y1) and (x2,y2)
         double dist;           // distance between (x1,y1) and (x2,y2)
         String Q1, Q2;         // quadrant containing (x1,y1) and (x2,y2)
         
         // set up instacne of Scanner for input
         Scanner kb = new Scanner(System.in);
         
         // get input in pairs prompt & capture pairs
         System.out.print("Enter the x coordinate of point 1 :");
         
         // gets the value for x1
         x1 = kb.nextDouble();
         
         System.out.print("Enter the y coordinate of point 1 :");
         
         // gets the value for y1
         y1 = kb.nextDouble();
         
         System.out.print("Enter the x coordinate of point 2 :");
         
         // gets the value for x2
         x2 = kb.nextDouble();
         
         System.out.print("Enter the y coordinate of point 2 :");
         
         //gets the value for y2
         y2 = kb.nextDouble();

         // call calcDistance()   
         dist = calcDistance( x1, y1, x2, y2);

         // call findQuadrant(point1)
         Q1 = findQuadrant(x1, y1);
         
         // call findQuadrant(point2)
         Q2 = findQuadrant(x2, y2);

         // output results
         
         // Point 1
         System.out.println("\nPoint 1 is ("+ x1 + "," + y1 + ")");
         
         //Point 2
         System.out.println("Point 2 is ("+ x2 + "," + y2 + ")\n");
         
         //Distance
         System.out.printf("The distance between the two points is: %-8.2f%n", dist ); 
         
         //Statment for which quadrant point 1 falls into
         System.out.println("Point 1 is in " + Q1);
         
         // Statement for which quadrant point 2 falls into
         System.out.println("Point 2 is in " + Q2);
 
         
         
     } // end main()
/****************************************************************************/
     
     // this method calculates and returns the distance between two points
     public static double calcDistance(double x1,double y1,double x2,double y2)
     {
         double deltaX;     // difference in x coordinates
         double deltaY;     // difference in x coordinates
         double dist;       // distance between (x1,y1) and (x2,y2)
         
         
         // calculates delta x
         deltaX = (x1-x2);
         
         // calculates delta y
         deltaY = (y1-y2);
         
         
         //users the math method hypot to calculate the distance between two deltas
         dist = Math.hypot(deltaX, deltaY);
         
         // returns the distance calculation 
         return dist;
         
         /* this whole method could be one line:
          * return Math.hypot( (x1-x2), (y1-y2) );
          */
     } // end calcDistance()
/****************************************************************************/
     
     // this method returns which quadrant a point is in
     public static String findQuadrant(double x,double y)
     {
         String Q;      //quadrant message
     
        if ( (x >= 0.0) && (y >= 0.00) )   // checks if points fall in the first quadrant 
            Q = "Quadrant I";  
        else if ( (x < 0.0 ) && ( y >= 0) )  // checks if points fall in the second quadrant  
            Q = "Quadrant II";
        else if ( (x < 0) && (y < 0) )   // checks if points fall in the third quadrant  
            Q ="Quadrant III";  
        else // ( (x >= 0) && (y < 0) )   // if it does not fall in any other quadrant, it must be QIV
            Q = "Quadrant IV";
     
        return Q;
     } // end findQuadrant
     
     
} // end class
