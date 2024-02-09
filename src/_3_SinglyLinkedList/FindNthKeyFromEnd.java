package _3_SinglyLinkedList;

public class FindNthKeyFromEnd {

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
    private Node head;

    public Node n_from_end(int n){
        Node main_pointer = head;
        Node reference_pointer = head;
        int count = 0;
        while (count < n){
            reference_pointer = reference_pointer.next;
            count ++;
        }
        while (reference_pointer!=null){
            main_pointer = main_pointer.next;
            reference_pointer = reference_pointer.next;
        }
        main_pointer.next = null;
        return main_pointer;
    }

    public static void main(String[] args) {
        FindNthKeyFromEnd fn = new FindNthKeyFromEnd();
        fn.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        fn.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        System.out.println(fn.n_from_end(1));
        System.out.println(fn.n_from_end(4));

    }
}