package Trie;

public class Trie {
    static class Node {
        Node[] children = new Node[26];
        boolean isEOW ;

        Node() {
            isEOW = false;
            for (int i = 0; i <26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root;

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

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        root = new Node();  
        // String arr[] = { "the", "there", "any", "their" };
        String arr[] = {"my","sai","name","is","hi"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        // System.out.println(search("any"));
        String key = "mynameissai";
        System.out.println(wordBreak(key));
    }
}
