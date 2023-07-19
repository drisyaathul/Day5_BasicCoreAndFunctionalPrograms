package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of times to flip coin : ");
        int flip = scanner.nextInt();

        int heads = 0;
        int tails = 0;
        /*
         Using Random Function to get value between 0 and 1.
         */
        for (int i=0; i<flip; i++){
            if (Math.random() < 0.5) {
                tails++;
            }else
                heads++;
        }
        /*
        Percentage of Heads and Tails.
         */
        double tailPercentage = tails/(double)flip * 100;
        double headPercentage = heads/(double)flip * 100;

        System.out.println("Number of Heads : "+heads);
        System.out.println("Number of Tails : "+tails);
        System.out.println("Percentage of Head : "+headPercentage+"%");
        System.out.println("Percentage of Tail : "+tailPercentage+"%");
    }
}
