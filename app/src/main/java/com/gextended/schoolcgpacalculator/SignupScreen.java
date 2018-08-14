package com.gextended.schoolcgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class SignupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);



    }

    // This method takes the student to the student record screen
    public void proceed(View view) {
        Intent studentRecordIntent = new Intent(this,StudentRecord.class);
        startActivity(studentRecordIntent);
    }
}
