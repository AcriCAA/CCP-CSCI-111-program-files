/* SortStringsDemo.java
 * program to demonstrate the toLowercase() and toUppercase() methods
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */
package sortstringsdemo;
import java.util.Scanner;

public class SortStringsDemo {

    public static void main(String[] args) {
      
        String StringA;     //the first of two Stringsa to be sorted
        String StringB;     //the second of two Stringsa to be sorted
        String StringC;     // a "catalyst" String used in the Swap
        
        // set up instance of Scanner for input
         Scanner kb = new Scanner(System.in);
         
         System.out.println("This program will sort two Strings\n");
 
         // get the first String
         System.out.print("\nEnter the first String:  " );
         StringA = kb.nextLine();
         
         // get the first String
         System.out.print("Enter the second String: " );
         StringB = kb.nextLine();
         
         // echo input
         System.out.println("You entered:");
         System.out.println("\t" + StringA);
         System.out.println("\t" + StringB);
             
        // swap the Strings if B should come before A
        if ( StringA.compareTo(StringB) > 0)  {
            StringC = StringA;   // use the catalyst to save a copy of StringA
            StringA = StringB;
            StringB = StringC;
        } // end if
    
          // show results
         System.out.println("\nIn the correct order they are:");
         System.out.println("\t" + StringA);
         System.out.println("\t" + StringB);
    
    } // end main()
    
} // end class UpperLowerDemo
