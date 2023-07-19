package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

/*
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
*/
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find prime factors : ");
        int number = scanner.nextInt();
        System.out.println("Prime Factors of given number : ");
        for (int i=2; i<number; i++) {
            while (number%i == 0) {
                number = number/i;
                System.out.println(i);
            }
        }
        if (number != 1) {
            System.out.println(number);
        }
    }
}
