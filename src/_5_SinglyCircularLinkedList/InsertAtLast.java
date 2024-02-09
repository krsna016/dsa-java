package _5_SinglyCircularLinkedList;
public class InsertAtLast{
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

    public void insert_last(int data){
        Node new_node = new Node(data);
        Node head = last.next;
        last.next = new_node;
        new_node.next = head;
        last = new_node;
    }

    public static void main(String[] args) {
        InsertAtLast il = new InsertAtLast();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        il.last = sixth;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = first;

        il.print_the_node();
        il.insert_last(70);
        il.insert_last(80);
        il.print_the_node();
    }
}