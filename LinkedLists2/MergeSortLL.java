package LinkedLists2;

public class MergeSortLL {
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
    // public static int size;

    public Node midOfLL(Node head) { // modified its not same as we do for palinfrome
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 !=null && head2 != null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node mergeSortLL(Node head){
        if(head==null || head.next == null){
            return head;
        }

        Node mid = midOfLL(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSortLL(head);
        Node newRight = mergeSortLL(rightHead);

        return merge(newLeft,newRight);

        // Node slow = head;
        // Node fast = head.next;
        // while(fast.next!=null && fast.next.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
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
    public void addFirst(int data) {
        Node newNode = new Node(data);
        // size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();

        // head = new Node(5);
        // head.next = new Node(4);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(2);
        // head.next.next.next.next = new Node(1);

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        // System.out.println("_________________");
        head = ll.mergeSortLL(head);
        ll.print();

    }
}

