/*  CSCI 111 - Spring 2016
 * Writing "Hello world!" to a data file
 * this program demonstrates writing to a text file
 * 
 * Warning -- this will overwrite the file "hello.txt"
 */

package writehello;
import java.io.*;

public class WriteHello {

    public static void main(String[] args) throws Exception 
    {
        // create a File class object and give the file the name hello.txt
        File dataFile  = new File("hello.txt");

    // Create a PrintWriter text output stream and link it to the file dataFile
    PrintWriter output  = new PrintWriter(dataFile);

    // Write text output to the file using print(), println() or printf()
    output.println("Hello World! ");
    
    System.out.println("File written...");
    System.out.println("Open the NetBeans folder for this project and then");
    System.out.println("open the file hello.txt to see the result.\n");
    
    // close the data stream and associated file
    output.close();
    
  } // end main()

} // end class
