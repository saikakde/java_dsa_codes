package BinaryTrees;

import java.util.*;

public class TreeTraversal {

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

    // // same approach but here no class is used
    // // also the buildTree function/method here is non-static
    // static int idx = -1;
    // public Node buildTree(int nodes[]){
    // idx++;
    // if(nodes[idx]==-1){
    // return null;
    // }

    // Node newNode = new Node(nodes[idx]);
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);

    // return newNode;
    // }
    // public static void main(String[] args) {
    // // -1 indicates that the next left or right values are null
    // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    // GivenPreorder tree = new GivenPreorder();
    // Node root = tree.buildTree(nodes);
    // System.out.println(root.data);
    // }
    // --------------------------------------------------------------------

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // public static void levelOrder(Node root) {
        // if (root == null) {
        // return;
        // }
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // q.add(null);

        // while (!q.isEmpty()) {
        // Node currNode = q.remove();
        // if (currNode == null) {
        // System.out.println();
        // if (q.isEmpty()) {
        // break;
        // } else {
        // q.add(null);
        // }
        // } else {
        // System.out.print(currNode.data + " ");
        // if (currNode.left != null) {
        // q.add(currNode.left);
        // }
        // if (currNode.right != null) {
        // q.add(currNode.right);
        // }
        // }
        // }

        // }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);

                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int maxHeight = Math.max(lh, rh) + 1;
            return maxHeight;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int totalCount = count(root.left) + count(root.right) + 1;
            return totalCount;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int sum = sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
            return sum;
        }

        public static int diamaterOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int ld = diamaterOfTree(root.left);

            int rh = height(root.right);
            int rd = diamaterOfTree(root.right);

            int selfDiameter = lh + rh + 1;

            return Math.max(selfDiameter, Math.max(ld, rd));
        }

        // diameter of tree optimised
        static class Info {
            int diam;
            int ht;

            Info(int diameter, int height) {
                this.diam = diameter;
                this.ht = height;
            }
        }

        public static Info diamaterOptimised(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diamaterOptimised(root.left);
            Info rightInfo = diamaterOptimised(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
            return new Info(diam, ht);
        }

        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            }
            if (root == null || subroot == null || root.data != subroot.data) {
                return false;
            }
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }

        public static boolean isSubtree(Node root, Node subroot) {
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subroot)) {
                return true;
            }
            // works the same as above if but is having an extra check
            // if (root.data == subroot.data) {
            // return isIdentical(root, subroot);
            // }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        // code to find the top view of a binary tree
        static int min = 0;
        static int max = 0;
        static HashMap<Integer, Integer> hm = new HashMap<>();

        public static void topView(Node root) {
            if (root == null) {
                return;
            }
            topViewUtil(root, 0);
            for (int i = min; i <= max; i++) {
                System.out.print(hm.get(i) + " ");
            }
        }

        public static void topViewUtil(Node root, int horizontalDistance) {
            if (root == null) {
                return;
            }
            if (!hm.containsKey(horizontalDistance)) {
                hm.put(horizontalDistance, root.data);
                min = Math.min(min, horizontalDistance);
                max = Math.max(max, horizontalDistance);

            }
            topViewUtil(root.left, horizontalDistance - 1);
            topViewUtil(root.right, horizontalDistance + 1);
        }

        public static void kthLevel(Node root, int k, int currlevel) {
            if (root == null) {
                return;
            }
            if (k == currlevel) {
                System.out.print(root.data + " ");
                return;
            }
            kthLevel(root.left, k, currlevel + 1);
            kthLevel(root.right, k, currlevel + 1);

        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);

            if (root.data == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i - 1);
            return lca;
        }

        public static Node lca2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n2, n2);

            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca;
            }
            return root;
        }

        public static int minDist(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);
            int dist1 = lcaDistBetw2Nodes(lca, n1);
            int dist2 = lcaDistBetw2Nodes(lca, n2);

            return dist1 + dist2;
        }

        public static int lcaDistBetw2Nodes(Node root, int n) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDist = lcaDistBetw2Nodes(root.left, n);
            int rightDist = lcaDistBetw2Nodes(root.right, n);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            } else if (leftDist == -1) {
                return rightDist + 1;
            } else {
                return leftDist + 1;
            }

        }

        public static int KAncestor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDist = KAncestor(root.left, n, k);
            int rightDist = KAncestor(root.right, n, k);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            }
            int max = Math.max(leftDist, rightDist);
            if (max + 1 == k) {
                System.out.println(root.data);
            }
            return max + 1;
        }

        public static int sumTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftChild = sumTree(root.left);
            int rightChild = sumTree(root.right);

            int data = root.data;

            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
        }
    }

    public static void main(String[] args) {
        // -1 indicates that the next left or right values are null
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        // Node root = BinaryTree.buildTree(nodes);

        // either use array for creating tree or create by use new Node as shown below
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.left = new Node(6);
        // root.left.right.left.left = new Node(7);
        // root.left.right.left.right = new Node(9);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        // root.left.right.left.left.right = new Node(8);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int n1 = 4, n2 = 6;
        // System.out.println(BinaryTree.lca(root, n1, n2).data);
        // System.out.println(BinaryTree.lca2(root, n1, n2).data);
        // System.out.println(BinaryTree.minDist(root, n1, n2));

        // int n=5,k=3;
        // System.out.print("the kth:"+k+" ancestor of "+n+" is ");
        // System.out.println(BinaryTree.KAncestor(root, n, k));
        // int k = 3;
        // BinaryTree.kthLevel(root, k, 1);
        // System.out.println();

        // BinaryTree.topView(root);
        // System.out.println();

        // root.left.right.right = new Node(7);
        // root.left.right.right.left = new Node(8);
        // root.left.left.left = new Node(5);

        System.out.print("preorder traversal: ");
        BinaryTree.preOrder(root);
        System.out.println();

        // System.out.print("inorder traversal: ");
        // BinaryTree.inOrder(root);
        // System.out.println();

        // System.out.print("postorder traversal: ");
        // BinaryTree.postOrder(root);
        // System.out.println();

        // System.out.println("levelorder traversal: ");
        // BinaryTree.levelOrder(root);

        // System.out.println("height of the tree is: " + BinaryTree.height(root));

        // System.out.println("Count of the nodes of the tree is: " +
        // BinaryTree.count(root));

        // System.out.println("Sum of nodes of the tree is: " +
        // BinaryTree.sumOfNodes(root));

        // System.out.println(BinaryTree.diamaterOfTree(root));
        // System.out.println(BinaryTree.diamaterOptimised(root).diam);

        // System.out.println(BinaryTree.isSubtree(root, subroot));

       BinaryTree.sumTree(root);
       BinaryTree.preOrder(root);
    }

}


// public static Node deleteKeysAtLeaf(Node root,int key){
//         if(root==null){
//             return null;
//         }
//         root.left = deleteKeysAtLeaf(root.left, key);
//         root.left = dele(root.left, key);
//         root.right = deleteKeysAtLeaf(root.right, key);
//         root.right = dele(root.right, key);
//         return root;
//     }