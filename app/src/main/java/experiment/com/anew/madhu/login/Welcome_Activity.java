package experiment.com.anew.madhu.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome_Activity extends AppCompatActivity {
    public final static String MESSAGE_KEY="experiment.com.anew.madhu.login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);

        TextView tvFirst = (TextView) findViewById(R.id.textView5);

        Intent welcome = getIntent();
        String welcome_name = welcome.getStringExtra(MESSAGE_KEY);

        tvFirst.setText(welcome_name);
    }
}
