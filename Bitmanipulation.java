import java.util.Scanner;

public class Bitmanipulation {
    public static void convertToBinary(int n){
        int num[] = new int[40];
        int i=0;
        while(n>0){
            num[i]=n%2;
            n/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(num[j]);
        }
    }

    public static void leftShift(int x,int y) {
        System.out.println(x<<y);
    }

    public static void rightShift(int x,int y) {
        System.out.println(x>>y);
    }

    public static void oddeven(int x){
        // int bitmask = 1;
        if((x & 1) == 1){
            System.out.println(x+" is an odd number");
        }else{
            System.out.println(x+" is an even number");
        }
    }

    public static int ithBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setithBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    public static int clearithBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    public static int updateithBit(int num, int i,int val){
        // if (val==1) {
        //     return setithBit(num, i);
        // } else {
        //     return clearithBit(num, i);
        // }

        // other approach
        int bitmask = val<<i;
        num = clearithBit(num, i);
        return num | bitmask;

    }

    public static boolean powerOf2OrNot(int num){
        if((num & (num-1))==0){
         return true;   
        }
        else{
            return false;
        }
    }

    public static int countbitsthatare1(int num){
        int bitmap = 1;
        int count = 0;
        while(num!=0){
            if((num & bitmap)!=0){
                count +=1;
            }
            num = num>>1;
        }
        return count;
    }

    public static int cleariBits(int x,int i){
        int bitmask = ~1<<(i-1);
        return x & bitmask;
    }

    public static int clearRangeOfBits(int num,int i,int j){
        int bitmask = 1;
        for(int k=i;k<=j;k++){
            num = num & ~(bitmask<<k);
        }
        return num;
    }

    public static void swap(int a,int b){
        a = a^b;
        b = b^a;
        a = b^a;
        System.out.println("a: "+a+",b: "+b);
    }

    public static void swap2(int x,int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x: "+x+", y: "+y);
    }
    public static int fastexponentiation(int num,int pow){
        int ans =1;
        while(pow!=0){
            if((ans & pow)!=0){
                ans = ans*num;
            }
            num = num*num;
            pow = pow>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // int z = sc.nextInt();

        // swap(x, y);
        // swap2(x, y);
        
        // convertToBinary(x); //to convert a decimal number to binary
        // System.out.println();

        // // and or xor
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);

        // 1's compliment of a number
        // System.out.println((~x)+1 );
        // System.out.println(~x);

        // leftshift rightshift
        // leftShift(x,y);
        // rightShift(x, y);

        // check odd even
        // oddeven(x);

        // System.out.println(ithBit(x, y));
        // System.out.println(setithBit(x, y));
        // System.out.println(clearithBit(x,y));
        // System.out.println(updateithBit(x,y,z));
        // System.out.println(cleariBits(x,y));

        // System.out.println(clearRangeOfBits(x,y,z));
        // System.out.println(powerOf2OrNot(x));
        
        // System.out.println(countbitsthatare1(x));
        // System.out.println(fastexponentiation(x,y));

        sc.close();

    }
}
