package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;
/*  Write a program Distance.java that takes two integer command-line arguments x and y and
    prints the Euclidean distance from the point (x, y) to the origin (0, 0).
    The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter value of y: ");
        int y= sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The Euclidean distance from ("+x+","+y+") to  (0, 0) is: " + distance);
    }

}
