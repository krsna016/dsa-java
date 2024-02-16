package _6_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr){
        int[] result_ = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if(!stack.isEmpty()){
                while (!stack.isEmpty() && stack.peek() < arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result_[i] = -1;
            }else {
                result_[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result_;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr_ = new int[size];
        for (int i = 0; i < size; i++) {
            arr_[i] = sc.nextInt();
        }
        int[] arr__ = nextGreaterElement(arr_);
        System.out.print("The result is : ");
        for (int i : arr__){
            System.out.print(i + " ");
        }
    }
}