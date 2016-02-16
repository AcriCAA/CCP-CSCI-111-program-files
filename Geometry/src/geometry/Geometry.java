/**
 * @author Corey Acri
 * Course: CSCI 111
 * Date: Feb. 16, 2016
 * Description: Lab 5 - Methods and Geometry calculations
 *
 */
package geometry;

import java.util.Scanner;

public class Geometry {

    // main class
    public static void main(String[] args) {
        int choice;       // The user's choice
        double value = 0; // The method's return value
        char letter;      // The user's Y or N decision
        double radius;    // The radius of the circle
        double length;    // The length of the rectangle
        double width;     // The width of the rectangle
        double height;    // The height of the triangle
        double base;      // The base of the triangle
        double side1;     // The first side of the triangle
        double side2;     // The second side of the triangle
        double side3;     // The third side of the triangle

        // Create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // The do while loop allows the menu to be displayed first
        do {
            // TASK #1 Call the printMenu method
            printMenu();
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of "
                            + "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circleArea method and
                    value = circleArea(radius);

                    // store the result in the value variable
                    System.out.println("The area of the "
                            + "circle is " + value);
                    break;
                case 2:
                    System.out.print("Enter the length of "
                            + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of "
                            + "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the rectangleArea method and
                    // store the result in the value variable
                    value = rectangleArea(length, width);

                    System.out.println("The area of the "
                            + "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the height of "
                            + "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of "
                            + "the triangle: ");
                    base = keyboard.nextDouble();

                    // TASK #3 Call the triangleArea method and
                    // store the result in the value variable
                    value = triangleArea(base, height);
                    System.out.println("The area of the "
                            + "triangle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the radius of "
                            + "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circumference method and
                    // store the result in the value variable
                    value = circleCircumference(radius);

                    System.out.println("The circumference "
                            + "of the circle is "
                            + value);
                    break;
                case 5:
                    System.out.print("Enter the length of "
                            + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of "
                            + "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    value = rectanglePerimeter(length, width);

                    System.out.println("The perimeter of "
                            + "the rectangle is "
                            + value);
                    break;
                case 6:
                    System.out.print("Enter the length of "
                            + "side 1 of the "
                            + "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of "
                            + "side 2 of the "
                            + "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of "
                            + "side 3 of the "
                            + "triangle: ");
                    side3 = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    
                    value = trianglePerimeter(side1, side2, side3);
                    
                    System.out.println("The perimeter of "
                            + "the triangle is "
                            + value);
                    break;
                default:
                    System.out.println("You did not enter "
                            + "a valid choice.");
            }
            keyboard.nextLine(); // Consume the new line

            System.out.println("Do you want to exit "
                    + "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);

        } while (letter != 'Y' && letter != 'y');

    } //end main method

// TASK #1 Create the printMenu method here
    public static void printMenu() {

        System.out.println("This is a geometry calculator"
                + "\nChoose what you would like to calculate"
                + "\n1.  Find the area of a circle"
                + "\n2.  Find the area of a rectangle"
                + "\n3.  Find the area of a triangle"
                + "\n4.  Find the circumference of a circle"
                + "\n5.  Find the perimeter of a rectangle"
                + "\n6.  Find the perimeter of a triangle"
                + "\n\tEnter the number of your choice:");

    }

// TASK #2 Create the value-returning methods here
    public static double circleArea(double r) {
        //     A = π r 2

        double A = Math.PI * (r * r);
        return A;

    }

    public static double rectangleArea(double l, double w) {
    //A = lw

        double A = l * w;
        return A;

    }

    public static double triangleArea(double b, double h) {
    //A = 1⁄2bh

        double A = 0.5 * (b * h);
        return A;

    }

    public static double circleCircumference(double r) {
    // C = 2πr 

        double C = 2 * (Math.PI * r);
        return C;

    }

    public static double rectanglePerimeter(double l, double w) {
    //  P = 2l +2w

        double P = (2 * l) + (2 * w);
        return P;

    }

    public static double trianglePerimeter(double s1, double s2, double s3) {
    //P = s1 + s2 + s3
        double P = s1 + s2 + s3;
        return P;

    }

} //end Geometry class 
