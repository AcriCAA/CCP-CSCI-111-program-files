/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinations;

/**
 *
 * @author AcriCAA
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int position1 = 1; 
    int position2 = 1; 
    int position3 = 1;
    int position4 = 1; 
    int position =1; 

        for(double i=1;i<=1296;i++){
            
            
           if (position <= 6) {
           
           
           
           
           
           
           }
           
           else {
           
               position = ResetPosition(position);
           
           }
           
           
            
            
            
             
          
            
            
        
        }
            
            
        
        

    }
    
    
    public static void PrintDigits1to6 () {
    
        for(int i=1; i<=6;i++) {
        System.out.print(i);
        i++;
        }
        
       
        

    }
    
    public static void printNumber (int number){
    
        System.out.print(number);
        
    }
    
    
    public static int ChangePosition (int position){
    
            position++;
            return position; 
    
    }
    
    public static int IncrementNumber (int number){
    
        number++;
        return number;
    
    }
    
    public static int ResetPosition(int position) {
    
        position = 1; 
        
        return position; 
    
    }
    
}
