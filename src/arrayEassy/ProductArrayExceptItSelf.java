package arrayEassy;

public class ProductArrayExceptItSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] leftProduct=new int[n];
        int[] rightProduct=new int[n];
        leftProduct[0]=1;
        rightProduct[n-1]=1;

        for(int i=1;i<n;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }

        for(int i=n-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=leftProduct[i]*rightProduct[i];
        }

        return ans;
    }
}
