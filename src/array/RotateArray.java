package array;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
    }

    public static void rotate(int[] nums, int k) {
        int[] numsNew=new int[nums.length];
        k=k%(nums.length);
        int j=nums.length-k;
        for(int i=0;i<(nums.length-k);i++){
            numsNew[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            numsNew[i]=nums[j];
            j++;
        }
        for(int i=0;i<numsNew.length;i++){
            System.out.print(numsNew[i]+" ");
        }
    }
}
