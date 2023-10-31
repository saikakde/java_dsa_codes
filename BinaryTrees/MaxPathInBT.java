package BinaryTrees;

public class MaxPathInBT {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

    static int res = Integer.MIN_VALUE;

    public static int findMaxSum(Node node) {
        maxSum(node);
        return res;
    }

    public static int maxSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxSum(root.left);
        int rightMax = maxSum(root.right);

        // Calculate the maximum path sum that includes the current root
        int maxSingle = Math.max(Math.max(leftMax, rightMax) + root.data, root.data);

        // Update the global maximum path sum
        res = Math.max(res, Math.max(maxSingle, leftMax + rightMax + root.data));

        // Return the maximum path sum that includes the current root
        return maxSingle;
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        inorder(root);
        System.out.println();
        System.out.println(findMaxSum(root));
    }
}
