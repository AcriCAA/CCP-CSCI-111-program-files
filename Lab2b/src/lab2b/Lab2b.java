/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Jan. 28, 2016
 * Description: This program:
 * - gets the user’s name
 * - says hello to the user by name and ask for the user’s age in years
 * - calculates the user’s age in days 
 * - prints the results – the user’s age in days.
 * 
 */
package lab2b;

import java.util.*;

public class Lab2b {

  
    public static void main(String[] args) {
       

       // declare variables
       
        
        
        // user name
        String name; 
        
        // age (in years)
        double age;
   
        
        // age (in days)
        double days;
      
        // constant days per year
        final double DAYS_PER_YEAR = 365.25;
         
        // declare an instance of Scanner to read the data stream from the keyboard.
        Scanner kb = new Scanner(System.in);
         
        // say hello to the user and ask for the user’s name
        System.out.println("Hello, please enter your name: " );
        name = kb.nextLine();

        // say hello to the user by name.
        System.out.println("Hello, " + name);
        
        // ask for the user’s age in years
        System.out.println("How many years old are you");
        age = kb.nextDouble();
        
        // Calculate how many days are in the number of years entered
        days = DAYS_PER_YEAR * age;
        
        // print results
        System.out.println(name + ", you are " + days + " days old.");
        
        // close the input stream
        kb.close();
        
        
        
        
    }
    
}
