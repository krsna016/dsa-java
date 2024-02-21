package Library_IntegerQueue.queue;

import Library_IntegerQueue.adt.AbstractClass;

public class CircularIntegerArrayQueue implements AbstractClass {
    private int front;
    private int rear;
    private int size;

    int[] arr;

    public CircularIntegerArrayQueue(int capacity) {
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
        if (size == arr.length) {
            System.err.println("Queue is Full !!");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        front = (front + 1) % arr.length;
        arr[front] = Integer.MIN_VALUE;
        size--;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.err.println("Queue is Empty !!");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("null");
    }

    @Override
    public void enqueueFront(int data) {
        return;
    }

    @Override
    public void dequeueRear() {
        return;
    }

    @Override
    public void enqueueRear(int data) {
        return;
    }

    @Override
    public void dequeueFront() {
        return;
    }
}