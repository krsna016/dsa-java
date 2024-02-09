package _3_SinglyLinkedList;
public class RemoveDuplicateInSortedLL {
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
    public void remove_dup(){
        Node current_node = head;
        while (current_node != null && current_node.next != null){
            if(current_node.data == current_node.next.data) {
                current_node.next = current_node.next.next;
            }else {
                current_node = current_node.next;
            }
        }
    }

    private Node head;
    public static void main(String[] args) {
        RemoveDuplicateInSortedLL rd = new RemoveDuplicateInSortedLL();
        rd.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);

        rd.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        rd.print_node();
        rd.remove_dup();
        rd.print_node();
    }
}