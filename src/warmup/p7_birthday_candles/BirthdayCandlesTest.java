package warmup.p7_birthday_candles;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link BirthdayCandles}
 * Created by andrewgarner on 3/30/18.
 */
public class BirthdayCandlesTest extends TestCase {
    private static int[] ARRAY_A = {3, 2, 1, 3};
    private static int[] ARRAY_B = {1, 0, 3, 2};
    private static int[] ARRAY_C = {10, 100, 100, 100, 50, 50, 100, 50};

    public void testCandles0A() throws Exception {
        Assert.assertEquals(2, BirthdayCandles.candles0(ARRAY_A.length, ARRAY_A));
    }

    public void testCandles0B() throws Exception {
        Assert.assertEquals(1, BirthdayCandles.candles0(ARRAY_B.length, ARRAY_B));
    }

    public void testCandles0C() throws Exception {
        Assert.assertEquals(4, BirthdayCandles.candles0(ARRAY_C.length, ARRAY_C));
    }

}