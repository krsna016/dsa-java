package Library_IntegerQueue.queue;

import Library_IntegerQueue.node.Node;
import Library_IntegerQueue.adt.AbstractClass;

public class IntegerListQueue implements AbstractClass {
    Node front;
    Node rear;
    int size;

    public IntegerListQueue() {
        front = null;
        rear = null;
        size = 0;
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
        Node new_node = new Node(data);
        if (isEmpty()) {
            front = new_node;
        } else {
            rear.next = new_node;
        }
        rear = new_node;
        size++;
    }

    @Override
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

    @Override
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
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