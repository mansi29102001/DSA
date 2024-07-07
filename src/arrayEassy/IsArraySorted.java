package arrayEassy;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr[] = {8,5,4,5,1,4,5,2,2}; //[1,2,3], [3,4,5,1,2]
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int min=nums[0];
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(flag==0 && nums[i]<=nums[i+1]){
                if(min>nums[i]){
                    min=nums[i];
                }
            }
            else if(nums[i+1]<=min){
                if(flag==1 && !(nums[i]<=nums[i+1])){
                    return false;
                }
                flag=1;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
