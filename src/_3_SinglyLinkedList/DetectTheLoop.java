package _3_SinglyLinkedList;
public class DetectTheLoop {
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


    public boolean detect_the_loop(){
        Node fast_pointer = head;
        Node slow_pointer = head;
        while (fast_pointer != null && fast_pointer.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if(slow_pointer == fast_pointer){
                return true;
            }
        }
        return false;
    }

    private Node head;
    public static void main(String[] args) {
        DetectTheLoop dl = new DetectTheLoop();
        dl.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);

        dl.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
        boolean temp = dl.detect_the_loop();
        if(temp){
            System.out.println("Loop detected");
        }else{
            System.out.println("No loop detected");
        }
    }
}