package com.bridgelabz.FunctionalPrograms;
/*
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("x = "+x);
        int y = Integer.parseInt(args[1]);
        System.out.println("y = "+y);

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println("Distance from ("+x+","+y+") to the origin (0,0) is "+distance);
    }
}
