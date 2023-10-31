package Sorting;

public class QuickSort {
   

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pIndex = pivotIndex(arr,start,end);
        quickSort(arr, start, pIndex-1);
        quickSort(arr,pIndex+1,end);
    }
    public static int pivotIndex(int arr[],int start,int end){
        int pivot = arr[end];
        int j=start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                j++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            printArray(arr);
            System.out.println();
        }
        j++;
        int temp = pivot;
        arr[end]=arr[j];
        arr[j]=temp;


        return j;
    }
    
     public static void main(String[] args) {
        int arr[] = {7,8,3,1,2}; //output: {1,2,3,7,8}
        int start=0;
        int end = arr.length-1;
        quickSort(arr,start,end);
        printArray(arr);

    }

}
