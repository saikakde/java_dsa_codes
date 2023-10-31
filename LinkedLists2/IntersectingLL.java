package LinkedLists2;

public class IntersectingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int intersecting(Node h1, Node h2) {
        Node temp = h1;
        Node temp2 = h2;

        while (temp != null) {
            while (h2 != null) {
                if (temp == h2) {
                    return temp.data;
                }
                h2 = h2.next;
            }
            temp = temp.next;
            h2 = temp2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(2);

        Node h2 = new Node(3);
        h2.next = h1.next;

        // Node temp = new Node(5);
        // h1.next.next = temp;

        // Node h2 = new Node(3);
        // h2.next = new Node(4);
        // h2.next.next = temp;

        // h1.next.next.next = new Node(6);

        System.out.println(intersecting(h1, h2));

        // while(h1!=null){
        // System.out.print(h1.data+"->");
        // h1 = h1.next;
        // }
        // System.out.println();
        // while(h2!=null){
        // System.out.print(h2.data+"->");
        // h2 = h2.next;
        // }
    }

}