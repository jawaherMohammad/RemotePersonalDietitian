package ksu.remotepersonaldietitian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    private static RadioGroup radio_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signup(View view) {
        // take all info
        final  EditText name = (EditText) findViewById(R.id.name);
        final EditText height = (EditText) findViewById(R.id.height);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText pass = (EditText) findViewById(R.id.pass);
        final EditText age = (EditText) findViewById(R.id.age);
        final CheckBox vegan = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox nonvegan = (CheckBox) findViewById(R.id.checkBox2);
        RadioButton gender1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton gender2 = (RadioButton)findViewById(R.id.radioButton2);
        radio_g = (RadioGroup)findViewById (R.id.radioG);
        int selectedRadio= radio_g.getCheckedRadioButtonId();
        RadioButton gender = (RadioButton)findViewById(selectedRadio);

        //store info in db

        //show message
        Toast.makeText(this, "you have been signed up succesuflly", Toast.LENGTH_LONG).show();
        Intent userhomePage = new Intent(this, homepage.class);
        Bundle b = new Bundle();
        b.putString("name",name.getText().toString());
        userhomePage.putExtras(b);
        //redirect to home page
        startActivity(userhomePage);

    }

}