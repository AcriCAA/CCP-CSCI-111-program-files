/* 
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 26, 2016
 * Description of Program: reads a file, sorts it and then writes the sorted file
 *
 */
package sortfile;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author AcriCAA
 */
public class SortFile {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        int count; // int count the number of elements in the that are used
        String[] tutorials = new String[100]; // an array of Strings listing programming language 

        count = readLines(tutorials);

        sortStringArray(tutorials, count);
        printArray(tutorials);
        writeTextArray(tutorials, count);

    }

    /* This method reads data from the file into the array.
     * We want our array to work with up to 100 elements
     * Each line from the file will be one element in the array.
     *
     * The parameter refers to the array in the main method.
     *
     * The method returns the number of elements it uses.
     */
    public static int readLines(String[] lines) throws Exception {

        Scanner kb = new Scanner(System.in);
        String filename = "whatever"; // put an arbitrary name so it throws an error
        System.out.println("Read file");

        int count = 0; // count lines read
//        File unsorted = new File(filename); // set up file access with File object

        // Create a Scanner named y to read the input stream from the file unsorted
        
        String exitStatement = "exit";
        
        
        
        boolean correctFileName = false; 
        
        do {
            
               if (filename.equals(exitStatement)){
                 System.out.println("In the if statement");       
                 break;
             }
            
            File unsorted = new File(filename); // set up file access with File object
            
            try {
                
              
                System.out.println("Ran try section");
                Scanner infile = new Scanner(unsorted);

                while (infile.hasNextLine()) {

                    lines[count] = infile.nextLine();
                    count++;

                } // close while 

                infile.close();
                
                correctFileName = true; 
                
            

            } // end try 
            
            catch (FileNotFoundException e) {
                System.err.println("FileNotFoundException: " + e.getMessage());
                System.out.println("The file name specified is " + unsorted.getName().toString());
                
                System.out.println("Please enter the correct "
                        + "filename (or type exit to quit the program): ");
                
             
                filename = kb.next();
                
                System.out.println("Filename is: " + filename);
                

               
            //    System.out.println("New file name is " + filename);
                        
            } // end catch 
            
             
            
        } while (correctFileName == false);

        return count;

    }

    // This method prints an array of Strings on the screen.
    // The first parameter refers to the array in the main method.  The second
    //parameter is the number of elements in the array that actually contain data 
    public static void printArray(String[] t) throws Exception {
        System.out.println("Ran printArray");
        for (String val : t) {
            System.out.println(val);
        }

    }

// This method sorts values in the passed string array
    public static void sortStringArray(String[] array, int count) {

        System.out.println("Ran sortStringArray");
        boolean swapped;    // a boolean variable to keep track of when array values are swapped 
        String temp;        // a catalyst variable for swapping values of variables

        do //the outer post-test loop will  repeat another pass through the list when swapped in true
        {
            swapped = false;
            for (int i = 0; i < (count - 1); i++) // a pass through the array to the second to last element
            {
                if (array[i + 1].compareTo(array[i]) < 0) // if the two items are out of order
                {
                    // Swap the two items and set swapped to true 
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }  // end if

            } // end for

        } while (swapped);	// the outer loop will repeat if swapped is true – another pass

    }// end sortArray()

// This method writes the array to a file
    public static void writeTextArray(String[] array, int count) throws Exception {

        System.out.println("Ran writeTextArray");
        // create a File class object and give the file the name hello.txt
        File dataFile = new File("sorted.txt");

        // Create a PrintWriter text output stream and link it to the file dataFile
        PrintWriter output = new PrintWriter(dataFile);

        // Write text output to the file using print(), println() or printf()
        for (int i = 0; i < count - 1; i++) {
            output.println(array[i]);
        }

        System.out.println("File written...");
        System.out.println("Open the NetBeans folder for this project and then");
        System.out.println("open the file sorted.txt to see the result.\n");

        // close the data stream and associated file
        output.close();
    }

} // close class
