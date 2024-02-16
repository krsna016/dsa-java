package _6_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean is_valid_parenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (top == '{' && c == '}' ||
                            top == '[' && c == ']' ||
                            top == '(' && c == ')') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        boolean k = is_valid_parenthesis(s);
        if (k)
            System.out.println("Valid Parenthesis");
        else
            System.out.println("Invalid Parenthesis");
    }
}