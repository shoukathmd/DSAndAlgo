package com.java.algorithms.recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursively {
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(scn.nextInt());
        }
        sort(stack);
        stack.forEach(s -> System.out.println(s));
    }

    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        sort(stack);
        insert(stack, temp);

    }

    private static void insert(Stack<Integer> stack, int temp) {
        if (stack.size() == 0 || stack.peek() < temp) {
            stack.push(temp);
            return;
        }

       int s = stack.pop();
        insert(stack, temp);
        stack.push(s);
    }
}
