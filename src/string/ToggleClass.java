package string;

public class ToggleClass {
    public static void main(String[] args) {
        System.out.println(solve("Hello"));
    }
    public static String solve(String A) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch>='A' && ch<='Z'){
                str.append((char)(ch+32));
            } else {
                str.append((char)(ch-32));
            }
        }
        return str.toString();
    }
}
