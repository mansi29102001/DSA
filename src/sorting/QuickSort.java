package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {57,38,91,10,38,28,79,41};
        int n = arr.length;
        System.out.print("Before sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        quickSort(arr,0,n-1);
        System.out.print("\nAfter sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void quickSort(int[] arr,int low, int high){
        if(low<high){
            int partition = partition(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }

    }
    private static int partition(int[] arr,int low,int high){
        int left = low;
        int right = high;
        int pivot = arr[low];
        while(left<right){
            while(arr[left]<=pivot && left<arr.length-1){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<right){
                swap(arr,left,right);
            }
            else{
                swap(arr,low,right);
            }
        }
        return right;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


}
