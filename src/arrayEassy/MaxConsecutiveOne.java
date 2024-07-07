package arrayEassy;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int cnt = 0;
        int max = 0;
        while(i<nums.length){
            if(nums[i]==0){
                max = Math.max(cnt,max);
                cnt = 0;
            }
            else{
                cnt++;
            }
            i++;
        }

        return Math.max(cnt,max);

    }
}
