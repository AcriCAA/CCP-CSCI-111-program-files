/*
 * ContainsDemo.java
 * This program demonstrates the String contains() method
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */
package containsdemo;
import java.util.Scanner;

public class ContainsDemo {

    /* The main method gets the name of a school as String input, 
     * then checks to see if it contains one of three subStrings --
     * "College", "University", or "High School"
     */
    
    public static void main(String[] args) {
        
        String inString;   // entered by the user
    
        // set up instance of Scanner for input
         Scanner kb = new Scanner(System.in);
         
         System.out.print("Please enter The name of your school: ");
         inString = kb.nextLine();

         if ( inString.contains("College") )
              System.out.println("Your school name contains the word \"College\".");
         
         if ( inString.contains("University") )
              System.out.println("Your school name contains the word \"University\".");
         
         if ( inString.contains("High") )
             if ( inString.contains("High School") ) 
             System.out.println("Your school name contains the term \"High School\".");
             else
             {
                 System.out.print("Your school name contains the word \"High\" ");
                 System.out.println("but not \"School\".");
                 System.out.println("I suspect it is really " + inString + " School.");
             }
         
         if ( inString.contains("Academy") )
              System.out.println("Your school name contains the word \"Academy\".");
         
         if ( inString.contains("Institute") )
              System.out.println("Your school name contains the word \"Institute\".");
         
         System.out.println("\nThank You");
         
    } // end main()
} // end class ContainsDemo
