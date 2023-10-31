package Stack;

import java.util.*;

public class DupliParanthesis {
    public static boolean dupliParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                if (count < 1) {
                    return true;
                } else {
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "((a+b))";
        // String str = "()";
        String str = "((a+b)+(c))";

        boolean result = dupliParanthesis(str);
        System.out.println(result);

    }
}