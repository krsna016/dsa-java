package _3_SinglyLinkedList;
public class RemoveTheLoop {
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
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node has_loop(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                remove_the_loop(slow);
            }
        }
        return null;
    }
    public void remove_the_loop(Node ptr){
        Node temp = head;
        while (temp.next != ptr.next){
            ptr = ptr.next;
            temp = temp.next;
        }
        ptr.next = null;
    }

    private Node head;
    public static void main(String[] args) {
        RemoveTheLoop rl = new RemoveTheLoop();
        rl.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(50);

        rl.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
        rl.has_loop(); // The loop is removed
        rl.print_node();
    }
}