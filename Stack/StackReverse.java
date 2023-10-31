package Stack;

import java.util.Stack;

public class StackReverse {
    public static void pushAtBottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int popped = stack.pop();
        pushAtBottom(stack, data);
        stack.push(popped);
    }

    public static void reverseStack(Stack<Integer> stack){
        while(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        // stack.push(temp);
        pushAtBottom(stack, temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        reverseStack(stack);
        System.out.println(stack);
    }
}
