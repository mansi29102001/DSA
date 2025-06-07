package string;

public class SimpleReverse {
    public static void main(String[] args) {
        System.out.println(solve("hello"));
    }
    public static String solve(String A) {
        char[] ch = A.toCharArray();
        int start=0;
        int end=ch.length-1;

        while(start<end){
            char temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            start++;
            end--;
        }

        return new String(ch);
    }
}
