package _3_SinglyLinkedList;
public class SinglyLinkedListCreation {
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head; // 'head' pointing null

    public static void main(String[] args) {
        SinglyLinkedListCreation sllc = new SinglyLinkedListCreation();

        // Assigning data to each nodes:

        sllc.head = new ListNode(10); // 'head' pointing 10
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        // Connecting each nodes:

        sllc.head.next = second; // 10 --> 20
        second.next = third; // 10 --> 20 --> 30
        third.next = forth; // 10 --> 20 --> 30 --> 40
        forth.next = null; // 10 --> 20 --> 30 --> 40 --> null
    }
}