package matrices;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] A={{1,2},{3,4}};
        solve(A);
    }
    public static void solve(int[][] A) {
        //Find transpose
        int N=A.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp=A[j][i];
                A[j][i]=A[i][j];
                A[i][j]=temp;
            }
        }

        //Reverse rows
        int start=0;
        int end=A.length-1;

        while(start<end){
            for(int i=0;i<A.length;i++){
                int temp=A[i][start];
                A[i][start]=A[i][end];
                A[i][end]=temp;
            }
            start++;
            end--;
        }
    }
}
