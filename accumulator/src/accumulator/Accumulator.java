/**
 * @author E. Agbada
 * CSCI 111 Spring 2016
 * Sample program to demonstrate accumulator in a user-controlled for loop
 * 
 */

package accumulator;
import java.util.*;

public class Accumulator {

    // main class
    public static void main(String[] args) {

        int items;			  
        double price, 
               totalSales = 0.0;             //Accumulator variable
        
        Scanner kb = new Scanner(System.in); //Create Scanner object for input 
        
        System.out.println("How many items did you sell?");

        items = kb.nextInt();

        for (int x = 0; x < items; x++)     //for loop based on user count
        {
            System.out.println("Enter price of item #" + (x + 1));
            price = kb.nextDouble();
            
            //Accumulator variable stores price of each item during each loop
            totalSales = totalSales + price;    
        }

        System.out.println("Total sales amount: " + totalSales);

    }   //end main method

}   // end class Accumulator
