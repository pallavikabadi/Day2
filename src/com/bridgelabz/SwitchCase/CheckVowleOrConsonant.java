package com.bridgelabz.SwitchCase;

import java.util.Scanner;
// Write a Program to Check Vowel or Consonant
public class CheckVowleOrConsonant {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter vowel: ");

        char ch =r.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " : is vowel");
                break;
            default:
                System.out.println(ch + " : is consonent");
        }
    }
}
