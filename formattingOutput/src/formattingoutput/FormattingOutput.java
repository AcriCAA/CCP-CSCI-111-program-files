/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formattingoutput;

/**
 *
 * @author AcriCAA
 */
public class FormattingOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int hours = 40; 
        
        System.out.printf("I worked %d hours.\n", hours);
        
        
        double grossPay = 3343434349.44923; 
        System.out.printf("The value is %,.2f\n", grossPay); // uses commas
    
        int x; 
        // generates random number between 1 and 10 
        x = 1 + (int)(Math.random() * 10);
        System.out.println(x); 
        double y; 
        y = 1+ (Math.random()*10);
        System.out.println(y); 
        
        double f = 5.5555; 
        f = (int)f; 
        System.out.println(f); 
    
    }
    
}
