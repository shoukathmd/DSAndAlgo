package com.java.algorithms.recursion;


import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int j = 0; j < i; j++) {
            stack.push(scanner.nextInt());
        }
        recursiveDelete(stack, k);
        stack.stream().forEach((s) -> System.out.println(s));
    }


    public static void recursiveDelete(Stack<Integer> stack, int k) {
        //Base case
        if (k == 1) {
            stack.pop();
            return;
        }
        //Hypothesis
        int x = stack.pop();
        delete(stack, k-1);
        stack.push(x);
    }
}
