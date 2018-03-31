package warmup.p2_big_sum;

/**
 * A Very Big Sum
 * <p>
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 * Created by andrewgarner on 3/30/18.
 */
public class BigSum {

    /**
     * Attempt 0.
     */
    public static long aVeryBigSum0(int n, long[] ar) {
        long result = 0;
        for (long value : ar) {
            result += value;
        }
        return result;
    }
}
