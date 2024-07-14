package bitManipulationBasic;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 161;
        System.out.println(isPowerOfTwo(n));
    }
    private static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        return ((n & n-1) == 0) ? true : false;
    }
}
