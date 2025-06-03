package arrayEassy;

public class MinimumSwap {
    public static void main(String[] args) {
        int[] A={0};
        int B=-1000000000;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int count=0;
        long minElements=0;
        for(int k=0;k<A.length;k++){
            if(A[k]<=B){
                minElements++;
            }
        }

        int j=0;
        int minCount=Integer.MAX_VALUE;
        for(int i=0;i<minElements+j;i++){
            if(i<A.length){
                if(A[i]>B){
                    count++;
                }
                if(i==minElements+j-1){
                    i=j;
                    j++;
                    minCount=Math.min(minCount, count);
                    count=0;
                }
            }
            else{
                break;
            }
        }

        return minCount;
    }
}
