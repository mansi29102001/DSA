package sorting;

public class recursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        int N=arr.length;
        System.out.print("Before sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        insertionSort(arr,1);
        System.out.print("\nAfter sorting : ");
        for(int i=0;i<N;i++) System.out.print(arr[i] + " ");
    }
    public static void insertionSort(int[] arr, int n){
        if(n==arr.length) return;
        int temp = arr[n];
        for(int j=n-1;j>=0 && temp<arr[j];j--){
           arr[j+1] = arr[j];
           arr[j] = temp;
        }

        insertionSort(arr,n+1);

    }
}
