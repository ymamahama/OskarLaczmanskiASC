package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to get Context
        Context context = getApplicationContext();
// message to display
        String text = "T42g554gho2uic54l coi4goiu2h45hgoi2ug o5g4oui2h45ugho254";
// toast time duration, can also set manual value
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
// to show the toast
        toast.show();

    }

}

