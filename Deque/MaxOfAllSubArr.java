package Deque;

import java.util.*;

public class MaxOfAllSubArr {

    public static int[] maxSlidingWindow(int arr[], int k, int N) {
        int[] r = new int[N - k + 1];
        int ri = 0;

        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {

            // remove numbers out of range k
            if (!q.isEmpty() && q.peek() == i - k) {
                int rm1 = q.poll();
                System.out.println(rm1);
                System.out.println("---------");
            }
            // remove smaller number in k range as they are useless
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                // q.pollLast();
                int rm2 = q.pollLast();
                System.out.println(rm2);

            }
            System.out.println(q.peek());
            System.out.println("xxxxxxxx");
            // q.peek();
            // q.offer(i);
            q.add(i);
            if (i >= k - 1) {
                r[ri++] = arr[q.peek()];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        int N = arr.length;
        int r[] = maxSlidingWindow(arr, k, N);

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }

    // // Not an optimized approach can be considered as brute force approach
    // public static void maxSlidingWindow(int arr[],int k,int N){
    //     ArrayList<Integer> a = new ArrayList<>();
    //     for(int i=0;i<N;i++){
    //         int j=0;
    //         int value =0;
    //         while(j!=3 ){
    //             if(i>=N-2){
    //                 break;
    //             }
    //             if(value<arr[i+j]){
    //                 value = arr[i+j];
    //             }
    //             j++;
    //         }
    //         a.add(value);
    //         }
    //         System.out.println(a);
    //     }

    //     public static void main(String[] args) {
    //     int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
    //     int k = 3;
    //     int N = arr.length;
    //     maxSlidingWindow(arr, k, N);

    // }
    
    
}
