/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 9, 2016
 * Description: Lab 4A with while loops
 *
 */
package pretest;

public class Pretest {

    public static void main(String[] args) {
        int count;              // the control variable for the loop

        count = 1;              // initialization  set count to 1

        while (count <= 10) // test continue while count <= 10
        {
            // processing -- print a message with the value of count
            System.out.println("The value of count is " + count);

            count++;            // update the control variable -- increment count
        } // end while (count <= 10)

        System.out.println("Question 1:");

//Question 1
        int x = 1;
        while (x <= 10) {
            System.out.print(x);
            x++;
        } // end while

        System.out.println("\n\n");

// Question 2
        System.out.println("Question 2:");
        x = 10;
        while (x >= 1) {
            System.out.print(x);
            x--;
        } // end while

        System.out.println("\n\n");

// Question 3
        System.out.println("Question 3:");

        x = 1;
        while (x <= 100) {
            System.out.print(x);
            x = x + 2;
        } // end while

        System.out.println("\n\n");

// Question 4  
        System.out.println("Question 4:");

        x = 2;
        while (x <= 100) {
            System.out.print(x);
            x = x + 2;
        } // end while  

        System.out.println("\n\n");

// Question 5  
        System.out.println("Question 5:");
        double y = 0;
        while (y <= 10) {
            System.out.print(" " + y + " ");
            y = y + 0.5;
        } // end while!        

    } // end main()

} // end class Pretest
