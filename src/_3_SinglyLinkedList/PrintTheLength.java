package _3_SinglyLinkedList;

public class PrintTheLength {
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;
    public int print_len(){
        if(head == null){
            return 0;
        }
        int len = 0;
        ListNode current = head;
        while (current != null){
            len += 1;
            current = current.next;
        }
        return  len;
    }
    public static void main(String[] args) {
        PrintTheLength pl = new PrintTheLength();
        pl.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        pl.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        System.out.print("The lenght of the linked list is : ");
        System.out.println(pl.print_len());
    }
}