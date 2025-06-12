package arrayEassy;

public class GoodSUbArrays {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int B=4;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(A[i]>B){
                count++;
            }
            int sum=A[i];
            for(int j=i+1;j<n;j++){
                if((j-i+1)%2==0 && (sum+A[j])<B){
                    count++;
                }
                else if((j-i+1)%2==1 && (sum+A[j])>B){
                    count++;
                }
                sum+=A[j];
            }
        }
        return count;
    }
}
