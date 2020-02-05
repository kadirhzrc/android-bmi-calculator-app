package com.example.fssd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiy2);

        Intent intent = getIntent();
        double BMI = intent.getDoubleExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textview2 = (TextView) findViewById(R.id.textView2);
        textview2.setText("Your BMI Index is " + BMI);
    }
}
