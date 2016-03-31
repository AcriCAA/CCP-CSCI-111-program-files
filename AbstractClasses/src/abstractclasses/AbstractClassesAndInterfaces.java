/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author AcriCAA
 */
public class AbstractClassesAndInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
}// close class AbstractClasses

// defining abstract classes
// AccessSpecifier(i.e. public/private) abstract ReturnType MethodName(ParameterList);  <-- end with semicolon because you won't have a body


//defining interfaces
public interface Clock { // you must use the keyword interface

//body has abstract method headers for interface. Assumed as abstract so don't need "abstract"
    public void SetHour(int hour);

}

public class Timer implements Clock { // keyword implements 
// body of Timer class definition

}
