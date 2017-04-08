package app.getitright.com.example.android.getitright;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int clicks = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, startquiz.class);
        startActivity(intent);
    }

    public void showTips(View view) {
        if (clicks == 1) {
            LinearLayout showTip = (LinearLayout) findViewById(R.id.instructions);
            showTip.setVisibility(View.VISIBLE);
            clicks = clicks + 1;
        } else {
            LinearLayout showTip = (LinearLayout) findViewById(R.id.instructions);
            showTip.setVisibility(View.GONE);
            clicks = 1;
        }
    }

    public void closeTips(View view) {
        LinearLayout showTip = (LinearLayout) findViewById(R.id.instructions);
        showTip.setVisibility(View.GONE);
        clicks = 1;
    }
}
