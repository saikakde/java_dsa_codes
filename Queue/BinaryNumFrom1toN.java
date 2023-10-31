package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumFrom1toN {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static void

    public static void binFrom1toN(int num) {
        // Queue<Integer> q = new LinkedList<>();

        // for(int j=1;j<=num;j++){
        // int i = j;
        // while(i!=0){
        // int x = i%2;
        // i = i/2;
        // q.add(x);
        // }
        // int n=0;
        // while(!q.isEmpty()){
        //     int m = q.remove();
        //     n = n*10+ m;
        // System.out.print(n);
        // }
        // System.out.println();
        // }

        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (num-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }

    }


    public static void main(String[] args) {
        binFrom1toN(5);
    }
}
