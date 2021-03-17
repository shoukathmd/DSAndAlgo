package com.java.algorithms.recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRecursively {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(scn.nextInt());
        }
        stack.forEach(s ->  System.out.println("Before --" + s));
        reverseRecursively(stack);
        stack.forEach(s ->System.out.println( "After -- " + s));
    }


    public static void reverseRecursively(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int x = stack.pop();
        reverseRecursively(stack);
        insert(stack, x);

    }

    public static void insert(Stack<Integer> stack, int x) {
        if (stack.size() == 0) {
            stack.push(x);
            return;
        }
        int y = stack.pop();
        insert(stack, x);
        stack.push(y);

    }


}
