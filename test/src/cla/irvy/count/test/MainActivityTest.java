package cla.irvy.count.test;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import cla.irvy.count.MainActivity;
import cla.irvy.count.R;

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
     * テストのサンプル
     *
     * とりあえず，今の機能をテストするよ
     */
    public void testButtonPress() {
        MainActivity activity = getActivity();
        Instrumentation instrumentation = getInstrumentation();
        TextView textView = (TextView)activity.findViewById(R.id.textview01);

        // initial statement
        assertEquals(activity.getString(R.string.hello), textView.getText());

        final Button button = (Button)activity.findViewById(R.id.button01);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                button.dispatchTouchEvent(MotionEvent.obtain(5, 0, MotionEvent.ACTION_DOWN, 0, 0, 0));
                button.dispatchTouchEvent(MotionEvent.obtain(5, 0, MotionEvent.ACTION_UP, 0, 0, 0));
            }
        });
        instrumentation.waitForIdleSync();

        // result statement
        assertEquals(activity.getString(R.string.count), textView.getText());
    }
}
