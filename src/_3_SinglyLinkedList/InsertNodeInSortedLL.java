package _3_SinglyLinkedList;
public class InsertNodeInSortedLL {
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

    public void print_node(){
        Node current_node = head;
        while (current_node != null){
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }

    public void add_node(int data){
        Node current_node = head;
        Node new_node = new Node(data);
        Node temp = null;
        while (current_node != null && current_node.data < new_node.data){
            temp = current_node;
            current_node = current_node.next;
        }
        temp.next = new_node;
        new_node.next = current_node;
    }

    private Node head;
    public static void main(String[] args) {
        InsertNodeInSortedLL in = new InsertNodeInSortedLL();
        in.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);

        in.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        in.print_node();
        in.add_node(30);
        in.print_node();
    }
}