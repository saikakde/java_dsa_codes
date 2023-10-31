package BinaryTrees;

public class DeleteKeyAtLeafs {
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

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node deleteKeysAtLeaf(Node root,int key){
        if(root == null ||(root.data == key && root.left==null && root.right == null)){
            return null;
        }
        root.left = deleteKeysAtLeaf(root.left, key);
        root.right = deleteKeysAtLeaf(root.right, key);
        return root;
    }
    public static void main(String[] args) {
        Node root2 = new Node(3);
        root2.left = new Node(1);
        root2.right = new Node(2);
        root2.left.left = new Node(2);
        root2.left.right = new Node(3);
        root2.right.left = new Node(1);
        root2.right.right = new Node(3);

        inorder(root2);
        System.out.println();
        System.out.println("-----");
        Node root = deleteKeysAtLeaf(root2, 3);
        inorder(root);
        System.out.println();
        System.out.println("-----");


    }
}
