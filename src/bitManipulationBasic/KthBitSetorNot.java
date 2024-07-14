package bitManipulationBasic;

public class KthBitSetorNot {
    public static void main(String[] args) {
        int num = 500;
        int k = 3;
        System.out.println(checkKthBit(num,k));
    }
    private static boolean checkKthBit(int num, int k){
        int mask = 1<<k;
        int kthBit = num & mask;
        if(kthBit == 0) return false;
        return true;
    }
}
