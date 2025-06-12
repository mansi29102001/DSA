package arrayEassy;

public class CountingSubArrays {
    public static void main(String[] args) {
        int[] A={1, 11, 2, 3, 15};
        int B=10;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]<B){
                int sum=A[i];
                count++;
                for(int j=i+1;j<n;j++){
                    if((sum+A[j]<B)){
                        sum+=A[j];
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return count;
    }
}
