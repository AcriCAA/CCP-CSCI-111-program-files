/* CSCI 111 - Spring 2016
 * 
 * Reading "Hello world!" from a data file
 * this program demonstrates reading from a text file
 * 
 * The file "hello.txt" must exist in the project folder for this to work
 */
package CommentsGrabber;
import java.util.Scanner; 

public class CommentsGrabber 
{
  public static void main(String[] args) throws Exception 
  {
  
    String message;     // holds the line of text coming in from the file
      
    // Create a File class object x and give it the name of the file to read
    java.io.File x = new java.io.File("hello.txt");

    // Create a Scanner named y to read the input stream from the file x
    Scanner y  = new Scanner(x);

    // Read a line of text from the file 
    message = y.nextLine();

    // print the message from the file on the screen
    System.out.println("reading from the data file...\n");
    System.out.println(message);
  
    // Close the input data strean and associated file
    y.close();
    
  } // end main()
} // end class
