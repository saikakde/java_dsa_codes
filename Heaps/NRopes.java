package Heaps;

import java.util.PriorityQueue;

public class NRopes {
    public static int maxCost(PriorityQueue<Integer> pq) {
        int cost = 0;
        while (pq.size() > 1) {
            int x = pq.remove();
            int y = pq.remove();
            cost = cost + x + y;
            pq.add(x + y);
        }
        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = {4,3,2,6};
        // int ropes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        System.out.println(maxCost(pq));
    }
}
