package com.example.tehyproju;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake1);
    }
    public void avaaKalenteri(View view) {
        Intent intent = new Intent(getApplicationContext(), kalenteri.class);
        startActivity(intent);
    }

    public void lisaaMerkinta(View view){
        Intent intent1 = new Intent(getApplicationContext(), merkinta.class);
        startActivity(intent1);
    }

    public void vinkit(View view){
        Intent intent2 = new Intent(getApplicationContext(), vinkit.class);
        startActivity(intent2);
    }
}