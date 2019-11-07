// Tutorial 1 // Date: 19 Spet 2019
// Problem 2
// You have recently taken a multiple choice biology exam for which no partial marks are
// awarded. Write a program to convert your score (out of 63) to a percent and print the
// result. You may optionally incorporate I/O in your program to read input from the user.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the amount of marks you obtained on the exam: ");
        double score = input.nextInt();
        input.close();
        double percent = (score/63)*100;
        System.out.println("Your percentage result on the exam is: " + percent + "%");
        System.out.println("This floor of this is: " + (int) percent + "%");
        System.out.println("The ceiling of this is: " + (int) (percent + 1) + "%");
    }
}
