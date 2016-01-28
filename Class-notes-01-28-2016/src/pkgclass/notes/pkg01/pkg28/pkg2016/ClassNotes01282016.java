/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Jan. 28, 2016
 * Description: class notes and working with scanner
 * 
 */

package pkgclass.notes.pkg01.pkg28.pkg2016;
//import java.util.*; 
// imports all libraries

import java.util.Scanner;


public class ClassNotes01282016 {

   
    public static void main(String[] args) {
       
        
        Scanner kb = new Scanner(System.in);
        // 'kb' here is a user defined variable
        
        String name; 
        
        // Get the user's name form the keyboard 
        System.out.println("Please enter your name: "); 
        name = kb.nextLine();
        
        kb.close(); // closing input stream
        
        System.out.println("Hello " + name);
        
    }
    
}
