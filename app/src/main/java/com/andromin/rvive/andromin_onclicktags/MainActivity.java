package com.andromin.rvive.andromin_onclicktags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v)
    {
        EditText et = (EditText)findViewById(R.id.et);
        int val = Integer.valueOf(et.getText().toString());
        String t = v.getTag().toString();

        if(t.equals("increment"))
            val++;
        else
            val--;

        et.setText(""+val);




    }

}
