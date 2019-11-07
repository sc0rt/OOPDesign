// Tutorial 2 // Date: 26 Sept 2019
// Problem 1
// What would be the output of each expression using following methods? (double x = 28; double y = 4;)
// • Square root of y (Math.sqrt(y)
// • 28 power of 4 (Math.pow(x,y))
// • Logarithm of x and y (Math.log(x))
// • e to the x (Math.exp(x)).

import java.util.Scanner;

public class MathMethods {
    
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        System.out.println("With double x = 28 and double y = 4 : ");
        System.out.println("Square root of y: " + Math.sqrt(y));
        System.out.println("x to the power of y: " + Math.pow(x,y));
        System.out.println("Logarithm of x: " + Math.log(x));
        System.out.println("Logarithm of y: " + Math.log(y));
        System.out.println("e to the power of x: " + Math.exp(x));
    }
}
