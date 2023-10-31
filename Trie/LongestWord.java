package Trie;

public class LongestWord {
    static class Node {
        Node[] children = new Node[26];
        boolean isEOW = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].isEOW == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        // mark last node as leaf
        curr.isEOW = true;
    }

    public static void main(String[] args) {
        String arr[] = { "a", "banana", "ap", "app", "appl", "apply", "apple" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
