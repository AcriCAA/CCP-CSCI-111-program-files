/*
 * CSCI 111 Spring 2016
 * Chapter 3 example 13
 * This code illustrates multiple branching wth nested if...else
 * It uses two Boolean variables
 */
package airlock;

public class Airlock {

    // main method
    public static void main(String[] args) {
       
// Example 13  -- airlock doors – nested…if – two boolean variables
boolean innerDoor;   // true if closed and sealed, otherwise false
boolean outerDoor; // true if closed and sealed, otherwise false

// change the values of the following two lines to test the switch command
innerDoor = true;
outerDoor = false;




if (innerDoor && outerDoor)   		// If both doors are closed
	System.out.println("Airlock sealed");
else if (!(innerDoor) && outerDoor)  	// inner door open, outer door closed
	System.out.println("Open to inside");
else if  (innerDoor && !(outerDoor))  	// inner door closed, outer door open
	System.out.println("Open to outside");
else	// only possibility left --          inner door open, outer door open –
	System.out.println("Danger – Airlock doors not sealed");


        
    }   // end main method
}   // end Airlock class
