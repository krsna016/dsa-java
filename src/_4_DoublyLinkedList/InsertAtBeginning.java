package _4_DoublyLinkedList;
public class InsertAtBeginning {

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
    public void insert_first(int data){
        Node new_node = new Node(data);
        if(head == null){
            tail = new_node;
        }else{
            head.previous = new_node;
        }
        new_node.next = head;
        head = new_node;
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
            return "Node{" +
                    "previous=" + (previous!=null?previous.data:"null") +
                    ", data=" + data +
                    ", next=" + (next!=null?next.data:"null") + "}";
        }
    }

    public static void main(String[] args) {
        InsertAtBeginning iab = new InsertAtBeginning();
        iab.insert_first(50);
        iab.insert_first(40);
        iab.insert_first(30);
        iab.insert_first(20);
        iab.insert_first(10);
        iab.print_node();
        System.out.println("Head: "+iab.head);
        System.out.println("Tail: "+iab.tail);
    }
}