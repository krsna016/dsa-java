package _3_SinglyLinkedList;
public class ReverseTheLL {

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void print_ele(Node head_){
        Node current = head_;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Node reverse_ll(Node head_){
        // 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> 7 --> null
        if(head_ == null){
            return head_;
        }
        Node current = head_;
        Node previous = null;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args) {
        ReverseTheLL rll = new ReverseTheLL();
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        rll.print_ele(head);
        Node ReverseListHead = rll.reverse_ll(head);
        rll.print_ele(ReverseListHead);
    }
}