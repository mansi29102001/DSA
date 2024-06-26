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
        //As the number of passes is always n-1
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            //Number of checks decreases as we move the greater element to the last indexes
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //Now we will check was there any swapping , if there was no swapping it mean that the array is sorted
            if(!flag)
                break;
        }
        System.out.print("\nAfter sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
