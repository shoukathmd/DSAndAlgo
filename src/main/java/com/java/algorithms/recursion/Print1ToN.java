package com.java.algorithms.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }


    public static void print(int n) {
        //Base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        //Hypothesis
        print(n-1);
        //induction
        System.out.println(n);

    }
}
