package Library_IntegerStack.node;
public class Node {
    public Node next;
    public int data;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public String toString() {
        return "Node{Data = " + data + ", Next = " + next + "}";
    }
}
