package day21;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_SimpleAssertsTest {

    @Test()
    void testCase1() {
        Integer[] actual = {1, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4};
        Assert.assertEquals(actual, expected, "Arrays are not equal by order");
    }

    @Test()
    void testCase2() {
        Integer[] actual = {1, 2, 3, 4};
        Integer[] expected = {1, 4, 3, 2};
        Assert.assertEquals(actual, expected, "Arrays are not equal by order");
    }

    @Test()
    void testCase3() {
        Integer[] actual = {1, 2, 3, 4};
        Integer[] expected = {1, 4, 3, 2};
        Assert.assertEqualsNoOrder(actual, expected, "Arrays are equal");
    }

    @Test()
    void testCase4() {
        Integer[] actual = {1, 2, 3, 4};
        Integer[] expected = {1, 4, 3, 5};
        Assert.assertEqualsNoOrder(actual, expected, "Arrays are equal");
    }

    @Test()
    void testCase5() {
        double actual = 10.0;
        double expected = 10.1;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test()
    void testCase6() {
        double actual = 10.1;
        double expected = 10.0;
        Assert.assertNotEquals(actual, expected, 0.1, "Expected not to be equal withing 0.1 delta!");
    }

    @Test()
    void testCase7() {
        Object actual = null;
        Assert.assertNotNull(actual, "Expecting actual not to be NULL!");
    }

    @Test()
    void testCase8() {
        Object actual = null;
        Assert.assertNull(actual, "Expecting actual to be NULL!");
    }

    @Test()
    void testCase9() {
        Object actual = new Object();
        Object reference = actual;
        Assert.assertSame(actual, reference, "Expecting objects to be the same!");
    }

    @Test()
    void testCase10() {
        Object actual = new Integer(1);
        Object reference = new Integer(1);
        Assert.assertSame(actual, reference, "Expecting objects to be the same!");
    }
    @Test()
    void testCase11() {
        Object actual = new Integer(1);
        Object reference = new Integer(1);
        Assert.assertEquals(actual, reference, "Expecting objects to be equal!");
    }

    @Test()
    void testCase12() {
        Object actual = new Integer(1);
        Object reference = new Integer(1);
        Assert.assertNotSame(actual, reference, "Expecting objects to not be same!");
    }

    @Test
    void testCase13() {
        boolean actual = false;
        Assert.assertTrue(actual, "Expected element to found!");
    }
}
