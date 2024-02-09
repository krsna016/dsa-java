package _3_SinglyLinkedList;
public class RemoveGivenKey {
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

    public void remove_key(int data){
        Node current_node = head;
        Node temp = null;
        while (current_node!=null && current_node.data != data){
            temp = current_node;
            current_node = current_node.next;
        }
        if (current_node == null) return;
        temp.next = current_node.next;
    }

    private Node head;
    public static void main(String[] args) {
        RemoveGivenKey rk = new RemoveGivenKey();
        rk.head = new Node(10);
        Node second = new Node(5);
        Node third = new Node(20);
        Node forth = new Node(30);
        Node fifth = new Node(55);
        Node sixth = new Node(43);

        rk.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        rk.print_node();
        rk.remove_key(55);
        rk.print_node();
    }
}