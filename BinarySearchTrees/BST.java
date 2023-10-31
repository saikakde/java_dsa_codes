package BinarySearchTrees;

import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        }
        if (root.data < data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // compact code same functionality as code below this one
    // public static boolean searchInBST(Node root, int key) {
    // return root != null && (root.data == key || (root.data > key ?
    // searchInBST(root.left, key) : searchInBST(root.right, key)));
    // }

    public static boolean searchInBST(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchInBST(root.left, key);
        } else {
            return searchInBST(root.right, key);
        }
    }

    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
        // works same as above
        // } else if (root.data < k1) {
        // printInRange(root.right, k1, k2);
        // }
        // else {
        // printInRange(root.left, k1, k2);
        // }
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(arr);
        }
        rootToLeaf(root.left, arr);
        rootToLeaf(root.right, arr);
        arr.remove(arr.size() - 1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftNode = mirror(root.left);
        Node rightNode = mirror(root.right);

        root.left = rightNode;
        root.right = leftNode;
        // Node temp = leftNode;
        // leftNode = rightNode;
        // rightNode = temp;

        return root;
    }
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // create BST from sorted array
    public static Node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node newNode = new Node(arr[mid]);
        newNode.left = createBST(arr, start, mid-1);
        newNode.right = createBST(arr, mid+1, end);

        return newNode;
    }

    // below three functions for BST to Balanced BST
    public static void inorderTraversal2(Node root,ArrayList<Integer> arr2){
        if(root == null){
            return;
        }
        inorderTraversal2(root.left,arr2);
        arr2.add(root.data);
        inorderTraversal2(root.right,arr2);

    }

    public static Node createBST2(ArrayList<Integer> arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST2(arr, start, mid-1);
        root.right = createBST2(arr, mid+1, end);

        return root;
    }

    public static Node bstToBalBST(Node root){
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorderTraversal2(root, arr2);
        // System.out.println(arr2);
        return createBST2(arr2, 0, arr2.size()-1);
    }

    public static void main(String[] args) {

        // int arr[] = { 5, 1, 3, 4, 6, 7 };
        // int arr[] = { 8, 5, 3, 6, 10, 11, 14 };
        // int arr[] = {8,5,10,11,6,3};
        // Node root = null;
        // for (int i = 0; i < arr.length; i++) {
        //     root = insert(root, arr[i]);
        // }
        // inorderTraversal(root);
        // System.out.println();
        // System.out.println(searchInBST(root, 4));

        // delete(root, 2);
        // inorderTraversal(root);
        // System.out.println();

        // printInRange(root, 2, 6);
        // System.out.println();
        // ArrayList<Integer> arr2 = new ArrayList<>();
        // rootToLeaf(root, arr2);

        // System.out.println(isValidBST(root, null, null));
        // root = mirror(root);
        // inorderTraversal(root);
        // System.out.println();
        // preOrder(root);

        // int arr[] = {3,5,6,8,10,11,12};

        // sorted array to BST
        // Node root = createBST(arr,0,arr.length-1);
        // preOrder(root);

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = bstToBalBST(root);
        inorderTraversal(root);
        preOrder(root);

    }
}
