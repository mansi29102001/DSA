package array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {42,28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47, 44, 49, 46, 25, 57, 39, 55, 45 ,29 ,32 ,61 ,53 ,31 ,36, 56, 63, 30, 52, 27, 34, 50 ,41 ,37 ,66, 62, 59};
        int n=arr.length;
        if(n==1){
            System.out.println("Second Largest = " + -1);
        }
        else{
            int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    if(max!=arr[i]){
                        secMax=max;
                    }
                    max=arr[i];

                } else if (arr[i]>secMax) {
                    secMax = arr[i];
                }
            }
            System.out.println("Second largest = " + secMax);
        }
    }
}
