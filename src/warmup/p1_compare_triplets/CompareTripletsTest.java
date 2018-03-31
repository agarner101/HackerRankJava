package warmup.p1_compare_triplets;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link CompareTriplets}
 * Created by andrewgarner on 3/30/18.
 */
public class CompareTripletsTest extends TestCase {

    private void test(int expectedA, int expectedB, int[] result) throws Exception {
        Assert.assertEquals("A Check:", expectedA, result[0]);
        Assert.assertEquals("B Check:", expectedB, result[1]);
    }

    //----------- Solution 0 Tests ------------
    public void testSolve0A() throws Exception {
        test(1, 1,
                CompareTriplets.solve0(1,2, 3,3,2,1));
    }

    public void testSolve0B() throws Exception {
        test(0, 3,
                CompareTriplets.solve0(10,10, 10,20,20,20));
    }

    public void testSolve0C() throws Exception {
        test(3, 0,
                CompareTriplets.solve0(2,2, 2,1,1,1));
    }

    public void testSolve0D() throws Exception {
        test(0, 0,
                CompareTriplets.solve0(0,0, 0,0,0,0));
    }

}