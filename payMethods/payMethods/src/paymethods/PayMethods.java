package paymethods;
import java.util.Scanner;

/* CSCI 111 Fall 2013
 * Sample program - payroll methods
 * This program has an example of a value returning method and a void method
 * @author Chuck Herbert
 */
public class PayMethods {

    public static  void main(String[] args) {
    String fname;       // employee's first name
    String lname;       // employee's last name
    double hours;       // hours worked in the week
    double rate;        // hourly pay rate
    double gross;       // gross pay  (hours * rate) + overtime
    
    // set up input stream from the keyboard  (see chapter 2, code on pg. 22)
    Scanner keyboard = new Scanner(System.in);   
    
    // get employee's first name
    System.out.print("Please enter the employee's first name: " );  
    fname = keyboard.next();

    // get employee's last name
    System.out.print("Please enter the employee's last name: " );  
    lname = keyboard.next();

    // get employee's hours
    System.out.print("Please enter the hours for " + fname +" " + lname+ ": ");  
    hours = keyboard.nextDouble();

    // get employee's rate
    System.out.print("Please enter the pay rate for " + fname +" " + lname+ ": ");  
    rate  = keyboard.nextDouble();
    
    // call method to calculate gross  
    // this value returing method is used inline
    gross = calculateGross(hours, rate);
    
    // call method to print payroll report
    // this void method is used as if it is a new instruction in Java
    // the actual parameters must match the method's formal parameter list
    payrollReport(fname, lname,  hours, rate, gross );
        
    } // end main()
/*****************************************************************************/
    
    /* this method calculates gross pay, including overtime, using the 
     * time and a half for overtime rule.
     * it has two parameters, 
     *      the hours worked during the week    double hrs
     *      the pay rate                        double rt
     * 
     * it returns the gross pay
     */
    public static double  calculateGross(double hrs, double rt )
    {
        double gr;  // gross pay
        double ot;  // overtime pay
        
        gr = hrs * rt;
        if (hrs > 40)
            ot = (hrs-40) * .5 * rt;    // ot bonus
        else 
            ot = 0;
        
        gr = gr + ot;
        return gr;
       
    } // end calculateGross
/*****************************************************************************/
    
    /* this method prints a payroll report
     * it takes four parameters,
     *      employeee's first name              String fname
     *      employee's last name                String lname
     *      the hours worked during the week    double hrs
     *      the pay rate                        double rate
     */
    
    public static void payrollReport(String fname, String lname,  
            double hrs, double rt, double gross )
    {
    // print the payroll report -- \n starts a newline, \t is a tab
    System.out.printf("%n%-12s%-12s%8s%8s%9s%n", "First name", "Last name", 
            "Hours", "Rate", "Gross");
    
    System.out.printf("%-12s%-12s%8.2f%8.2f%,9.2f%n", fname, lname,  
            hrs,rt, gross);
    
    } // end payrollReport()
    
} // end class
