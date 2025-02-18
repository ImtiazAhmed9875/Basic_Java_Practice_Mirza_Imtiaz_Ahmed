package org.example;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        func f = new func();
        f.function();
        f.function1();
        f.function2();
        f.function3();
        f.function4();
    }
}
class func{
    public void function(){
        System.out.println("Enter a Number");
        int k;
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            System.out.println("Couinting = " + i );
        }
    }
    public void function1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to see the Even Numbers");
        int k = input.nextInt();
        int i = 0;
        while(i <= k){
            if( i%2 == 0 ){
                System.out.println("Even Number = " + i);

            }
            i++;
        }

    }
    public void function2(){
        Scanner input= new Scanner(System.in);
        System.out.println("Give me a Number to See the Sum of all the Numbers");
        int a =input.nextInt();
        int i = 1;
        int sum = 0;
        do{
           sum = sum+i;
           i++;
        }while(i<=a);
        System.out.println("The sum of "+a+" Number is ="+sum);

    }
    public void function3(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number to Reverse");
        int n = input.nextInt();
        int i = 0;
        while(n!=0){
            int l = n%10;
            i = i*10+l;
            n = n/10;
        }
        System.out.println("Reverse of the Number is = "+i);
    }
    public void function4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to see the Sum of all the number");
        int a = input.nextInt();
        int l=0;
        while(a!=0){
            int r = a%10;
            l=l+r;
            a = a/10;
        }
        System.out.println("Sum of the Number is = "+l);
    }
}
