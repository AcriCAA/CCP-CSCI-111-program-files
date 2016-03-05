/*
 * UpperLowerDemo.java
 * program to demonstrate the toLowercase() and toUppercase() methods
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */
package upperlowerdemo;

public class UpperLowerDemo {

    public static void main(String[] args) {

       String testString = "wedNESday";
       String result;
		
       // call method to convert the string to the right format		
       result = standardize(testString);

       System.out.println("The original string is: " + testString);
       System.out.println("The standardized string is: " + result);

    }// end main()
    
    /*********************************************************************
     * The standardize method returns the input String with
     * the first character uppercase and the rest of the String lowercase
     */ 
    static String standardize(String inString) {

        // get the first character of inString as a one character String
        String first = inString.substring(0, 1);
        System.out.println(first);

        // get the rest of inString
        String rest = inString.substring(1, inString.length());
        System.out.println(rest);

        // return a String with first uppercase and rest lowercase
           return first.toUpperCase() + rest.toLowerCase();

  		// Note that this whole method could all be done in one instruction
  		// return inString.substring(0, 1).toUpperCase() 
       //    + inString.substring(1,inString.length()).toLowerCase();
                
    } // end standardize()
} // end class UpperLowerDemo
