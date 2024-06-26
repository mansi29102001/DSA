package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int N=6;
        System.out.print("Before sorting : ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr, N);
    }

    public static void sort(int arr[], int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                   min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }
        System.out.print("\nAfter sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
