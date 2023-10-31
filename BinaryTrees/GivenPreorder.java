package BinaryTrees;

public class GivenPreorder {
    static class Node{
        int data;
        Node left;
        Node right;
    

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// // same approach but here no class is used 
// // also the buildTree function/method here is non-static
// static int idx = -1;
// public Node buildTree(int nodes[]){
//     idx++;
//     if(nodes[idx]==-1){
//         return null;
//     }

//     Node newNode = new Node(nodes[idx]);
//     newNode.left = buildTree(nodes);
//     newNode.right = buildTree(nodes);

//     return newNode;
// }
// public static void main(String[] args) {
//     // -1 indicates that the next left or right values are null
//     int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

//     GivenPreorder tree = new GivenPreorder();
//     Node root = tree.buildTree(nodes);
//     System.out.println(root.data);
// }
// --------------------------------------------------------------------


static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}
public static void main(String[] args) {
    // -1 indicates that the next left or right values are null
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    Node root = BinaryTree.buildTree(nodes);
    System.out.println(root.data);
}
}
