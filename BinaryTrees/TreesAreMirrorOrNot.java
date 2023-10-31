package BinaryTrees;

public class TreesAreMirrorOrNot {
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

    public static boolean isMirror(Node root1, Node root2) {
        // If both trees are empty, they are mirrors.
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one tree is empty and the other is not, they are not mirrors.
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check if the values of the current nodes are equal
        // and recursively check the subtrees.
        return (root1.data == root2.data)
                && isMirror(root1.left, root2.right)
                && isMirror(root1.right, root2.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.left.left = new Node(7);
        root2.left.right = new Node(6);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        System.out.println(isMirror(root, root2));

    }
}
