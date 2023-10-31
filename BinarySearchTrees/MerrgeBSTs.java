package BinarySearchTrees;

import java.util.ArrayList;

public class MerrgeBSTs {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    public static Node finalBST(ArrayList<Integer> finalArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(finalArr.get(mid));
        root.left = finalBST(finalArr, start, mid - 1);
        root.right = finalBST(finalArr, mid + 1, end);
        return root;
    }

    public static Node merge(Node root1,Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(root1, arr1);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(root2, arr2);
        
        ArrayList<Integer> finalArr = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.size() && p2 < arr2.size()) {
            if (arr1.get(p1) < arr2.get(p2)) {
                finalArr.add(arr1.get(p1));
                p1++;
            } else {
                finalArr.add(arr2.get(p2));
                p2++;
            }
        }
        while (p1 < arr1.size()) {
            finalArr.add(arr1.get(p1));
            p1++;
        }
        while (p2 < arr2.size()) {
            finalArr.add(arr2.get(p2));
            p2++;

        }
        return finalBST(finalArr, 0, finalArr.size()-1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = merge(root1, root2);

        preOrder(root);
    }

}
