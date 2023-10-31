

public class PermutationOfStrings {
    public static void main(String[] args) {
        String str = "abc";

        permutationOfStrings(str,"");
    }
    public static void permutationOfStrings(String str,String newStr){
        if(str.length() == 0){
            System.out.println(newStr);
            return;
        }

        for(int i=0;i<str.length();i++){
            Character current = str.charAt(i);
            str = str.substring(0, i)+str.substring(i+1); 
            permutationOfStrings(str, newStr+current);
        }
    }
    
}
