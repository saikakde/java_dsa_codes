package Stack;

import java.util.Stack;

public class StringReverse {

    public static void reverseString(Stack<Character> chStack,String str){
        StringBuilder sb = new StringBuilder("");

        int i=0;
        while(i<str.length()){
            chStack.push(str.charAt(i));
            i++;
        }

        while(!chStack.isEmpty()){
            sb.append(chStack.pop());
        }
        
        str = sb.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Stack<Character> chStack = new Stack<>();

        String str = "hello";

        System.out.println(str);
        reverseString(chStack, str);
    }
}
