package Stack;

import java.util.ArrayList;

public class StackArrayList {
    ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return Integer.MIN_VALUE;
        }
        return stack.remove(stack.size() - 1);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return;
        }
        System.out.println(stack.get(stack.size() - 1));
    }

    public void print() {
        while (!isEmpty()) {
            peek();
            pop();
        }
    }

    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // stack.print();
        stack.peek();
        System.out.println("-------------");
        stack.print();
        // stack.pop();
        stack.peek();

    }
}
