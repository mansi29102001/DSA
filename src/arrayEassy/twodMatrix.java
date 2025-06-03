package arrayEassy;

public class twodMatrix {
    public static void main(String[] args) {
        int[][] A={{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        System.out.println(solve(A));
    }

    public static int[] solve(int[][] A) {
        int[] ans=new int[A[0].length];

        for(int i=0;i<A[0].length;i++){
            int sum=0;
            for(int j=0;j<A.length;j++){
                sum+=A[j][i];
            }
            ans[i]=sum;
        }

        return ans;
    }
}
