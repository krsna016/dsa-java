package Library_IntegerQueue.queue;

import Library_IntegerQueue.adt.AbstractClass;

public class CircularDoubleEndedIntegerArrayQueue implements AbstractClass {
    private int front;
    private int rear;
    private int size;

    int[] arr;

    public CircularDoubleEndedIntegerArrayQueue(int capacity) {
        arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(int data) {
        return;
    }

    @Override
    public void dequeue() {
        return;
    }

    @Override
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

    @Override
    public void enqueueFront(int data) {
        if (size == arr.length) {
            System.err.println("Queue is Full !!");
            return;
        }
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = data;
        size++;
    }

    @Override
    public void dequeueRear() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        arr[rear] = Integer.MIN_VALUE;
        rear = (rear - 1 + arr.length) % arr.length;
        size--;
    }

    @Override
    public void enqueueRear(int data) {
        if (size == arr.length) {
            System.err.println("Queue is Full !!");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    @Override
    public void dequeueFront() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        front = (front + 1) % arr.length;
        arr[front] = Integer.MIN_VALUE;
        size--;
    }
}