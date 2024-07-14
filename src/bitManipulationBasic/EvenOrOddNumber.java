package bitManipulationBasic;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(findOddEven(num));
    }
    private static String findOddEven(int num){
        if((num & 1)==0) return "Even";
        return "Odd";
    }
}
