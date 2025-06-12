package arrayEassy;

public class MinimumSwap {
    public static void main(String[] args) {
        int[] A={0};
        int B=-1000000000;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int num : A) {
            if (num <= B) {
                count++;
            }
        }

        if (count == 0) return 0;

        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] > B) bad++;
        }

        int minSwaps = bad;

        for (int i = 0, j = count; j < n; i++, j++) {
            if (A[i] > B) bad--;
            if (A[j] > B) bad++;
            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}
