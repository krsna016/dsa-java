package _3_SinglyLinkedList;
public class FindMiddleNode {
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public String toString(){
            return "Node{Data = " + this.data + ", next = " + this.next + "}";
        }
    }
    private Node head;

    public void append_node(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new_node;
    }

    public void print_node(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public Node find_middle_node(){
        Node slow_pointer = head;
        Node fast_pointer = head;
        while (fast_pointer != null){
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        slow_pointer.next = null;
        return slow_pointer;
    }

    public static void main(String[] args) {
        FindMiddleNode mn = new FindMiddleNode();
        mn.append_node(10);
        mn.append_node(20);
        mn.append_node(30);
        mn.append_node(40);
        mn.append_node(50);
        mn.append_node(60);
        mn.print_node();
        System.out.println(mn.find_middle_node());
    }
}