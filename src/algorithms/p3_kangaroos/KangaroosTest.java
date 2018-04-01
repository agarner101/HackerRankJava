package algorithms.p3_kangaroos;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link Kangaroos}
 * Created by andrewgarner on 3/31/18.
 */
public class KangaroosTest extends TestCase {
    public void testKangaroo1A() throws Exception {
        Assert.assertEquals("YES", Kangaroos.kangaroo1(0,3,4,2));
    }

    public void testKangaroo1B() throws Exception {
        Assert.assertEquals("NO", Kangaroos.kangaroo1(0,2,5,3));
    }

    public void testKangaroo1C() throws Exception {
        Assert.assertEquals("YES", Kangaroos.kangaroo1(1,2,1,2));
    }

    public void testKangaroo2A() throws Exception {
        Assert.assertEquals("YES", Kangaroos.kangaroo2(0,3,4,2));
    }

    public void testKangaroo2B() throws Exception {
        Assert.assertEquals("NO", Kangaroos.kangaroo2(0,2,5,3));
    }

    public void testKangaroo2C() throws Exception {
        Assert.assertEquals("YES", Kangaroos.kangaroo2(1,2,1,2));
    }

}