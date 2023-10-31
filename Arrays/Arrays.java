
package Arrays;

import java.util.Scanner;

public class Arrays {

    public static int largestInArray(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestInArray(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pairsInArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArray(int arr[], int start, int end) {
        if (start >= 0 && end <= arr.length) {

            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("invalid range");
        }
    }

    public static int maxSumSubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE,currentSum=0, prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            // if(start==0){
            //     currentSum = prefixsum[end1];
            // } alternate of this is done using ternary operator below
            for(int j=i;j<arr.length;j++){
                int end = j;
                currentSum = start==0? prefixsum[end]:prefixsum[end]-prefixsum[start-1];
                if(maxsum<currentSum){
                    maxsum = currentSum;
                }
            }
        }
        return maxsum;
    }

    public static int kadanesMaxSumarray(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum + arr[i];
            // if(currentSum >0 && maxSum<currentSum){
            //     maxSum=currentSum;
            // }else{
            //     currentSum =0;
            // }
            if(currentSum<0){
                currentSum = 0;
            }
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            // maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int number = sc.nextInt();
        // int arr[] = {2,4,6,8,18,-1,12,21,14,16};

        // int arr[] = { 1, 2, 3, 4, 5 };
        int arr[] = {1,-2,6,-1,3};
        // int start = sc.nextInt();
        // int end = sc.nextInt();

        // System.out.println(largestInArray(arr));
        // System.out.println(smallestInArray(arr));

        // reverseArray(arr);
        // pairsInArray(arr);
        // subArray(arr,x, y);

        // System.out.println(maxSumSubarray(arr));
        System.out.println(kadanesMaxSumarray(arr));


        sc.close();
    }
}
