package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;
/*
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
   standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
   OutputStreamWriter to print the output to the screen.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the elements of array :- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
    }
        for (int i=0;i<arr.length;i++) {
            System.out.println("\n");
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] +"\t");
            }
        }
    }
}
