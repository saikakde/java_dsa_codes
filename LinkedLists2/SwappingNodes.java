package LinkedLists2;

import java.util.ArrayList;

// Swapping Nodes in a Linked ListWehavealinkedlistandtwokeysinit,swapnodesfortwogivenkeys.Nodesshouldbeswappedbychanginglinks.Swappingdataofnodesmaybeexpensiveinmanysituationswhendata contains many fields. It may be assumed that all keys in the linked list are distinct.Sample Input 1: 1->2->3->4,  x = 2, y = 4Sample Output 1: 1->4->3->2Question 4 :Odd Even Linked ListWehaveaLinkedListofintegers,writeafunctiontomodifythelinkedlistsuchthatallevennumbersappearbeforealltheoddnumbersinthemodifiedlinkedlist.Also,keeptheorderofeven and odd numbers same.Sample Input 1: 8->12->10->5->4->1->6->NULLSample Output 1: 8->12->10->4->6->5->1->NULLSample Input 2: 1->3->5->7->NULLSample Output 2:1->3->5->7->NULLQuestion 5 :Merge k Sorted ListsWe have K sorted linked lists of size N each, merge them and print the sorted output.Sample Input 1:k = 2, n =  2l1 = 1->3->NULLl2 = 6->8->NULLl3 = 9->10->NULLSample Output 1: 1>3->6->8->9->10->NULL
public class SwappingNodes {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Alternative method only swapping data and not actually the nodes
    // public static void swap(Node h1, int key1, int key2) {
    //     Node temp = h1;
    //     Node temp2 = h1;
    //     while (temp.data != key1 && temp != null) {
    //         temp = temp.next;
    //     }
    //     while (temp2.data != key2 && temp2 != null) {
    //         temp2 = temp2.next;
    //     }
    //     int swapData = temp.data;
    //     temp.data = temp2.data;
    //     temp2.data = swapData;

    // }

    
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
    
    public static void print(Node h1){
        Node temp = h1;
        if(temp==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }System.out.println("null");
    }
    public static void swap(Node h1,int key1,int key2){
        if(key1 == key2){
            return;
        }
        Node p1=h1,temp1=h1;
        Node p2=h1,temp2 = h1;

        while(temp1.data!=key1){
            p1 = temp1;
            temp1 = temp1.next;
        }
        Node helper = temp1.next;
        while(temp2.data!=key2){
            p2 = temp2;
            temp2 = temp2.next;
        }
        // if(temp1==h1){
        //     // p1.next = temp2;
        //     temp1.next = temp2.next;
        //     helper.next = temp2.next;
        //     temp2.next = helper;
        //     return;
        // }
        if(temp1==p2){
            p1.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
            return;
        }

        p1.next = temp2;
        temp1.next = temp2.next;
        p2.next = temp1;
        temp2.next = helper;
    }

    public static void main(String[] args) {
        Node h1 = new Node(8);
        h1.next = new Node(12);
        h1.next.next = new Node(10);
        h1.next.next.next = new Node(5);
        h1.next.next.next.next = new Node(4);
        h1.next.next.next.next.next = new Node(1);
        h1.next.next.next.next.next.next = new Node(6);

        print(h1);

        swap(h1, 1, 8);
        // evenOddSwap(h1);

        
        print(h1);
    }

}
