package BinarySearchTrees;

public class LargestBSTinBT {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
        }
    }
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node createTree(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (int)(Math.floor(start + end) / 2);
        Node root = new Node(arr[mid]);
        root.left = createTree(arr, start, mid - 1);
        root.right = createTree(arr, mid + 1, end);
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
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    // the real work begins from here
    static Node min = null;
    static Node max = null;

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSize = 0;

    public static Info reqBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = reqBST(root.left);
        Info rightInfo = reqBST(root.right);

        int min = Math.min(Math.min(leftInfo.min, rightInfo.min), root.data);
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max), root.data);
        int size = leftInfo.size + rightInfo.size + 1;
        
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

        // below code works same as above two if statements
        // boolean isBST = leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min;
        // maxSize = isBST ? Math.max(maxSize, size) : Math.max(maxSize, Math.max(leftInfo.size, rightInfo.size));
        // return new Info(isBST, size, min, max);
    }
    public static void main(String[] args) {
        // this will result in maxSize=4 as the tree will form like
        //      50
        //     /  \
        //   20    65
        //  / \    / \
        // 5  30  60 70
        //             \
        //             80
  
        int arr[] = { 5, 30, 20, 50, 45, 60, 65, 70, 80 };
        Node root = createTree(arr, 0, arr.length - 1);


    //      50
    //     /  \
    //   30    60
    //  /  \   / \
    // 5   20 45 70
    //           / \
    //          65  80
  
  
        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

        reqBST(root);
        System.out.println("size of max BST is: " + maxSize);
    }
}
