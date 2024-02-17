package Library_IntegerStack.stack;

import Library_IntegerStack.node.Node;
import Library_IntegerStack.adt.AbstractClass;

public class IntegerArrayStack implements AbstractClass {
    int top;
    int[] arr;

    public IntegerArrayStack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int data) {
        if (top == arr.length - 1) {
            System.err.println("The Stack is Full !!");
            return;
        }
        top++;
        arr[top] = data;
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.err.println("The Stack is Empty !!");
            return Integer.MIN_VALUE;
        }
        arr[top] = Integer.MIN_VALUE;
        top--;
        return Integer.MIN_VALUE;
    }

    @Override
    public int peek() {
        return arr[top];
    }

    @Override
    public int getSize() {
        return top+1;
    }

    @Override
    public boolean isUnderflow() {
        return top == -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        top = -1;
    }

    @Override
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("null");
    }
}