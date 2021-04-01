package com.java.algorithms.dynamicprograming;

import java.util.Scanner;

public class FebonacciDPMemoization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] lookuptable = new int[n + 1];
        for (int i = 0; i < lookuptable.length; i++) {
            lookuptable[i] = -1;
        }

        System.out.println(febonacci(n, lookuptable));
    }

    public static int febonacci(int n, int[] lookupTable) {
        if (lookupTable[n] == -1) {
            if (n <= 1) {
                lookupTable[n] = 1;
            } else {
                lookupTable[n] = febonacci(n - 1, lookupTable) + febonacci(n - 2, lookupTable);
            }
        }
        return lookupTable[n];
    }
}
