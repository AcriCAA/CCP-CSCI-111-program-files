/*
 * StringSearchDemo.java
 * program to demonstrate indexOf() and lastIndexOf() methods
 * CSCI 112 Fall 2014
 * last edited Jan. 24, 2013 by C. Herbert
 */
package stringsearchdemo;

public class StringSearchDemo {

     /* The main method demonstrates the use of several IndexOf()
     *  and lastIndexOf() methods
     */
    public static void main(String[] args) {
        
        String colony = "Pennsylvania";
        int position; // position within the String
    
        System.out.println("The String is: " + colony);
        System.out.println();
        
        // find the first position of 'y' in the String 
        findChar(colony, 'y'); 

        // find the first position of the first letter 'n'
        findChar(colony, 'n'); 

        // find the first position of the last letter 'n'
        findLastChar(colony, 'n');
        
        // find the position of the subString  "sylvan"
        findSubString(colony, "sylvan");
        
        // find the position of the subString  "woods"
        findSubString(colony, "woods");
                
    }// end main()

/*********************************************************************
 * The findChar method searchers String s  for the first occurrence of character c
 * If found, it tells us the position of the character in the String. 
 * If not found, it tells us the Character is not in the String.
 */  
static void findChar(String s, char c) {

    int position;
    position = s.indexOf(c);    // returns -1 if not found
    if (position < 0)   
        System.out.println(c + " is not in the String");
        else
        System.out.println("The first \'" + c + "\' is at position " + position);
        
} //end findChar()

/*********************************************************************
 * The findLastChar method searchers String s  for the last occurrence of character c
 * If found, it tells us the last position of the character in the String. 
 * If not found, it tells us the Character is not in the String.
 */  
static void findLastChar(String s, char c) {

    int position;
    position = s.lastIndexOf(c);    // returns -1 if not found
    if (position < 0)
        System.out.println("\'" + c + "\'" + " is not in the String");
        else
        System.out.println("The last \'" + c + "\' is at position " + position);
        
} //end findChar()


/*********************************************************************
 * The findSubString method searchers String s  for the first occurrence of 
 * the subString ss
 * If found, it tells us the position of the character in the String. 
 * If not found, it tells us the Character is not in the String.
 */  
static void findSubString(String s, String ss) {

    int position;
    position = s.indexOf(ss);   // returns -1 if not found
    if (position < 0)
        System.out.println("\"" + ss + "\"" + " is not in the String");
        else
        System.out.println( "\"" + ss + "\"" + " begins at  position " + position);
        
} //end findChar()    
} // end class SubStringDemo
