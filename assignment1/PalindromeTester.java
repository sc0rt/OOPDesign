//****************************************
// PalindromeTester.java
//
// SOFE 2710 Assignment 1
// Due: 6 Oct 2019
// Scott Garland 100723360
//****************************************

import java.util.Scanner;

public class PalindromeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String test = input.nextLine();
        
        // Using regex to get rid of special characters, and then putting all characters into lowercase for easy comparison.
        String strip = test.replaceAll("[^a-zA-Z0-9]", "");
        String str = strip.toLowerCase();

        // Converting the string to an array of characters.
        char[] str2array = str.toCharArray();

        // Returns a boolean value of whether or not the input is a palindrome.
        boolean value = pTest(str2array);

        if (value) {
            System.out.println("Is a palindrome.");
        }
        else {
            System.out.println("Is not a palindrome.");
        }

    }

    public static boolean pTest(char[] str2array) {
        // This method computes whether or not the argument is a palindrome, regardless of special characters
        int i = 0;
        int j = str2array.length - 1;
    
        while (j > i) {
            if (str2array[i] != str2array[j]) {
                return false;
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }
}

