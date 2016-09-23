package experiment.com.anew.madhu.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    public final static String MESSAGE_KEY="experiment.com.anew.madhu.login";


    public String password1="password";
    public String password2="bind";
    public Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        login=(Button) findViewById(R.id.button);
    }

    public void login_check(View view)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);

        String name=e1.getText().toString();
        String password=e2.getText().toString();


        if(password.equals("password")|| password.equals("bind"))
        {
            Intent welcome=new Intent(this, Welcome_Activity.class);
            welcome.putExtra(MESSAGE_KEY,name);
            startActivity(welcome);
        }
        else
        {  Intent error_page=new Intent(this, ActivityError.class);
            startActivity(error_page);
        }

    }



}
