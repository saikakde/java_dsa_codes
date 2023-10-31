package Stack;

import java.util.Stack;

public class TrapRainWaterStack {
    public static int trappedWater(int arr[]){
        Stack<Integer> sr = new Stack<>();
        Stack<Integer> sl = new Stack<>();
        int maxWater =0;

        sr.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            sr.push(Math.max(sr.peek(), arr[i]));
        }
        System.out.println(sr);
        sl.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            sl.push(Math.max(sl.peek(), arr[i]));
        }
        System.out.println(sl);
        for(int i=0;i<arr.length;i++){
            maxWater = maxWater+(Math.min(sl.pop(), sr.pop())-arr[i]);
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int heights[] ={7,0,4,2,5,0,6,4,0,5};
        System.out.println(trappedWater(heights));
        
    }
}
