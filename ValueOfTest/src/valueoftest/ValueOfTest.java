/*
 * ValueOfTest.Java
 * program to demonstrate converting String data to numbers
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */
package valueoftest;
import java.util.Scanner;
/*
 * @author cherbert
 */
public class ValueOfTest {

    /* The main method gets keyboard input and attempts to convert it to 
     *  an integer and a double value, then displays the result.
     */
    public static void main(String[] args) 
    {
           //declare variables

         String inString;   // entered by the user
         int newInt;        // holds input converted to an integer
         double newDouble;  // holds input converted to a double
         
         // set up instance of Scanner for input
         Scanner kb = new Scanner(System.in);
         
         // get the input as a String
         System.out.println("This program will attempt to convert String input to a numeric data.");
         System.out.print("\nPlease enter a String to be converted to a number: ");
         inString = kb.nextLine();

         System.out.println("\nYou entered: " + inString);
         
         // convert to an int value
         try {
            newInt = Integer.parseInt(inString);
            System.out.println("As an int value it is: " + newInt);
         } // end try
         catch (NumberFormatException e) { 
            // bad as an int error message 
            System.out.println("The input cannot be converted to an int");        
         }   // end catch
         
         // convert to a double value
         try {
            newDouble = Double.parseDouble(inString);
            System.out.println("As a double value it is: " + newDouble);
         } // end try
         catch (NumberFormatException e) {
            // bad as adouble error message 
            System.out.println("the input cannot be converted to a double");
         } // end catch

         
    }  // end main()
} // end class ValueOfTest
