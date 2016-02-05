/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 2, 2016
 * Description: Lab 3A
 * This program:
 * - calculates user's Body Mass Index
 *
 */
package bmicalculator;

import java.util.*;

public class BmiCalculator {

    public static void main(String[] args) {
    
// Body Mass Index calculator

double height; // person’s height in inches

double weight; // person’s weight in pounds

double bmi; // person’s calculated body mass index 

String category; // the BMI category

// set up scanner for input from the keyboard
Scanner kb = new Scanner(System.in);
 
//print opening message
System.out.println("Hi!\n\nThis program will calculate your body mass index.\n"
        + "Body Mass Index (BMI) is a number calculated from a person's \n"
        + "weight and height. BMI is an inexpensive and \n"
        + "easy-to-perform method of screening for \n"
        + "weight categories that may lead to health problems.");
 
//get person’s height get person’s weight
System.out.println("\n\nPlease tell me your your height in inches:");
height = kb.nextDouble(); 

System.out.println("\n\nPlease tell me your your weight:");
weight = kb.nextDouble();  

// calculate BMI using CDC formula: bmi = wt / (ht * ht) * 703 
bmi = (weight / ( height * height )) * 703;
 
// determine BMI category 

if(bmi < 18.5)
      category = "underweight";
else if (bmi < 25.0)
       category = "normal";
else if (bmi < 30.0)
       category = "overweight";
else 
        category = "obese";

 //print result 
 System.out.println("your BMI is " + bmi + "\n\nbased on "
         + "your height and weight is:\n" + "-->" + category + "<--");    
                 
kb.close(); 
    }
    
}
