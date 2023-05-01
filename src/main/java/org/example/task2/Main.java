package org.example.task2;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([{}])";
        String s5 = "([{}]){}[]";

        System.out.println("Input: " + s1 + ", Output: " + isValid(s1)); // true
        System.out.println("Input: " + s2 + ", Output: " + isValid(s2)); // true
        System.out.println("Input: " + s3 + ", Output: " + isValid(s3)); // false
        System.out.println("Input: " + s4 + ", Output: " + isValid(s4)); // true
        System.out.println("Input: " + s5 + ", Output: " + isValid(s5)); // true
    }
}
