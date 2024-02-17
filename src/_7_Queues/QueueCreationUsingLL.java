package _7_Queues;

public class QueueCreationUsingLL {
    private Node front;
    private Node rear;
    private int size;

    public QueueCreationUsingLL() {
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

    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (isEmpty()) {
            front = new_node;
        } else {
            rear.next = new_node;
        }
        rear = new_node;
        size++;
    }

    public void dequeue() {
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

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        QueueCreationUsingLL qc = new QueueCreationUsingLL();
        qc.enqueue(10);
        qc.enqueue(20);
        qc.enqueue(30);
        qc.enqueue(40);
        System.out.println("The size is : " + qc.getSize());
        System.out.println("IsEmpty : " + qc.isEmpty());
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        qc.dequeue();
        System.out.println("The size is : " + qc.getSize());
        System.out.println("IsEmpty : " + qc.isEmpty());
    }
}