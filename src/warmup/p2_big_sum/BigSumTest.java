package warmup.p2_big_sum;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link BigSum}
 * Created by andrewgarner on 3/30/18.
 */
public class BigSumTest extends TestCase {

    private static final long[] ARRAY = new long[]{
            1000000001,
            1000000002,
            1000000003,
            1000000004,
            1000000005
    };

    private static final int SIZE = ARRAY.length;

    public void testAVeryBigSum0() throws Exception {
        long result = BigSum.aVeryBigSum0(SIZE, ARRAY);
        Assert.assertEquals(5000000015L, result);
    }

}