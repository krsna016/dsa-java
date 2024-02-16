package _6_Stacks;

import Library_SinglyIntegerLinkedList.node.Node;

public class StackCreationUsingArray {
    int top;
    int[] arr;

    public StackCreationUsingArray(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (isOverflow()) {
            System.err.println("The Stack is Full !!");
            return;
        }
        top++;
        arr[top] = data;
    }

    public void pop() {
        if (isUnderflow()) {
            System.err.println("The Stack is Empty !!");
            return;
        }
        arr[top] = Integer.MIN_VALUE;
        top--;
    }

    public int peek() {
        return arr[top];
    }

    public int getSize() {
        return top+1;
    }

    public boolean isOverflow() {
        return arr.length == (top + 1);
    }

    public boolean isUnderflow() {
        return top == -1;
    }


    public static void main(String[] args) {
        StackCreationUsingArray s = new StackCreationUsingArray(5);
        System.out.println(s.isUnderflow());
        System.out.println(s.getSize());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
//        s.push(60);  // Stack is Full
        s.pop();
        s.pop();
        s.push(100);
        s.pop();
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.pop();
//        s.pop(); // Stack is Empty
        System.out.println(s.getSize());
        System.out.println(s.isUnderflow());
    }
}