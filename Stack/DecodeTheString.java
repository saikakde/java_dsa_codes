package Stack;

import java.util.*;

public class DecodeTheString {
    public static String decodeString(String str) {
        Stack<String> s = new Stack<>();
        int currNum = 0;
        String currString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[') {
                s.push(currString);
                s.push(String.valueOf(currNum));
                currString = "";
                currNum = 0;
            } else if (ch == ']') {
                int num = Integer.parseInt(s.pop());
                String prevString = s.pop();
                StringBuilder temp = new StringBuilder();
                while (num > 0) {
                    temp.append(currString);
                    num--;
                }
                currString = prevString + temp.toString();
            } else if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            } else {
                currString = currString + ch;
            }
        }
        return currString;
    }

    public static void main(String args[]) {
        // String str = "3[b2[ca]]";
        String str = "3[b2[v]]a1[b]";
        System.out.println(decodeString(str));
    }
}
