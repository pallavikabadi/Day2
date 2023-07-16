package com.bridgelabz.Ifelse;
// Read a Number 1,10,100,1000 and display unit, ten hundred
import java.util.Scanner;

public class NumberToWordConversion {
    public static void main(String[] args) {
        int no;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        no =sc.nextInt();

        if(no==0){
            System.out.println("zero");
        } else if (no==1) {
            System.out.println("one");
        } else if (no==2) {
            System.out.println("two");
        } else if (no==3) {
            System.out.println("three");
        } else if (no==4) {
            System.out.println("four");
        } else if (no==5) {
            System.out.println("five");
        } else if (no==6) {
            System.out.println("six");
        } else if (no==7) {
            System.out.println("seven");
        } else if (no==8) {
            System.out.println("eight");
        } else {
            System.out.println("nine");
        }
    }
}
