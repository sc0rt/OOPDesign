//****************************************
// MultiSphere.java
//
// SOFE 2710 Assignment 1
// Due: 6 Oct 2019
// Scott Garland 100723360
//****************************************

import java.util.Scanner;

public class MultiSphere {

    public static void main(String[] args) {
        
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();
        Sphere sphere3 = new Sphere();

        Scanner input = new Scanner(System.in);

        // Setting the diameter, surface area, and volume for Sphere 1 and then printing toString
        System.out.println("Please input a diameter for sphere1: ");
        double nxtdub1 = input.nextDouble();

        sphere1.setDiameter(nxtdub1);
        sphere1.setSurfaceArea(nxtdub1);
        sphere1.setVolume(nxtdub1);

        String str1 = sphere1.toString();
        System.out.println(str1 + "\n");

        // Setting the diameter, surface area, and volume for Sphere 2 and then printing toString
        System.out.println("Please input a diameter for sphere2: ");
        double nxtdub2 = input.nextDouble();

        sphere2.setDiameter(nxtdub2);
        sphere2.setSurfaceArea(nxtdub2);
        sphere2.setVolume(nxtdub2);

        String str2 = sphere2.toString();
        System.out.println(str2 + "\n");

        // Setting the diameter, surface area, and volume for Sphere 3 and then printing toString
        System.out.println("Please input a diameter for sphere3: ");
        double nxtdub3 = input.nextDouble();

        sphere3.setDiameter(nxtdub3);
        sphere3.setSurfaceArea(nxtdub3);
        sphere3.setVolume(nxtdub3);

        String str3 = sphere3.toString();
        System.out.println(str3 + "\n");
            
    }
}