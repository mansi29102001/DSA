package matrices;

public class AntiDiagonal {
    public static void main(String[] args) {
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int n=A.length;
        int finalSize=(2*n)-1;
        int[][] ans=new int[finalSize][n];

        int j;

        for(j=0;j<n;j++){
            int temp=j;
            int i=0;
            while(i<=j){
                ans[j][i]=A[i][temp];
                temp--;
                i++;
            }
        }

        int ansIndex=j;
        j=1;
        int i;
        while(ansIndex<finalSize){
            int temp=n-1;
            int col=0;
            i=j;

            while(i<n){
                ans[ansIndex][col]=A[i][temp];
                temp--;
                col++;
                i++;
            }

            j++;
            ansIndex++;
        }
    }
}
