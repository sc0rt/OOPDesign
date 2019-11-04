//****************************************
// WholeNumbers.java
//
// SOFE 2710 Assignment 1
// Due: 6 Oct 2019
// Scott Garland 100723360
//****************************************

import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        Double dub = input.nextDouble(); // Has to be Double object as double can't use the .intValue() method

        int low = dub.intValue(); //truncates the decimals
        int high = low + 1; // add 1 to the truncation to get the higher integer

        System.out.println("The number you input is: " + dub);
        System.out.println("The floor of this is: " + low);
        System.out.println("The ceiling of this is: " + high);
    }
}