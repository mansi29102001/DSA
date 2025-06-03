package string;

public class StringImmutability {
    public static void main(String[] args) {
        System.out.println(solve("aeiOUz"));
    }

    public static String solve(String A) {
        StringBuilder newStr = new StringBuilder(A.concat(A));
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<newStr.length();i++){
            char ch = newStr.charAt(i);
            if(ch>='A' && ch<='Z'){
                continue;
            }
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ans.append("#");
            }
            else{
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
