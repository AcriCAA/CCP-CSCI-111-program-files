/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AcriCAA
 */
public class ObjectsClasses {

    /**
     * @param args the command line arguments
     */
    
    // when working with multiple classes only one class can contain your main method
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //objects are instances of a class
        
        Scanner keyboard = new Scanner(System.in);
                           //this expression creates a Scanner object in memory
        
        PrintWriter outputFile = new PrintWriter("numbers.txt");
        
        
        Rectangle box = new Rectangle();
        Rectangle box1 = new Rectangle(10,3);
       
        double box1length = box1.getLength();
        double boxlength = box.getLength();
        
        System.out.println("The length of box1 is: " + box1length); 
        System.out.println("The length of box is: " + boxlength); 


// object arrays require 2 steps 


// STEP 1: declare the object array 
        Rectangle[] rooms = new Rectangle[10];

// STEP 2: intiate the object to load constructors        
        for(int i = 0; i< 10; i++){
        rooms[i] = new Rectangle();
        
        }
        
      rooms[1] = new Rectangle(10,10);
      

        
// IF YOU WANT TO PRINT THE CONTENTS OF AN OBJECT ARRAY, YOU NEED A TOSTRING METHOD
         for(int i = 0; i< 10; i++){
        System.out.println("Rooms at 0 is: " + rooms[i].toString()); 
        
        }

        
     
        
//        double currentLength = 0.0; 
//        int i = 0; 
//      while(i < rooms.length){
//            currentLength = rooms[i].getLength(); 
//            System.out.println("Length of rooms #" + i + "is: " + currentLength);
//            i++;    
//        }
        
        
    } // close main 
    
    
} // close Objects Class



