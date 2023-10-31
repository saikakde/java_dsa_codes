package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] bubbleSort(int arr[]) {
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        //     // for (int k = 0; k < arr.length; k++) {
        //     //     System.out.print(arr[k] + " ");
        //     // }
        //     // System.out.println();
        // }
        // return arr;

        // ------------------------------------
        // optimized code

        for (int i = 0; i < arr.length; i++) {
            boolean counter = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter = true;
                }
            }
            if(counter == false){
                break;
            }
            // for (int k = 0; k < arr.length; k++) {
            //     System.out.print(arr[k] + " ");
            // }
            // System.out.println();
        }
        return arr;


    }
}
