// Tutorial 2 // Date: 26 Sept 2019
// Problem 3 //
// Write a program to generate 10 random integers with the limit of 30, 
// so that the generated random number is always less than 30.

import java.util.Random;

public class RandomIntegers {

    // Main method generates 10 random integers less than 30
    public static void main(String[] args) {
        Random generator = new Random();
        int num;
        int count = 0;
        // generates a number from 0 to 29
        num = generator.nextInt(30);

        while (count < 10) {
            System.out.println(num);
            num = generator.nextInt(30);
            count += 1;
        }
    }
}