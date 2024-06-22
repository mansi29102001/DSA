package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int N=6;
        System.out.print("Before sorting : ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr, N);
    }

    public static void sort(int arr[], int n){
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j-- ){
                if((arr[i]<arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nAfter sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
