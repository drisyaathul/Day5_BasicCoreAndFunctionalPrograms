package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;
/*
a. Desc -> A program with cubic running time. Read in N integers and counts the
   number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
   print the distinct triplets.
 */
public class Triplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean flag = false;
        int count = 0;

        System.out.println("Enter the Elements :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Printing the Elements in an Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Print the Distinct Triplets :- ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        count++;
                        flag = true;
                    }
                }
            }
        }
        System.out.println("Number of Distinct Triplets : "+count);
        System.out.println();
        if (flag == false) {
            System.out.println("Not exist !!!!");
        }
    }
}