package org.example;

public class MethodOverloading {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Multiply 2 and 3: " + multiply(2, 3));
        System.out.println("Multiply 2, 3, and 4: " + multiply(2, 3, 4));
        System.out.println("Multiply 2.5 and 3.5: " + multiply(2.5, 3.5));
    }
}
