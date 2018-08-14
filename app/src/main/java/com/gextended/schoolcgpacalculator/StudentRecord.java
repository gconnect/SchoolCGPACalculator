package com.gextended.schoolcgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_record);
    }

    public void year1(View view) {
        Intent navigationIntent = new Intent(this, NavigationScreen.class);
        startActivity(navigationIntent);
    }
}
