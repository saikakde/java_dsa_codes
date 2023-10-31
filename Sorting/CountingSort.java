package Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        countingSort(arr,1,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSort(int arr[],int min,int max) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }
// ----------------------------------
    // chatgpt
    // public static void countingSort(int arr[], int min, int max) {
    //     int range = max - min + 1; // Calculate the range of values
    
    //     // Step 1: Count occurrences of each element
    //     int[] counts = new int[range];
    //     for (int i = 0; i < arr.length; i++) {
    //         counts[arr[i] - min]++;
    //     }
    
    //     // Step 2: Calculate cumulative counts
    //     for (int i = 1; i < range; i++) {
    //         counts[i] += counts[i - 1];
    //     }
    
    //     // Step 3: Place elements in their sorted positions
    //     int[] sortedArr = new int[arr.length];
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         sortedArr[--counts[arr[i] - min]] = arr[i];
    //     }
    
    //     // Copy the sorted array back to the original array
    //     System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    // }
    
}
