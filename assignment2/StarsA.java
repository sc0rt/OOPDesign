//*****************************************
// StarsA.java
//
// SOFE 2710 Assignment 2
// Due: 6 Nov 2019
// Scott Garland 100723360
//*****************************************

public class StarsA {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}