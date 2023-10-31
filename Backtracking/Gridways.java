import java.util.Scanner;

public class Gridways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // System.out.println(gridways(0,0,n,m));
        System.out.println(gridways(n, m));
        
        
        sc.close();
    }
    // public static int gridways(int right,int down,int n,int m){   // time complexity: O(2 raised to n+m)
    //     if(right == n-1 && down == m-1){
    //         return 1;
    //     }else if(right == n || down == m){
    //         return 0;
    //     }

    //     int w1 = gridways(right+1, down, n, m);
    //     int w2 = gridways(right, down+1, n, m);
    //     return w1 + w2;
    // }

    public static int factorial(int x){   // time compexity: O(n+m)
        if(x == 1 || x == 0){
            return 1;
        }
        return x * factorial(x-1);
    }
    public static int gridways(int n,int m){
        int numerator = factorial(n+m-2);
        int denominator = factorial(n-1)*factorial(m-1);

        return numerator/denominator;
    }
}
