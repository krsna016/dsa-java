package Library_IntegerQueue.main;
import Library_IntegerQueue.queue.*;

public class Main {
    public static void main(String[] args) {
        CircularDoubleEndedIntegerArrayQueue double_ended_queue = new CircularDoubleEndedIntegerArrayQueue(6);

        IntegerListQueue list_queue = new IntegerListQueue();
        System.out.println("List Queue");
        list_queue.enqueue(1);
        list_queue.enqueue(2);
        list_queue.enqueue(3);
        list_queue.enqueue(4);
        list_queue.enqueue(5);
        list_queue.enqueue(6);

        list_queue.dequeue();
        list_queue.dequeue();
        list_queue.dequeue();
        list_queue.dequeue();
        list_queue.dequeue();
        list_queue.dequeue();

        IntegerArrayQueue array_queue = new IntegerArrayQueue(6);
        System.out.println("Array Queue");
        array_queue.enqueue(1);
        array_queue.enqueue(2);
        array_queue.enqueue(3);
        array_queue.enqueue(4);
        array_queue.enqueue(5);
        array_queue.enqueue(6);

        array_queue.dequeue();
        array_queue.dequeue();
        array_queue.dequeue();
        array_queue.dequeue();
        array_queue.dequeue();
        array_queue.dequeue();

        CircularIntegerArrayQueue circular_queue = new CircularIntegerArrayQueue(6);
        System.out.println("Circular Array Queue");
    }
}