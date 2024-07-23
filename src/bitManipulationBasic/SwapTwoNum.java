package bitManipulationBasic;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 13;
        int b = 9;
        swap(a,b);
    }
    private static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping : a="+a +" b="+b);
    }
}
