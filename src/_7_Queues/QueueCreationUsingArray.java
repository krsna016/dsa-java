package _7_Queues;

import java.util.Scanner;

public class QueueCreationUsingArray {
    private int front;
    private int rear;
    private int size;
    private int[] arr;

    public QueueCreationUsingArray(int capacity) {
        arr = new int[capacity];
        this.rear = -1;
        this.front = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if(size > arr.length-1){
            System.err.println("Queue is Full !!");
            return;
        }
        rear++;
        arr[rear] = data;
        size ++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.err.println("Queue is Empty !!");
            return;
        }
        front++;
        arr[front] = Integer.MIN_VALUE;
        size--;
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
        System.out.println("null");
    }


    public static void main(String[] args) {
        System.out.print("Enter the capacity for the queue : ");
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        QueueCreationUsingArray qca = new QueueCreationUsingArray(cap);
        System.out.println("Size is : "+qca.getSize());
        System.out.println("IsEmpty : "+ qca.isEmpty());
        qca.enqueue(10);
        qca.enqueue(20);
        qca.enqueue(30);
        qca.enqueue(40);
        qca.enqueue(50);
        qca.enqueue(60);
//        qca.print_queue();
        System.out.println("Size is : "+qca.getSize());
//        System.out.println("IsEmpty : "+ qca.isEmpty());
//        qca.dequeue();
//        qca.dequeue();
//        qca.dequeue();
//        qca.dequeue();
//        qca.print_queue();
//        qca.dequeue();
//        qca.dequeue();
//        System.out.println("Size is : "+qca.getSize());
//        System.out.println("IsEmpty : "+ qca.isEmpty());
    }
}