/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author AcriCAA
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


int[] numbers = new int[100]; // this is a valid declaration 
int moreNumbers[];

int[] codes, scores; // both of these are valid declarations this one is better if you are declaring multiple arrays

for (int i = 0; i < 100; i++)
    numbers[i] = 5;

/*

for (int i = 0; i <= 100; i++) //DONT this would give an out of bounds exception because of the <=
    numbers[i] = 5;
*/


// The Enhanced for loop
/* for (datatype elementVariable : array)
        statement; 
*/ 

int[] test = {3, 6, 9}; 
for (int val : test) {

    System.out.println("The next value" + " is " + val);

}


int[] temperatures = {5,6,7,8,9,10};

for (int i = 0; i < temperatures.length; i++) {

    System.out.println("Temp " + i + ": " + temperatures[i]);
}

int[] firstArray = {5,10,15,20,25};
int[] secondArray = new int[5];

for (int i = 0; i < firstArray.length; i++)
    
{
    secondArray[i] = firstArray[i];
    System.out.println(secondArray[i]);
}

//int [] num = new int[50];
System.out.println("Starting highest comparison:");
int [] num = {24,4,5,10,55,67};
int highest = num[0];
for (int i = 1; i < num.length; i++) {
    System.out.println("At iteration i = " + i + "num[i] = " + num[i]);
if (num[i] > highest)
       highest = num[i];
    System.out.println("Highest value = " + highest);
}
System.out.println("Final:  " + highest);

double grades[] = getGrades();
        System.out.println("Printing Grades");
for(double val : grades)
    System.out.println(val);

double newGrades[] = changeGrades(grades);
        System.out.println("Printing new Grades");
for(double val : newGrades)
    System.out.println(val);

        System.out.println("Printing Grades");
for(double val : grades)
    System.out.println(val);



//chgGrades(grades);
//
//        System.out.println("chgGrades");
//for(double val : grades)
//    System.out.println(val);


// comparing string objects


String a[] = {"Hello", "hello"};

        System.out.println(a[0].matches(a[1]));
   

        System.out.println(a[0].compareTo(a[1]));
        System.out.println(a[0].compareToIgnoreCase(a[1]));
        System.out.println(a[0].equals(a[1]));
                System.out.println(a[0].equalsIgnoreCase(a[1]));

        
        

    } // end main
// Array methods
public static double [] getGrades() // you want to specify the array and the data type in 
{

double[] grades = {3.4,3.5,3.6};
return grades; // you can just return the variable name

}

public static double [] changeGrades(double[] newG) // you want to specify the array and the data type in 
{

    
    for(int i = 0; i < newG.length; i++)
            newG[i]=0.0;
   
for(double val : newG) 
         System.out.println(val);
   

return newG; // you can just return the variable name

}
 
public static void chgGrades(double[] newG) 
{

    
    for(int i = 0; i < newG.length; i++)
            newG[i]=0.0;
   
for(double val : newG) 
         System.out.println(val);
   

}


}
