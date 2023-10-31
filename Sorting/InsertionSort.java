package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2}; //output: {1,2,3,4,5}
        // 4 5 1 3 2
        // 4 1 5 3 2 //1 4 5 3 2

        // int arr[] = {7,8,3,1,2}; //output: {1,2,3,7,8}

        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   

    public static int[] insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        //     for(int k=0;k<arr.length;k++){
        //     System.out.print(arr[k]+" ");
        // }
        // System.out.println();
        }

        return arr;
    }
}
