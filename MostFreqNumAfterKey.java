import java.util.*;

public class MostFreqNumAfterKey {
    public static void main(String[] args) {
        // int arr[] = {1,100,1,1,200,1,100};
        int arr[] = {2,2,2,4};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        freqArr(arr,key);
        sc.close();
    }

    public static void freqArr(int[] arr,int key){
        int[] followingCount = new int[1001]; 

        int maxCount = 0;
        int mostFreqNum = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                int followingNum = arr[i + 1];
                followingCount[followingNum]++;
                if (followingCount[followingNum] > maxCount) {
                    maxCount = followingCount[followingNum];
                    mostFreqNum = followingNum;
                }
            }
        }

        if (mostFreqNum != -1) {
            System.out.println("The number with maximum following count after key " + key + " is: " + mostFreqNum);
        } else {
            System.out.println("No number found after key " + key);
        }
    
        
    }
}
