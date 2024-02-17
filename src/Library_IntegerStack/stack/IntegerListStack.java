package Library_IntegerStack.stack;

import Library_IntegerStack.adt.AbstractClass;
import Library_IntegerStack.node.Node;
import _6_Stacks.StackCreationUsingLL;

public class IntegerListStack implements AbstractClass {
    Node top;
    int size;

    public IntegerListStack() {
        this.top = null;
        this.size = 0;
    }


    @Override
    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
        size++;
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.err.print("Stack is Empty !!");
            return Integer.MIN_VALUE;
        }
        Node temp = top;
        top = top.next;
        size--;
        return temp.data;
    }

    @Override
    public int peek() {
        if (isUnderflow()) {
            System.err.print("Stack is Empty !!");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isUnderflow() {
        return size == 0;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}