package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2}; //output: {1,2,3,4,5}
        int arr[] = {7,8,3,1,2}; //output: {1,2,3,7,8}

        mergeSort(arr,0,arr.length-1);
        printArray(arr);
        
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[],int start,int end){
        int mid = start + (end - start)/2;
        if(start>=end){
            return ;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end - start +1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i<= mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    
}
