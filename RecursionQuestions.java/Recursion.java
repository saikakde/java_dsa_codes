import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
                int y = sc.nextInt();


        // DecOrder(x);
        // System.out.println();
        // IncOrder(x);
        // System.out.println();

        // System.out.println(FactorialN(x));
        // System.out.println(Sum(x));
        // System.out.println(Fibonacci(x));

        // int arr[] = { 1, 2, 3, 6,2, 4, 6, 5 };
        // System.out.println(Array(arr, x));

        // System.out.println(lastOccur(arr, x,0));

        // System.out.println(firstOccur(arr, x,0));

        System.out.println(xPowerN(x,y));
        sc.close();
    }

    public static void decOrder(int x) {
        if (x == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(x + " ");
        decOrder(x - 1);
    }

    public static void incOrder(int x) {
        if (x == 1) {
            System.out.print(1 + " ");
            return;
        }
        incOrder(x - 1);
        System.out.print(x + " ");
    }

    public static int factorialN(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorialN(x - 1);
    }

    public static int Sum(int x) {
        if (x == 1) {
            return 1;
        }
        return x + Sum(x - 1);
    }

    public static int fibonacci(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static boolean array(int arr[], int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i + 1] < arr[i]) {
            return false;
        }
        return array(arr, i + 1);
    }

    public static int firstOccur(int arr[],int num,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==num){
            return index;
        }
        return firstOccur(arr, num,index+1);
    }

    public static int lastOccur(int arr[],int num,int index){
        if(arr.length == index){
            return -1;
        }
        int found = lastOccur(arr, num,index+1);
        if(arr[index]==num && found == -1){
            return index;
        }
        return found;
    }

    public static int xPowerN(int num,int power){
        if(power==0){
            return 1;
        }
        int j = xPowerN(num, power/2);
        if(power % 2 ==0){
            return j*j;
        }else{
            return num * j*j;
        }
    }

}
