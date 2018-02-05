package ksu.remotepersonaldietitian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    final  EditText name = (EditText) findViewById(R.id.name);
    final EditText pass = (EditText) findViewById(R.id.pass);

    public void userlogin(View view) {

        //check if it regesterd or not

        //if existing in db
        Toast.makeText(this, "log in succesuflly", Toast.LENGTH_LONG).show();//show msg
        Intent userhomePage = new Intent(this, homepage.class);
        Bundle b = new Bundle();
        b.putString("name",name.getText().toString());
        userhomePage.putExtras(b);
        //redirect to home page
        startActivity(userhomePage);

        //if NOT in db
       // Toast.makeText(this, "no information found, pls sign up first", Toast.LENGTH_LONG).show();
    }

    public void ditlogin(View view) {
        //check if it regesterd or not

        //if existing in db
        Toast.makeText(this, "log in succesuflly", Toast.LENGTH_LONG).show();//show msg
        Intent dithomePage = new Intent(this, dithomepage.class);
        Bundle b = new Bundle();
        b.putString("name",name.getText().toString());
        dithomePage.putExtras(b);
        //redirect to home page
        startActivity(dithomePage);

        //if NOT in db
       // Toast.makeText(this, "no information found, pls sign up first", Toast.LENGTH_LONG).show();


    }
}
