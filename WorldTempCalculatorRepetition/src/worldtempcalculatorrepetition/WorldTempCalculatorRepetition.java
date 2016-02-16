/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 15, 2016
 * Description: This program:
 * - asks user for the name of a city
 * - asks for the current temp in degrees Celsius
 * - converts the user input in Celsius to Fahrenheit for a 20 degree range
 *   and then prints the results in a column and row format.
 *
 */
package worldtempcalculatorrepetition;

import java.util.Scanner;

public class WorldTempCalculatorRepetition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare variables
        // city name
        String cityName;

        // temperature in Celsius for input from user
        double degreesCelsius;

        //temperature in Fahrenheit after conversion from Celsius
        double degreesFahrenheit;

        // multiplier for Celsius
        double celsiusMultiplier = 9.0 / 5.0;

        // degree normalizer to add remaining degrees to temp conversion
        double degreeNormalizer = 32;

        // declare an instance of Scanner to read the data stream from the keyboard.
        Scanner kb = new Scanner(System.in);

        // get input from user. 
        // retrieve city name from user 
        System.out.println("Hello, please enter your city: ");
        cityName = kb.nextLine();

        // Asks for the current temp in degrees Celsius requiring a number
        System.out.println("\n" + cityName + ", great! \n\nPlease tell me the "
                + "current temperature in " + cityName + " in degrees Celsius: ");

        do {
            try {

                String s = kb.nextLine();
                degreesCelsius = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Please try again, entering only a number:");
            }
        } while (true);

        // print column headers
        System.out.println("\nTemperature conversion for " + cityName + ":\n");
        System.out.printf("%2s%13s%n", "Celsius", "Fahrenheit");

        //loop 20 times calculating Celsius to Fahrenheit
        for (int i = 0; i <= 20; i++) {

            //converts the user provided the temperature in Celsius to Fahrenheit  
            degreesFahrenheit = (celsiusMultiplier * degreesCelsius)
                    + degreeNormalizer;
            System.out.printf("%2.1f%10.1f%n", degreesCelsius, degreesFahrenheit);
            degreesCelsius++; //increase degreeCelsius by 1 for next iteration of loop. 
        }

        // close the input stream
        kb.close();

    } // end main method

} // end WorldCityTemp class
