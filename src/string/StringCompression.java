package string;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        int i=0;
        char ch=chars[i];
        int n=chars.length;
        int count=0;
        int start=0;

        while(i<=n){
            if(i!=n && ch==chars[i]){
                count++;
            }
            else{
                chars[start]=ch;
                if(count>1){
                    String num = Integer.toString(count);
                    for (int j = 0; j < num.length(); j++) {
                        chars[++start] = num.charAt(j);
                    }

                }
                start++;
                if(i<n){
                    ch=chars[i];
                    count=1;
                }
            }
            i++;
        }

        return start;
    }
}
