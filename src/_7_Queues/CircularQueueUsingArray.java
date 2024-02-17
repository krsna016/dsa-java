package _7_Queues;

import java.util.Scanner;

public class CircularQueueUsingArray {
    private int front;
    private int rear;
    private int size;
    private int[] arr;

    public CircularQueueUsingArray(int capacity) {
        arr = new int[capacity];
        this.rear = -1;
        this.front = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if(size == arr.length){
            System.err.println("Queue is Full !!");
            return;
        }
        rear = (rear + 1)%arr.length;
        arr[rear] = data;
        size ++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.err.println("Queue is Empty !!");
            return;
        }
        front = (front+1)%arr.length;
        arr[front] = Integer.MIN_VALUE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void print_queue(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("Pointing to Start");
    }


    public static void main(String[] args) {
        System.out.print("Enter the capacity for the queue : ");
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        CircularQueueUsingArray qca = new CircularQueueUsingArray(cap);
        System.out.println("Size is : "+qca.getSize());
        qca.enqueue(10);
        qca.enqueue(20);
        qca.enqueue(30);
        qca.enqueue(40);
        qca.enqueue(50);
        qca.enqueue(60);
        qca.print_queue();
        System.out.println("Size is : "+qca.getSize());
        qca.dequeue();
        qca.dequeue();
        qca.dequeue();
        qca.enqueue(10);
        qca.enqueue(20);
        qca.enqueue(30);
        qca.dequeue();
        qca.dequeue();
        qca.dequeue();
        qca.print_queue();
        System.out.println("Size is : "+qca.getSize());
    }
}