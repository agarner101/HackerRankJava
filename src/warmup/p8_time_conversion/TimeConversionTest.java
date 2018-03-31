package warmup.p8_time_conversion;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Test for {@link TimeConversion}
 * Created by andrewgarner on 3/30/18.
 */
public class TimeConversionTest extends TestCase {

    private static final String INPUT_A = "07:05:45PM";
    private static final String EXPECTED_A = "19:05:45";

    private static final String INPUT_B = "07:05:45AM";
    private static final String EXPECTED_B = "07:05:45";

    public void testTimeConversion0A() throws Exception {
        Assert.assertEquals(EXPECTED_A, TimeConversion.timeConversion0(INPUT_A));
    }

    public void testTimeConversion0B() throws Exception {
        Assert.assertEquals(EXPECTED_B, TimeConversion.timeConversion0(INPUT_B));
    }

}