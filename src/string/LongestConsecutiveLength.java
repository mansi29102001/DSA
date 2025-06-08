package string;

public class LongestConsecutiveLength {
    public static void main(String[] args) {
        System.out.println(solve("1111111111111"));
    }
    public static int solve(String A) {
        int ans=0;
        int totalOne=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='0'){
                int l=0;
                int j=i-1;
                while(j>=0 && A.charAt(j)!='0'){
                    j--;
                    l++;
                }

                int r=0;
                j=i+1;
                while(j<A.length() && A.charAt(j)!='0'){
                    j++;
                    r++;
                }
                ans=Math.max(ans, l+r);
            }
            else{
                totalOne++;
            }
        }
        if(ans!=0 && totalOne!=ans){
            ans=ans+1;
        }
        else if(totalOne==A.length()){
            ans=totalOne;
        }
        return ans;
    }
}
