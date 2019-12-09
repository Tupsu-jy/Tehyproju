package com.example.tehyproju;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tehyproju.db.QDao;
import com.example.tehyproju.db.Quest;
import com.example.tehyproju.db.QuestRDatabase;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class Graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.d("MyApp","I am here1111");
        Log.i("gra", "gggg");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        QDao dao=QuestRDatabase.getInstance().qDao();

        Quest[] quests=dao.getQuestsByOrder();


        DataPoint[] data= new DataPoint[quests.length];

        for (int i = 0; i < quests.length; i++){
            data[i]=new DataPoint(((double) quests[i].getId()), ((double) quests[i].getPoints()));
        }

        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(data);
        graph.addSeries(series);
    }
}
