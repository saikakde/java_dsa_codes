import java.util.Scanner;

public class ContigousStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        System.out.println(countContiguous(str,0));
        sc.close();
    }

    public static int countContiguous(String str,int index){
        int count =0;
        if(index ==str.length()){
            return count;
        }
        for(int i=index;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == str.charAt(index)){
                count++;
            }
        }
        return count + countContiguous(str, index+1);
    }
}
