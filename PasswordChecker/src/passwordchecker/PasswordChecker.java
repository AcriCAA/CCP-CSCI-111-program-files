/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordchecker;

import static java.lang.Character.isLetter;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author AcriCAA
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean passwordValid,
                alphaPass,
                numberPass,
                specialCharPass,
                noSpaces,
                noQMark,
                noEMark,
                noThreeRepeat;

        String passwordAttempt; // value to hold passwordAttempt

        // set up instance of Scanner for input
        Scanner kb = new Scanner(System.in);

        printGreeting();
        enterPasswordPrompt();

        int i = 1; // this is a temporary counter for testing

        do {
            System.out.println("This is attempt # " + i);
            i++;
            passwordAttempt = kb.nextLine();
            System.out.println(passwordAttempt);
            
            

            // run method to check if the desired password has an alpha char
            alphaPass = checkForAlpha(passwordAttempt);

            // run method to check if desired password has a number
            numberPass = checkForNumber(passwordAttempt);

            // run method to check if desired password has a symbol
            specialCharPass = checkForSymbol(passwordAttempt);

            // run method to check if desired password has a whitespace
            noSpaces = checkForSpaces(passwordAttempt);

            // run method to check if desired password starts with the char passed in
            noQMark = testFirstChar(passwordAttempt, '?');

            // run method to check if desired password starts with the char passed in
            noEMark = testFirstChar(passwordAttempt, '!');

            // run method to check for consecutive characters
            noThreeRepeat = checkForRepeats(passwordAttempt);

            // call method statusCheck to determine if the password passed all tests
            passwordValid = statusCheck(alphaPass,
                    numberPass,
                    specialCharPass,
                    noSpaces,
                    noQMark,
                    noEMark,
                    noThreeRepeat);

            if (passwordValid == false) {
                // tell the user password was invalid and to try again
                passwordInvalid();
                printReasonForFail(alphaPass,
                        numberPass,
                        specialCharPass,
                        noSpaces,
                        noQMark,
                        noEMark,
                        noThreeRepeat);
            }

        } while (passwordValid == false);

    } // close main

////////////////////////////////////////////////////////////////////////////////    
// this method prints the opening greeting and instructions    
////////////////////////////////////////////////////////////////////////////////   
    public static void printGreeting() {

        System.out.println("Please enter a password that meets these conditions:\n"
                + "1) The password must be at least 8 characters long.\n"
                + "\n"
                + "2) The password must contain at least:\n"
                + "     - one alpha character [a-z A-Z];\n"
                + "     - one numeric character [0-9];\n"
                + "     - one character that is not alpha or numeric, such as\n"
                + "              ! @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?\n"
                + "\n"
                + "3) The password must not:\n"
                + "    - contain spaces;\n"
                + "    - begin with an exclamation [!] or a question mark [?];\n"
                + "    - contain repeating character strings of 3 or more identical "
                + "characters, such as “1111” or “aaa”.");

    }
////////////////////////////////////////////////////////////////////////////////   

