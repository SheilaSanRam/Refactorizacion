package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner console = new Scanner(System.in);
        System.out.print("Enter addition numbers 1 y 2");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+ num2));


        System.out.print("Enter subtraction number 1 y 2");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

        System.out.print("Enter multiplication number 1 y 2");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

        System.out.print("Enter division number 1 y 2");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
    }

}