package _3_SinglyLinkedList;
public class InsertAtLast {
    public void print_ele(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insert_last(int data){
        ListNode new_node = new ListNode(data);

        if(head == null){
            head = new_node;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = new_node;
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
        InsertAtLast ial = new InsertAtLast();
        ial.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        ial.head.next = second;
        second.next = third;
        third.next = forth;

        ial.print_ele();
        ial.insert_last(100);
        ial.print_ele();

    }
}