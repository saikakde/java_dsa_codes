package SearchingTechniques;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println(binarySearch(arr, 1));
    }
    public static int binarySearch(int arr[], int i) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] > i) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
