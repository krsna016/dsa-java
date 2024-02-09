package _3_SinglyLinkedList;
public class SearchElement {
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public boolean search_ele(int value){
        Node current = head;
        while (current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchElement se = new SearchElement();
        se.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        se.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        boolean temp = se.search_ele(50);
        System.out.println(temp);
        boolean temp1 = se.search_ele(70);
        System.out.println(temp1);
    }
}
