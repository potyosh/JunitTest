package yoshi.junittest;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by yoshi on 2015/01/17.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();
    }

    public void testGetMessage() throws Exception {
        String expected = "Hello test world";
        String actual = mActivity.getMessage();
        assertEquals(expected, actual);
    }
}
