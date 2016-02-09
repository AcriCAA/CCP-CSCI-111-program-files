/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 9, 2016
 * Description: Lab 3A
 * This program asks the user to enter a student’s
 * (1) name and
 * (2) GPA
 * (3) then determines and displays the following information:
 *      the student’s name
 *      Graduation status
 *      Honor level (if applicable).
 *
 */
package graduationstatus;

import java.util.*; //importing all java util for Scanner class

public class GraduationStatus {

    public static void main(String[] args) {

        String name; // string to store student's name. 
        double gpa; // variable to store student GPA 

        final double maxGPA = 4.0; //setting maximum GPA allowed
        final double eligible = 2.0; // setting constant for eligibility gpa
        final double summaCumLaude = 3.8; // setting constant for summa cum laude
        final double magnaCumLaude = 3.6; // setting constant for magna cum laude
        final double cumLaude = 3.2; // setting constant for cum laude

// set up scanner for input from the keyboard
        Scanner kb = new Scanner(System.in);

//print greeting message
        System.out.println("Hi!\n\nThis program will determine your graduation status.");

//get student’s name as string value
        System.out.print("\n\nPlease tell me your name:  ");
        name = kb.nextLine();

// get student's GPA value and check that it is a number. 
        System.out.println("\n\nHi " + name + ", please tell me your GPA:");

        do {
            try {
                String s = kb.nextLine();
                gpa = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Please try again, entering only a number:");
            }
        } while (true);

        System.out.print("\nYou entered: " + gpa + ".");

// get new GPA value and check that GPA entered is not higher than maximum GPA of 4.0 allowed
        while (gpa > maxGPA) {

            System.out.println(" 4.0 is the highest GPA allowed. Please enter a GPA of "
                    + "4.0 or lower:");

            do {
                try {
                    String s1 = kb.nextLine();
                    gpa = Double.parseDouble(s1);
                    break;
                } catch (Exception e) {
                    System.out.println("Please try again, entering only a number:");
                }
            } while (true);

        }

        System.out.println("\nThank you for entering your GPA of " + gpa + ".\n\n");

// determine graduation status 
        if (gpa >= eligible) { // first check whether student is eligible for graduation

            if (gpa >= summaCumLaude) { // check if student is eligible for Summa Cum Laude Honors
                  // print that student is eligible to graduate Summa Cum Laude
                System.out.println("Congratulations, you are eligible to graduate with"
                        + " the honors of Summa Cum Laude.");

            } // check if student is eligible for Magna Cum Laude Honors 
            // but also double-check that GPA is less than Summa Cum Laude honors
            else if (gpa >= magnaCumLaude && gpa < summaCumLaude) {
                // print that student is eligible to graduate Magna Cum Laude
                System.out.println("Congratulations, you are eligible to graduate with"
                        + "the honors of Magna Cum Laude.");

            } // check if student is eligible for Cum Laude Honors 
            // but also double-check that GPA is less than Magna Cum Laude honors
            else if (gpa >= cumLaude && gpa < magnaCumLaude) {
                // print that student is eligible to graduate Cum Laude
                System.out.println("Congratulations, you are eligible to graduate with"
                        + "the honors of Cum Laude.");

            } else {
                // print that student is eligible to graduate but not for honors
                System.out.println("Congratulations, you are eligible to graduate "
                        + "but are not "
                        + "eligible for honors.");
            }

        } // close eligibility check if statement
        else {
            // print that student is not eligible to graduate
            System.out.print("Sorry, you are not eligible to graduate.");
        }

        kb.close(); // close Scanner; 

    } // close main method 

} // close class
