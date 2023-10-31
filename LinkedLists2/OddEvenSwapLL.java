package LinkedLists2;

import java.util.ArrayList;
public class OddEvenSwapLL {


// Swapping Nodes in a Linked ListWehavealinkedlistandtwokeysinit,swapnodesfortwogivenkeys.Nodesshouldbeswappedbychanginglinks.Swappingdataofnodesmaybeexpensiveinmanysituationswhendata contains many fields. It may be assumed that all keys in the linked list are distinct.Sample Input 1: 1->2->3->4,  x = 2, y = 4Sample Output 1: 1->4->3->2Question 4 :Odd Even Linked ListWehaveaLinkedListofintegers,writeafunctiontomodifythelinkedlistsuchthatallevennumbersappearbeforealltheoddnumbersinthemodifiedlinkedlist.Also,keeptheorderofeven and odd numbers same.Sample Input 1: 8->12->10->5->4->1->6->NULLSample Output 1: 8->12->10->4->6->5->1->NULLSample Input 2: 1->3->5->7->NULLSample Output 2:1->3->5->7->NULLQuestion 5 :Merge k Sorted ListsWe have K sorted linked lists of size N each, merge them and print the sorted output.Sample Input 1:k = 2, n =  2l1 = 1->3->NULLl2 = 6->8->NULLl3 = 9->10->NULLSample Output 1: 1>3->6->8->9->10->NULL
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void evenOddSwap(Node h1) {
        Node even = h1;
        Node odd = h1;
        ArrayList<Integer> list = new ArrayList<>();

        while (even != null) {
            if (even.data % 2 == 0) {
                list.add(even.data);
            }
            even = even.next;
        }
        while (odd != null) {
            if (odd.data % 2 != 0) {
                list.add(odd.data);
            }
            odd = odd.next;
        }
        Node temp = h1;
        for (int i = 0; i < list.size(); i++) {
            temp.data = list.get(i);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node h1 = new Node(8);
        h1.next = new Node(12);
        h1.next.next = new Node(10);
        h1.next.next.next = new Node(5);
        h1.next.next.next.next = new Node(4);
        h1.next.next.next.next.next = new Node(1);
        h1.next.next.next.next.next.next = new Node(6);

        evenOddSwap(h1);

        while (h1 != null) {
            System.out.print(h1.data + "->");
            h1 = h1.next;
        }
    }

}

    

