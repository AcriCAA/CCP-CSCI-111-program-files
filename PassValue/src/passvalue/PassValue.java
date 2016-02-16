/*
   This program demonstrates that only a copy of an argument
   is passed into a method.
*/

package passvalue;


public class PassValue 
{
   public static void main(String[] args)
   {
      int number = 99; // number starts with 99
      
      // Display the value in number.
      System.out.println("number is initially " + number);
      
      // Call changeMe, passing the value in number
      // as an argument.
      changeMe(number);
      
      // Display the value in number again.
      System.out.println("\nBack in the main method, number remains " + number);
   }
   
   /**
      The changeMe method accepts an argument and then
      changes the value of the parameter.
   */
   
   public static void changeMe(int myValue)
   {
      System.out.println("\nI am changing the value.");
      
      // Change the myValue parameter variable to 0.
      myValue += 5;
      
      // Display the value in myValue.
      System.out.println("\nNow the value is "+ myValue +" from the changeMe"+ 
              " method.");
   }
}
