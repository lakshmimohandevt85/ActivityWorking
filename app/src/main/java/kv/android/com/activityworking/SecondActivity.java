package kv.android.com.activityworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle personalData = getIntent().getExtras();
        String first = personalData.get("FirstName").toString();
        String last = personalData.getString("LastName");
        TextView name = (TextView)findViewById(R.id.textView_name);
        name.setText(first + last);
    }
}
