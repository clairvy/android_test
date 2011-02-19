package cla.irvy.count;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author clairvy
 */
public class MainActivity extends Activity {
    protected int count;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // initialize
        count = 0;

        final TextView textView = (TextView)findViewById(R.id.textview01);
        Button button = (Button)findViewById(R.id.button01);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                textView.setText(getString(R.string.count) + count);
            }
        });
    }
}
