package Deque;

import java.util.*;

public class StackUsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public  void peek(){
            if(deque.isEmpty()){
                System.out.println("empty");
                return;
            }
            System.out.println(deque.getLast());
        }

        public int pop(){
            if(deque.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return deque.removeLast();
        }

        public void print(){
            int size = deque.size();
            while(size!=0){
                System.out.print(pop()+" ");
                size--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        s.peek();
        System.out.println(s.pop());
        s.peek();
        // System.out.println(s);
        s.print();

    }
}
