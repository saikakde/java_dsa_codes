package Stack;

public class StackLinkedList {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public boolean isEmpty(){
        if(size ==0 || head == null){
            return true;
        }
        return false;
    }
    public void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head =temp;
            size++;
            return;
        }
        size++;
        temp.next = head;
        head = temp;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        size--;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.data; 
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(head.data);
    }


    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // stack.peek();
        // stack.pop();
        stack.peek();

        while(!stack.isEmpty()){
            // stack.peek();
            System.out.println(stack.pop());
            System.out.println("------------------");
        }
        stack.peek();
        stack.pop();
    }

}
