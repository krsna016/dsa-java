package _6_Stacks;

public class StackCreationUsingLL {
    private Node top;
    private static int size = 0;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return "Data: " + this.data;
        }
    }

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
        size++;
    }

    public Node pop() {
        if (isUnderflow()) {
            System.err.print("Stack is Empty !!");
            return null;
        }
        Node temp = top;
        top = top.next;
        size--;
        return temp;
    }

    public Node peek() {
        if (isUnderflow()) {
            System.err.print("Stack is Empty !!");
            return null;
        }
        return top;
    }

    public boolean isUnderflow() {
        return size == 0;
    }

    public  int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackCreationUsingLL s = new StackCreationUsingLL();
        System.out.println(s.isUnderflow());
        System.out.println(s.getSize());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.push(100);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getSize());
        System.out.println(s.isUnderflow());
    }
}
