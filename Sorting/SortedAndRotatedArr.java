package Sorting;

import java.util.Scanner;

public class SortedAndRotatedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,5,6,7,0,1,2};
        int key = sc.nextInt();

        System.out.println(findKey(arr,key,0,arr.length-1));

        sc.close();
    }
    public static int findKey(int arr[], int key,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(arr[mid]>=key && key>=arr[start]){
                return findKey(arr, key, start, mid-1);
            }else{
                System.out.println(mid+" "+end);
                return findKey(arr, key, mid+1, end);
            }
        }
        else{
            if(arr[mid]<=key && key<=arr[end]){
                return findKey(arr, key, mid+1, end);
            }else{
                System.out.println(start+" "+mid);
                return findKey(arr, key, start, mid-1);
            }
        }
    }
}
