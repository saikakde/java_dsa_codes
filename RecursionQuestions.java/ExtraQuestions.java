// package RecursionQuestions.java;

import java.util.Scanner;

public class ExtraQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        // int arr[] = {3,2,4,5,6,2,7,2,2};

        // findOccurences(arr,key,0);

        // int number = sc.nextInt();
        // String numSet[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // numToString(number,numSet);

        // numToString(numSet, number, "");

        // String str = sc.nextLine();
        // System.out.println(lengthOfString(str));

        // int length = str.length();
        // System.out.println(startEndStrings(str, 0, length));
        sc.close();
    }

    public static void findOccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i);
        }
        findOccurences(arr, key, i + 1);
    }

// public static void numToString(String numSet[],int n,String str){
    // if(n==0){
    //     return;
    // }
    // numToString(numSet, n/10,str);
    // System.out.print(numSet[n%10]+str+" ");
// }

public static void numToString(int number,String numSet[]){
    if(number == 0){
        return;
    }
    numToString(number/10, numSet);
    System.out.print(numSet[number%10]+" ");
}

public static int lengthOfString(String str){
    if(str == ""){
        return 0;
    }
    // int length =0;
    return 1+ lengthOfString(str.substring(1));
}

// public static int startEndStrings(String str,int start,int length){
//     if(start==str.length()){
//         return length;
//     }
//     if(str.charAt(length))
//     return length+startEndStrings(str, start, length)
// }
}