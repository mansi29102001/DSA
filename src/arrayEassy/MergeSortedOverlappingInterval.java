package arrayEassy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedOverlappingInterval {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(Arrays.asList(1, 3)));
        intervals.add(new ArrayList<>(Arrays.asList(2, 6)));
        intervals.add(new ArrayList<>(Arrays.asList(8, 10)));
        intervals.add(new ArrayList<>(Arrays.asList(15, 18)));

        System.out.println(solve(intervals));

    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        ArrayList<Integer> interval=new ArrayList<>();
        ArrayList<ArrayList<Integer>> response=new ArrayList<>();

        interval.add(A.get(0).get(0));
        interval.add(A.get(0).get(1));
        response.add(new ArrayList<>(interval));

        int j=0;

        for(int i=1;i<n;i++){
            interval.clear();
            if(response.get(j).get(1) >= A.get(i).get(0)){
                int end=Math.max(response.get(j).get(1), A.get(i).get(1));
                int start=response.get(j).get(0);

                interval.add(start);
                interval.add(end);
                response.set(j, new ArrayList<>(interval));
            }
            else{
                j++;
                interval.add(A.get(i).get(0));
                interval.add(A.get(i).get(1));
                response.add(new ArrayList<>(interval));
            }
        }

        return response;
    }
}
