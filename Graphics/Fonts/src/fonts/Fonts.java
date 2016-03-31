/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonts;

import java.awt.Font;

/**
 *
 * @author AcriCAA
 */
public class Fonts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           myButton.setFont(Font appearance)
        
        // font constructor
        //Font(String fontName, int style, int size)
        // create FONT instances
       Font title = new Font("Georgia", Font.BOLD, 24);
       Font regular = new Font("Arial", Font.BOLD, 14);
       
       // Apply title font appearance to components
       
       myLabel.setFont(title);
       myButton1.setFont(regular);
       myButton2.setFont(regular);
       
       // java has physical fonts and logical fonts, which are specified by 
       // java runtime environment. So they might vary depending on the system
       // you are using 
       
       Dialog, DialogInput,Monospaced,SansSerif, and Serif // logical fonts
       
       // there are three FONT styles 
       Font.PLAIN, Font.BOLD, Font.ITALIC
       
               
      
        
        
    }
    
}
