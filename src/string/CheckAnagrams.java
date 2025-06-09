package string;

public class CheckAnagrams {
    public static void main(String[] args) {
        System.out.println(solve("secure","rescue"));
    }
    public static int solve(String A, String B) {
        int[] frequencyA=new int[26];
        int[] frequencyB=new int[26];

        for(int i=0;i<A.length();i++){
            int val=A.charAt(i);
            frequencyA[val-97]++;
        }
        for(int i=0;i<B.length();i++){
            int val=B.charAt(i);
            frequencyB[val-97]++;
        }
        for(int i=0;i<26;i++){
            if(frequencyA[i]!=frequencyB[i]){
                return 0;
            }
        }
        return 1;
    }
}
