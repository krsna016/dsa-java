package Library_SinglyIntegerLinkedList.main;

import Library_SinglyIntegerLinkedList.list.SinglyLinkedList;
import Library_SinglyIntegerLinkedList.node.Node;

// Main method to implement the SinglyLinkedList class:
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        System.out.println(sll.head);

        System.out.println("Size : " + sll.get_size());
        System.out.println("IsEmpty : " + sll.is_empty());
        sll.print_element(sll.head);

        sll.add_first(10);
        sll.add_first(20);
        sll.add_first(30);
//        System.out.println(sll.head);
        sll.print_element(sll.head);

        sll.add_last(40);
        sll.add_last(50);
        sll.add_last(60);
        sll.print_element(sll.head);

        System.out.println("Size : " + sll.get_size());
        sll.remove_first();
        sll.remove_last();
        sll.print_element(sll.head);

        sll.add_any(30, 3);
        sll.print_element(sll.head);
        sll.remove_any(2);
        sll.print_element(sll.head);

        sll.reverse(sll.head);
        sll.print_element(sll.head);

        System.out.println("Node is present : " + sll.search_node(40));
    }
}