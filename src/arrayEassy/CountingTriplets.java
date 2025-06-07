package arrayEassy;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] A={1, 2, 4, 3};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans=0;
        for(int j=1;j<A.length-1;j++){
            int lc=0;
            for(int i=0;i<j;i++){
                if(A[i]<A[j]){
                    lc++;
                }
            }

            int rc=0;
            for(int k=j+1;k<A.length;k++){
                if(A[k]>A[j]){
                    rc++;
                }
            }

            ans+=(lc*rc);
        }

        return ans;
    }
}
