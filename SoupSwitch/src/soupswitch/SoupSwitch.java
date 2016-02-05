/* CSCI 111 Spring 2016
 * JLK Chapter 3 example 12
 * This code illustrates a switch with an enumerated data type
 * The enumerated data type is declared as an inner class
 */
package soupswitch;


public class SoupSwitch 
{
    
public enum Day                              // enum inner class declaration 
    { SUN, MON, TUE, WED, THU, FRI, SAT, ERR }    // fits well on one line
        
/* The main method displays the soup of the day, based on the value
 * of the variable today, which is of the enumerated type Day.
 */


        
public static void main(String[] args)      // main method demonstrates switch
{
        
Day today;          // declare today as a variable of type Day

today = Day.FRI;    // for this example, we just set today to MON
                    // change it to a different day to test switch 

System.out.print("The soup of the day is: "); 

switch (today)
    {
    case MON:	System.out.println("McGinley’s Jersey Tomato and Basil."); 
   		break;
    case TUE:	System.out.println("Baker’s Chesapeake Crab Chowder.");
   		break;
    case WED:	System.out.println("Melamed’s Vegetable Rhythm Roundup.");
   		break;
    case THU:	System.out.println("Horwitz’s Florida Matzah Ball Bisque.");
   		break;
    case FRI:	System.out.println("Freemans’s Seafood Special.");
   		break;
    case SAT:	System.out.println("Wormley’s Grambling Game Time Gumbo.");
   		break;
    case SUN:	System.out.println("Nelson’s After Church Chicken Soup.");
   		break;
    default :	System.out.println("ERROR: INVALID DAY!");
    } //end switch(day)    

} // end main()

} // end class SoupSwitch
