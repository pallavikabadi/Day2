package com.bridgelabz.WhileLoop;

import java.util.Scanner;
//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ReverseNumber {
    public static void main(String[] args) {
        int num,lastDigit,sum=0;
        System.out.println("Enter the number: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();


        System.out.println("Number before reversing: " +num);
        while (num>0){
            lastDigit=num%10;
            sum=(sum*10)+lastDigit;
            num=num/10;
        }
        System.out.println("Number after reversing: " +sum);
    }
}
