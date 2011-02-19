package cla.irvy.count;

/**
 * @author clairvy
 */
public class Count {
    /**
     * 初期状態
     * @return 初期状態
     */
    public static int init() {
        return 0;
    }

    /**
     * 次の状態
     * @param current
     * @return 次の状態
     */
    public static int next(int current) {
        return current + 1;
    }
}
