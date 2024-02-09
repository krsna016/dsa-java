package Library_SinglyIntegerLinkedList;public class IntegerLinkedList implements AbstractClass{    public Node head;    public int size;    public IntegerLinkedList(){        this.head = null;        this.size = 0;    }    /**        Overridden the toString method of String class in order to get the formatted output while printing Node instead        of getting hashCode:     */    @Override    public String toString(){        if(head == null){            return "Node{data = NotAssigned, next = NotAssigned}";        }        return "Node{data = "+head.data+", next = "+head.next+"}";    }    /**        Methods for the IntegerLinkedList class:    */    @Override    public void print(Node head) {        Node current_node = head;        while (current_node!= null){            System.out.print(current_node.data + " --> ");            current_node = current_node.next;        }        System.out.println("null");    }    @Override    public boolean is_empty() {        if(this.head == null){            return true;        }        return false;    }    @Override    public int get_size() {        return size;    }    @Override    public void add_first(int data) {        this.head = new Node(data,this.head);        this.size++;        return;    }    @Override    public void add_last(int data) {        Node new_node = new Node(data);        if(head == null){            head = new_node;            return;        }        Node current_node = head;        while (current_node.next != null){            current_node = current_node.next;        }        current_node.next = new_node;        this.size++;    }    @Override    public void add_anywhere(int data, int position){        Node new_node = new Node(data);        if(this.head == null){            head = new_node;            return;        }        Node previous_node = head;        int count = 1;        while (count < position-1){            previous_node = previous_node.next;            count ++;        }        Node current_node = previous_node.next;        previous_node.next = new_node;        new_node.next = current_node;        size ++;    }    @Override    public Node remove_first() {        if(this.head == null){            return head;        }        Node current_node = head;        head = head.next;        current_node.next = null;        size --;        return current_node;    }    @Override    public Node remove_last() {        if(this.head == null){            return head;        }        if(this.head.next == null){            return remove_first();        }        Node previous_node = null;        Node current_node = head;        while (current_node.next!=null){            previous_node = current_node;            current_node = current_node.next;        }        previous_node.next = null;        size--;        return current_node;    }    @Override    public Node remove_anywhere(int position) {        // 1 -> 2 -> 3 -> 4 -> 5 -> null        if(this.head == null){            return head;        }        if(this.head.next == null){            return remove_first();        }        Node previous_node = head;        int count = 1;        while (count < position-1){            previous_node = previous_node.next;            count++;        }        Node current_node = previous_node.next;        previous_node.next = current_node.next;        current_node.next = null;        size--;        return current_node;    }    @Override    public boolean search(int data) {        Node current_node = head;        while (current_node != null){            if(current_node.data == data){                return true;            }            current_node = current_node.next;        }        return false;    }    @Override    public Node reverse(Node head) {        Node current_node = head;        Node previous_node = null;        Node next_node = null;        while (current_node != null){            next_node = current_node.next;            current_node.next = previous_node;            previous_node = current_node;            current_node = next_node;        }        return previous_node; // previous node is the new head for the reversed LL    }    @Override    public Node find_middle() {        Node slow_pointer = head;        Node fast_pointer = head;        while (fast_pointer != null && fast_pointer.next != null){            slow_pointer = slow_pointer.next;            fast_pointer  = fast_pointer.next.next;        }        slow_pointer.next = null;        return slow_pointer;    }    @Override    public void find_nth_from_end() {    }    @Override    public void find_nth_from_start() {    }    @Override    public void remove_duplicates() {    }}