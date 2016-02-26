/*  CSCI 111 - Spring 2016
 *
 * NFL City Search Program
 * This program performs a linear search of a String array with
 * the names of cities that have NFL teams
 * 
 */
package nflcities;
import java.util.Scanner;

public class NFLcities {

    public static void main(String[] args) {
        
 //  an array holding the names of cities with NFL teams.       
 String[] NFLcities = {"Buffalo", "Miami", "Boston", "New York", "Baltimore", 
     "Cincinnati", "Cleveland", "Pittsburgh", "Houston", "Indianapolis", 
     "Jacksonville", "Tennessee", "Denver", "Kansas City", "Oakland", 
     "San Diego", "Dallas", "New York", "Philadelphia", "Washington", "Chicago", 
     "Detroit", "Green Bay", "Minnesota", "Atlanta", "Charlotte", "New Orleans", 
     "Tampa", "Arizona", "St. Louis", "San Francisco", "Seattle"};
 
 String target;         // User-entered city name for which we are searching
 boolean found = false; // true if the target city is found in the array
 
 
 // set up input stream from the keyboard  
 Scanner keyboard = new Scanner(System.in);   

 // print intro message
  System.out.print("This program will tell you if a city has an NFL team.\n\n");  
  
 // get the target name of the city from the user
 System.out.print("Please enter the name of a city: " );  
 target = keyboard.nextLine();
 
 // search array of NFL cities for target city
 // the loop coninues to the end of the array if the city is not found  
 for (int i=0; (!found) && (i < NFLcities.length) ; i++) 
 {
     if (NFLcities[i].equals(target) )
      {
          //print found message and set found to true
          System.out.println(target + " has an NFL team.\n");
          found = true;
      } // end if
     
  } // for loop
 
 // after the loop – if not(found) print not found message
 if (!found)
     System.out.println(target + " is not in the list of cities with an NFL team.\n");
 
    } // end main()

} // end class
