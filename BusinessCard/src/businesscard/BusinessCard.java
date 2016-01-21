/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Jan. 21, 2016
 * 
 * This program prints out a Business Card to the console with eight
 * commands for these fields:
 * 
 * First name
 * Last name
 * Major
 * School
 * City
 * State
 * Zip
 * Email address
 * 
 * The end result looks like this: 
 * 
 * Corey Acri
 * Computer Science
 * The Community College of Philadelphia
 * Philadelphia, PA 19130
 * cacri1@ccp.edu
 */

package businesscard;

public class BusinessCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Corey ");
        System.out.println("Acri");
        System.out.println("Computer Science");
        System.out.println("The Community College of Philadelphia");
        System.out.print("Philadelphia, ");
        System.out.print("PA ");
        System.out.println("19130");
        System.out.println("cacri1@ccp.edu");
    } // end BusinessCard main method
    
} // end Business Card Class