package LinkedLists2;

public class CyclicLL {
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

    public boolean isCyclic() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("cyclic");
                return true;
            }
        }
        System.out.println("not cyclic");
        return false;
    }

    public void removeCylic() {
        Node slow = head;
        Node fast = head;

        boolean result = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                result = true;
                break;
            }
        }

        if (result == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
        // System.out.println("cyclic");
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
        CyclicLL ll = new CyclicLL();

        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        temp.next = head.next;

        // head.next.next = new Node(3);
        // head.next.next.next = head;

        ll.isCyclic();
        ll.removeCylic();
        ll.print();
        ll.isCyclic();

    }
}