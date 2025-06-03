package arrayEassy;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        int k = 15;
        System.out.println(lenOfLongSubarr(nums,nums.length,k));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int maxSum = 0;
        for(int i=0;i<N;i++){
            int sum = A[i];
            int cnt = 1;
            for(int j=i+1;j<N;j++){
                if((sum+A[j]) <= K){
                    sum += A[j];
                    cnt++;
                }
            }
            if(sum == K) maxSum = Math.max(maxSum,cnt);
        }
        return maxSum;
    }
}
