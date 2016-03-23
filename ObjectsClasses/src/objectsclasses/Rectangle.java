/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

/**
 *
 * @author AcriCAA
 */
public class Rectangle {
    
   
       private double length; 
       private double width; // private so only accessible to class 
       
       // static does not appear in the method header designed to work as an instance of a class
       
       public Rectangle(){
       
       length = 1.0; 
       width = 1.0; 
       
       }
       
       public Rectangle (double len, double w){
       
       length = len; 
       width = w; 
       
       }
       
       public void setLength (double len) {
       
           length = len;
       
       
       }
       
       public void setWidth (double wid) {
       
           width = wid; 
       
       }
       
       public double getLength(){
           
           return length; 
       
       }
       
       public double getWidth(){
       
           return width; 
       
       }
       
       public double getArea(){
       
           return length * width; 
       
       }
       
        public String toString() {
        return ("Length: " + length + "  ||  Width: " + width);
    } // end to String()
       
       

    
}
