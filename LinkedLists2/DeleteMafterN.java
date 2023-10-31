package LinkedLists2;

public class DeleteMafterN {
    static class Node {
        int data;
        Node next;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;
        if (curr != null) {
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;
            if (curr == null)
                return;
            t = curr.next;
            curr.next = null;
            Node temp = t;
            for (count = 1; count <= N && temp != null; count++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
            return;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int M = -5, N = 15;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", M, N);
        printList(head);
        skipMdeleteN(head, M, N);
        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);
    }
}

// my approaches(both approach work fine)

// public class DeleteMafterN {
// static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }}

//     public static Node head;

//     public static void deleteMafterN(Node h1, int N, int M) {

//         Node temp1 = h1;

//         if (M == 0) {
//             Node temp2 = h1;
//             while (N != 0) {
//                 temp2 = temp2.next;
//                 N--;
//             }
//             h1 = temp2;
//             print(h1);
//             return;
//         }
//         if (N != 0) {
//             while (M > 1 && temp1 != null) {
//                 temp1 = temp1.next;
//                 M--;
//             }
//             if (temp1 == null) {
//                 print(h1);
//                 return;
//             }
//             Node temp2 = temp1.next;
//             temp1.next = null;

//             while (N != 0) {
//                 temp2 = temp2.next;
//                 if (temp2 == null) {
//                     print(h1);
//                     return;
//                 }
//                 N--;
//             }
//             temp1.next = temp2;
//             print(h1);
//         } else {
//             print(h1);
//             return;
//         }
//     }

//     public static void print(Node head) {
//         Node temp = head;
//         if (head == null) {
//             System.out.println("null");
//             return;
//         }
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Node h1 = new Node(1);
//         h1.next = new Node(2);
//         h1.next.next = new Node(3);
//         h1.next.next.next = new Node(4);
//         h1.next.next.next.next = new Node(5);
//         print(h1);
//         deleteMafterN(h1, 3, 1);

//     }
// }