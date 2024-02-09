package _3_SinglyLinkedList;
public class RemoveFirst {
    public void print_ele(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Node delete_1st_ele() {
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        RemoveFirst rf = new RemoveFirst();
        rf.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        rf.head.next = second;
        second.next = third;
        third.next = forth;

        rf.print_ele();
        System.out.println("The deleted node is : "+rf.delete_1st_ele());
        rf.print_ele();
    }
}
