package warmup.p3_diagonal_difference;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link DiagonalDifference}
 * Created by andrewgarner on 3/30/18.
 */
public class DiagonalDifferenceTest extends TestCase {

    private static final int[][] ARRAY_A = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    private static final int[][] ARRAY_B = new int[][] {
            {11, 2, 4},
            {4,  5, 6},
            {10, 8, -12},
    };

    private static final int[][] ARRAY_C = new int[][] {
            {1, 2, 3, 4},
            {8, 7, 6, 5},
            {9, 0, 1, 2},
            {6, 5, 4, 3},
    };

    public void testDiagonalDifference0A() throws Exception {
        Assert.assertEquals(0, DiagonalDifference.diagonalDifference0(ARRAY_A));
    }

    public void testDiagonalDifference0B() throws Exception {
        Assert.assertEquals(15, DiagonalDifference.diagonalDifference0(ARRAY_B));
    }

    public void testDiagonalDifference0C() throws Exception {
        Assert.assertEquals(4, DiagonalDifference.diagonalDifference0(ARRAY_C));
    }

}