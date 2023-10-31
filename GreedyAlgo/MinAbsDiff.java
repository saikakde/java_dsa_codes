package GreedyAlgo;

// import Arrays.Arrays;

import java.util.*;

public class MinAbsDiff {
    public static void main(String[] args) {
        // Integer A[] = { 1, 2, 3 };

        Integer A[] = { 4, 1, 8, 7 };
        // Integer B[] = { 2, 1, 3 };

        Integer B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int diff = 0;
            for (int j = 0; j < B.length; j++) {
                diff = diff + Math.abs(A[j] - B[j]);
            }
            if (ans >= diff) {
                ans = diff;
            }
        }
        System.out.println(ans + "---------------");
    }

}
