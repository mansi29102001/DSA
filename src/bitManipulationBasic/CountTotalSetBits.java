package bitManipulationBasic;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int N = 30;
        System.out.println(countSetBits(N));
    }
    private static int countSetBits(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp>1){
                if((temp & 1) == 1) {
                    cnt++;
                }
                temp = temp>>1;
            }
            cnt++;
        }
        return cnt;
    }
}
