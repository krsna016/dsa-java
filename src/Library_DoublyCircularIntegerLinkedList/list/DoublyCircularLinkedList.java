package Library_DoublyCircularIntegerLinkedList.list;

import Library_DoublyCircularIntegerLinkedList.node.Node;
import Library_DoublyCircularIntegerLinkedList.adt.AbstractClass;

public class DoublyCircularLinkedList implements AbstractClass {

    public Node head;
    public int size;
    public Node tail;

    public DoublyCircularLinkedList() {
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
            head.next = tail;
            tail.previous = head;
        } else {
            head.previous = new_node;
            new_node.next = head;
            head = new_node;
            head.previous = tail;
            tail.next = head;
        }
        size++;
    }

    @Override
    public void add_last(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            tail = new_node;
            head = new_node;
            head.next = tail;
            tail.previous = head;
            size++;
            return;
        } else {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
            tail.next = head;
            head.previous = tail;
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
        head.previous = tail;
        tail.next = head;
        size--;
    }

    @Override
    public void remove_last() {
        if (is_empty())
            return;
        if (head == tail) {
            head = null;
            tail = null;
            head.next = tail;
            tail.previous = head;
        } else {
            Node temp = tail.previous;
            temp.next = null;
            tail = temp;
            tail.next = head;
            head.previous = tail;
        }
        size--;
    }

    @Override
    public void print_forward(Node head_) {
        Node current_node = head_;
        do {
            System.out.print(current_node.data + " --> ");
            current_node = current_node.next;
        } while (current_node != head_);
        System.out.println("null");
    }

    @Override
    public void print_backward(Node tail_) {
        Node current_node = tail_;
        do {
            System.out.print(current_node.data + " --> ");
            current_node = current_node.previous;
        } while (current_node != tail_);
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
        head.previous = tail;
        tail.next = head;
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
        head.previous = tail;
        tail.next = head;
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
        do {
            temp = current_node.previous;
            current_node.previous = current_node.next;
            current_node.next = temp;
            current_node = current_node.previous;
        } while (current_node != head);
        if (temp != null) {
            Node oldHead = head;
            head = tail;
            tail = oldHead;
        }
        head.previous = tail;
        tail.next = head;
    }

    @Override
    public boolean search_node(int data) {
        Node current_node = head;
        do {
            if (current_node.data == data)
                return true;
            current_node = current_node.next;
        } while (current_node != head);
        return false;
    }
}