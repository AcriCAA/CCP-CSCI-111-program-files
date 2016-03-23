/**
 * @author AcriCAA 
 * Corey Acri 
 * Course: CSCI 111
 * Date: March 5, 2016
 * Description: This program sets a user password with these conditions: 
 * 
 * 1) The password must be at least 8 characters long.
 * 2) The password must contain at least:
 *      - one alpha character [a-z A-Z]
 *      - one numeric character [0-9]
 *      - one character that is not alpha or numeric, such as
 * 3) The password must not:
 *      - contain spaces 
 *      - begin with an exclamation [!] or a question mark [?]
 *      - contain repeating character strings of 3 or more identical
 *          characters, such as “111” or “aaa”.
 */

package passwordchecker;

import static java.lang.Character.isLetter;
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        
        // declare booleans to track various test values
        boolean passwordValid = false,
                lengthPass,
                alphaPass,
                numberPass,
                specialCharPass,
                noSpaces,
                noQMark,
                noEMark,
                noThreeRepeat,
                userQuit = false, // must be initialized because it may never 
                                  // be used
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
        
        // do-while loop to check password entries and run methods to check if it meets conditions
        do {

            try {
                
                passwordAttempt = kb.nextLine();
                
                if (passwordAttempt.equalsIgnoreCase("instructions") == true){ // if the user requests instructions print them
                printInstructions();
                count--;                   // deduct one from the count since entering ‘instructions’ doesn’t count as a pw attempt 
                enterPasswordPromptAgain(ATTEMPT_COUNT,
                        count);
               
                passwordValid = false;
                }
                
                else if(passwordAttempt.equalsIgnoreCase("instructions") == false){
               
                         
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
                    for (int i = 0; comparison == false && i < 3; i++) { // gives user 3 tries to re-enter pw
                        printConfirmPassword();                          // call  method to print confirm password message
                        passwordToCompare = kb.nextLine();               // get user to enter the duplicate password 
                        
                        // call method to compare the two passwords entered
                        comparison = comparePasswords(passwordAttempt, passwordToCompare);
                        
                        // set the passwordValid (validity sentinel) to equal the value returned from the comparison method
                        passwordValid = comparison;
                    }
                }

                if (passwordValid == false) {
                    // tell the user password was invalid and to try again
                    passwordInvalid();
                    
                    // call method to print the reason the password failed
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
                    
                    // remind user he/she can print instructions
                    System.out.println("Type 'instructions' in the prompt to list all password criteria"); 
                    
                    // call method to tell the user to enter the password again and let him/her the number of attempts left
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
                }  

            } catch (Exception e) {

                // if the user does not enter anything, catch the exception and set the password validity sentinel to false
                enterPasswordPromptAgain(ATTEMPT_COUNT,
                        count);

                passwordValid = false;

            }

            ++count;

        } while (passwordValid == false && count <= ATTEMPT_COUNT); // check the status of the password Validity sentinel, if it is false and the user has not 
        // exceeded the number of loops preset, continue loop 

        if (passwordValid == true && userQuit == false) { // check if the password validity sentinel says the password is valid and if the user did not request to quit
        // print the success message
            printSuccess();
        } else {
            System.out.println("\n\n[User request to quit...quitting program]");  // user requested a quit, print quit program message 
        }

    } // close main

