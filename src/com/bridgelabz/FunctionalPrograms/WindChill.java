package com.bridgelabz.FunctionalPrograms;

public class WindChill {
    public static void main(String[] args) {
        double t = Integer.parseInt(args[0]);
        System.out.println("Temperature(In Fahrenheit),T = "+t);
        double v = Integer.parseInt(args[1]);
        System.out.println("Wind Speed(In miles per Hour),V = "+v);
        if (t < 50 && v > 3 && v < 120) {
            double windChill = 35.74 + (0.62151 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));

            System.out.println("Wind Chill : " + windChill);
        } else
            System.out.println("Enter Valid temperature and Wind Speed !!!");
    }
}
