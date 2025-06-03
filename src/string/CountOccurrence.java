package string;

public class CountOccurrence {
    public static void main(String[] args) {
        System.out.println(solve("bobob"));
    }

    public static int solve(String A) {
        int count=0;
        for(int i=0;i<A.length()-2;i++){
            StringBuilder str = new StringBuilder(A.substring(i,i+3));
            if(str.toString().equals("bob")){
                count++;
            }
        }

        return count;
    }
}
