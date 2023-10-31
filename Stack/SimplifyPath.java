package Stack;

import java.util.Stack;

public class SimplifyPath {
    // public static StringBuilder simple(Stack<Character> s, StringBuilder sb) {
    // if (s.isEmpty()) {
    // return sb.append('/');
    // }
    // char ch = s.pop();
    // simple(s, sb);
    // sb.append(ch);
    // sb.append('/');
    // return sb;

    // }

    // public static void simplifyPath(String str) {
    // if (str.charAt(0) != '/') {
    // return;
    // }
    // Stack<Character> s = new Stack<>();
    // int count = 1;
    // for (int i = 0; i < str.length(); i++) {
    // int j = i;
    // if (Character.isLetter(str.charAt(i))) {
    // s.push(str.charAt(i));
    // }
    // if (str.charAt(i) == '.' && j < str.length()) {
    // while (str.charAt(j + 1) == '.' && j < str.length()) {
    // j++;
    // count++;
    // }
    // }
    // if (count == 2) {
    // if (!s.isEmpty()) {
    // s.pop();
    // i = i + 1;
    // } else {
    // i = i + 1;
    // }
    // }
    // if (count == 3) {
    // i = i + 2;
    // }
    // count = 1;
    // }
    // System.out.println(s);
    // StringBuilder sb = new StringBuilder("");
    // sb = simple(s, sb);
    // sb.deleteCharAt(sb.length() - 1);
    // System.out.println(sb);
    // }

    // public static void main(String[] args) {
    // // String str = "/a/b///c/.../../../d/./";
    // String str = "/sai/";
    // simplifyPath(str);
    // }
// -------------------------------------------------

    // Shrada's logic
    public static void main(String[] args) {
        // String str = new String("/a/./b/../../c/");
        String str = new String("/./.../");

        String res = simplify(str);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = A.length();
        for (int i = 0; i < len_A; i++) {
            String dir = "";
            while (i < len_A && A.charAt(i) == '/')
                i++;
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
            if (dir.equals("..") == true) {
                if (!st.empty())
                    st.pop();
            } else if (dir.equals(".") == true)
                continue;
            else if (dir.length() != 0)
                st.push(dir);
        }
        Stack<String> st1 = new Stack<String>();
        while (!st.empty()) {
            st1.push(st.pop());
        }
        while (!st1.empty()) {
            if (st1.size() != 1)
                res += (st1.pop() + "/");
            else res += st1.pop();
        }
        return res;
    }
}
