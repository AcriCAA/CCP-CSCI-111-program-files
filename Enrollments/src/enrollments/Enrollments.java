/* 
 * @author Corey Acri
 * Course: CSCI 111
 * Date: March 1, 2016
 * Description of Program: reads a file into an array and determines:
 * the number of sections of CIS 103
 * the average class size
 * the minimum class size
 * the maximum class size 
 *
 */
package enrollments;

import java.util.Scanner;
import java.io.*;

public class Enrollments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int count = 0; // int count the number of elements in the array
        int average = 0; // int average of class size

        int[] enrollments = new int[100]; // an array of ints for class size        

        // call readLines method
        count = readLines(enrollments);

        System.out.println("There are " + count + " classes.");

        // sort the array  
        sortArray(enrollments, count);

        // call averageArray method
        average = averageArray(enrollments, count);

        // print the average class size 
        System.out.println("The average class size is: " + average);

        // print the minimum class size by pointing to the first element in the
        // sorted file array
        System.out.println("The minimum class size is: " + enrollments[0]);

        // print the maximum class size by point to the last element in the 
        // sorted file array 
        System.out.println("The maximum class size is: " + enrollments[count - 1]);

      

    } // close main

////////////////////////////////////////////////////////////////////////////////
//This method reads data from the file into the array.
//Each line from the file will be one element in the array.
//The parameter refers to the array in the main method
//The method returns the number of elements it uses.
////////////////////////////////////////////////////////////////////////////////     
    public static int readLines(int[] lines) throws Exception {

        //System.out.println("Read file");

        int count = 0; // count lines read
        File unsorted = new File("enrollments.txt"); // set up file access with File object

        // Create a Scanner named infile to read the input stream from the file unsorted
        Scanner infile = new Scanner(unsorted);

        while (infile.hasNextInt()) {

            lines[count] = infile.nextInt();
            count++;

        } // close while 

        infile.close();
    
        return count;

    }
////////////////////////////////////////////////////////////////////////////////    
    

////////////////////////////////////////////////////////////////////////////////
// this method sorts a numeric array 
////////////////////////////////////////////////////////////////////////////////    
    public static void sortArray(int[] array, int count) {

       
        boolean swapped;    // a boolean variable to keep track of when array values are swapped 
        int temp;        // a catalyst variable for swapping values of variables

        do //the outer post-test loop will  repeat another pass through the list when swapped in true
        {
            swapped = false;
            for (int i = 0; i < (count - 1); i++) // a pass through the array to the second to last element
            {
                if (array[i + 1] < array[i]) // if the two items are out of order because the later one is greater than its predecessor in the array
                {
                    // Swap the two items and set swapped to true 
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }  // end if

            } // end for

        } while (swapped); // the outer loop will repeat if swapped is true – another pass

    }// end sortArray()
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// this method calculates the average of all values in the array 
////////////////////////////////////////////////////////////////////////////////
    public static int averageArray(int[] array, int count) {
        int average = 0;
        int sum = 0;
        int i = 0;

        while (i < count) {
            sum = sum + array[i];
            i++;
        }

        average = sum / i;
       
        return average;
    }

////////////////////////////////////////////////////////////////////////////////
} // close class

