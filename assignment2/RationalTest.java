//*****************************************
// RationalTest.java
//
// SOFE 2710 Assignment 2
// Due: 6 Nov 2019
// Scott Garland 100723360
//*****************************************

// Testing RationalNumber.java's compareTo method against RationalNumber objects
public class RationalTest {
    public static void main(String[] args) {
    
        RationalNumber r1 = new RationalNumber(30, 45);
        RationalNumber r2 = new RationalNumber(15, 25);
        int var1 = r1.compareTo(r1);
        int var2 = r1.compareTo(r2);
        int var3 = r2.compareTo(r1);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}