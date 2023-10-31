package Heaps;

import java.util.*;

public class NearbyCars {
    static class Cars implements Comparable<Cars> {
        int x, y, distsq,index;

        Cars(int x, int y,int distsq,int index) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.index=index;
        }

        @Override
        public int compareTo(Cars c2) {
            return this.distsq - c2.distsq;
        }
    }

    public static int distance(int x, int y) {
        return x * x + y * y;
    }

    public static void main(String[] args) {
        // int cars[][]= {{3,3},{5,-1},{-2,4}};
        int cars[][]= {{3,3},{-2,4},{5,-1}};

        int k=2;

        PriorityQueue<Cars> pq = new PriorityQueue<>();

        for(int i=0;i<=cars.length-1;i++){
            pq.add(new Cars(cars[i][0], cars[i][1],distance(cars[i][0], cars[i][1]),i));
        }

        while (k>0) {
            System.out.println("C"+pq.peek().index);
            pq.remove();
            k--;
        }
    }
}
