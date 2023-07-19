package com.bridgelabz.BasicCorePrograms;

import javax.swing.text.Utilities;

/*
a. Desc -> This program takes a command-line argument N and prints a table of the
   powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("N = "+number);

        if (number <= 31) {
            for (int i=1; i<=number; i++) {
                int result = (int) Math.pow(2,i);
                System.out.println("2^" +i+ " = "+result);
            }
        }else
            System.out.println("Invalid !! Enter the Number between 0 - 31.");
    }
}
