package Library_SinglyIntegerLinkedList;
public class Main {
    public static void main(String[] args) {
        IntegerLinkedList ls1 = new IntegerLinkedList();
        System.out.println(ls1);

        ls1.print(ls1.head);
        ls1.add_first(10);
        ls1.print(ls1.head);
        System.out.println(ls1);
        ls1.add_first(20);
        ls1.print(ls1.head);
        ls1.add_last(20);
        ls1.print(ls1.head);
        ls1.add_anywhere(1,2);
        ls1.print(ls1.head);
        ls1.remove_first();
        ls1.print(ls1.head);
        ls1.remove_last();
        ls1.print(ls1.head);
        ls1.add_first(20);
        ls1.print(ls1.head);
        ls1.add_first(30);
        ls1.print(ls1.head);
        ls1.remove_anywhere(3);
        ls1.print(ls1.head);
        System.out.println(ls1.get_size());
        System.out.println(ls1.is_empty());
        System.out.println(ls1.search(30));
        System.out.println(ls1.search(20));
        System.out.println(ls1.search(10));
        System.out.println(ls1.search(50));
        ls1.print(ls1.head);
        Node new_head = ls1.reverse(ls1.head);
        ls1.print(new_head);
        System.out.println("\n\n");


        IntegerLinkedList ls2 = new IntegerLinkedList();
        ls2.add_first(10);
        ls2.add_last(20);
        ls2.add_last(30);
        ls2.add_last(40);
        ls2.print(ls2.head);
        System.out.println(ls1.find_middle());
    }
}
