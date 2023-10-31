package LinkedLists;

public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        if (head == null) {
            head = tail = new Node(data);
        } else {
            Node temp = new Node(data);
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head == tail) {
            System.out.println(head.data);
            head = null;
            tail = null;
            size--;
            return;
        }

        size--;
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;

        System.out.println(temp.data);
    }

    public void addLast(int data) {
        size++;
        if (head == null) {
            addFirst(data);
            return;
        }
        Node temp = new Node(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head == tail) {
            System.out.println(head.data);
            head = null;
            tail = null;
            size--;
            return;
        }

        System.out.println(tail.data);
        Node temp = tail.prev;
        temp.next = null;
        tail.prev = null;
        tail = temp;

    }

    public void add(int index, int data) {
        // implementation pending
    }

    public void remove(int index) {
        // implementation pending
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reversePrint() {
        // my approach using tail

        // Node temp = tail;
        // while(temp!=null){
        // System.out.print(temp.data+"<->");
        // temp = temp.prev;
        // }
        // System.out.println("null");
        // ---------------------------------

        // shradhas approach using head
        Node current = head;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();

        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.addLast(4);
        dl.addLast(5);

        dl.print();
        // dl.reversePrint();
        // dl.print();
        dl.removeFirst();
        dl.removeLast();
        dl.print();

    }
}
