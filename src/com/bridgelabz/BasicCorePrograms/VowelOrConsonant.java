package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet : ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'a','e','i','o','u' :
                System.out.println(alphabet+" ia a Vowel.");
                break;
            default :
                System.out.println(alphabet+" is a Consonant.");
        }
    }
}
