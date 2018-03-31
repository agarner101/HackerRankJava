package algorithms.p1_grading;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Tests for {@link Grading}
 * Created by andrewgarner on 3/30/18.
 */
public class GradingTest extends TestCase {

    private static int[] INPUT_A = new int[]{73, 67, 38, 33};
    private static int[] EXPECTED_A = new int[]{75, 67, 40, 33};

    public void testGradingStudents0A() throws Exception {
        int[] actual = Grading.gradingStudents0(Arrays.copyOf(INPUT_A, INPUT_A.length));
        Assert.assertTrue("Not equals. Actual: " + Arrays.toString(actual) + ". Expected: " + Arrays.toString(EXPECTED_A),
                Arrays.equals(EXPECTED_A, actual));
    }

}