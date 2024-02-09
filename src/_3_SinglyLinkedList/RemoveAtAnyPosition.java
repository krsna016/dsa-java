package _3_SinglyLinkedList;
public class RemoveAtAnyPosition {
    public void print_ele(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node delete_any(int position){
        if(head == null){
            return head;
        }
        Node previous = head;
        int count = 1;
        while (count<position-1){
            previous = previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next = current.next;
        current.next = null;
        return current;
    }

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        @Override
        public String toString(){
            return "Node = [data = "+data+", next = "+next+"]";
        }
    }
    private Node head;
    public static void main(String[] args) {
        RemoveAtAnyPosition rn = new RemoveAtAnyPosition();
        rn.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        rn.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        rn.print_ele();
        System.out.println("The deleted node is : "+rn.delete_any(3));
        rn.print_ele();
    }
}