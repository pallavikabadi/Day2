package com.bridgelabz.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        int num,i=1,sum=0;
        System.out.println("Enter the number: ");

        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        while (i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of n natural numbers are: "+sum);

    }

}
