package Arrays;

import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 4, 2, 0, 6 , 3, 2, 5 };

        System.out.println(trappedWater(arr));

        sc.close();
    }

    public static int trappedWater(int arr[]) {
        int n = arr.length;
        if(n<=2){
            return 0;
        }
        int level = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for(int i=0;i<n;i++){
            level = level+ Math.min(rightMax[i], leftMax[i])-arr[i];
        }
        return level;
    }
}