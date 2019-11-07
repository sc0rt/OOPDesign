// OOP Tutorial 2 // Date: 26 Sept 2019
// Problem 2
// Write a program to find the surface area and volume of a sphere using given methods based on user input.
// (surface area = 4 * PI * (radius^3) /3, volume = 4 * PI * (radius^2).)

import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        
        // Main method executes the surfaceArea and volume methods to be displayed after user inputs radius
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a radius for a sphere: ");
        double radius = input.nextDouble();

        double sArea = surfaceArea(radius);
        double volume = volume(radius);

        System.out.println("With sphere of radius = " + radius);
        System.out.println("Surface Area = " + sArea);
        System.out.println("Volume = " + volume);

    }

    public static double surfaceArea(double radius) {
        // This method computes the surface area of a sphere of user given radius.
        double surfaceArea = (4*Math.PI*(Math.pow(radius,3))) / 3;

        return surfaceArea;
    }

    public static double volume(double radius) {
        // This method computes the volume of a sphere of a user given radius.
        double volume = 4*Math.PI*(Math.pow(radius,2));

        return volume;
    }
}