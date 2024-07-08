package sorting;

public class recursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        System.out.println("Before sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        bubbleSort(arr, arr.length);
        System.out.println("\nAfter sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int arr[], int n){
        if(n==1) return;
        int flag = 0;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = 1;
            }
        }
        if (flag==0) return;
        bubbleSort(arr,n-1);
    }
}
