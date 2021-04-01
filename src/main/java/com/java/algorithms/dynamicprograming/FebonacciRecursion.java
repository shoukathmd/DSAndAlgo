package com.java.algorithms.dynamicprograming;

import java.util.Scanner;

public class FebonacciRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(febonacci(n));
    }

    public static int febonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return febonacci(n-1) + febonacci(n-2);
    }
}
