import java.util.*;

public class Hello{

    public static int digit_sum(int number){
        int sum=0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    public static int fact(int number){
        if(number<=1){
            return 1;
        }
        return number*fact(number-1);
    }

    public static void table(int number){
        for(int i=1;i<=10;i++){
            System.out.print(number*i+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int x,y,z;
        // x = sc.nextInt();
        // y = sc.nextInt();
        // z = sc.nextInt();

        // int exp1 = (x*y/x);
        // int exp2 = (x*(y/x));

        // System.out.println(exp1+',');
        // System.out.println(exp1);
        // System.out.print(exp2);
        // if(x>y && y>z){
        //     System.out.println("Hello");
        // }
        // if(z>y && z<x){
        //     System.out.println("Java");
        // }if((y+200)<x && (y+150)<z){
        //     System.out.println("hello world");
        // }


        // x+=y;
        // y-=z;
        // z/=(x+y);
        //     System.out.println(x+" "+y+" "+z);

        // int x=10,y=5;
        // int a = (y*(x/y+x/y));
        // int b = (y*x/y+y*x/y);

        // System.out.println(a);
        // System.out.println(b);
    
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("you have fever");
        // }else{
        //     System.out.println("no fever");
        // }
    
        // int x = sc.nextInt();
        // switch (x) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //         case 3:
        //         System.out.println("Tuesday");
        //         break;
        //         case 4:
        //         System.out.println("Wednesday");
        //         break;
        //         case 5:
        //         System.out.println("Thursday");
        //         break;
        //         case 6:
        //         System.out.println("Friday");
        //         break;
        //         case 7:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         break;
        // }
        // int a=63,b=36;
        // boolean x=(a<b)?true:false;
        // int y=(a>b)?a:b;

        // boolean res = (x && y);
        // System.out.println(res);
        // int year = sc.nextInt();
        // if(year%400==0 || (year%4==0 && year%100!=0)){
        //     System.out.println("is a leap year");
        // }else{
        //     System.out.println("not a leap year");
        // }

        // for (int i = 0; i <5; i++) {
        //     System.out.println("hi");
        //     i+=2;
        // }

        // int x = sc.nextInt();
        // int fact=1;
        // if (x<=1){
        //  fact=1;   
        // };
        // for (int i = 2; i <=x; i++) {
        //     fact = fact *i;
        // }
        // System.out.println(fact);
        // int num = sc.nextInt();
        // System.out.println(fact(num));
    //    table(num);

    // System.out.println(Math.sqrt(num));
    // System.out.println(digit_sum(num));
    // int num[] = {1,2,5,3};
    // System.out.println(average(num));
        sc.close();
    // }
    // public static double average(int number[]){
    //     double avg = 0;
    //     int sum=0;
    //     for (int i = 0; i < number.length; i++) {
    //         sum = sum+number[i];
    //     }
    //     avg = (double)sum/number.length;
    //     return avg;
    }

    

    
}

        