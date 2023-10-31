package Stack;

import java.util.Stack;

public class NextGreaterEle {
    public static int[] nextGreater(int arr[]){
        int nextGreat[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreat[i] = -1;
            }else{
                nextGreat[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreat;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};

        // output: nextGreater[] = {8,-1,1,3,-1}
        int newArr[] = nextGreater(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }
    
}
