package yoshi.junittest;

import junit.framework.TestCase;

import util.Calc;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yoshi on 2015/01/18.
 */
public class CalcTest extends TestCase {

    public void testAdd() throws Exception {
        int expected = 3;
        int actual = Calc.add(1, 2);
        assertEquals(expected, actual);
    }

    public void testSub() throws Exception {
        int expected = -1;
        int actual = Calc.sub(1, 2);
        assertEquals(expected, actual);
    }
}
