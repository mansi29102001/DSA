package bitManipulationBasic;

public class SetRightMostUnsetBit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(setBit(n));
    }
    static int setBit(int n) {
        //Optimised way
        return (n | (n+1));
        //Manual approach
        /*int temp = n;
        int iteration = 0;
        while(n>0){
            if((n&1) == 0) break;
            iteration++;
            n = n>>1;
        }
        int mask = 1<<iteration;
        return (temp | mask);*/
    }
}
