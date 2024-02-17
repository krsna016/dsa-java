package Library_IntegerQueue.node;
public class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public String toString() {
        return "Node{Data = " + data +"Next = " + next + "}";
    }
}