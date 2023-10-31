package BinaryTrees;

import java.util.*;

public class DuplicateSubTrees {
    // static HashMap<String, Integer> m = new HashMap<>();

    // static class Node {
    // int data;
    // Node left;
    // Node right;

    // Node(int data) {
    // this.data = data;
    // this.left = null;
    // this.right = null;
    // }
    // }

    // // public static void inorder(Node root) {
    // // if (root == null) {
    // // return;
    // // }
    // // inorder(root.left);
    // // System.out.print(root.data + " ");
    // // inorder(root.right);
    // // }

    // static String inorder(Node node) {
    // if (node == null)
    // return "";
    // String str = "(";
    // str += inorder(node.left);
    // str += Integer.toString(node.data);
    // str += inorder(node.right);
    // str += ")";
    // if (m.get(str) != null && m.get(str) == 1)
    // System.out.print(node.data + " ");
    // if (m.containsKey(str))
    // m.put(str, m.get(str) + 1);
    // else
    // m.put(str, 1);
    // return str;
    // }

    // static void printAllDups(Node root) {
    // m = new HashMap<>();
    // inorder(root);
    // }

    // public static void main(String[] args) {
    // Node root2 = new Node(1);
    // root2.left = new Node(4);
    // root2.right = new Node(3);
    // root2.left.left = new Node(3);
    // root2.right.left = new Node(4);
    // root2.right.right = new Node(3);
    // root2.right.left.left = new Node(3);

    // printAllDups(root2);

    // }
    // }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        dfs(map, root, res);
        return res;
    }

    private static String dfs(Map<String, Integer> map, TreeNode root, List<TreeNode> res) {
        if (root == null)
            return "N";

        String s = String.valueOf(root.val) + "," + dfs(map, root.left, res) + "," + dfs(map, root.right, res);

        if (map.containsKey(s) && map.get(s) == 1)
            res.add(root);

        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        // Find duplicate subtrees
        List<TreeNode> duplicates = findDuplicateSubtrees(root);

        // Print the root values of duplicate subtrees
        for (TreeNode duplicate : duplicates) {
            System.out.print(duplicate.val + " ");
        }
    }

}
