package Stack;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean validParanthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='{' || ch =='(' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek() == '(' && ch ==')')||
                (stack.peek() == '{' && ch=='}')||(stack.peek() =='[' && ch==']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {

        String str = "{{([])[]}}";
        boolean result = validParanthesis(str);
        System.out.println(result);
    }
}
