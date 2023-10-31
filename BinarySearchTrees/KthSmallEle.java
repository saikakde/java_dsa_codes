package BinarySearchTrees;

import java.util.ArrayList;

public class KthSmallEle {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
        }
    }
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // kth small from start
    static int x=0;
    public static void kthSmall(Node root,int k) {
        if (root == null) {
            return;
        }
        x= x+1;
        if(k == x){
            System.out.println(root.data);
            return;
        }
        kthSmall(root.left,k);
        kthSmall(root.right, k);
    }

    // below here is code for kth small from end
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void kthSmallFromEnd(Node root,int kend){
        kthUtil(root);
        System.out.println(arr.get(arr.size()-kend));
    }

    public static void kthUtil(Node root) {
        if(root == null){
            return;
        }
        kthUtil(root.left);
        arr.add(root.data);
        kthUtil(root.right);
    }

    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        kthSmall(root,5);

        kthSmallFromEnd(root, 5);
    }
}
