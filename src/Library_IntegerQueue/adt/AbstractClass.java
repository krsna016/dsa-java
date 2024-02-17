package Library_IntegerQueue.adt;
public interface AbstractClass {
    public int getSize();
    public boolean isEmpty();
    public void enqueue(int data);
    public void dequeue();
    public void printQueue();
    public void enqueueFront(int data);
    public void dequeueRear();
    public void enqueueRear(int data);
    public void dequeueFront();
}