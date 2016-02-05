/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiontional.operator;

/**
 *
 * @author AcriCAA
 */
public class CondiontionalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double z; 
        double x = 12;
        double y =10; 
       
        // the conditional operator works like this 
        z = x > y ? 10 : 5; 
        
        // it is the equivalent of this
        if (x>y)
            z = 10;
        else 
            z = 5;
        
        
    }
    
}
