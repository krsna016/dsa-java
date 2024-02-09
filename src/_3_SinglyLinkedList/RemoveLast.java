package _3_SinglyLinkedList;
public class RemoveLast {

    public void print_ele(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node delete_last_ele(){
        if(head == null || head.next == null){
            return head;
        }
        Node previous = null;
        Node current = head;
        while (current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
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
        RemoveLast rl = new RemoveLast();
        rl.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        rl.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;

        rl.print_ele();
        System.out.println("The deleted node is : "+rl.delete_last_ele());
        rl.print_ele();
    }
}