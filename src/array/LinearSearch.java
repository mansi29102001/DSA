package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int k=6;
        System.out.println(searchInSorted(arr,5,k));
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
}
