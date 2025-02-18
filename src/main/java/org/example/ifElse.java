package org.example;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give an integer input");
        int a = input.nextInt();
        if (a%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        if (a>0){
            System.out.println("The number is positive");
        } else if (a<0) {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
