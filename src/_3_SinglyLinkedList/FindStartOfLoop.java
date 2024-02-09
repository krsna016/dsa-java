package _3_SinglyLinkedList;
public class FindStartOfLoop {
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

    public Node has_loop(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return find_start_of_loop(slow);
            }
        }
        return null;
    }
    public Node find_start_of_loop(Node ptr){
        Node temp = head;
        while (temp != ptr){
            ptr = ptr.next;
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    private Node head;
    public static void main(String[] args) {
        FindStartOfLoop sl = new FindStartOfLoop();
        sl.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);

        sl.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
        System.out.println(sl.has_loop());
    }
}