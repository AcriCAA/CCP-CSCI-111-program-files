/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringobjects;
import java.util.*;
import java.io.*;

/**
 *
 * @author AcriCAA
 */
public class StringObjects {

    private static Object letters;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String greeting = "Hello";
        
        int stringSize = greeting.length();
        
        System.out.println(stringSize);
        
        
        System.out.println(String.valueOf("letter"));
        
        String s = "...stuff...";

for (int i = 0; i < s.length(); i++){
    char c = s.charAt(i); 
    
    System.out.println(c); 
    //Process char
}



        String fullname = "Cynthia Susan Smith";
        
        int position = findChar(fullname, ' '); 
        
        String lastname = fullname.substring(position);
        
        System.out.println(lastname); 
        // Wrapper classes
       // ???
       
       //unboxing
       // autoboxing
        
StringBuilder str = new StringBuilder("We Moved from Chicago to Atlanta."); 
str.replace(14, 21, "New York");
// 14 and 21 are index locations
System.out.println(str);

       
    } // close main
    
/*********************************************************************
 * The findChar method searchers String s  for the first occurrence of character c
 * If found, it tells us the position of the character in the String. 
 * If not found, it tells us the Character is not in the String.
 */  
static int findChar(String s, char c) {

    int position;
    position = s.indexOf(c);    // returns -1 if not found
    if (position < 0)   
        System.out.println(c + " is not in the String");
        else
        System.out.println("The first \'" + c + "\' is at position " + position);
     return position;    
} //end findChar()    
    
    
} // close class
