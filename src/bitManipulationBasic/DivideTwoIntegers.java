package bitManipulationBasic;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 22, divisor = 3;
        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) == (divisor > 0);
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long sum = 0;
        while(n>=d){
            long temp = d;
            long multiple = 1;

            while (n >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            n -= temp;
            sum += multiple;
        }
        if(sum >= Math.pow(2,31)-1 && sign == true) return Integer.MAX_VALUE;
        else if(sum >= Math.pow(2,31)-1 && sign == false) return Integer.MIN_VALUE;
        return sign==false ? (int)(-1*sum) : (int)sum;
    }
}
