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

import java.util.*; // import java util 

public class WorldCityTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    // declare variables
        // city name
        String cityName;

        // temperature in Celsius input from user
        double tempCelsius;
        
        // temperature in Fahrenheit
        double tempFahrenheit;
        
        // multiplier for Celsius
        double celsiusMultiplier = 9/5;
        System.out.println(celsiusMultiplier);
        
        // degree normalizer to add remainging degrees to temp conversion
        double degreeNormalizer;

        

        // declare an instance of Scanner to read the data stream from the keyboard.
        Scanner kb = new Scanner(System.in);

        // retrieve city name from user 
        System.out.println("Hello, please enter your city: ");
        cityName = kb.nextLine();
        
        

    }

}
