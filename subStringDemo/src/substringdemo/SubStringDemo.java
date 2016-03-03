/*
 * SubStringDemo.java
 * program to demonstrate subString operations
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */package substringdemo;

/*
 * @author cherbert
 */
public class SubStringDemo {

    /* The main method demonstrates the use of several String functions
     * such as charAt(), substring()
     */
    public static void main(String[] args) {
        
        String colony = "Pennsylvania";
        
        System.out.println("the String is: " + colony);
        
        for ( int i =0; i < colony.length(); i++)
            System.out.println("the character at index " + i + " is\t"+ colony.charAt(i));
        
        System.out.print("\nsubString(4) is ");
        System.out.println(colony.substring(4));
        
        System.out.print("subString(0,4) is ");
        System.out.println(colony.substring(0,4));
        
        System.out.print("subString(4,10) is ");
        System.out.println(colony.substring(4,10));
        
    } // end main()
} // end class SubStringDemo
