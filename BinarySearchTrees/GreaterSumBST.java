package BinarySearchTrees;

public class GreaterSumBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private static int sum = 0;

    public static Node convertBST(Node root) {
        reverseInOrder(root);
        return root;
    }

    private static void reverseInOrder(Node node) {
        if (node == null) {
            return;
        }

        reverseInOrder(node.right);

        sum += node.val;
        node.val = sum;

        reverseInOrder(node.left);
    }

    public static void main(String[] args) {

        // Construct a BST
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        Node transformedRoot = convertBST(root);

        // In-order traversal to print the transformed tree
        inOrderTraversal(transformedRoot);
    }

    private static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }
}
