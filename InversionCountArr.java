public class InversionCountArr {
    // brute force approach not optimised n^2 time complexity
    // public static void inversionCountArr(int[] arr) {
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < arr[i]) {
    // count++;
    // System.out.println("(" + arr[i] + "," + arr[j] + ")");
    // }
    // }
    // }
    // if (count != 0) {
    // System.out.println(count + " beacuse it has " + count + " inversions");
    // } else {
    // System.out.println("0,beacuse the array is already sorted");
    // }
    // }

    public static int merge(int[] arr, int mid, int left, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        int x = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                x += (mid - i + 1);
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= right) {
            temp[k++] = arr[j++];

        }
        for (k = 0, i = left; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return x;
    }

    public static int mergeSort(int[] arr, int left, int right) {
        int mid = (right + left) / 2;
        int count = 0;
        if (right <= left) {
            return count;
        }
        count += mergeSort(arr, left, mid); 
        count += mergeSort(arr, mid + 1, right);
        count += merge(arr, mid, left, right);
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        // int arr[] = {2,3,4,5,6};
        // inversionCountArr(arr);
        int count = mergeSort(arr, 0, arr.length - 1);
        System.out.println(count);

    }
}
