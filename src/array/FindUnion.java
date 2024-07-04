package array;

import java.util.*;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2={1, 2, 3, 6, 7};
        int n=5;
        int m=5;
        System.out.println(findUnion(arr1,arr2,n,m));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        Set<Integer> list = new TreeSet<>();
        for(int i=0;i<n;i++){
            list.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            list.add(arr2[j]);
        }
        return new ArrayList<Integer>(list);
    }
}
