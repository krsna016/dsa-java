package _4_DoublyLinkedList;
public class PrintNode {

    public void print_frorward(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void print_backward(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.previous;
        }
        System.out.println("null");
    }
    private Node head;
    private Node tail;

    private static class Node {
        private int data;
        private Node next;
        private Node previous;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        public String toString(){
            return "Node{" + "previous=" + (previous!=null?previous.data:"null") + ", data=" + data + ", next=" + (next!=null?next.data:"null") + "}";
        }
    }


    public static void main(String[] args) {
        PrintNode pn = new PrintNode();
        pn.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        pn.head.next = second;
        second.previous = pn.head;
        second.next = third;
        third.previous = second;
        third.next = forth;
        forth.previous = third;

        pn.tail = forth;
        pn.print_frorward();
        pn.print_backward();
    }
}