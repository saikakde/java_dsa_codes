package BinarySearchTrees;

public class MaxSumBST {
    // find the max sum of a BST in a given BT
    static class Node {
        int data;
        Node left, right;
        boolean isBST;
        int sum;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.isBST = true;
            this.sum = 0;
        }
    }

    public static int maxSumBST(Node root) {
        Result result = new Result();
        maxSumBSTHelper(root, result);
        return result.maxSum;
    }

    static class Result {
        int maxSum;
        boolean isBST;
        int sum;

        Result() {
            maxSum = 0;
            isBST = false;
            sum = 0;
        }
    }

    public static void maxSumBSTHelper(Node root, Result result) {
        if (root == null) {
            result.isBST = true;
            return;
        }

        Result leftResult = new Result();
        Result rightResult = new Result();

        maxSumBSTHelper(root.left, leftResult);
        maxSumBSTHelper(root.right, rightResult);

        // Check if the current subtree is a BST
        if (leftResult.isBST && rightResult.isBST && (root.left == null || root.data > root.left.data) &&
            (root.right == null || root.data < root.right.data)) {
            result.isBST = true;
            result.sum = leftResult.sum + rightResult.sum + root.data;
            result.maxSum = Math.max(result.maxSum, result.sum);
        } else {
            result.isBST = false;
        }

        // Update the result with the maximum sum found in the subtrees
        result.maxSum = Math.max(result.maxSum, Math.max(leftResult.maxSum, rightResult.maxSum));
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(6);

        root.right = new Node(7);
        root.right.right = new Node(10);

        int maxSum = maxSumBST(root);

        System.out.println("Max Sum of BSTs in the given BT: " + maxSum);
    }
}
