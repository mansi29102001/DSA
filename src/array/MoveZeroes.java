package array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]= temp;
                k++;
            }
        }
        //Printing array
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
