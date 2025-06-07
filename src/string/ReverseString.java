package string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solve("the sky is blue"));
    }
    public static String solve(String A) {
        StringBuilder ans = new StringBuilder();
        int endIndex=A.length()-1;
        int startIndex=-1;

        for(int i=A.length()-1;i>=0;i--){
            while(i>=0 && A.charAt(i)!=' '){
                i--;
            }

            startIndex=i+1;
            ans.append(A, startIndex, endIndex+1);
            endIndex=i-1;
            if(i!=0){
                ans.append(' ');
            }
        }

        return ans.toString().trim();
    }
}
