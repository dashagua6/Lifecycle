package bid.woou.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cc on 2016/10/14.
 */
public class SecondActivity  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("对话框风格的Activity");
        setContentView(tv);

    }
}
