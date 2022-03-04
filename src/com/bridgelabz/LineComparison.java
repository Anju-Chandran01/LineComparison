package com.bridgelabz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println(" --- Welcome to Line Comparison Computation Program --- ");

        Scanner sc = new Scanner(System.in);
        DecimalFormat deciForm = new DecimalFormat("0.##");

        //READ INPUT COORDINATES
        System.out.println("Enter coordinates of 1st Line");
        System.out.print("x1 : ");
        int x1 = sc.nextInt();
        System.out.print("y1 : ");
        int y1 = sc.nextInt();
        System.out.print("x2 : ");
        int x2 = sc.nextInt();
        System.out.print("y2 : ");
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of 2nd Line");
        System.out.print("x3 : ");
        int x3 = sc.nextInt();
        System.out.print("y3 : ");
        int y3 = sc.nextInt();
        System.out.print("x4 : ");
        int x4 = sc.nextInt();
        System.out.print("y4 : ");
        int y4 = sc.nextInt();


        //CALCULATE LENGTH OF TWO LINES
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line is : " +deciForm.format(length1));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of second line is : " + deciForm.format(length2));

        if(length1.equals(length2))
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");
    }
}
