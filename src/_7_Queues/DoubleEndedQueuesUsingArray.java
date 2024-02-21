package _7_Queues;

public class DoubleEndedQueuesUsingArray {
    private int front;
    private int rear;
    private int size;

    int[] arr;

    public DoubleEndedQueuesUsingArray(int capacity) {
        arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("null");
    }

    public void enqueueFront(int data) {
        if (size == arr.length) {
            System.err.println("Queue is Full !!");
            return;
        }
        front = (front -1 + arr.length) % arr.length;
        arr[front] = data;
        size++;
    }

    public void dequeueRear() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        arr[rear] = Integer.MIN_VALUE;
        rear = (rear -1 + arr.length) % arr.length;
        size--;
    }

    public void enqueueRear(int data) {
        if (size == arr.length) {
            System.err.println("Queue is Full !!");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public void dequeueFront() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        front = (front + 1) % arr.length;
        arr[front] = Integer.MIN_VALUE;
        size--;
    }

    public static void main(String[] args) {
        DoubleEndedQueuesUsingArray dq = new DoubleEndedQueuesUsingArray(10);
        dq.enqueueFront(10);
        dq.enqueueFront(20);
        dq.enqueueFront(30);
        dq.enqueueFront(40);
        dq.enqueueFront(50);
        dq.enqueueFront(60);
        dq.enqueueFront(70);

        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();

        dq.enqueueRear(100);
        dq.enqueueRear(200);
        dq.enqueueRear(300);
        dq.enqueueRear(400);
        dq.enqueueRear(500);
        dq.enqueueRear(600);
        dq.enqueueRear(700);

        dq.dequeueRear();
        dq.dequeueRear();
        dq.dequeueRear();
        dq.dequeueRear();
        dq.dequeueRear();

        dq.printQueue();


    }

}