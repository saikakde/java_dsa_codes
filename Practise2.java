import java.util.*;

public class Practise2 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // for(int i=2;i<=(num/2);i++){
            if (num % i == 0) {
                System.out.println(num + " is non-prime");
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int range) {
        for (int i = 0; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void firstNPrimes(int n) {
        int x = 2;
        while (n > 0) {
            if (isPrime(x)) {
                System.out.print(x + " ");
                n--;
            }
            x++;
        }
    }

    public static void revString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void armstrong(int num) {
        int sum = 0, length = 0, temp = num, num2 = num;
        while (num > 0) {
            length++;
            num = num / 10;
        }
        while (num2 > 0) {
            sum = sum + (int) Math.pow(num2 % 10, length);
            num2 = num2/ 10;
        }
        if (temp == sum) {
            System.out.println("is armstrong number");
        } else {
            System.out.println("is not armstrong number");
        }

    }

    public static void fibonacci(int range) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int i = 0;
        while (range - 2 > 0) {
            arr.add(arr.get(i) + arr.get(i + 1));
            i++;
            range--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number to check if prime or not: ");
        // int num = sc.nextInt();
        // isPrime(num);
        // sc.close();
        // int num=29;
        
        // primesInRange(30);
        // System.out.println();

        // firstNPrimes(20);
        // System.out.println();

        System.out.println(isPalindrome("naman"));
        // System.out.println(factorial(3));
        // fibonacci(10);
        // revString("hello");
        // armstrong(1634);

    }
}