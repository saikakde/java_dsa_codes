package Sorting;

public class SortingExtraQuetions {
    public static void main(String[] args) {
    //    String arr[] = { "sun", "earth", "mars", "mercury"};

    //    sortArrayOfStrings(arr);

    int arr[] = {1,2,1,1,1,1,2,3,1,4,4};
    countMajorityOccur(arr);

    }
    public static void sortArrayOfStrings(String arr[]){
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(arr[i].charAt(0)<arr[j].charAt(0) && j<arr.length){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void countMajorityOccur(int arr[]){
        // brute force

        // int majorCount = arr.length/2,temp=-1;
        // for(int i=0;i<arr.length;i++){
        //     int count = 0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[j] == arr[i]){
        //             count++;
        //         }
        //     }
        //     if(count>majorCount){
        //         majorCount=count;
        //         temp = arr[i];
        //     }
        // }
        // System.out.println(temp);

        // ---------------------------------------------------------------
        // divide and conquer

        
    }
    
}
