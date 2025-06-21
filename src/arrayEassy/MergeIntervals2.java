package arrayEassy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(Arrays.asList(3, 5)));
        intervals.add(new ArrayList<>(Arrays.asList(8, 10)));
        //intervals.add(new ArrayList<>(Arrays.asList(5, 6)));

        System.out.println(insert(intervals, new ArrayList<>(Arrays.asList(1,12))));
    }
    public static ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> response = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int startCompare=B.get(0);
        int endCompare=B.get(1);

        if(A.size()>0){
            list.add(A.get(0).get(0));
            list.add(A.get(0).get(1));
            response.add(new ArrayList<>(list));
        }

        int j=0;
        int flag=0;

        for(int i=0;i<A.size();i++){
            list.clear();
            int prevEnd=response.get(j).get(1);

            if(prevEnd>=startCompare && flag==0){
                flag=1;
                i--;
                list.add(Math.min(startCompare,response.get(j).get(0)));
                list.add(Math.max(prevEnd, endCompare));
                response.set(j, new ArrayList<>(list));
            }
            else if(prevEnd>=A.get(i).get(0)){
                list.add(response.get(j).get(0));
                list.add(Math.max(prevEnd, A.get(i).get(1)));
                response.set(j, new ArrayList<>(list));
            }
            else{
                j++;
                if(startCompare>A.get(i).get(0) || flag==1){
                    list.add(A.get(i).get(0));
                    list.add(A.get(i).get(1));
                    response.add(new ArrayList<>(list));
                }
                else{
                    flag=1;
                    response.add(new ArrayList<>(B));
                    i--;
                }
            }
        }

        if(flag==0){
            response.add(new ArrayList<>(B));
        }

        return response;
    }
}
