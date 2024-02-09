package _4_DoublyLinkedList;
public class DeleteFirst {

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
    public void delete_first(){
        Node temp = null;
        if(head==tail){
            tail = null;
        }
        if(head != null){
            temp = head.next;
            head.next = null;
            temp.previous = null;
        }
        head = temp;
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
            return "Node{" + "previous=" +
                    (previous!=null?previous.data:"null") +
                    ", data=" + data + ", next=" +
                    (next!=null?next.data:"null") + "}";
        }
    }

    public static void main(String[] args) {
        DeleteFirst df = new DeleteFirst();
        df.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        df.head.next = second;

        second.next = third;
        third.next = forth;
        forth.next = fifth;
        second.previous = df.head;
        third.previous = second;
        forth.previous = third;
        fifth.previous = forth;

        df.tail = fifth;
        df.print_node();
        df.delete_first();
        df.print_node();
        df.delete_first();
        df.print_node();
    }
}