//*****************************************
// StarsD.java
//
// SOFE 2710 Assignment 2
// Due: 6 Nov 2019
// Scott Garland 100723360
//*****************************************

public class StarsD {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        int space = 9;

        for (int row = 1; row <= MAX_ROWS/2; row++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;

            for (int i = 1; i <= 2*row-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        space = 5;
        for (int row = 1; row <= MAX_ROWS - 1; row++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;

            for (int i = 1; i <= 2*(MAX_ROWS/2 - row) + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}