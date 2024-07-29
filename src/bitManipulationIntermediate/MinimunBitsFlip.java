package bitManipulationIntermediate;

public class MinimunBitsFlip {
    public static void main(String[] args) {
        int start = 3; int goal = 4;
        System.out.println(minBitFlips(start,goal));
    }
    public static int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int cnt = 0;
        while(n!=0){
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
