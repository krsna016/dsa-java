package Library_SinglyIntegerLinkedList.list;

import Library_SinglyIntegerLinkedList.node.Node;
import Library_SinglyIntegerLinkedList.adt.AbstractClass;

public class SinglyLinkedList implements AbstractClass {

    public Node head;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean is_empty() {
        return size == 0;
    }

    @Override
    public int get_size() {
        return size;
    }

    @Override
    public void add_first(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            head = new_node;
            size++;
            return;
        }
        new_node.next = head;
        head = new_node;
        size++;
    }

    @Override
    public void add_last(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            add_first(data);
            return;
        }
        Node current_node = head;
        while (current_node.next != null) {
            current_node = current_node.next;
        }
        current_node.next = new_node;
        size++;
    }

    @Override
    public void remove_first() {
        if (is_empty())
            return;
        head = head.next;
        size--;
    }

    @Override
    public void remove_last() {
        if (is_empty()) return;
        if (size == 1) {
            remove_first();
            return;
        }
        Node current_node = head;
        Node previous_node = null;
        while (current_node.next != null) {
            previous_node = current_node;
            current_node = current_node.next;
        }
        previous_node.next = null;
        size--;
    }

    @Override
    public void print_element(Node head_) {
        Node current_node = head_;
        while (current_node != null) {
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }

    @Override
    public void add_any(int data, int position) {
        Node new_node = new Node(data);
        if (is_empty()) {
            add_first(data);
            return;
        }
        Node previous_node = head;
        int count = 1;
        while (count < position - 1) {
            previous_node = previous_node.next;
            count++;
        }
        Node current_node = previous_node.next;
        previous_node.next = new_node;
        new_node.next = current_node;
        size++;
    }

    @Override
    public void remove_any(int position) {
        if (is_empty())
            return;
        if (size == 1) {
            remove_first();
            return;
        }
        Node previous_node = head;
        int count = 1;
        while (count < position - 1) {
            previous_node = previous_node.next;
            count++;
        }
        previous_node.next = previous_node.next.next;
        size--;
    }

    @Override
    public Node reverse(Node head_) {
        if (is_empty())
            return head;
        Node current_node = head_;
        Node previous_node = null;
        Node next_node = null;
        while (current_node != null) {
            next_node = current_node.next;
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = next_node;
        }
        head = previous_node;
        return head;
    }

    @Override
    public boolean search_node(int data) {
        Node current_node = head;
        while (current_node != null) {
            if (current_node.data == data)
                return true;
            current_node = current_node.next;
        }
        return false;
    }
}