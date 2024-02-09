package _3_SinglyLinkedList;
import Library_SinglyIntegerLinkedList.Node;

public class MergeTwoSortedLL {

    public static void print_node(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node merge_list(Node l1,Node l2){
        Node dummy = new Node(0);
        Node tail = dummy;
        while (l1 != null && l2 !=null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 == null){
            tail.next = l2;
        }else {
            tail.next = l1;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node head_ = new Node(20);

        Node s1 = new Node(30);
        Node t1 = new Node(50);

        Node s2 = new Node(40);
        Node t2 = new Node(60);

        head.next = s1;
        s1.next = t1;

        head_.next = s2;
        s2.next = t2;

        System.out.println("LL1 and LL2 are:");
        print_node(head);
        print_node(head_);
        System.out.println("After merging the two sorted linked list:");
        Node k = merge_list(head,head_);
        print_node(k);
    }
}