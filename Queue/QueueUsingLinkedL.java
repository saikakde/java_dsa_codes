package Queue;

public class QueueUsingLinkedL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            if(head == null){
                System.out.println("Queue is empty");
                return true;
            }
            return false;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail= head;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(head.data);
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.peek();

        System.out.println(q.remove());
        System.out.println("----------");
        q.peek();
        q.add(5);
        q.add(6);
        q.remove();
        q.add(7);
        q.peek();
        System.out.println("----------------");

        while(!q.isEmpty()){
            q.peek();
            q.remove();
        }

    }
    
}
