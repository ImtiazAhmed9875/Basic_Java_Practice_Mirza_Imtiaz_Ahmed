package org.example;

public class Method_practice {
public static void printMessage(){
    System.out.println("Welcome to the world of java");
}
public static int sum(int a,int b){
    return (a+b);
}
public static boolean isEven(int a ){
    return a % 2 == 0;
}

    public static void main(String[] args) {
        printMessage();
        System.out.println("Sum ="+sum(5,9));
        System.out.println("Even number = "+isEven(10));
    }
}