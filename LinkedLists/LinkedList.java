package LinkedLists;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        size--;
        int val = temp.next.data;
        tail = temp;
        temp.next = null;
        return val;
    }

    public void add(int index, int data) {
        if (index == 0 && size == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remove(int index) {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size <= index || index < 0) {
            System.out.println("index out of bound");
            return Integer.MIN_VALUE;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removelast();
        }
        Node temp = head;
        Node temp2 = temp.next;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
            temp2 = temp.next;
        }
        // temp2 = temp2.next;
        int val = temp2.data;
        temp.next = temp2.next;
        temp2.next = null;
        size--;
        return val;
    }

    public int removeNthFromEnd(int nFromEnd) {
        if (nFromEnd > size) {
            System.out.println("out of bound");
            return -1;
        }
        int nFromStart = size - nFromEnd;
        Node previous = head;
        while (nFromStart != 1) {
            previous = previous.next;
            nFromStart--;
        }
        int val = previous.next.data;
        previous.next = previous.next.next;
        return val;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int index = 0;
        while (index < size) {
            if (temp.data == key) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return Integer.MIN_VALUE;
    }

    public int recursiveSearch(int key, Node head) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = recursiveSearch(key, head.next);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public void reverseLL(Node head, int index) {
        // My approach

        // if(size ==0){
        // System.out.println("null");
        // }
        // if(size == 1){
        // System.out.println(head.data+"->null");
        // return;
        // }
        // if(index == size){
        // return;
        // }
        // reverseLL(head.next, index+1);
        // System.out.print(head.data+"->");
        // index--;
        // if(index ==-1){
        // System.out.print("null");
        // }

        // --------------------------------------
        // Shradhas approach

        Node prev = null;
        Node current = tail = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public Node midOfLL(Node head) {
        // int mid = 0;
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // mid++;
        }
        return slow;
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = midOfLL(head);

        Node prev = null;
        Node current = midNode;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.add(3, 4);
        ll.addLast(5);

        // ll.add(1, 1);
        // ll.addFirst(5);

        ll.print();
        System.out.println("size: "+size);
        System.out.println("_________________");

        // System.out.println(ll.removeFirst());
        // // ll.removeFirst();
        // ll.print();
        // System.out.println(size);
        // System.out.println("_________________");

        // System.out.println(ll.removelast());
        // // ll.removelast();
        // ll.print();
        // System.out.println(size);
        // System.out.println("_________________");

        // System.out.println(ll.remove(-1));
        // // ll.remove(2);
        // ll.print();
        // System.out.println(size);

        // System.out.println(ll.iterativeSearch(1));
        // System.out.println(ll.recursiveSearch(2, head));

        // System.out.println(ll.recursiveSearch(8, head));

        // ll.reverseLL(head,0);

        // System.out.println(ll.removeNthFromEnd(2));
        // ll.print();

        // to check if palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // System.out.println(ll.palindrome());

    }
}
