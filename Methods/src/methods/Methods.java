/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author AcriCAA
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        displayMessage();
        
        double degreesCelsius = 20;
        double degree = convertTemp(degreesCelsius);
        
        System.out.println(degree); 
        
    } // end main
    
    
    public static void displayMessage ()
    {
    
        System.out.println("Hello");
    }
    
    
    public static double convertTemp(double degreesCelsius) {
//  ^ modfier     ^ return type  ^ name  ^ what is passed in
         
        double degreesFahrenheit = 0.0; 
        // multiplier for Celsius
        double celsiusMultiplier = 9.0 / 5.0;

        // degree normalizer to add remaining degrees to temp conversion
        double degreeNormalizer = 32;
            
         for (int i = 0; i <= 20; i++) {

            //converts the user provided the temperature in Celsius to Fahrenheit  
            degreesFahrenheit = (celsiusMultiplier * degreesCelsius)
                    + degreeNormalizer;
            System.out.printf("%2.1f%10.1f%n", degreesCelsius, degreesFahrenheit);
            degreesCelsius++; //increase degreeCelsius by 1 for next iteration of loop. 
        }

        return degreesFahrenheit; 
    
    
    }
    
    ////////////////////////////////////////////////////////////////////////////////
//This method prints an int array and numbers the items
////////////////////////////////////////////////////////////////////////////////    
    public static void printArrayNumbered (int[] t, int count) throws Exception {
        // System.out.println("Ran printArray");
        int i = 1;
        while (i < count) {

            System.out.println(i + ".) " + t[i]);
            
            i++;
        }
    }
////////////////////////////////////////////////////////////////////////////////   
    
    
}
