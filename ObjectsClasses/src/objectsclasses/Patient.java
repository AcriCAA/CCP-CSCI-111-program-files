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
public class Patient { // if not designated as public, it's private by defaut 
    
       private String uniqueId;
       private String firstName;
       private String lastName;
       private double height;
       private double weight;
       private String dateOfBirth; 
       private String gender;
       private String homeAddress; 
       
       // static does not appear in the method header designed to work as an instance of a class
       
       // constructor class with no values
       public Patient(){
       
       uniqueId = "No record";
       firstName = "No record";
       lastName = "No record";
       height = 0.0;
       weight = 0.0; 
       dateOfBirth = "No record"; 
       gender = "No record";
       homeAddress = "No record";
       
       }
       
       public Patient (String id, String fName, String lName, double h, double w,
               String dob, String gen, String address){
       
       uniqueId = id;
       firstName = fName;
       lastName = lName; 
       height = h; 
       weight = w; 
       dateOfBirth = dob;
       gender = gen;
       homeAddress = address; 
        
       
       }
       
//       public void patientPrintFields(){
//       
//           System.out.println("These are the patient fields:\n"
//                   + "Unique Id\n"
//                   + "First Name"
//                   + "Last Name"
//                   + "Height"
//                   + "Weight"
//                   + "Date of Birth (mm/dd/yyyy)"
//                   + "gender"
//                   + "Home address");
//                  
//       
//       }
       
       public void setUniqueId (String id) {
       
           uniqueId = id;
       
       }
       
       public void setFirstName (String fName) {
           
           firstName = fName;
       
       }
       
       public void setLastName (String lName){
       
       
       lastName = lName; 
        
       }
       
       public void setHeight (double h){
       height = h; 
       
       }
       
       public void setWeight (double w){
        weight = w; 
       }
       
       public void setDateOfBirth(String dob){
       
       
       dateOfBirth = dob;
       }
       
       public void setGender(String gen){
       gender = gen;
       }
       
       public void setHomeAddress(String address){
       homeAddress = address; 
       }
       
       public String getUniqueId () {
       
           return uniqueId; 
       
       }
       
       public String getFirstName () {
           
           return firstName;
       
       }
       
       public String getLastName (){
       
       
       return lastName; 
        
       }
       
       public double getHeight (){
       
           return height; 
       
       }
       
       public double getWeight (){
        return weight; 
       }
       
       public String getDateOfBirth(){
       
       
       return dateOfBirth;
       }
       
       public String getGender(){
       return gender;
       }
       
       public String getHomeAddress(){
       return homeAddress; 
       }
       
       
       
    
}
