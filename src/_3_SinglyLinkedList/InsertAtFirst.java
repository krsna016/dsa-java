package _3_SinglyLinkedList;
public class InsertAtFirst {

    public void print_ele(){
        ListNode current = head;
        System.out.print("[ ");
        while (current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public void insert_at_begin(int data){
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;
    public static void main(String[] args) {
        InsertAtFirst iab = new InsertAtFirst();
        iab.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        iab.head.next = second;
        second.next = third;
        third.next = forth;

        iab.print_ele();
        iab.insert_at_begin(90);
        iab.print_ele();
        iab.insert_at_begin(100);
        iab.print_ele();
    }
}