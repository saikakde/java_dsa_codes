package Deque;

import java.util.*;

public class QueueUsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public  void peek(){
            if(deque.isEmpty()){
                System.out.println("empty");
                return;
            }
            System.out.println(deque.getFirst());
        }

        public int remove(){
            if(deque.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return deque.removeFirst();
        }

        public void print(){
            int size = deque.size();
            while(size!=0){
                System.out.print(remove()+" ");
                size--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        
        s.peek();
        System.out.println(s.remove());
        s.peek();
        // System.out.println(s);
        s.print();

    }
}
