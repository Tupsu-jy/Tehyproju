package com.example.tehyproju;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class kalenteri extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalenteri);
        calendarView = (CalendarView)findViewById(R.id.kalenteri);
        myDate = (TextView) findViewById(R.id.kalenteritext);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String pvm = (dayOfMonth +"."+month+"."+year);
                myDate.setText(pvm);
                //Toast.makeText(getApplicationContext(), "moi "+dayOfMonth, +0).show();

            }
        });
        }
    }

