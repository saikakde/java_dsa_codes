package Collections;

import java.util.Stack;

public class StackCollections {

    public static void pushAtBottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int popped = stack.pop();
        pushAtBottom(stack, data);
        stack.push(popped);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack);
        pushAtBottom(stack, 5);
                System.out.println(stack);

        System.out.println(stack.indexOf(5)+"-----");

        // System.out.println(stack);

        // System.out.println(stack.peek());

        // stack.pop();
        // System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
