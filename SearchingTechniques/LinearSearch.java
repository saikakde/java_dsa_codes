package SearchingTechniques;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println(linearSearch(arr, 1));
    }
    public static int linearSearch(int arr[], int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return j;
            }
        }
        return -1;
    }

}
