import java.util.*;


// a number 'n' is a lonely number if there doesnt exist 'n-1' or 'n+1' or repeated 'n' in the array
public class LonelyNum {
    public static void main(String[] args) {
        // int arr[] = {10,3,3,9,5};
        int arr[] = { 10, 6, 8,5 };
        // int arr[] = {2,2,2,4};

        lonelyNum(arr);
    }

    public static void lonelyNum(int[] arr) {
        Arrays.sort(arr);

        ArrayList<Integer> lonelyNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean hasPrev = i > 0 && arr[i - 1] == num - 1;
            boolean hasNext = i < arr.length - 1 && arr[i + 1] == num + 1;
            
            if (!hasPrev && !hasNext && countOccurrences(arr, num)) {
                lonelyNumbers.add(num);
            }
        }

        System.out.println("Lonely Numbers: " + lonelyNumbers);
    }

    public static boolean countOccurrences(int[] arr, int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
