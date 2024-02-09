package Library_SinglyIntegerLinkedList;
public interface AbstractClass {
    void print(Node head);
    boolean is_empty();
    int get_size();
    void add_first(int data);
    void add_last(int data); // Or called simply add
    void add_anywhere(int data,int position);
    Node remove_first();
    Node remove_last();
    Node remove_anywhere(int position);
    boolean search(int data);
    Node reverse(Node head);
    Node find_middle();
    void find_nth_from_end();
    void find_nth_from_start();
    void remove_duplicates();
}
