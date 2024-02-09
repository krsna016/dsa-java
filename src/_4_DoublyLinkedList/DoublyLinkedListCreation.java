package _4_DoublyLinkedList;
public class DoublyLinkedListCreation {
    private Node head;
    private Node tail;

    private static class Node{
        private int data;
        private Node next;
        private Node previous;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        @Override
        public String toString() {
            return "Node{" +
                    "previous=" + (previous != null ? previous.data : "null") +
                    ", data=" + data +
                    ", next=" + (next != null ? next.data : "null") +
                    '}';
        }
    }
    public static void main(String[] args) {
        DoublyLinkedListCreation dll = new DoublyLinkedListCreation();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        
        
        dll.head = first;
        
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;
        
        fifth.previous = forth;
        forth.previous = third;
        third.previous = second;
        second.previous = first;
        first.previous = null;
        
        dll.tail = fifth;
        
        System.out.println(dll.head);
        System.out.println(dll.tail);
    }
}