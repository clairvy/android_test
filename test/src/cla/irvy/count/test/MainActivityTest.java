package cla.irvy.count.test;

import cla.irvy.count.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * @author clairvy
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    /**
     * デフォルトのコンストラクタ
     */
    public MainActivityTest() {
        super("cla.irvy.count", MainActivity.class);
    }

    /**
     * とりあえず通すテスト
     */
    public void testAAA() {
        assertTrue(true);
    }
}
