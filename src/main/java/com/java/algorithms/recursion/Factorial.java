package com.java.algorithms.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(n));
    }

    public  int factorial(int n) {
        if (n == 1) {
            return n;
        }
        int result = n * factorial(n-1);
        return result;
    }
}
