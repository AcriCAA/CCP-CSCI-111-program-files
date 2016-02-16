/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 9, 2016
 * Description: Lab 4A with for loops
 *
 */
package pretest2;

public class Pretest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Question 1
        for (int x = 1; x <= 10; x++) {
            System.out.print(x);
        } // end for

        System.out.println("\n\n");

// Question 2
        System.out.println("Question 2:");

        for (int x = 10; x >= 1; x--) {
            System.out.print(x);
        } // end for

        System.out.println("\n\n");

// Question 3
        System.out.println("Question 3:");

        for (int x = 1; x <= 100; x += 2) {
            System.out.print(x);

        } // end for

        System.out.println("\n\n");

// Question 4  
        System.out.println("Question 4:");

        for (int x = 2; x <= 100; x += 2) {
            System.out.print(x);
        } // end for  

        System.out.println("\n\n");

// Question 5  
        System.out.println("Question 5:");

        for (double x = 0; x <= 10; x += 0.5) {
            System.out.print(" " + x + " ");
        } // end for!     
    }

}
