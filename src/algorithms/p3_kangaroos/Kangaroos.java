package algorithms.p3_kangaroos;


/**
 * You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number
 * line ready to jump in the positive direction (i.e, toward positive infinity).
 * <p>
 * https://www.hackerrank.com/challenges/kangaroo/problem
 * Created by andrewgarner on 3/31/18.
 */
public class Kangaroos {

    /**
     * Attempt 2 (really 1.5) -- Same as {@link #kangaroo1(int, int, int, int)} but condensed.
     */
    static String kangaroo2(int x1, int v1, int x2, int v2) {
        double i = (double) (x2 - x1) / (v1 - v2);
        return Double.isNaN(i) || i >= 0 && i == (int) i ? "YES" : "NO";
    }

    /**
     * Attempt 1.
     * i = (x2 - x1) / (v1 - v2)
     * Returns {@code "YES"} if:
     * 1. i is a whole number greater than or equal to {@code 0}.
     * 2. i is NaN -- i.e. v1 == v2
     */
    static String kangaroo1(int x1, int v1, int x2, int v2) {
        double dividend = (x2 - x1);
        double divisor = (v1 - v2);
        double i = dividend / divisor;

        boolean isEquivalent = Double.isNaN(i);
        boolean isGreaterThan0 = i >= 0;
        boolean isWholeNumber = i == (int) i;

        return isEquivalent || (isGreaterThan0 && isWholeNumber) ? "YES" : "NO";
    }

    /**
     * Attempt 0. Does not work for v2 == v1
     */
    static String kangaroo(int x1, int v1, int x2, int v2) {
        double i = (double) (x2 - x1) / (v1 - v2);
        return i >= 0 && i == (int) i ? "YES" : "NO";
    }
}
