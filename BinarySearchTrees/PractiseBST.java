package BinarySearchTrees;

public class PractiseBST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int inorder2(Node root, int n1, int n2) {
        if (root == null) {
            return 0;
        }
        int rangeSum = 0;
        if (root.data >= n1 && root.data <= n2) {
            rangeSum += root.data;
        }
        if (root.data >= n1) {
            rangeSum += inorder2(root.left, n1, n2);
        }
        if (root.data <= n2) {
            rangeSum += inorder2(root.right, n1, n2);
        }
        return rangeSum;
    }

    public static Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (root.data < newNode.data) {
            root.right = insert(root.right, newNode);
        } else {
            root.left = insert(root.left, newNode);
        }
        return root;
    }

    static int res;

    public static int finalDist(Node node, int key) {
        res = Integer.MAX_VALUE; // Initialize res to a large value
        dist(node, key);
        return res;
    }

    public static void dist(Node root, int key) {
        if (root == null) {
            // If root is null, set res to the absolute difference between key and root data
            // (which is key itself)
            res = Math.min(res, Math.abs(key));
            return;
        }

        // Calculate the absolute difference between the current node's data and the key
        int currentDiff = Math.abs(root.data - key);

        // Update the result (res) if the currentDiff is smaller
        res = Math.min(res, currentDiff);

        // Recursively search in both subtrees
        dist(root.left, key);
        dist(root.right, key);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 5, 6, 15, 9 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, new Node(arr[i]));
        }

        inorder(root);
        System.out.println();

        System.out.println(finalDist(root, 40));
        // System.out.println(inorder2(root, 7, 12));

    }
}
