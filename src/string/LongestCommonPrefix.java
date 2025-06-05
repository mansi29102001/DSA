package string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(solve(A));
    }

    public static String solve(String[] A) {
        int j=0;
        char ch='\0';
        int flag=1;
        StringBuilder prefix = new StringBuilder();

        while(flag==1){
            for(int i=0;i<A.length;i++){
                StringBuilder str = new StringBuilder(A[i]);
                if(j<str.length()){
                    if(i==0){
                        ch=str.charAt(j);
                    }
                    else if(ch != str.charAt(j)){
                        flag=0;
                        break;
                    }
                }
                else{
                    flag=0;
                }
            }
            j++;
            if(flag!=0){
                prefix.append(ch);
            }
        }

        return prefix.toString();
    }
}
