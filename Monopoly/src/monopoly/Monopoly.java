/* Monopoly.java
 * 
 * 
 * @author AcriCAA (Corey Acri) 
 * Course: CSCI 111
 * Date: March 29, 2016
 *
 * CSCI 111 Spring 2016
 * Program Description: This program, in its current state, starts 
 * the game monopoly, provides the option to set the number of players, the
 * players to select their name and token and 
 * choose a name and token, roll the dice by pressing enter and move around the
 * board. It also deducts rent from the player for board squares that have
 * rents. 
 * 
 * This package contains code that can be used as the basis of a monopoly game
 * It has a class of BoardSquares for the board squares in a Monopoly game,
 * and a main program that puts the squares into an array.
 * 
 * The main method has code to test the program by printing the data from the 
 * array.
 * 
 * This is for teaching purposes only. 
 * 
 * Monopoly and the names and images used in Monopoly are registered trademarks 
 * of Parker Brothers, Hasbro, and others.
 */
package monopoly;

import java.util.*;

public class Monopoly {

    public static void main(String[] args) throws Exception {

        // ints
        final int squareBounds = 40; // constant int to set number of squares on board
        
        int i; // a loop counter
        int numPlayers = 2; // int set max number of players (default to 2)
        int currentPlayer = 0; // int to keep track of the current player (player 1 or 2)     
        int diRoll; // int for current roll of the dice
        int currentLocation; // value to hold player's current location
        int newLocation; // value to hold player's location after he/she moves the number of dice values away from currentLocation. 
        int currentBalance; // int carrying current player's money balance
        int rentForLocation; // the rent in the BoardSquare where the player lands after moving on the board
        int newBalance; // holds the value for the player's new balance after rent deducted. 

        // booleans
        boolean squareHasRent = false; // holds value for whether the square the player is on has rent; 
        
        // Strings
        String userStringInput; // String variable to hold String input from user
        String currentName; // String variable to hold currentName of player
        String currentToken; // String variable to hold currentToken of player
        String currentSquare; // String variable to hold currentSquare player is on

        // set up instance of Scanner for input
        Scanner kb = new Scanner(System.in);
        Scanner kbInt = new Scanner(System.in);

        // Create array of 40 monopoly squares
        BoardSquare[] square = new BoardSquare[squareBounds];

        // Call the method to load the array
        loadArray(square);

        // call printLineBreak method to draw a line break
        printLineBreak(71, ':');
        
        // print welcome message
        System.out.println("\nWelcome to MONOPOLY!");
        
        // print a request for the number of players that will be playing
        System.out.print("How many players will be playing?");
        
        // get user input for the number of players
        numPlayers = kbInt.nextInt();

        // print the number of players the user indicated were playing 
        System.out.print("\nOk, great " + numPlayers + " players.\n");

// create array of numPlayers number of players (for scalability when we add full features)
        // STEP 1: declare the object array 
        Player[] thePlayer = new Player[numPlayers];

        // STEP 2: initiate player object 
        initiatePlayerObject(thePlayer, numPlayers);

        //Set up players
        for (i = 0; i < numPlayers; i++) {
            
            // set current player to equal the value of i to properly iterate 
            // through the each Player object when the other player's turn 
            // is over 
            
            currentPlayer = i;
            
            
            printLineBreak(71, ':');
            
            // call printWhichPlayer method and pass in the currentPlayer value
            printWhichPlayer(currentPlayer);
            
            // call promptUserForName to ask user for his/her name
            promptUserForName();
           
            // get user input for name from Scanner
            userStringInput = kb.nextLine();
            
            //set thePlayer object name for the currentPlayer to the userStringInput
            thePlayer[currentPlayer].setName(userStringInput);
            
            printLineBreak(71, ':');
            System.out.print("Hi, " + thePlayer[currentPlayer].getName() + " please ");

            // get Token Choice
            
            //call promptUserForTokenChoice method to print request for Token choice
            promptUserForTokenChoice();
            
            //get user string input from scanner
            userStringInput = kb.nextLine();
            
            // set thePlayer object Token to user's string input 
            thePlayer[currentPlayer].setToken(userStringInput);
            printLineBreak(71, ':');

        }

        currentPlayer = 0; // reset currentPlayer value to 0 so you can start 
                           // playing with player one

        for (i = 0; i < numPlayers; i++) {
            printWhichPlayer(currentPlayer);                
            do {

                printLineBreak(10,'/');
                
                // print prompt for user to press enter to roll the dice
                System.out.println("****** press enter to roll dice ******");
                
                // get the user input (enter) from scanner
                userStringInput = kb.nextLine();
                printLineBreak(10,'/');    

                // roll the dice by calling the rollDice method and assign 
                // returned value to diRoll
                diRoll = rollDice();
                
                // get current location from thePlayer object
                currentLocation = thePlayer[currentPlayer].getLocation();
                
                // call determineNewLocation passing in diRoll, currrentLocaiton and the squareBounds
                // assign returned value to new Location 
                newLocation = determineNewLocation(diRoll, currentLocation, squareBounds);
                
                // set the new location in thePlayer object for current player
                thePlayer[currentPlayer].setLocation(newLocation);
                
                // get the current location from thePlayer object for the current player
                currentLocation = thePlayer[currentPlayer].getLocation();
                
                // get the Rent for the square object from the currentLocation
                rentForLocation = square[currentLocation].getRent();

                // check if the square has rent
                squareHasRent = checkIfSquareHasRent(rentForLocation);
                currentBalance = thePlayer[currentPlayer].getBalance();

                // get the name of the player
                currentName = thePlayer[currentPlayer].getName();

                // get the name of the player's token
                currentToken = thePlayer[currentPlayer].getToken();             

                //get the name of the square the player is now on
                currentSquare = square[currentLocation].getName();

                // print Player's name, token and square by calling printNameTokenSquareDice method
                printNameTokenSquareDice(currentName, currentToken, currentSquare, diRoll);

                if (squareHasRent == true) { // check if the square player is on has rent

                    // print the amount of the rent on the current square
                    System.out.println("The rent on this sqaure is: " + rentForLocation);
                    
                    // charge the player rent by calling chargeRent
                    newBalance = chargeRent(currentBalance, rentForLocation);
                    
                    // set the balance for the currentPlayer in thePlayer object
                    thePlayer[currentPlayer].setBalance(newBalance);
                    currentBalance = thePlayer[currentPlayer].getBalance();

                    // print the player's new bank balance                
                    System.out.println("Your new balance is: " + currentBalance);
                    printLineBreak(71,'#');

                } else { // this covers what happens if the square does not have rent
                    currentBalance = thePlayer[currentPlayer].getBalance();
                    
                    // print message to user that there is no rent on the square
                    // print the player's current balance
                    System.out.println("There is no rent for this square.\nYour current balance is: " + currentBalance);
                    printLineBreak(71,'#');
                }
                
                
            } while (currentBalance > 0); // player keeps going until his/her balance is zero

            currentPlayer++; // move on to the next player

        } // end for loop; 

    } // end main()
    //***********************************************************************

////////////////////////////////////////////////////////////////////////////////     
// this method prints which player we are currently on
////////////////////////////////////////////////////////////////////////////////        
    public static void printWhichPlayer(int currentP) {

        currentP = currentP + 1;

        System.out.println("PLAYER " + currentP);
        printLineBreak(10, '-');

    }
////////////////////////////////////////////////////////////////////////////////        

////////////////////////////////////////////////////////////////////////////////    
// this method formats a line break with a width equal to the int passed into
// using the string passed in 
////////////////////////////////////////////////////////////////////////////////
    public static void printLineBreak(int width, char c) {

        for (int i = 1; i < width; i++) {   // print the char c until you've reached the desired width
            System.out.print(c);
        }
        System.out.print("\n");

    }
////////////////////////////////////////////////////////////////////////////////  

////////////////////////////////////////////////////////////////////////////////        
// this prompts the user for his/her name
////////////////////////////////////////////////////////////////////////////////        
    public static void promptUserForName() {

        System.out.println("Please enter your name: ");

    }
////////////////////////////////////////////////////////////////////////////////    

////////////////////////////////////////////////////////////////////////////////    
// this method prints the token choice options
////////////////////////////////////////////////////////////////////////////////        
    public static void promptUserForTokenChoice() {

        System.out.println("choose your token. Here are your choices:\n\nWheelbarrow\n"
                + "Battleship\n"
                + "Racecar\n"
                + "Thimble\n"
                + "Old-style shoe (or boot)\n"
                + "Scottie dog\n"
                + "Top hat\n"
                + "Cat\n\n"
                + "Please enter your choice: ");

    }
////////////////////////////////////////////////////////////////////////////////        

////////////////////////////////////////////////////////////////////////////////        
//this method loads the BoardSquare array from a data file
////////////////////////////////////////////////////////////////////////////////        
    public static void loadArray(BoardSquare[] square) throws Exception {
        int i; // a loop counter

        // declare temporary variables to hold BoardSquare properties read from a file
        String inName;
        String inType;
        int inPrice;
        int inRent;
        String inColor;

        // Create a File class object linked to the name of the file to be read
        java.io.File squareFile = new java.io.File("squares.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(squareFile);

        /* This loop reads data into the square array.
         * Each item of data is a separate line in the file.
         * There are 40 sets of data for the 40 squares.
         */
        for (i = 0; i < 40; i++) {
            // read data from the file into temporary variables
            // read Strings directly; parse integers
            inName = infile.nextLine();
            inType = infile.nextLine();
            inPrice = Integer.parseInt(infile.nextLine());
            inRent = Integer.parseInt(infile.nextLine());;
            inColor = infile.nextLine();

            // intialze each square with the BoardSquare constructor
            square[i] = new BoardSquare(inName, inType, inPrice, inRent, inColor);
        } // end for
        infile.close();

    } // endLoadArray
    //***********************************************************************

////////////////////////////////////////////////////////////////////////////////    
// this method initiates player object 
////////////////////////////////////////////////////////////////////////////////    
    public static void initiatePlayerObject(Player[] thePlayer, int number) {

        for (int i = 0; i < number; i++) {
            thePlayer[i] = new Player();
        }

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// this method rolls the dice 
////////////////////////////////////////////////////////////////////////////////    
    public static int rollDice() {

        int firstDi, secondDi, total; // there are two dice with random number values

        // generates random number between 1 and 6
        firstDi = 1 + (int) (Math.random() * 6);

        // generates random number between 1 and 6
        secondDi = 1 + (int) (Math.random() * 6);

        return total = firstDi + secondDi; // totals the two random numbers

    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// method to determine where the player lands on the board after the dice roll
////////////////////////////////////////////////////////////////////////////////    
    public static int determineNewLocation(int diceRoll, int currentLocation, int squareBounds) {

        
        int movingPlayer = 0; // this keeps track of where the player is moving
        int newLocation; // this is the player's new location 
        
        // movingPlayer determines where the player lands after diceRoll
        movingPlayer = diceRoll + currentLocation;

        // if movingPlayer value is >= 40, then he/she is at the very end of the board 
        // or at the first square on the board
        if (movingPlayer >= squareBounds) { 

            
            newLocation = movingPlayer - squareBounds;
            
        } else { // if the player's move value is not larger than the number of board 
                 // squares then just set the player's location to the location 

            newLocation = movingPlayer;

        }

        return newLocation;
    }
////////////////////////////////////////////////////////////////////////////////    

////////////////////////////////////////////////////////////////////////////////    
// method to print current player's current name token and square 
////////////////////////////////////////////////////////////////////////////////    
    public static void printNameTokenSquareDice(String cName, String cToken, String cSquare, int dice) {
        
        printLineBreak(71,'#');
        System.out.println("PLAYER: " + cName + " || TOKEN: " + cToken);
        
        System.out.println(cName + " has landed on square: " + cSquare);
        
    }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// method to deduct rent
// this method checks the player's balance, deducts the rent amount for the
// board square the player landed on. It also checks if the rent amount is less 
// than the player's balance, if so, it sets the player's balance to zero
////////////////////////////////////////////////////////////////////////////////    
    public static int chargeRent(int balance, int rentAmount) {

        int newBalance = 0;

        if (rentAmount > balance) {
            return newBalance = 0; // automatically zeros out player balance if there are not enough funds in the account
        } else {
            return newBalance = balance - rentAmount;
        }

    }    // end chargeRent method 
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////    
// method to check if the square has a value for rent
////////////////////////////////////////////////////////////////////////////////    
    public static boolean checkIfSquareHasRent(int rentValue) {

        boolean hasRent = false;
        // this method will return a boolean value 

        if (rentValue > 0) {
            hasRent = true;
        } else {
            hasRent = false;
        }

        return hasRent;

    } // end checkIfSquareHasRent
////////////////////////////////////////////////////////////////////////////////    

// end methods in class Monopoly 
//*************************************************************************** 
} // end class Monopoly
//***************************************************************************


/* code for a class of Monopoly squares
 * 
 * CSCI 111 Fall 2013 
 * last edited November 2, 2013 by C. Herbert
 * Each object in this class is a square for the board game Monopoly.
 * 
 * This is for teaching purposes only. 
 * Monopoly and the names and images in the game are 
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */
class BoardSquare {

    // BoardSquare fields
    private String name;    // the name of the square
    private String type;    // property, railroad, utility, plain, tax, or  toJail 
    private int price;      // cost to buy the square; zero means not for sale
    private int rent;       // rent paid by a player who lands on the square 
    private String color;   // many are null; this is not the Java Color class

    // constructor methods ****************************************************
    public BoardSquare() {
        name = "";
        type = "";
        price = 0;
        rent = 0;
        color = "";
    } // end Square()

    public BoardSquare(String name, String type, int price, int rent, String color) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rent = rent;
        this.color = color;
    } // end Square((String name, String type, int price, int rent, String color)

    // accesors for each property *********************************************
    public String getName() {
        return name;
    } //end  getName()

    public String getType() {
        return type;
    } //end  getType()

    public int getPrice() {
        return price;
    } //end  getPrice()

    public int getRent() {
        return rent;
    } //end  getRent()

    public String getColor() {
        return color;
    } //end  getColor()

    // a method to return the BoardSquare's data as a String
    public String toString() {
        String info;
        info = (name + ",  " + type + ", " + price + ",  " + rent + ",  " + color);
        return info;
    } //end  toString()

} // end class BoardSquare
//***************************************************************************


/* code for a class of Monopoly players
 * 
 * CSCI 111 Fall 2013 
 * last edited November 2, 2013 by C. Herbert
 * Each object in this class is a player for the board game Monopoly.
 * 
 * This is for teaching purposes only. 
 * Monopoly and the names and images in the game are 
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */
class Player {

    private String name; // name of the player
    private String token; // token type racecar, wheelbarrow, battleship, top hat
    private int location; // the number of the square the player is on 
    private int balance; // player's balance (initialized to 1500)

// constructor methods  *********************************************
    public Player() {

        name = "No name";
        token = "no token selected";
        location = 0;
        balance = 1500;

    }

    public Player(String name, String token, int location, int balance) {

        this.name = name;
        this.token = token;
        this.location = location;
        this.balance = balance;

    }

// accesors for each property *********************************************
    public String getName() {
        return name;
    }

    public String getToken() {

        return token;

    }

    public int getLocation() {

        return location;

    }

    public int getBalance() {

        return balance;

    }

// mutators for each property *********************************************
    public void setName(String name) {

        this.name = name;

    }

    public void setToken(String token) {

        this.token = token;
    }

    public void setLocation(int location) {

        this.location = location;

    }

    public void setBalance(int balance) {

        this.balance = balance;

    }

    public String toString() {

        return ("Player Name: " + name
                + "  ||  Token: " + token
                + "  ||  Location: " + location
                + "  ||  Balance:  " + balance);

    }

} // end class Player
//***************************************************************************

