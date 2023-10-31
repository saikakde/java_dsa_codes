package Trie;

public class UniqueSubstr {
    static class Node {
        Node[] children = new Node[26];
        int freq;
        boolean isEOW = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static void insert(String key) {// O(n)
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            } else {
                curr.children[index].freq += 1;
            }
            curr = curr.children[index];
        }
        curr.isEOW = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null)
                return false;
            curr = curr.children[index];
        }
        // mark last node as leaf
        return curr.isEOW;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static Node root = new Node();

    public static void main(String[] args) {
        String str = "ababa";// ans=10
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));

    }
}
