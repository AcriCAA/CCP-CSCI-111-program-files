/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Jan. 28, 2016
 * Description: This program:
 * - asks user for the name of a city
 * - asks for the current temp in degrees Celsius
 * - converts the user input in Celsius to Fahrenheit
 * - prints the results in this format:
 *   "The current temperature in London is 20 0C, which is 68 0F"
 *
 */
package worldcitytemp;

import java.util.*; // import java util libraries
import javax.swing.JOptionPane;

public class WorldCityTemp {

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
                System.out.println(cityName + ", great!\n\nPlease tell me the \n current temperature in " + cityName + " in degrees Celsius:");
                String s = kb.nextLine();
                degreesCelsius = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Please try again, entering only a number:");
            }
        } while (true);

        //converts the user provided the temperature in Celsius to Fahrenheit  
        degreesFahrenheit = (celsiusMultiplier * degreesCelsius)
                + degreeNormalizer;

        // tells user the current temperature in degrees Fahrenheit
        System.out.println("\nThe current temperature in " + cityName + " is "
                + degreesCelsius + "\u00b0" + " C, which is " + degreesFahrenheit
                + "\u00b0" + " F.");

        JOptionPane.showMessageDialog(null, "The current temperature in " + cityName + " is "
                + degreesCelsius + "\u00b0" + " C, which is " + degreesFahrenheit
                + "\u00b0" + " F.");

        // close the input stream
        kb.close();
        System.exit(0);

    } // end main method

}  // end WorldCityTemp class
