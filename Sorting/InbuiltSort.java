package Sorting;

import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2}; //output: {1,2,3,4,5}
        // 4 5 1 3 2
        // 4 1 5 3 2 //1 4 5 3 2

        // int arr[] = {7,8,3,1,2}; //output: {1,2,3,7,8}

        inbuiltSort(arr);
        
    }
    public static void inbuiltSort(int arr[]){
        Arrays.sort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }  
}
}
