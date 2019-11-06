//*****************************************
// StarsC.java
//
// SOFE 2710 Assignment 2
// Due: 6 Nov 2019
// Scott Garland 100723360
//*****************************************

public class StarsC {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        String starString = "*";
        int amount = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {
            System.out.printf("%" + MAX_ROWS + "s", starString.repeat(amount));
            System.out.println();
            amount -= 1;
        }
    }
}