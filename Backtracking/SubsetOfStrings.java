public class SubsetOfStrings {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("abc");
        String sb = "abc";
        // subsetOfStrings(sb,new StringBuilder(""),0);
        // subsetOfStrings(sb, "", 0);
    System.out.println(sb.substring(0, 0));    }

    public static void subsetOfStrings(String sb,String newStr,int i){
        if(i==sb.length()){
            System.out.println(newStr);
            return;
        }
        subsetOfStrings(sb, newStr+sb.charAt(i), i+1);
        // System.out.println();
        subsetOfStrings(sb, newStr, i+1);
        // System.out.println(newStr);

    }
}
