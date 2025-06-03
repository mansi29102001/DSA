package arrayEassy;

public class LeastAverage {
    public static void main(String[] args) {
        int[] A={20,3,13,5,10,14,8,5,11,9,1,11};
        int B=9;
        System.out.println(solve(A,B));
    }

    public static int solve(int[] A, int B) {
        int n=A.length;
        int[] ps=new int[n];

        for(int i=0;i<n;i++){
            if(i==0) ps[i]=A[i];
            else {
                ps[i]=ps[i-1]+A[i];
            }
        }

        int minSum=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<=n-B;i++){
            if(i==0){
                if(minSum>(ps[B-1])){
                    minSum=(ps[B-1]);
                    index=i;
                }
            }
            else{
                int sum=ps[B+i-1]-ps[i-1];
                if(minSum>sum){
                    minSum=sum;
                    index=i;
                }
            }
        }

        return index;
    }
}
