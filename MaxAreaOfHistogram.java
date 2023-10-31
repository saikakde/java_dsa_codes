// import java.util.ArrayList;

import java.util.Stack;

public class MaxAreaOfHistogram {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        
        // approach 1 own logic 
        // int maxArea = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         int left = i;
    //         int right = i;
    //         int minL = 0;
    //         int minR = arr.length;

    //         while (left >= 0 && arr[left]>=arr[i]) {
    //             minL = left;
    //             left--;
    //         }
    //         while (right < arr.length && arr[right] >= arr[i]) {
    //             minR = right;
    //             right++;
    //         }
    //         int area = arr[i] * (minR - minL + 1);
    //         System.out.println(area);
    //         if (area >= maxArea) {
    //             maxArea = area;
    //         }

    //     }
    //     System.out.println(maxArea);

    
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);


    }
}
