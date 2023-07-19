package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number :");
        int secondNumber = scanner.nextInt();

        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+remainder);
    }
}
