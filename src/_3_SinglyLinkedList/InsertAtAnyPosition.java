package _3_SinglyLinkedList;
public class InsertAtAnyPosition {

    public void print_ele(){
        ListNode current_node = head;
        while (current_node != null){
            System.out.print(current_node.data+" --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }

    public void insert_node(int data,int position){
        ListNode new_node = new ListNode(data);
        if(position == 1){
            new_node.next = head;
            head = new_node;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while (count < position-1){
                previous = previous.next;
                count ++;
            }
            ListNode current = previous.next;
            new_node.next = current;
            previous.next = new_node;
        }
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;

    public static void main(String[] args) {
        InsertAtAnyPosition in = new InsertAtAnyPosition();
        in.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        in.head.next = second;
        second.next = third;
        third.next = forth;

        in.print_ele();
        in.insert_node(50,2);
        in.print_ele();
    }
}