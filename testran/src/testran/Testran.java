/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 11, 2016
 * Description: Lab 4B
 * This program:
 * - prints 50 random double numbers in 10 rows of 5
 *
 */
package testran;

public class Testran {

    // This method prints 50 random double numbers in 10 rows of 5 
    public static void main(String[] args) 
    {
        double number;       // the number to be printed
        int row;          // the row number
        int col;          // the column number
        
        for( row=1; row<=10; row++)      // outer loop for rows
        {
            for( col=1; col<=5; col++) // inner loop for columns
            {
                number = 1.0 + (Math.random() * 30.0); // random numbers
                System.out.printf("%7.2f", number);      // formatted output
                
            } // end inner loop for col
            System.out.println();
            
        } // end outer loop for row
    
    } // end main()

} // end class Testran
