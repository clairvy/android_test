package cla.irvy.count.test;

import cla.irvy.count.Count;
import junit.framework.TestCase;

/**
 * @author clairvy
 */
public class CountTest extends TestCase {
    /**
     * 初期状態のテスト
     */
    public void testInit() {
        assertEquals(0, Count.init());
    }

    /**
     * 次の状態のテスト
     */
    public void testNext() {
        assertEquals(1, Count.next(0));
    }
}
