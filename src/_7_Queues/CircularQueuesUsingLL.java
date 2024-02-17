package _7_Queues;

public class CircularQueuesUsingLL {
    private Node front;
    private Node rear;

    public CircularQueuesUsingLL() {
        this.rear = null;
        this.front = null;
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

    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (isEmpty()) {
            front = new_node;
        } else {
            rear.next = new_node;
        }
        rear = new_node;
        rear.next = front;
    }

    public void dequeue() {
        if (front == rear) { // If this is the last node
            front = null;
            rear = null;
        }
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        } else {
            front = front.next;
        }
        rear.next = front;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public static void main(String[] args) {
        CircularQueuesUsingLL qc = new CircularQueuesUsingLL();
        qc.enqueue(10);
        qc.enqueue(20);
        qc.enqueue(30);
        qc.enqueue(40);
        qc.enqueue(50);
        qc.enqueue(60);
        qc.enqueue(70);
        System.out.println("IsEmpty : " + qc.isEmpty());
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        qc.enqueue(1000);
        qc.enqueue(2000);
        qc.enqueue(3000);
        System.out.println("IsEmpty : " + qc.isEmpty());
    }
}