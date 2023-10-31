package Hashing;
import java.util.*;

public class MaxSubArrWithSum0 {
    public static int maxSubArrWithSum0(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0,maxLength=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            int k=0,j=0;
            if(hm.containsKey(sum)){
                k = hm.get(sum);
                j=i;
            }else{
                hm.put(sum, i);
            }
            int length = j-k;
            // System.out.println(length);
            if(maxLength<length){
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static int maxSubArrWithSumk(int arr[],int x){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0,maxLength=0;
        int k=0,j=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            
            if(hm.containsKey(sum-x)){
                k = hm.get(sum-x)+1;
                j=i;
                
            }else{
                hm.put(sum, i);
            }
            int length = j-k+1;
            if(maxLength<length){
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static int maxSubArrWithSumky(int arr[], int x) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
            if (sum == x) {
                maxLength = i + 1;  // Subarray from index 0 to i has sum equal to x
            }
            
            if (hm.containsKey(sum - x)) {
                int startIndex = hm.get(sum - x) ; // Starting index of subarray
                int length = i - startIndex ; // Length of subarray
                maxLength = Math.max(maxLength, length);
            }
            
            // Store the first occurrence of the current sum in the map
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        // int arr[] = {15,-2,2,-8,1,7,10};
        int arr[] = {15,5,-1,1,0};

        System.out.println(maxSubArrWithSum0(arr));
        System.out.println(maxSubArrWithSumk(arr,0));
        System.out.println(maxSubArrWithSumky(arr,15));

    }
}
