package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int N=5;
        System.out.print("Before sorting : ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr, N);
    }

    public static void sort(int arr[], int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("\nAfter sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
