package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Halves {
    public static void interLeave(Queue<Integer> q1){
        Queue<Integer> q2 = new LinkedList<>();
        int size = q1.size()/2;
        while(size!=0){
            size--;
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            int x = q1.remove();
            q1.add(x);
        }
        System.out.println(q1);
    }
    public static void main(String[] args) {
        Queue<Integer> o = new LinkedList<>();
        o.add(1);
        o.add(2);
        o.add(3);
        o.add(4);
        o.add(5);
        o.add(6);
        o.add(7);
        o.add(8);
        o.add(9);
        o.add(10);
        interLeave(o);
    }
}
