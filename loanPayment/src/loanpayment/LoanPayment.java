/* 
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 26, 2016
 * Description of Program: this calculates a monthly loan payment
 *
 *

1)  The main method asks the user for the following three values:  

The loan amount
The annual interest rate as a decimal, e.g. 7.5% is 0.075
The number of months for the term of your loan

2)  Call a first user-defined method to calculate and return the 
monthly interest rate : monthly interest rate = (annual interest rate / 12)

3)  Call a second user-defined method to calculate and return the monthly payment

4)  Call a third user-defined method to print a formatted loan statement showing

Amount borrowed
Annual interest rate
Number of months
Monthly payment

 */
package loanpayment;

import java.util.Scanner;

/**
 *
 * @author AcriCAA
 */
public class LoanPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// declare an instance of Scanner to read the data stream from the keyboard.
        Scanner kb = new Scanner(System.in);

        double loanAmount = 0.0;
        double interestRate = 0.0;
        double months = 0.0;
        double monthlyInterestRate = 0.0;
        double monthlyPayment = 0.0;

// ask user for the the loan amount
        System.out.println("Hello, please enter the loan amount: ");
        loanAmount = getValue(kb);
        //System.out.println(loanAmount);

// ask user for the annual interest rate as a decimal, e.g. 7.5% is 0.075
        System.out.println("Great, now please enter the"
                + " interest rate as a decimal, , e.g. 7.5% is 0.075: ");
        interestRate = getValue(kb);
        //System.out.println(interestRate);

// ask user for the number of months for the term of your loan 
        System.out.println("Got it, now, please enter "
                + "the number of months for the term of your loan: ");
        months = getValue(kb);
        //System.out.println(months);

    // call method to calculate and return monthly interest rate  
        monthlyInterestRate = calculateMonthlyInterestRate(interestRate);
        System.out.println(monthlyInterestRate);
// Call method to calculate and return the monthly payment
        monthlyPayment = calculateMonthlyPayment(monthlyInterestRate,
                loanAmount, months);

// Call method to print a formatted loan statement        
        printStatement(loanAmount, interestRate, months, monthlyPayment);

    } // end main method       

////////////////////////////////////////////////////////////////////////////////    
//This method retrieves a value from the user and checks that it is a number. 
////////////////////////////////////////////////////////////////////////////////
    public static double getValue(Scanner kb) {

        double value;

        do {
            try {

                String s = kb.nextLine();
                value = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Please try again, entering only a number:");
            }
        } while (true);

        return value;
    }

//////////////////////////////////////////////////////////////////////////////// 
//This is A user-defined method to calculate
//and return the monthly interest rate
//monthly interest rate = (annual interest rate / 12) 
////////////////////////////////////////////////////////////////////////////////     
    public static double calculateMonthlyInterestRate(double interestRate) {

        double monthlyInterestRate = interestRate / 12;
        return monthlyInterestRate;

    }
//////////////////////////////////////////////////////////////////////////////// 

////////////////////////////////////////////////////////////////////////////////
//This is a user defined method to calculate the monthly loan payment 
//(monthly interest rate * loan amount )/ 1 - (1+monthly interest rate)^-months
//////////////////////////////////////////////////////////////////////////////// 
    public static double calculateMonthlyPayment(double monthlyInterestRate,
            double loanAmount, double months) {

        double numerator = monthlyInterestRate * loanAmount;
        
        double denominatorPow = Math.pow((1 + monthlyInterestRate), -months);
        
        double denominator = 1 - denominatorPow; 
        
        double monthlyPayment = numerator / denominator;
        
        return monthlyPayment;

    }
////////////////////////////////////////////////////////////////////////////////

    
////////////////////////////////////////////////////////////////////////////////        
// A user-defined method to print a formatted loan statement showing
// Amount borrowed
// Annual interest rate
// Number of months
// Monthly payment        
////////////////////////////////////////////////////////////////////////////////
    public static void printStatement(double loanAmount,
            double interestRate, double months, double monthlyPayment) {

        // print column headers
        System.out.printf("%s%23s%20s%20s%n",
                "Amount Borrowed", "Annual Interest Rate",
                "Length of Loan", "Monthly Payment"
        );

        System.out.printf("%,15.2f%23.4f%20.0f%,20.2f%n",
                loanAmount, interestRate, months, monthlyPayment);

    }
////////////////////////////////////////////////////////////////////////////////


} // end class 

