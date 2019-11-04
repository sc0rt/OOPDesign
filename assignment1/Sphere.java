//****************************************
// Sphere.java
//
// SOFE 2710 Assignment 1
// Due: 6 Oct 2019
// Scott Garland 100723360
//****************************************

public class Sphere{

    private double diameter;
    private double surfaceArea;
    private double volume;

    // Method that uses the Scanner in MultiSphere driver class to read a diameter input 
    // from the user as a double type. The setter method for the diameter.
    public void setDiameter(double input) {
        diameter = input;
    }

    // Getter method for diameter.
    public double getDiameter() {
        return diameter;
    }

    // This method computes the surface area of a sphere of user given radius. 
    // Setter method for the surface area.
    public void setSurfaceArea(double diameter) {
        surfaceArea = 4*Math.PI*(Math.pow((diameter/2),2));
    }

    // Getter method for surface area
    public double getSurfaceArea() {
        return surfaceArea;
    }

    // This method computes the volume of a sphere of a user given radius. 
    // Setter method for the volume.
    public void setVolume(double diameter) {
        volume = (4*Math.PI*(Math.pow((diameter/2),3))) / 3;
    }

    // Getter method for the volume.
    public double getVolume() {
        return volume;
    }

    // toString method that returns string value for the diamter, surface area, and volume of the sphere.
    public String toString() {
        String result = "With sphere of diameter = " + diameter + "\n" + "Surface Area = " + surfaceArea + "\n" + "Volume = " + volume;
        return result;
    }
}