/*  CSCI 111 - Spring 2016
 * Bubble Sort Example
 *
 * This program performs a bubble sort of a String array with
 * the names of cities that have NFL teams
 *
 * It also demonstrates modular development and passing an array as a parameter
 *
 */

package bubblesort;

public class BubbleSort 
{

    public static void main(String[] args) 
    {
        //  an array holding the names of cities with NFL teams.       
        String[] NFLcities = {"Buffalo", "Miami", "Boston", "New York", "Baltimore",
            "Cincinnati", "Cleveland", "Pittsburgh", "Houston", "Indianapolis", 
            "Jacksonville", "Tennessee", "Denver", "Kansas City", "Oakland", 
            "San Diego", "Dallas", "New York", "Philadelphia", "Washington", "Chicago", 
            "Detroit", "Green Bay", "Minnesota", "Atlanta", "Charlotte", "New Orleans", 
            "Tampa", "Arizona", "St. Louis", "San Francisco", "Seattle"};
 
        // call a method to print the list of cities before sorting
        printCities(NFLcities);
        
        // call a method to sort the array of cities
        sortCities(NFLcities);
        
        // call a method to print the list of cities after printing
        printCities(NFLcities);
        
        
    } // end main()
/****************************************************************************/


// This method prints the values in the passed string array
public static void printCities(String[] array)
{
  
    for (int i=0; i <array.length; i++)
        System.out.print(array[i] + " | ");
    
    System.out.println();   // go to a new line line after printng th list

} // end printcities()
/****************************************************************************/


// This method sorts values in the passed string array
public static void sortCities(String[] array)
{
    boolean swapped;    // a boolean variable to keep track of when array values are swapped 
    String temp;        // a catalyst variable for swapping values of variables
    
    do     //the outer post-test loop will  repeat another pass through the list when swapped in true
{ 
     swapped = false;   	
     for(int i=0; i < (array.length - 1) ; i++)    // a pass through the array to the second to last element
     {
	if ( array[i+1].compareTo(array[i]) < 0 )  // if the two items are out of order
 	{
            // Swap the two items and set swapped to true 
            temp = array[i];   
            array[i] = array[i+1];
            array[i+1] = temp;
            swapped = true;
	}  // end if

     } // end for

} while (swapped);	// the outer loop will repeat if swapped is true – another pass

}// end sortCities()
/****************************************************************************/


} // end class
