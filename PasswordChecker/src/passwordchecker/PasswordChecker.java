/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordchecker;

import static java.lang.Character.isLetter;
import java.util.Scanner;

/**
 *
 * @author AcriCAA
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean userQuit = false;
        boolean passwordValid,
                lengthPass,
                alphaPass,
                numberPass,
                specialCharPass,
                noSpaces,
                noQMark,
                noEMark,
                noThreeRepeat,
                comparison = false; // comparison must be initialized because 
        // it may never be used if the prelim checks 
        // fail 

        String passwordAttempt; // value to hold passwordAttempt
        String passwordToCompare; // user re-typed password

        // set up instance of Scanner for input
        Scanner kb = new Scanner(System.in);

        printGreeting();
        printInstructions();
        enterPasswordPrompt();

        final int ATTEMPT_COUNT = 10; // value to limit how many times the user 
        // can try to enter a password before 
        // program quits

        int count = 1; // this tracks how many attempts user has made
        // to enter a password. 

        do {

            try {

                passwordAttempt = kb.nextLine();

                // run method to see if desired password is at least 8 chars
                lengthPass = lengthChecker(passwordAttempt);

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
                passwordValid = statusCheck(
                        lengthPass,
                        alphaPass,
                        numberPass,
                        specialCharPass,
                        noSpaces,
                        noQMark,
                        noEMark,
                        noThreeRepeat);

                // if the user's password attempt passed all of the preliminary checks
                // ask user to retype password and call method to compare them. 
                if (passwordValid == true) {
                    // comparison = false; // intialize comparison
                    for (int i = 0; comparison == false && i < 3; i++) { // gives user 3 tries to re-enter pw
                        printConfirmPassword();
                        passwordToCompare = kb.nextLine();
                        comparison = comparePasswords(passwordAttempt, passwordToCompare);
                        passwordValid = comparison;
                    }
                }

                if (passwordValid == false) {
                    // tell the user password was invalid and to try again
                    passwordInvalid();

                    printReasonForFail(
                            lengthPass,
                            alphaPass,
                            numberPass,
                            specialCharPass,
                            noSpaces,
                            noQMark,
                            noEMark,
                            noThreeRepeat,
                            comparison,
                            ATTEMPT_COUNT,
                            count);
                    printInstructions();
                    enterPasswordPromptAgain(ATTEMPT_COUNT,
                            count);
                }

                // call method to check if the user elected to quit the program 
                // pre-maturely
                userQuit = checkForQuit(passwordAttempt);

                // if the user choose to quit exit the loop by setting all values
                // to loop success values
                if (userQuit == true) {
                    passwordValid = userQuit;
                    count = ATTEMPT_COUNT;
                }

            } catch (Exception e) {

                enterPasswordPromptAgain(ATTEMPT_COUNT,
                        count);

                passwordValid = false;

            }

            ++count;

        } while (passwordValid == false && count <= ATTEMPT_COUNT);

        if (passwordValid == true && userQuit == false) {
            printSuccess();
        } else {
            System.out.println("\n\n[User request to quit...quitting program]");
        }

    } // close main

////////////////////////////////////////////////////////////////////////////////
// this method allows the user to quit the program prematurely by typing 'quit'
////////////////////////////////////////////////////////////////////////////////    
    public static boolean checkForQuit(String pw) {

        boolean passwordPass = false;
        passwordPass = pw.equals("quit");
        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered method has an alpha character. if 'true
// returned the string has an alpha character; 
////////////////////////////////////////////////////////////////////////////////
    public static boolean lengthChecker(String pw) {

        boolean passwordPass = true;

        if (pw.length() < 8) {

            passwordPass = false;

        }

        return passwordPass;

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

            if (numberStatus == true) {
                isNumber = true;
                passwordPass = true;

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
    public static boolean statusCheck(
            boolean lengthPass,
            boolean alphaPass,
            boolean numberPass,
            boolean specialCharPass,
            boolean noSpaces,
            boolean noQMark,
            boolean noEMark,
            boolean noThreeRepeat) {

        boolean passwordPass = false;
        if (lengthPass == true && alphaPass == true && numberPass == true && specialCharPass == true
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

                    }

                } else if (i == (pw.length() - 1)) {

                    if (pw.charAt(i) == pw.charAt(i - 1)
                            && pw.charAt(i) == pw.charAt(i - 2)) {
                        passwordPass = false;

                    }

                } else if (pw.charAt(i) == pw.charAt(i - 1)
                        && pw.charAt(i) == pw.charAt(i + 1)) {
                    passwordPass = false;

                } // close else 

            }// close for loop 

        } // close first if check

        return passwordPass;

    } // close method
////////////////////////////////////////////////////////////////////////////////

// this method compares one string to another 
    public static boolean comparePasswords(String pw1, String pw2) {

        boolean passwordPass;

        passwordPass = pw1.equalsIgnoreCase(pw2);

        if (passwordPass == false) {

            System.out.println("-- Try again. The passwords do not match");

        }

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// this method formats a line break with a width equual to the int passed into
// using the string passed in 
////////////////////////////////////////////////////////////////////////////////
    public static void printLineBreak(int width, char c) {

        for (int i = 1; i < width; i++) {
            System.out.print(c);
        }

    }
////////////////////////////////////////////////////////////////////////////////        

////////////////////////////////////////////////////////////////////////////////    
// this method prints the greeting    
////////////////////////////////////////////////////////////////////////////////   
    public static void printGreeting() {
        printLineBreak(71, ':');
        System.out.println("\n:: Hello. This program will allow "
                + "you to set your password.");
        System.out.println(":: [you may quit the program by typing 'quit' at the "
                + "password prompt]");
        for (int i = 1; i < 70; i++) {
            System.out.print(":");
        }
        System.out.print("\n\n\n");

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// this method prints the instructions    
////////////////////////////////////////////////////////////////////////////////   
    public static void printInstructions() {

        System.out.println("Your password must meet these conditions:\n"
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
                + "characters, such as “111” or “aaa”.");

    }
////////////////////////////////////////////////////////////////////////////////    

////////////////////////////////////////////////////////////////////////////////    
// this method prompts the user to enter a password  
////////////////////////////////////////////////////////////////////////////////   
    public static void enterPasswordPrompt() {

        for (int i = 1; i < 70; i++) {
            System.out.print("*");
        }
        System.out.print("\nPlease enter your desired password: > ");

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////   
    public static void printConfirmPassword() {
        for (int i = 1; i < 70; i++) {
            System.out.print("*");
        }
        System.out.print("\nPlease re-enter your password to confirm:> ");

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////    
// this method prompts the user to enter a password  
////////////////////////////////////////////////////////////////////////////////   
    public static void enterPasswordPromptAgain(int ATTEMPT_COUNT, int count) {
        if (ATTEMPT_COUNT - count > 0) {

            printLineBreak(71, '*');

            System.out.print("\nPlease enter your desired password ");
            System.out.print("(you have " + (ATTEMPT_COUNT - count) + " attempts left.): > ");
        } else {

            passwordInvalid();
            System.out.println("\n-- YOU'VE EXCEEDED THE NUMBER OF PASSWORD ATTEMPTS"
                    + " ALLOWED");
            System.out.println("\n\n[quitting program]");

        }

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////    
// this method tells the user that the password attempt was invalid
////////////////////////////////////////////////////////////////////////////////   
    public static void passwordInvalid() {

        System.out.print("\n\n\n");
        printLineBreak(71, 'X');
        System.out.println("\nXXXXX            PASSWORD ATTEMPT FAILED");

        printLineBreak(71, 'X');
    }
////////////////////////////////////////////////////////////////////////////////   

////////////////////////////////////////////////////////////////////////////////    
// this method prints a success message
////////////////////////////////////////////////////////////////////////////////   
    public static void printSuccess() {

        System.out.print("\n\n\n");
        printLineBreak(71, '*');
        System.out.println("\n***            SUCCESS PASSWORD ACCEPTED");
        printLineBreak(71, '*');
    }
////////////////////////////////////////////////////////////////////////////////    

////////////////////////////////////////////////////////////////////////////////
// this method receives boolean variables for each password test and prints a 
// message letting the user know which test failed. 
////////////////////////////////////////////////////////////////////////////////    
    public static void printReasonForFail(
            boolean lengthPass,
            boolean alphaPass,
            boolean numberPass,
            boolean specialCharPass,
            boolean noSpaces,
            boolean noQMark,
            boolean noEMark,
            boolean noThreeRepeat,
            boolean comparison,
            int ATTEMPT_COUNT,
            int count) {

        System.out.println("\n");

        if (lengthPass == false) {

            System.out.println("-- The password is not at least 8 characters"
                    + " long");
        }

        if (noQMark == false || noEMark == false) {
            System.out.println("-- The password must NOT begin with "
                    + "an exclamation [!] or a question mark [?]");
        } else {

            if (alphaPass == false) {
                System.out.println("-- Your entry does not contain an letter"
                        + " [a-Z]");
            }
            if (numberPass == false) {
                System.out.println("-- Your entry does not contain "
                        + "a number [0-9]");
            }
            if (specialCharPass == false) {
                System.out.println("-- Your entry must contain "
                        + "a symbol [! @ $ % ^ & * ( ) - _ "
                        + "= + [ ] ; : ' \" , < . > / ?]");
            }
            if (noSpaces == false) {
                System.out.println("-- The password must NOT contain spaces");
            }

            if (noThreeRepeat == false) {
                System.out.println("-- The password must NOT contain repeating "
                        + "three or more repeating characters");
            }

            if (comparison == false && lengthPass == true && noQMark == true
                    && noEMark == true && alphaPass == true && numberPass == true
                    && specialCharPass == true && noSpaces == true
                    && noThreeRepeat == true) {

                System.out.println("-- You failed to enter a duplicate password"
                );
            }

        } // close else 

        printLineBreak(71, 'X');
        System.out.println("\n");

    }
////////////////////////////////////////////////////////////////////////////////

} // close class
