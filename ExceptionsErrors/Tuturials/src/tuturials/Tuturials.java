
/* CSCI 111 - Spring 2016
 * Reading, sorting and writing data in text files 
 * This program reads data from a text file, sorts the data, 
 * then writes the data back to another text file. 
 * 
 * For this to work, the file "unsorted.txt" must be in the project folder 
 * Warning -- this will overwrite the file "tutorials.txt"
 * 
 * This program has methods to read lines from a text file into an array, 
 * display a text array on screen line-by-line, sort a text array, and write 
 * a text array to a data file line by line. 
 * 
 * The program is limited to a file with 100 lines. To change this, change the 
 * size of the array declared in the main method. 
 * 
 */
package tuturials;

import java.util.*;
import java.io.*;

public class Tuturials {
// the main method call methods to perform each part of the program 

    public static void main(String[] args) throws Exception {
        String[] tutorials = new String[100]; // an array to hold a list of tutorials 
        int count; // the number of elements actually used 

        // read data into tutorials[] line by line and return count 
        count = readLines(tutorials);

        // print the array on the screen 
        System.out.println("The original file:");
        displayLines(tutorials, count);

        // sort the array 
        sortStringArray(tutorials, count);

        // print the array on the screen line by line 
        System.out.println("\nThe sorted file:");
        displayLines(tutorials, count);

        // write the array to a data file line by line 
        writeLines(tutorials, count);

    } // end main() 

    /**
     * ***********************************************
     */

    /* 
 * This method reads data from the file into the array. 
 * We want our array to work with up to 100 elements 
 * Each line from the file will be one element in the array. 
 * 
 * The parameter refers to the array in the main method. 
 * 
 * The method returns the number of elements it uses. 
     */
    public static int readLines(String[] lines) throws Exception {
        int count = 0;   // number of array elements with data 

        // Create a File class object linked to the name of the file to read 
        File unsorted = new File("test.txt");

        // Create a Scanner named infile to read the input stream from the file 
        try {
            Scanner infile = new Scanner(unsorted);

            /* This while loop reads lines of text into an array. it uses a Scanner class 
  * boolean function hasNextLine() to see if there another line in the file. 
             */
            while (infile.hasNextLine()) {
                // read a line and put it in an array element 
                lines[count] = infile.nextLine();
                count++; // increment the number of array elements with data 
            } // end while 

            infile.close();

        } catch (FileNotFoundException e) {

            System.err.println("OH NOOOOOOOOOOOOOO!!!! Runn!!!! FileNotFoundException: " + e.getMessage());

        } // end readList() 

        return count; // returns the number of items used in the array. 

    }

    /**
     * ***********************************************
     */

    /* 
 * This method sorts an array of Strings line by line 
 * using a simple bubble sort. 
 * 
 * The first parameter refers to the array in the main method. 
 * The second parameter is the number of elements in the array that 
 * actually contain data 
     */
    public static void sortStringArray(String[] a, int count) {
        boolean swapped = true; // keeps track of when array values are swapped 
        int i; // a loop counter 
        String temp; // catalyst variable for String swapping 

        // Each iteration of the outer do loop is one pass through the loop. 
        // If anything was swapped, it makes another pass. 
        while (swapped) {
            // set swapped to false before each pass 
            swapped = false;

            // the for loop is a pass through the array to the second to last element 
            for (i = 0; (i < count - 1); i++) {

                // if the two items are out of order
                if (a[i + 1].compareTo(a[i]) < 0) {
                    // swap the two items and set swapped to true 
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                } // end if 

            } // end for 
        } // end while 
    } // end sortStringArray 

    /**
     * ****************************************************************
     */

    /* 
 * This method prints an array of Strings on the screen. 
 * The first parameter refers to the array in the main method. The second 
 * parameter is the number of elements in the array that actually contain data 
     */
    public static void displayLines(String[] lines, int count) {
        int i; // loop counter 

        // iterate the elements actually used 
        for (i = 0; i < count; i++) {
            System.out.println(lines[i]);
        }
    } // end displayLines() 

    /**
     * ***********************************************
     */
    /* 
 * This method writes an array of Strings to a text data file. 
 * The first parameter refers to the array in the main method. 
 * The second parameter is the number of elements in the array 
 * that actually contain data 
     */
    public static void writeLines(String[] lines, int count) throws Exception {
        // create a File class object and give the file the name tutorials.txt 
        File tutorialFile = new File("tutorials.txt");

        // Create a PrintWriter text output stream and link it to the file x 
        PrintWriter outfile = new PrintWriter(tutorialFile);

        // iterate the elements actually used 
        for (int i = 0; i < count; i++) {
            outfile.println(lines[i]);
        }
        outfile.close();

    } // end writeTextArray() 

    /**
     * ***********************************************
     */
} // end class
