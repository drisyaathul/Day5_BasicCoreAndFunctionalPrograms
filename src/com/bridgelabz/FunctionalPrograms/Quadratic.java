package com.bridgelabz.FunctionalPrograms;
/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
 */
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'a' : ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of 'b' : ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of 'c' : ");
        int c = scanner.nextInt();

        double delta = (b*b-4*a*c);
        double r1,r2;

        if (delta > 0.0) {
            r1 = (-b + Math.sqrt(delta))/(2*a);
            r2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The Roots are "+r1+" and "+r2);
        } else if (delta == 0.0) {
            r1 = -b / (2.0 * a);
            System.out.println("The root is "+r1);
        } else
            System.out.println("Roots are imaginary");
    }
}
