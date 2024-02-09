package _5_SinglyCircularLinkedList;
public class PrintNode{
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

    public void print_the_node(){
        Node head = last.next;
        while (head != last){
            System.out.print(head.data+" --> ");
            head = head.next;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        PrintNode pn = new PrintNode();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        pn.last = sixth;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = first;

        pn.print_the_node();
    }
}