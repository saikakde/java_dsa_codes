package Queue;
import java.util.*;

public class Reverse1stKele {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        int N = 4;
        for(int i=1;i<11;i++){
            q.add(i*10);
        }
        int M = q.size()-N;
        System.out.println(q);

        reverse1stKele(q, N);

        System.out.println(q);
        helper(q, M);

        System.out.println(q);
    }
    public static void reverse1stKele(Queue<Integer> q,int N){
        if(N==0){
            return;
        }
        int ele = q.poll();
        reverse1stKele(q, N-1);
        q.add(ele);
    }
    public static void helper(Queue<Integer> q,int M){
        while(M!=0){
            int x =q.poll();
            q.add(x);
            M--;
        }
    }
}
