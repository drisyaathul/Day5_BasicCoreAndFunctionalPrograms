package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;
//Program to Swap Two Numbers
public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, Number1 :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number, Number2 :");
        int num2 = scanner.nextInt();
        //Swap Two Numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping Two Numbers:-");
        System.out.println("Number1 : "+num1);
        System.out.println("Number2 : "+num2);
    }
}
