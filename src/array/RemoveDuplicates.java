package array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int val=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                val=nums[i];
            }
            else if(nums[i]==val && i!=0){
                nums[i]=101;
            }
        }
        int cnt=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=101){
                cnt++;
                if(i!=0 && nums[cnt-1]==101){
                    nums[cnt-1]=nums[i];
                    nums[i]=101;
                }
            }

        }
        return cnt;
    }
}
