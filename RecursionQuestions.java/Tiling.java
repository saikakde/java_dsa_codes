import java.util.Scanner;

class Tiling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean boolArr[] = new boolean[100];
        // StringBuilder sb = new StringBuilder("");
        // String str = sc.nextLine();
        
        // removeDuplicates(boolArr,0,str,sb);
        // System.out.println(tiling(n));

        // int friends = sc.nextInt();
        // System.out.println(friendsPairing(friends));

        binaryString(3, 0, "");
        sc.close();
    }

    public static void binaryString(int n,int lastNumber,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        binaryString(n-1, 0, str+"0");
        if(lastNumber ==0){
            binaryString(n-1, 1, str+"1");
        }
    }

    public static void removeDuplicates(boolean boolArr[],int index,String str,StringBuilder sb){
        // My logic
       
        for(int i=0;i<str.length();i++){
            index = str.charAt(i)-'a';
            if(!boolArr[index]){
                sb.append(str.charAt(i));
            }
            boolArr[index] =true;
        }
        System.out.println(sb.toString());

        // ---------------
        // Shradha's logic
        // if(index == str.length()){
        //     System.out.println(sb);
        //     return;
        // }

        // char currChar = str.charAt(index);
        // if(boolArr[currChar-'a'] == true){
        //     removeDuplicates(boolArr, index+1, str, sb);
        // }else{
        //     boolArr[currChar-'a'] = true;
        //     removeDuplicates(boolArr, index+1, str, sb.append(currChar));
        // }
    }

    public static int friendsPairing(int friends){
        if(friends == 1 || friends == 2){
            return friends;
        }
        return friendsPairing(friends-1) + (friends-1) * friendsPairing(friends-2);
    }

    public static int tiling(int n){

        if(n<=1){
            return 1;
        }
        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);

        int totalWays = vertical+horizontal;
        return totalWays;
    }
}