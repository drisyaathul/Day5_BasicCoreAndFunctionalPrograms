package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;
/*
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find harmonic number : ");
        int n = scanner.nextInt();

        double harmonicNumber = 0.0;
        //Ensure n != 0.
       if (n != 0) {
           for (int i=1; i<=n; i++) {
               harmonicNumber += (double) 1 / i ;
               System.out.println(harmonicNumber);
           }
       }else
           System.out.println("Invalid Number. Please enter the value greater than Zero");
    }
}