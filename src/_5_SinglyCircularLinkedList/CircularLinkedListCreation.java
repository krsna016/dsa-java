package _5_SinglyCircularLinkedList;
public class CircularLinkedListCreation {
    private Node last;

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public String toString(){
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }
    public static void main(String[] args) {
        CircularLinkedListCreation cl = new CircularLinkedListCreation();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        cl.last = sixth;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = first;
    }
}