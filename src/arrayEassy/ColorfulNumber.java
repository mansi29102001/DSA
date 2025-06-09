package arrayEassy;

import java.util.ArrayList;
import java.util.List;

public class ColorfulNumber {
    public static void main(String[] args) {
        System.out.println(colorful(236));
    }
    public static int colorful(int A) {
        List<Integer> arr=new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        while(A>0){
            int val=A%10;
            arr.add(val);
            A=A/10;
        }
        for(int i=0;i<arr.size();i++){
            int product=1;
            for(int j=i;j<arr.size();j++){
                product*=arr.get(j);
                if(ans.contains(product)){
                    return 0;
                }
                else{
                    ans.add(product);
                }
            }
        }
        return 1;
    }
}
