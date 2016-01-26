/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Jan. 26, 2016
 * Description: calculates weekly pay rate
 * 
 */
package paycalc;

public class PayCalc {

    /**
     * @param args the command line arguments
     */
 
   
    public static void main(String[] args) {
        
        // constants
        final char DOLLARS = '$';     // defining constant for dollar sign
        final double PAYRATE = 15.75; // Hourly payrate as constant       
    
        
        // variable declarations 
        int hours;                    // Number of hours worked
        double weekPay;               // calculated amount of hours and pay
        
        hours = 40;                   // hours variable initialized
        
        // calculate weekly pay based on constant pay rate times hours worked
        weekPay = hours * PAYRATE; 
        
        System.out.println("Your weekly pay will be: " + DOLLARS + weekPay);
        
        
    }
    
}
