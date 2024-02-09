package _3_SinglyLinkedList;

public class PrintTheNodes {
    public void print_ele(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
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
        PrintTheNodes pe = new PrintTheNodes();

        pe.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        pe.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        pe.print_ele(pe.head);
    }
}