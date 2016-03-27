/* Monopoly.java
 * 
 * CSCI 111 Spring 2016
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
        
        final int squareBounds = 40; 
        final int numPlayers = 6; // set max number of players
        int currentPlayer = 0; // placeholder for current player
        int i; // a loop counter
        int diRoll; // current roll of the dice
        int currentLocation; // value to hold player's current location
        int newLocation; // value to hold player's location after he/she moves away from currentLocation the number of dice values. 
        int currentBalance; // current player's money balance
        int rentForLocation; // the rent in the BoardSquare where the player lands after moving on the board
        int newBalance; // holds the value for the player's new balance after rent deducted. 
        
        boolean squareHasRent = false; // holds value for whether the square the player is on has rent; 
        
        // Create array of 40 monopoly squares
        BoardSquare[] square = new BoardSquare[squareBounds];
        
       
        // Call the method to load the array
        loadArray(square);

        // Test the code by printing the data for each square
//        System.out.println("Data from the array of Monopoly board squares. ");
//        System.out.println("Each line has the following information:\n");
//        System.out.println("NAME OF SQUARE,  TYPE,  RENT,  PRICE,  COLOR\n");
        
        for (i = 0; i < squareBounds; i++) {
            System.out.println(i+ ": " + square[i].toString());
        }

      
        
        // create array of 6 players (for scalability when we add full features)
        
        
        // STEP 1: declare the object array 
        Player[] thePlayer = new Player[numPlayers];
        
        // STEP 2: initiate player object 
        initiatePlayerObject(thePlayer, numPlayers);
        
        
        for(int j = 0; j < 100; j++){
            
            System.out.println("+++++++++ MOVE #: " + j + " +++++++++++"); 

        diRoll = rollDice();
        

        System.out.println(thePlayer[currentPlayer].toString());
        
        currentLocation = thePlayer[currentPlayer].getLocation();
        newLocation = determineNewLocation(diRoll, currentLocation, squareBounds);
        thePlayer[currentPlayer].setLocation(newLocation);
        currentLocation = thePlayer[currentPlayer].getLocation();
        rentForLocation = square[currentLocation].getRent(); 
        
        
        // check if the square has rent
       squareHasRent = checkIfSquareHasRent(rentForLocation);
       currentBalance = thePlayer[currentPlayer].getBalance(); 
        
        
       if (squareHasRent == true){
     
        
        newBalance = chargeRent(currentBalance, rentForLocation);
        
       }
        
            //System.out.println("The rent on this sqaure is: " + rentForLocation);
        
        // console outputs
        System.out.println(thePlayer[currentPlayer].toString());
        System.out.println("The player's current location is: " + currentLocation);
        System.out.println("This means it is on square: " + square[currentLocation].toString());

        }  
        
    } // end main()
    //***********************************************************************

    // method to load the BoardSquare array from a data file
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

// method to initatiate player object 
public static void initiatePlayerObject(Player[] thePlayer, int number){

     for(int i = 0; i< number; i++){
        thePlayer[i] = new Player();
        }

}

// method to roll dice 
    public static int rollDice() {

        int firstDi, secondDi, total; // there are two dice with random number values

        // generates random number between 1 and 6
        firstDi = 1 + (int) (Math.random() * 6);
        System.out.println(firstDi);

        // generates random number between 1 and 6
        secondDi = 1 + (int) (Math.random() * 6);

        return total = firstDi + secondDi; // totals the two random numbers

    }

// method to determines where the player lands on the board after the dice roll
    public static int determineNewLocation(int diceRoll, int currentLocation, int squareBounds) {
      
       //squareBounds = squareBounds; // accounts for zero as a position on the board
        
       int movingPlayer = 0; // this keeps track of where the player is moving
       int newLocation; // this is the player's new location 
       
       movingPlayer = diceRoll + currentLocation; 
       
       
       
       if(movingPlayer >= squareBounds) {
       
           newLocation = movingPlayer - squareBounds; 
           System.out.println("NewLocation (in if statment): " + newLocation); 
          
       
       // will this go on git? 
       }
       
       else {
       
           newLocation = movingPlayer; 
           System.out.println("NewLocation (not out of bounds else statement): " + newLocation); 
       
       }
        
        
       
      
        return newLocation; 
    }


// method to deduct rent
    
    
    
// this method checks the player's balance, deducts the rent amount for the
// board square the player landed on. It also check
 public static int chargeRent(int balance, int rentAmount) {
 
     int newBalance = 0; 
        
     if (rentAmount > balance)
         return newBalance = 0; // automatically zeros out player balance if there are not enough funds in the account
     else 
         return newBalance = balance - rentAmount; 
 
 }    // end chargeRent method 
 
 
 public static boolean checkIfSquareHasRent (int rentValue) {
 
 
     boolean hasRent = false; 
 // this method will return a boolean value 
 
 if (rentValue > 0)
         hasRent = true; 
 
 else 
     hasRent = false; 
 
 return hasRent; 
     
 
 } // end checkIfSquareHasRent

 
 

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

