/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementsAndLoops;

import java.util.Scanner;

/**
 *
 * @author AcriCAA
 */
public class incrementsAndLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
        int x = 1;
        int total;
        total = x++ + 10; // postfix 
        System.out.println("Total" + total);

        x = 1;
        total = ++x + 10; //prefix
        System.out.println("Total" + total);

        x = 1;

        while (x <= 10) {

            System.out.println(x);
            x++;

        }

        System.out.println(x);
        x = 1;
        do {

            System.out.println("x2 = " + x);
            x++;

        } while (x < 10);

        for (int y = 0; y < 10; y++) {
            System.out.println("y = " + y);

        }

        int z; // must declare outside for loop if want to access it outside
        for (z = 0; z < 10; z++) {
            System.out.println("z = " + z);
        }

        System.out.println(z);
         */

        // multiple declarations in a for loop
        for (int num = 5, j = 0; num < 10 || j < 20; num++, j += 2) {

            System.out.println(j);
            System.out.println(num);

        }

        boolean done = false;
        double price = 0.0,  totalSales = 0.0;
        Scanner kb = new Scanner(System.in); //Create Scanner object for input 

        System.out.println("How many items did you sell");
        int items;
        
               
        items = kb.nextInt();

        //include sentitnel in condition 
//        for (int x = 0; x < items && !done; x++) {
//
//            System.out.println("enter price of item #" + (x + 1) + " (or -1 to quit):");
//
//            price = kb.nextDouble();
//
//            if (price < 0.0) // testing for sentinal value 
//            {
//                done = true; // set sentinal to true 
//                price = 0.0; // so -1 value is not included
//            }
//            totalSales = totalSales + price; // acummulator 
//        }
        
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 25; j++){
            
            System.out.print("*");
            
            }
            
            System.out.println("");
        
        }

    } // close main method

} // close class increments
