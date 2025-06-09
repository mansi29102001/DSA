package arrayEassy;

import java.util.Arrays;

public class RepeatNumbers {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 1, 1};
        System.out.println(repeatedNumber(A));
    }
    public static int repeatedNumber(int[] A) {
        Arrays.sort(A);
        int n=A.length;
        int count=0;
        int val=-1;
        for(int i=0;i<n;i++){
            if(i==0 || val!=A[i]){
                val=A[i];
                count=1;
            }
            else{
                count++;
            }
            if(count*3>n){
                return val;
            }
        }

        return -1;
    }
}
