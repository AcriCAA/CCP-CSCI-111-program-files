/* CSCI 111 - Spring 2016
 * 
 * Reading "Hello world!" from a data file
 * this program demonstrates reading from a text file
 * 
 * The file "hello.txt" must exist in the project folder for this to work
 */
package readdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CommentsGrabber {

    public static void main(String[] args) throws Exception {

        int stringLength = 700;

        String[] lines = new String[stringLength];

        java.io.File rawCode = new java.io.File("/Users/AcriCAA/documents/CCP-CSCI-111-program-files/CommentsGrabber/code.txt");

        // Create a Scanner named infile to read the input stream from the file unsorted
        Scanner inFile = new Scanner(rawCode);
        int count = 0;

        String filePath = "/Users/AcriCAA/documents/CCP-CSCI-111-program-files/CommentsGrabber/code.txt";
        
        String fileCodeContents;
        fileCodeContents = readFileAsString(filePath);

        // System.out.println("The file contents are: \n\n" + fileCodeContents); 
        StringBuilder commentsOnly = new StringBuilder();

        char temp;
        char tempNext;

        for (int i = 0; i < fileCodeContents.length() - 1; i++) {

            temp = fileCodeContents.charAt(i);
            
//            System.out.println("Temp is: " + temp); 

            tempNext = fileCodeContents.charAt(i + 1);
            
//            System.out.println("TempNext is: " + tempNext); 

            if (temp == '/' && tempNext == '/') { // checks for a '//' comment 

//                commentsOnly.append(temp);
//                commentsOnly.append(tempNext);
               

                    while (temp != '\n' && i < fileCodeContents.length()) { // loops until we reach the beginning of a new '//' or '/'
                        temp = fileCodeContents.charAt(i);
                        i++;
                        commentsOnly.append(temp);

                    } // close while 
                } // close check for // comment 

                if (temp == '/' && tempNext == '*' ) { // checks for the start fo a  '/*' comment

                                    
                    while (temp != '\n' && i < fileCodeContents.length()) { // loops until we reach next line
                        temp = fileCodeContents.charAt(i);
                        i++;
                        commentsOnly.append(temp);
                       

                        } // close while 
                    if(i < fileCodeContents.length())
                    tempNext = fileCodeContents.charAt(i + 1);
                    else 
                        tempNext = temp; 
                    
                    while (temp != '*' && tempNext != '/' && i < fileCodeContents.length()){
                        temp = fileCodeContents.charAt(i);
                        i++;
                        commentsOnly.append(temp);
                    
                    }
                    
                   
                    
                    } // close check for /* comment type 
//                
//                if (temp == ' ' && tempNext == '*' ) { // checks for the start fo a  ' *' commentlinw
//
//                                    
//                    while (temp != '\n' && i < fileCodeContents.length()) { // loops until we reach next line
//                        temp = fileCodeContents.charAt(i);
//                        i++;
//                        commentsOnly.append(temp);
//                       
//
//                        } // close while 
//                    
//                    
//                    
//                   
//                    
//                    } // close check for /* comment type 
                
                

                } // close for loop
               System.out.println(commentsOnly);
               
            } // close main


 



    public static String readFileAsString(String filePath) throws IOException {
        StringBuilder fileData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath))) {
            char[] buf = new char[1024];
            int numRead = 0;
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
        }
        return fileData.toString();
    }

} // end class
