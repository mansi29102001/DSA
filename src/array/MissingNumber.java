package array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {8,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        if(i==n){
            return i;
        }
        return -1;
    }
}
