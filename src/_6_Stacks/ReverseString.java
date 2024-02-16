package _6_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverse_string(String str){
        Stack<Character> stack = new Stack<>();
        char chars[] = str.toCharArray();
        for(char k: chars){
            stack.push(k);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.print("The reversed string is : ");
        System.out.println(reverse_string(str));
    }
}