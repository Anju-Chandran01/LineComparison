package com.bridgelabz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        //READ INPUT COORDINATES
        Scanner sc = new Scanner(System.in);
        DecimalFormat deciForm = new DecimalFormat("0.##");
        System.out.println("Enter x1 of first coordinate");
        double x1 = sc.nextInt();
        System.out.println("Enter y1 of first coordinate");
        double y1 = sc.nextInt();
        System.out.println("Enter x2 of second coordinate");
        double x2 = sc.nextInt();
        System.out.println("Enter y1 of second coordinate");
        double y2 = sc.nextInt();

        //CALCULATE DISTANCE
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance is : " + deciForm.format(distance));
    }
}
