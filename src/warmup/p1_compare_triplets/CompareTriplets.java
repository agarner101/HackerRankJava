package warmup.p1_compare_triplets;

/**
 * Compare the Triplets
 * <p>
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * <p>
 * Created by andrewgarner on 3/30/18.
 */
public class CompareTriplets {

    /**
     * Solution 0.
     * Works, but boring and long
     */
    public static int[] solve0(int a0, int a1, int a2, int b0, int b1, int b2) {

        int aCount = 0;
        int bCount = 0;

        if (a0 > b0) {
            aCount++;
        } else if (b0 > a0) {
            bCount++;
        }
        if (a1 > b1) {
            aCount++;
        } else if (b1 > a1) {
            bCount++;
        }
        if (a2 > b2) {
            aCount++;
        } else if (b2 > a2) {
            bCount++;
        }

        return new int[]{aCount, bCount};
    }
}
