package algorithms.p5_breaking_records;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Tests for {@link BreakingRecords}
 * Created by andrewgarner on 3/31/18.
 */
public class BreakingRecordsTest extends TestCase {
    private static final int[] INPUT_A = new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1};
    private static final int[] EXPECTED_A = new int[] {2, 4};

    public void testBreakingRecords() throws Exception {
        int[] actual = BreakingRecords.breakingRecords0(INPUT_A);
        Assert.assertTrue("Expected: " + Arrays.toString(EXPECTED_A) + " Actual: " + Arrays.toString(actual),
                Arrays.equals(EXPECTED_A, actual));
    }

}