package org.example;

import java.util.Scanner;


class Student_grade {
    public void Gradee(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Number");
        int a = input.nextInt();
        if(a>= 90 && a<=100){
            System.out.println("Grade A");
        } else if (a>=80 && a<=89) {
            System.out.println("Grade B");
        } else if (a>=70 && a<=79) {
            System.out.println("Grade C");
        } else if (a>=60 && a<=69) {
            System.out.println("Grade d");
        } else {
            System.out.println("Fail");
        }
        input.close();
    }
}
public class Grade {

    public static void main(String[] args) {
        Student_grade gradee = new Student_grade();
        gradee.Gradee();
    }
}