////////////////////////////////////////////////////////////////////////////////    
// this method prompts the user to enter a password  
////////////////////////////////////////////////////////////////////////////////   
    public static void enterPasswordPrompt() {

        System.out.println("\n\nPlease enter your desired password: ");

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////    
// this method tells the user that the password attempt was invalid
////////////////////////////////////////////////////////////////////////////////   
    public static void passwordInvalid() {

        System.out.println("Sorry, your password attempt was invalid");

    }
//////////////////////////////////////////////////////////////////////////////// 

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered method has an alpha character. if 'true
// returned the string has an alpha character; 
////////////////////////////////////////////////////////////////////////////////
    public static boolean checkForAlpha(String pw) {

        boolean passwordPass = false; // value to return, true means it passed the test 
        boolean isAlpha = false; // status for letter, whether alpha or not
        boolean letterStatus;
        char temp;
        int i = 0;

        while (i < pw.length() && isAlpha == false) {
            temp = pw.charAt(i);

            letterStatus = isLetter(temp);

            if (letterStatus == true) {
                isAlpha = true;
                passwordPass = true;
//                System.out.println("passed Alpha test with " + temp); 
            }

            i++;

        } // close while

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////    

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered method has an digit character. if 'true
// returned the string has an digit character; 
////////////////////////////////////////////////////////////////////////////////
    public static boolean checkForNumber(String pw) {

        boolean passwordPass = false; // value to return, true means it passed the test 
        boolean isNumber = false; // status for letter, whether alpha or not
        boolean numberStatus;
        char temp;
        int i = 0;

        while (i < pw.length() && isNumber == false) {
            temp = pw.charAt(i);

            numberStatus = Character.isDigit(temp);

//            System.out.println("It is a digit: " + numberStatus);
            if (numberStatus == true) {
                isNumber = true;
                passwordPass = true;
//                System.out.println("passed Number test with " + temp); 
            }

            i++;

        } // close while

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered password has a symbol by checking 
// if each character in the string is either a letter or a number
////////////////////////////////////////////////////////////////////////////////
    public static boolean checkForSymbol(String pw) {

        boolean passwordPass = false; // value to return, true means it passed the test 
        boolean isSymbol = false;
        boolean letterStatus; // true if is a letter
        boolean numberStatus; // true if temp is a number
        boolean whiteSpaceStatus; // true if temp is whitespace
        char temp;
        int i = 0;

        while (i < pw.length() && isSymbol == false) {
            temp = pw.charAt(i);

            letterStatus = isLetter(temp);
            numberStatus = Character.isDigit(temp);
            whiteSpaceStatus = Character.isWhitespace(temp);

            if (letterStatus == false && numberStatus == false
                    && whiteSpaceStatus == false) {
                isSymbol = true;
                passwordPass = true;
//                System.out.println("passed Symbol test with " + temp);  
            }

            i++;

        } // close while

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////   

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered method has an alpha character. if 'true
// returned the string has an alpha character; 
////////////////////////////////////////////////////////////////////////////////
    public static boolean checkForSpaces(String pw) {

        // the test is passed if there is NO space
        boolean passwordPass = true; // value to return, true means it passed the test 
        boolean isSpace = false; // status for space 
        boolean spaceStatus;
        char temp;
        int i = 0;

        while (i < pw.length() && isSpace == false) {
            temp = pw.charAt(i);

            spaceStatus = Character.isWhitespace(temp);

            if (spaceStatus == true) {
                isSpace = true;
                passwordPass = false;
//                System.out.println("failed whitespace test with " + temp); 
            }

            i++;

        } // close while

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////
// This method looks at the first character in a string and tests if it is the 
// character passed into the method
////////////////////////////////////////////////////////////////////////////////  
    public static boolean testFirstChar(String pw, char c) {

        boolean passwordPass = true; // value to return, true means it passed the test 

        // System.out.println("The char at 0 is: " + pw.charAt(0));
        if (pw.charAt(0) == c) {
            passwordPass = false;
        }

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////
// this method receives boolean variables for each password test and then returns
// a boolean value to indicate whether the password is valid or invalid. 
////////////////////////////////////////////////////////////////////////////////    
    public static boolean statusCheck(boolean alphaPass,
            boolean numberPass,
            boolean specialCharPass,
            boolean noSpaces,
            boolean noQMark,
            boolean noEMark,
            boolean noThreeRepeat) {

        boolean passwordPass = false;
        if (alphaPass == true && numberPass == true && specialCharPass == true
                && noSpaces == true && noQMark == true && noEMark == true && noThreeRepeat == true) {
            passwordPass = true;
        }

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// This method checks for consecutive characters
////////////////////////////////////////////////////////////////////////////////
    public static boolean checkForRepeats(String pw) {
        boolean passwordPass = true;

        if (pw.length() < 3) {

            passwordPass = false;
         

        } else {
            for (int i = 0; i < pw.length(); i++) {

                if (i == 0) {
                    if (pw.charAt(i) == pw.charAt(i + 1) && pw.charAt(i) == pw.charAt(i + 2)) {
                        passwordPass = false;
//             System.out.println("The current character is: " + pw.charAt(i)); 
//        System.out.println("The character to the right is: " + pw.charAt(i+1)); 
//        System.out.println("The character two to the right is: " + pw.charAt(i+2));    

                    }

                } else if (i == (pw.length() - 1)) {

                    if (pw.charAt(i) == pw.charAt(i - 1)
                            && pw.charAt(i) == pw.charAt(i - 2)) {
                        passwordPass = false;
//        System.out.println("The current character is: " + pw.charAt(i)); 
//        System.out.println("The character to the left is: " + pw.charAt(i-1)); 
//        System.out.println("The character two to the left is: " + pw.charAt(i-2));

                    }

                } else if (pw.charAt(i) == pw.charAt(i - 1)
                        && pw.charAt(i) == pw.charAt(i + 1)) {
                    passwordPass = false;

//        System.out.println("The current character is: " + pw.charAt(i)); 
//        System.out.println("The character to the left is: " + pw.charAt(i-1)); 
//        System.out.println("The character to the right is: " + pw.charAt(i+1));
                } // close else 

            }// close for loop 

        } // close first if check

        return passwordPass;

    } // close method
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// this method receives boolean variables for each password test and prints a 
// message letting the user know which test failed. 
////////////////////////////////////////////////////////////////////////////////    
    public static void printReasonForFail(boolean alphaPass,
            boolean numberPass,
            boolean specialCharPass,
            boolean noSpaces,
            boolean noQMark,
            boolean noEMark,
            boolean noThreeRepeat) {

        if (noQMark == false || noEMark == false) {
            System.out.println("The password must NOT begin with an exclamation [!] or a question mark [?]");
        } else {

            if (alphaPass == false) {
                System.out.println("Your entry does not contain an alpha [a-Z]");
            }
            if (numberPass == false) {
                System.out.println("Your entry does not contain one numeric character [0-9]");
            }
            if (specialCharPass == false) {
                System.out.println("Your entry must contain "
                        + "one character that is not alpha or numeric");
            }
            if (noSpaces == false) {
                System.out.println("The password must NOT contain spaces");
            }

            if (noThreeRepeat == false) {
                System.out.println("The password must NOT contain repeating character strings of 3 or more identical");
            }
        } // close else 

        System.out.println("Please enter your desired password again: ");

    }
////////////////////////////////////////////////////////////////////////////////

} // close class
