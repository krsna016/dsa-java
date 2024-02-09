package _3_SinglyLinkedList;
public class AddTwoLL {
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }

    private Node head;
    private Node head_;

    public void add_list(Node l1,Node l2){
        Node ptr1 = l1;
        Node ptr2 = l2;
        Node dummy = new Node(0);
        Node temp = dummy;

        while (l1 != null && l2 != null){

        }
    }
    public void print_node(Node h){
        Node current_node = h;
        while (current_node != null){
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddTwoLL ll1 = new AddTwoLL();
        ll1.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        ll1.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        ll1.head_ = new Node(60);
        Node second_ = new Node(70);
        Node third_ = new Node(80);
        Node forth_ = new Node(90);
        Node fifth_ = new Node(100);

        ll1.head_.next = second_;
        second_.next = third_;
        third_.next = forth_;
        forth_.next = fifth_;


        ll1.print_node(ll1.head);
        ll1.print_node(ll1.head_);
    }
}