package com.bridgelabz.ForLoop;
//Write a Program to find Palindrome Number
import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        int num,i,sum=0;
        System.out.println("Enter the number: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for (i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of n natural number are: "+sum);

    }
}
