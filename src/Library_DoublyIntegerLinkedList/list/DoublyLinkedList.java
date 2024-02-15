package Library_DoublyIntegerLinkedList.list;

import Library_DoublyIntegerLinkedList.node.Node;
import Library_DoublyIntegerLinkedList.adt.AbstractClass;

public class DoublyLinkedList implements AbstractClass {

    public Node head;
    public int size;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
        this.tail = null;
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
            tail = new_node;
            head = new_node;
        } else {
            head.previous = new_node;
            new_node.next = head;
            head = new_node;
        }
        size++;
    }

    @Override
    public void add_last(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            tail = new_node;
            head = new_node;
            size++;
            return;
        } else {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
            size++;
        }
    }

    @Override
    public void remove_first() {
        if (is_empty()) {
            tail = null;
            return;
        }
        Node temp = head.next;
        head.next = null;
        temp.previous = null;
        head = temp;
        size--;
    }

    @Override
    public void remove_last() {
        if (is_empty())
            return;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = tail.previous;
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    @Override
    public void print_forward(Node head_) {
        Node current_node = head_;
        while (current_node != null) {
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        }
        System.out.println("null");
    }

    @Override
    public void print_backward(Node tail_) {
        Node current_node = tail_;
        while (current_node != null) {
            System.out.print(current_node.data + " --> ");
            current_node = current_node.previous;
        }
        System.out.println("null");
    }

    @Override
    public void add_any(int data, int position) {
        if (position < 1 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (is_empty() && position == 1) {
            add_first(data);
            return;
        }
        Node new_node = new Node(data);
        Node previous_node = head;
        int count = 1;
        while (count < position - 1 && previous_node.next != null) {
            previous_node = previous_node.next;
            count++;
        }
        Node temp = previous_node.next;
        previous_node.next = new_node;
        new_node.previous = previous_node;
        new_node.next = temp;
        if (temp != null) {
            temp.previous = new_node;
        }
        size++;
    }

    @Override
    public void remove_any(int position) {
        if (position < 1 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (is_empty())
            return;
        if (position == 1) {
            remove_first();
            return;
        }
        Node previous_node = head;
        int count = 1;
        while (count < position - 1 && previous_node.next != null) {
            previous_node = previous_node.next;
            count++;
        }
        Node temp = previous_node.next;
        if (temp == tail) {
            tail = previous_node;
        } else {
            previous_node.next = previous_node.next.next;
            if (previous_node.next != null) {
                previous_node.next.previous = previous_node;
                temp.previous = null;
            }
        }
        size--;
    }

    @Override
    public void reverse() {
        if (is_empty()) {
            head = null;
            tail = null;
            return;
        }
        Node current_node = head;
        Node temp = null;
        while (current_node != null) {
            temp = current_node.previous;
            current_node.previous = current_node.next;
            current_node.next = temp;
            current_node = current_node.previous;
        }
        if (temp != null) {
            Node oldHead = head;
            head = tail;
            tail = oldHead;
        }
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