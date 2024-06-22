package array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest element in array = " + max);
    }
}
