package PriorityQueue;

import java.util.*;
// import java.util.PriorityQueue;

// Note: In priority Queue by default the highest priority 
// element is selected as the first element occuring in the ascending order of priorityqueue

// If we want the highest element to be the largest value then use 
// Comparator.reversedOrder()  

// the ascending and descending order is only applicable to the highest priority element of priorityqueue
public class PriorityQ {
    public static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();// priorityqueue will be in ascending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// priorityqueue will be in ascending order

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        pq.add(7);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        System.out.println(pq);
        int ans =0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first+second;
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};

        System.out.println(minCost(arr));
    }
}
