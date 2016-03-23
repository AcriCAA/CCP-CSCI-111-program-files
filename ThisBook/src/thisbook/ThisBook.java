/*
 * ThisBook.java 
 * CSCI 111 Spring 2016 
 * This program shows an example of a simple book class in Java
 *
 */
package thisbook;

import java.util.*;

public class ThisBook 
{
    public static void main(String[] args) 
    {
        //Create new instances of the Book class
        Book bookA = new Book("978-0618260300", "The Hobbit");
        Book bookB = new Book("978-1400033416", "Beloved");
        Book bookC = new Book("978-0316769174", "The Catcher in the Rye");
        
        System.out.println("List of three good books:");
        System.out.println(bookA.toString());
        System.out.println(bookB.toString()); 
        System.out.println(bookC.toString());
        
        

    } //end main()

} // end class ThisBook


class Book
{
    // declare properties **********************************

    private String isbn;
    private String title;
    private String subject;
    private double price;


    // constructor methods **********************************
    public Book() {
    } // end Book()

//    public Book(String number, String name) {
//        isbn = number;
//        title = name;
//    } // end Book(String number, String name)
    
//    public Book(String isbn, String title){
//    
//        isbn = isbn;  // you can't do this because it is assigning to itself
//        title = title; 
//    
//    }

    
    // if you want to use the same naming convention to refer to your
    // local variable and instance variables
        public Book(String isbn, String title){
    
        this.isbn = isbn; // this refers to your instance variable
        this.title = title; 
    
    }

    
    
    // accessor (getter) methods ****************************
    public String getTitle() {
        return title;
    } // end getTtitle()

    public String getISBN() {
        return isbn;
    } // end getISBN()

    public String getSubject() {
        return subject;
    } // end getsubject()

    public double setPrice() {
        return price;
    } // end setPrice()

    // mutator (setter) methods ******************************
    public void setTitle(String name) {
        title = name;
    } // end setTtitle()

    public void setISBN(String number) {
        isbn = number;
    } // end setISBN()

    public void setSubject(String sub) {
        subject = sub;
    } // end setsubject()

    public void setPrice(double value) {
        price = value;
    } // end setPrice()

    
    // a custom toString method is necessary to print the contents of an object
    // method to return information about the book as a String
    public String toString() {
        return ("Title: " + title + "  ||  ISBN: " + isbn);
    } // end to String()

} // end class Book