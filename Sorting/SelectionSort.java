package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2}; //output: {1,2,3,4,5}
        int arr[] = {7,8,3,1,2}; //output: {1,2,3,7,8}

        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
