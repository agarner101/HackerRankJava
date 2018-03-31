package warmup.p3_diagonal_difference;

/**
 * Diagonal Difference.
 * <pre>
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * Matrix:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Primary Diagonal (A):
 * 1
 *   5
 *     9
 * 1 + 5 + 9 = 15
 * Secondary Diagonal (B):
 *     3
 *   5
 * 7
 * 3 + 5 + 7 = 15
 *
 * Absolute difference
 * = | A - B |
 * = | 15 - 15 |
 * = 0
 * </pre>
 * Created by andrewgarner on 3/30/18.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        System.out.println("Hello Diagonal Difference!");
    }

    /**
     * Attempt 0
     */
    static int diagonalDifference0(int[][] a) {
        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < a.length; i++) {
            aSum += a[i][i];
            bSum += a[i][a.length - 1 - i];
        }
        int difference = aSum - bSum;
        return difference > 0 ? difference : -difference;
    }
}
