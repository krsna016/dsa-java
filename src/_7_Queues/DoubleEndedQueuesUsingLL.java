package _7_Queues;

public class DoubleEndedQueuesUsingLL {
    private Node front;
    private Node rear;
    private int size;

    public DoubleEndedQueuesUsingLL() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

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

    public void enqueueR(int data) {
        Node new_node = new Node(data);
        if (isEmpty()) {
            front = new_node;
        } else {
            rear.next = new_node;
        }
        rear = new_node;
        size++;
    }

    public void dequeueF() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        } else {
            front = front.next;
        }
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void enqueueF(int data) {
        Node new_node = new Node(data);
        if (isEmpty()) {
            rear = new_node;
        } else {
            new_node.next = front;
        }
        front = new_node;
        size++;
    }

    public void dequeueR() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        } else {
            Node temp = front;
            while (temp.next != rear) {
                temp = temp.next;
            }
            rear = temp;
            rear.next = null;
        }
        if (rear == null) {
            front = null;
        }
        size--;
    }

        public boolean isEmpty () {
            return size == 0;
        }

        public int getSize () {
            return size;
        }

        public static void main (String[]args){
            DoubleEndedQueuesUsingLL qc = new DoubleEndedQueuesUsingLL();
            qc.enqueueF(10);
            qc.enqueueF(20);
            qc.enqueueF(30);
            qc.enqueueF(40);
            qc.enqueueR(50);
            qc.enqueueR(60);
            qc.enqueueR(70);
            qc.enqueueR(80);
            qc.dequeueF();
            qc.dequeueF();
            qc.dequeueR();
            qc.dequeueR();

        }
    }