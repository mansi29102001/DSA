package bitManipulationBasic;

public class BitBasicConcepts {
    //Todo - Get ith bit, set ith bit and clear ith bit (1 based indexing)
    public static void main(String[] args) {
        int num = 70;
        int i = 3;
        System.out.println(getBit(num,i));
        System.out.println(setBit(num,i));
        System.out.println(clearBit(num,i));
    }
    private static int getBit(int num, int i){
        int mask = 1<<(i-1);
        if((num & mask)!=0) return 1;
        return 0;
    }
    private static int setBit(int num, int i){
        int mask = 1<<(i-1);
        return num | mask;
    }
    private static int clearBit(int num, int i){
        int mask = ~(1<<(i-1));
        return num & mask;
    }
}
