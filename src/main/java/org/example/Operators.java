package org.example;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a = 5, b = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Value");
        a = input.nextInt();
        System.out.println("Enter Second Value");
        b =input.nextInt();
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a/b));
        System.out.println("Modulas = "+(a%b));
    }
}
