package _4_DoublyLinkedList;
public class InsertAtLast{

    private Node head;
    private Node tail;

    public void print_node(){
        Node current_node = head;
        while (current_node != null){
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }
    public void insert_last(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }else {
            tail.next = new_node;
        }
        new_node.previous = tail;
        tail = new_node;
    }
    private static class Node{
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
        InsertAtLast ial = new InsertAtLast();
        ial.insert_last(50);
        ial.insert_last(40);
        ial.insert_last(30);
        ial.insert_last(20);
        ial.insert_last(10);
        ial.print_node();
        System.out.println(ial.tail);
        System.out.println(ial.head);
    }
}