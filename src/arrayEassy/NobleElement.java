package arrayEassy;

import java.util.Arrays;

public class NobleElement {
    public static void main(String[] args) {
        int[] A={2,4,1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int diff=A[1]-A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]-A[i-1]!=diff){
                return 0;
            }
        }
        return 1;
    }
}
