import java.util.Scanner;

public class Strings {


    public static void charPosition(String x,int i){
        System.out.println(x.charAt(i));
    }

    public static void isPalindrome(String x){
        String temp = "";
        
        for(int i=x.length()-1;i>=0;i--){
            temp = temp + x.charAt(i);
        }
        if(x.equals(temp)){
            System.out.println("is a palindrome");
        }else{
            System.out.println("not a palindrome");
            System.out.println(temp);
        }
    }

    public static void shortestPath(String x,int p,int q){
        int p1 = p;
        int q2 = q;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='N'){
                q = q + 1; 
            }else if(x.charAt(i)=='S'){
                q = q - 1; 
            }else if(x.charAt(i)=='W'){
                p = p - 1; 
            }else if(x.charAt(i)=='E'){
                p = p + 1; 
            }else{
                System.out.println("invalid directions");
                break;
            }
        }
        int X = p-p1;
        int Y = q-q2;

        double finalPosition = Math.sqrt((X*X)+(Y*Y));
        System.out.println("The final positon of person is: ("+X+","+Y+")");
        System.out.println("Displacement from initial position is: "+finalPosition);
    }

    public static void toUpCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // for(int i=1;i<str.length();i++){
        //     sb.append(str.charAt(i));
        // }
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(" ");
                i++;
                char ch1 = Character.toUpperCase(str.charAt(i));
                sb.append(ch1);
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static String stringCompression(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            int count = 1;
            while(i<str.length()-1 &&(str.charAt(i)==str.charAt(i+1))){
                count++;
                i++;
            }     
            newStr = newStr + str.charAt(i); 
            if(count>1){
                newStr = newStr + count;
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StringBuilder str = new StringBuilder(null);
        // String y = sc.next();
        String x = sc.nextLine();
        // String str = sc.nextLine();
        // System.out.println(y);
        // System.out.println(x);

        // System.out.println("hello "+"world");
        // System.out.println("hello "+x);
        
        int pos = sc.nextInt();
        charPosition(x, pos);
        // isPalindrome(x);

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // shortestPath(str, x,y);

        // String x = "hello";
        // String y = "hello";
        // System.out.println(x==y);  //output: true
        // System.out.println(x.equals(y));  //output: true


        // String x = sc.nextLine();  //input: hello    
        // String y = sc.nextLine();  //input: hello 
        // System.out.println(x==y);  //output: false
        // System.out.println(x.equals(y));  //output: true

        String str = sc.nextLine();
        // String str = "aabcccdd";

        // toUpCase(str);
        System.out.println(stringCompression(str));

        sc.close();

    }
}
