package com.example.tehyproju;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class vinkit extends AppCompatActivity {

    public static final String EXTRA = "com.example.myfirstapp.MESSAGE";

//avataan vinkkilista
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinkit);

        ListView lv = findViewById(R.id.vinkitListView);


        lv.setAdapter(new ArrayAdapter<Vinkki>(
                this,  //context (activity instance)
                //R.layout.activity_view_presidents, //XML item layout
                android.R.layout.simple_list_item_1,
                vinkkisingle.getInstance().getVinkit()));

//siirrytään halutun vinkin sisältöön
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("My app", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(vinkit.this, vinkitView.class);
                nextActivity.putExtra(EXTRA, i);
                startActivity(nextActivity);
            }
        });

    }
}
