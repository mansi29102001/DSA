package string;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
    public static String longestPalindrome(String A) {
        int maxLength = Integer.MIN_VALUE;
        StringBuilder palindrome = new StringBuilder();
        for(int i=0;i<A.length();i++){
            StringBuilder oddPalindrome = new StringBuilder(checkPalindrome(A, i, i));
            StringBuilder evenPalindrome = new StringBuilder(checkPalindrome(A, i, i+1));
            if(oddPalindrome.length() > maxLength){
                maxLength = oddPalindrome.length();
                palindrome = oddPalindrome;
            }
            if(evenPalindrome.length() > maxLength){
                maxLength = evenPalindrome.length();
                palindrome = evenPalindrome;
            }
        }
        return palindrome.toString();
    }
    public static String checkPalindrome(String str, int i, int j){
        StringBuilder ans=new StringBuilder();
        while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
            i--;
            j++;
        }

        if(i+1 < j){
            ans = new StringBuilder(str.substring(i+1, j));
        }
        return ans.toString();
    }
}
