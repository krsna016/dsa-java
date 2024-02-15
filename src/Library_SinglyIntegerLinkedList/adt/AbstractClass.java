package Library_SinglyIntegerLinkedList.adt;

import Library_SinglyIntegerLinkedList.node.Node;

public interface AbstractClass {
    boolean is_empty();

    int get_size();

    void add_first(int data);

    void add_last(int data);

    void remove_first();

    void remove_last();

    void print_element(Node head);

    void add_any(int data, int position);

    void remove_any(int position);

    Node reverse(Node head);

    boolean search_node(int data);
}
