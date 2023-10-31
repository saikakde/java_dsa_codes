package Stack;

import java.util.Stack;

public class PalindromeUsingStack {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node h) {
        Stack<Character> s = new Stack<>();

        Node temp = h;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        Node temp2 = h;
        while (!s.isEmpty()) {
            if (s.peek() != temp2.data) {
                return false;
            }
            temp2 = temp2.next;
            s.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        Node h = new Node('s');
        h.next = new Node('a');
        h.next.next = new Node('s');
        h.next.next.next = new Node('s');

        System.out.println(isPalindrome(h));
    }
}
