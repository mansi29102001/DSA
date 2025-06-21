package arrayEassy;

import java.util.ArrayList;
import java.util.Arrays;

public class ContinousSumArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(1, 2, 10)));
        arr.add(new ArrayList<>(Arrays.asList(2, 3, 20)));
        arr.add(new ArrayList<>(Arrays.asList(2, 5, 25)));

        System.out.println(solve(5, arr));
    }
    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int n=B.size();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<A;i++) ans.add(0);

        for(int i=0;i<n;i++){
            int start=B.get(i).get(0);
            int end=B.get(i).get(1);
            int add=B.get(i).get(2);
            int prevValueStart = ans.get(start-1);

            ans.set(start-1, add+prevValueStart);
            if(end!=A){
                int endValue = ans.get(end);
                ans.set(end, endValue+(add*(-1)));
            }
        }

        for(int i=0;i<A;i++){
            if(i!=0){
                ans.set(i, (ans.get(i-1)+ans.get(i)));
            }
        }

        return ans;
    }
}
