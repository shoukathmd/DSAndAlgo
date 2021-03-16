package com.java.algorithms.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SortRecursion {
    public static void main(String[] arg) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = scn.nextInt();
        }

        SortRecursion sort = new SortRecursion();
        sort.bubbleSort(arr, n);
        Arrays.stream(arr).asLongStream().forEach((s) -> System.out.println(s));
    }



    public void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);

    }


    public int[] sort(int[] arr) {
        //Base
        if (arr.length == 1) {
            return arr;
        }

        //Hypothesis
        int temp = arr[arr.length - 1];
        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length - 2);
        sort(arr2);
        //Induction
        return new int[2];
    }

    public void insert(int[] arr, int val) {
        if (arr.length == 0 || arr[arr.length - 1] <= val) {

        }

    }
}
