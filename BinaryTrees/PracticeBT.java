package BinaryTrees;

import java.util.*;

public class PracticeBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashSet<Integer> hs = new HashSet<>();

    // univalued binary tree means all nodes have same value
    public static boolean isUnival(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        return isUnival(root.left) && isUnival(root.right);
    }

    // to check if the tree contains all the unique values
    public static boolean isUniqueVal(Node root) {
        if (root == null) {
            return true;
        }
        if (hs.contains(root.data)) {
            return false;
        } else {
            hs.add(root.data);
        }
        boolean leftCheck = isUniqueVal(root.left);
        boolean rightCheck = isUniqueVal(root.right);
        if ((leftCheck && rightCheck) == false) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // for true
        // Node root = new Node(1);
        // root.left = new Node(3);
        // root.right = new Node(4);
        // root.left.left = new Node(5);
        // root.left.right = new Node(2);

        // for false
        // Node root= new Node(2);
        // root.left = new Node(2);
        // root.right = new Node(2);
        // root.left.left = new Node(5);
        // root.left.right = new Node(2);
        // System.out.println(isUniqueVal(root));
        // ----------------------------

        Node root= new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        System.out.println(isUnival(root));
    }
}
