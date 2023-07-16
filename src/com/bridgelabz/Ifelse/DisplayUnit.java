package com.bridgelabz.Ifelse;
// Read a single Digit Number and write in word
import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        int n;
        //Scanner for taking input from user
        System.out.println("Enter Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n<10){
            System.out.println("Unit");
        } else if (n==10) {
            System.out.println("Ten");
        } else if (n==100) {
            System.out.println("Hundred");
        } else if (n==1000) {
            System.out.println("Thousand");
        }
    }
}