////////////////////////////////////////////////////////////////////////////////
// this method allows the user to quit the program prematurely by typing 'quit'
////////////////////////////////////////////////////////////////////////////////    
    public static boolean checkForQuit(String pw) {

        boolean passwordPass = false;       
        passwordPass = pw.equals("quit");   // check if the pw entered is "quit"
        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
//this method checks if the user entered method has an alpha character. if 'true
// returned the string has an alpha character; 
////////////////////////////////////////////////////////////////////////////////
    public static boolean lengthChecker(String pw) {

        boolean passwordPass = true; // set to true to indicate it is >= 8

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

        boolean passwordPass = false;   // value to return, true means it passed the test 
        boolean isAlpha = false;        // control for letter status in loop
        boolean letterStatus;           // holds true/false value for temp 
        char temp;
        int i = 0;

        while (i < pw.length() && isAlpha == false) { // iterate through entire string until end or if letter found
            temp = pw.charAt(i);                      // check if the current index is a letter 

            letterStatus = isLetter(temp);            // update letterStatus

            if (letterStatus == true) {
                isAlpha = true;             // if it is a letter set isAlpha to true
                passwordPass = true;        // if letter found set passwordPass to true

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

        boolean passwordPass = false;                   // value to return, true means it passed the test 
        boolean isNumber = false;                       // status for number, whether alpha or not
        boolean numberStatus;
        char temp;
        int i = 0;

        while (i < pw.length() && isNumber == false) { 
            temp = pw.charAt(i);

            numberStatus = Character.isDigit(temp);     // update numberStatus

            if (numberStatus == true) {                 // check if it is a letter
                isNumber = true;                        // if it is a letter set isNumber sentinel to tru
                passwordPass = true;                    // set passwordPass to true 

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

        boolean passwordPass = false;           // value to return, true means it passed the test 
        boolean isSymbol = false;
        boolean letterStatus;                   // true if is a letter
        boolean numberStatus;                   // true if temp is a number
        boolean whiteSpaceStatus;               // true if temp is whitespace
        char temp;
        int i = 0;

        while (i < pw.length() && isSymbol == false) { //loop through String or until a symbol is found
            temp = pw.charAt(i);                       // assign char at index to temp

            letterStatus = isLetter(temp);             // set boolean value for letterStatus
            numberStatus = Character.isDigit(temp);    // set boolean value for numberStatus
            whiteSpaceStatus = Character.isWhitespace(temp); // set booleam value for whiteSpaceStatus

            if (letterStatus == false && numberStatus == false  // if it is neither a letter, number, or whitespace, it is a symbol
                    && whiteSpaceStatus == false) {
                isSymbol = true;                                // set symbol to true
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
        boolean spaceStatus;     // sentinel for spaceStatus
        char temp;              // temp value for character from String index
        int i = 0;              

        while (i < pw.length() && isSpace == false) { // loop while there are still characters in string or if a space is found
            temp = pw.charAt(i);                      // assign char at index to temp

            spaceStatus = Character.isWhitespace(temp); // set spaceStatus

            if (spaceStatus == true) {   // if spaceStatus is true then it fails the test
                isSpace = true;           
                passwordPass = false;
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
        if (pw.charAt(0) == c) {  // if the first character is the char passed into method then it fails the test
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

        boolean passwordPass = false; // default status is false 
        
        // if it passes all of the criteria set passworPass to true
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
        
        boolean passwordPass = true; // set value to true because you assume there are 
                                     // not three consecutive values by default 
        if (pw.length() < 3) {      // double check that the String is more than 3 characters

            passwordPass = false;

        } else {
            for (int i = 0; i < pw.length(); i++) {  // iterate through string

                if (i == 0) {  // look at first value in string 
                    if (pw.charAt(i) == pw.charAt(i + 1) && pw.charAt(i) == pw.charAt(i + 2)) { // if it is the same as the second value 
                        passwordPass = false;                                                   // and the same as the third value, the test fails

                    }

                } else if (i == (pw.length() - 1)) {  // else if you are at the last value in the string

                    if (pw.charAt(i) == pw.charAt(i - 1)  // if it is equal to the next to last and two from the last the test fails
                            && pw.charAt(i) == pw.charAt(i - 2)) {
                        passwordPass = false;

                    }

                } else if (pw.charAt(i) == pw.charAt(i - 1)
                        && pw.charAt(i) == pw.charAt(i + 1)) { // else if you are anywhere else, look at character one value to the left and
                    passwordPass = false;                      // look at the character one value to the right, if they are the same the test fails

                } // close else 

            }// close for loop 

        } // close first if check

        return passwordPass;

    } // close method
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// this method compares one string to another, checks if they match and 
// tells the user if they match.  
////////////////////////////////////////////////////////////////////////////////
    public static boolean comparePasswords(String pw1, String pw2) {

        boolean passwordPass;

        passwordPass = pw1.equalsIgnoreCase(pw2);   // compare the passwords ignoring case

        if (passwordPass == false) {

            System.out.println("-- Try again. The passwords do not match"); // if they do not match tell user

        }

        return passwordPass;

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// this method formats a line break with a width equual to the int passed into
// using the string passed in 
////////////////////////////////////////////////////////////////////////////////
    public static void printLineBreak(int width, char c) {

        for (int i = 1; i < width; i++) {   // print the char c until you've reached the desired width
            System.out.print(c);
        }

    }
////////////////////////////////////////////////////////////////////////////////        

////////////////////////////////////////////////////////////////////////////////    
// this method prints the greeting    
////////////////////////////////////////////////////////////////////////////////   
    public static void printGreeting() {
        printLineBreak(71, ':');            // call printLineBreak and pass the desired number of chars and character 
        System.out.println("\n:: Hello. This program will allow "
                + "you to set your password.");
        
        printLineBreak(71, ':');
        System.out.println("\n\n[you may quit the program by typing 'quit' at the "
                + "password prompt]");
         printLineBreak(71, ':');
        System.out.print("\n\n\n");

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// this method prints the instructions    
////////////////////////////////////////////////////////////////////////////////   
    public static void printInstructions() {
        // prints the criteria 
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
// This method asks the user to re-enter the password    
////////////////////////////////////////////////////////////////////////////////   
    public static void printConfirmPassword() {
        
        // call printLineBreak for formatting 
        printLineBreak(71, '*'); 
        System.out.print("\nPlease re-enter your password to confirm:> ");

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////    
// this method prompts the user to enter a password and tells the user the 
// number of attempts he or she has left or if he/she has exceeded the number
// of allowed attempts
////////////////////////////////////////////////////////////////////////////////   
    public static void enterPasswordPromptAgain(int ATTEMPT_COUNT, int count) {
        if (ATTEMPT_COUNT - count > 0) { // subtract the attempts allowed from the current count

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
// this method tells the user that the password attempt failed
////////////////////////////////////////////////////////////////////////////////   
    public static void passwordInvalid() {
        System.out.print("\n\n\n");
        printLineBreak(71, 'X');  // call printLineBreak for formatting
        System.out.println("\nXXXXX            PASSWORD ATTEMPT FAILED");
        printLineBreak(71, 'X');
    }
////////////////////////////////////////////////////////////////////////////////   

////////////////////////////////////////////////////////////////////////////////    
// this method prints a success message
////////////////////////////////////////////////////////////////////////////////   
    public static void printSuccess() {

        System.out.print("\n\n\n");
        printLineBreak(71, '*');    // call print line break for formatting
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

        if (lengthPass == false) {  // if the pw does not pass the length test

            System.out.println("-- The password is not at least 8 characters"
                    + " long");
        }

        if (noQMark == false || noEMark == false) {  // if the pw starts with a ? or !
            System.out.println("-- The password must NOT begin with "
                    + "an exclamation [!] or a question mark [?]");
        } else {

            if (alphaPass == false) { // if the pw failed the alpha test
                System.out.println("-- Your entry does not contain an letter"
                        + " [a-Z]");
            }
            if (numberPass == false) { // if the pw failed the number test
                System.out.println("-- Your entry does not contain "
                        + "a number [0-9]");
            }
            if (specialCharPass == false) { // if the pw failed the symbols test
                System.out.println("-- Your entry must contain "
                        + "a symbol [! @ $ % ^ & * ( ) - _ "
                        + "= + [ ] ; : ' \" , < . > / ?]");
            }
            if (noSpaces == false) { // if the password had spaces
                System.out.println("-- The password must NOT contain spaces");
            }

            if (noThreeRepeat == false) { // if the password had three chars consecutively
                System.out.println("-- The password must NOT contain repeating "
                        + "three or more repeating characters");
            }

            if (comparison == false         // this tells the user that he/she failed to enter a duplicate pw
                    && lengthPass == true 
                    && noQMark == true
                    && noEMark == true 
                    && alphaPass == true 
                    && numberPass == true
                    && specialCharPass == true 
                    && noSpaces == true
                    && noThreeRepeat == true) {

                System.out.println("-- You failed to enter a duplicate password"
                );
            }

        } // close else 

        printLineBreak(71, 'X'); // formatting 
        System.out.println("\n");

    }
////////////////////////////////////////////////////////////////////////////////

} // close class
