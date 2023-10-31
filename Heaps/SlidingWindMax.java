package Heaps;

import java.util.*;

public class SlidingWindMax {
    static class MaxWindow implements Comparable<MaxWindow> {
        int val, index;

        MaxWindow(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(MaxWindow w2) {
            return w2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;// window size

        PriorityQueue<MaxWindow> pq = new PriorityQueue<MaxWindow>();
        for (int i = 0; i < k; i++) {
            pq.add(new MaxWindow(arr[i], i));
        }

        int n = arr.length;
        int newArr[] = new int[n - k + 1];
        newArr[0] = pq.peek().val;
        for (int i = k; i < n; i++) {
            while (pq.size() > 0 && pq.peek().index <= (i - k)) {
                pq.remove();
            }
            pq.add(new MaxWindow(arr[i], i));
            newArr[i - k + 1] = pq.peek().val;
        }
        for (int i = 0; i <= newArr.length - 1; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
