package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number, num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Number, num2 : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Number, num3 : ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" is largest among three numbers.");
        } else if (num2 > num3) {
            System.out.println(num2+" is largest among three numbers.");
        } else
            System.out.println(num3+" is largest among three numbers.");
    }
}
