package com.java.algorithms.recursion;

import java.util.Scanner;

public class PrintNto1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        print(n);
    }


    public static void print(int n) {
        //Base case
        if (n==1) {
            System.out.println(n);
            return;
        }
        //induction
        System.out.println(n);
        //Hypothesis
        print(n-1);

    }
}
