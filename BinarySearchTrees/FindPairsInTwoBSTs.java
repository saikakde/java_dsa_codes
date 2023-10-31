package BinarySearchTrees;

import java.util.*;

public class FindPairsInTwoBSTs {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static List<int[]> findPairs(TreeNode root1, TreeNode root2, int x) {
        if (root1 == null || root2 == null) {
            return Collections.emptyList();
        }

        List<int[]> pairs = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode curr1 = root1;
        TreeNode curr2 = root2;

        while (!stack1.isEmpty() || !stack2.isEmpty() || curr1 != null || curr2 != null) {
            while (curr1 != null) {
                stack1.push(curr1);
                curr1 = curr1.left;
            }

            while (curr2 != null) {
                stack2.push(curr2);
                curr2 = curr2.right;
            }

            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                int val1 = stack1.peek().val;
                int val2 = stack2.peek().val;
                int sum = val1 + val2;

                if (sum == x) {
                    pairs.add(new int[] { val1, val2 });
                    curr1 = stack1.pop().right;
                    curr2 = stack2.pop().left;
                } else if (sum < x) {
                    curr1 = stack1.pop().right;
                } else {
                    curr2 = stack2.pop().left;
                }
            } else {
                // One of the stacks is empty, so we need to terminate the loop
                break;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(15);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(8);
        root2.right.left = new TreeNode(11);
        root2.right.right = new TreeNode(18);

        int x = 16;

        List<int[]> pairs = findPairs(root1, root2, x);

        System.out.println("Pairs that sum to " + x + ":");
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}


// ----------------------------------------------------------------
// alternative approach using HashSet
// package BinarySearchTrees;
// import java.util.*;

// public class FindPairsInTwoBSTs {
//     static class TreeNode {
//         int val;
//         TreeNode left, right;

//         TreeNode(int val) {
//             this.val = val;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static List<int[]> findPairs(TreeNode root1, TreeNode root2, int x) {
//         if (root1 == null || root2 == null) {
//             return Collections.emptyList();
//         }

//         List<int[]> pairs = new ArrayList<>();
//         Set<Integer> values1 = new HashSet<>();

//         // Populate the set with values from the first BST
//         populateSet(root1, values1);

//         // Traverse the second BST and check for complements
//         Stack<TreeNode> stack2 = new Stack<>();
//         TreeNode curr2 = root2;

//         while (!stack2.isEmpty() || curr2 != null) {
//             while (curr2 != null) {
//                 stack2.push(curr2);
//                 curr2 = curr2.left;
//             }

//             int val2 = stack2.peek().val;
//             int complement = x - val2;

//             if (values1.contains(complement)) {
//                 pairs.add(new int[] { complement, val2 });
//             }

//             curr2 = stack2.pop().right;
//         }

//         return pairs;
//     }

//     private static void populateSet(TreeNode root, Set<Integer> values) {
//         if (root == null) {
//             return;
//         }

//         populateSet(root.left, values);
//         values.add(root.val);
//         populateSet(root.right, values);
//     }

//     public static void main(String[] args) {
//         TreeNode root1 = new TreeNode(5);
//         root1.left = new TreeNode(3);
//         root1.right = new TreeNode(7);
//         root1.left.left = new TreeNode(2);
//         root1.left.right = new TreeNode(4);
//         root1.right.left = new TreeNode(6);
//         root1.right.right = new TreeNode(8);

//         TreeNode root2 = new TreeNode(10);
//         root2.left = new TreeNode(6);
//         root2.right = new TreeNode(15);
//         root2.left.left = new TreeNode(3);
//         root2.left.right = new TreeNode(8);
//         root2.right.left = new TreeNode(11);
//         root2.right.right = new TreeNode(18);

//         int x = 16;

//         List<int[]> pairs = findPairs(root1, root2, x);

//         System.out.println("Pairs that sum to " + x + ":");
//         for (int[] pair : pairs) {
//             System.out.println("(" + pair[0] + ", " + pair[1] + ")");
//         }
//     }
// }
