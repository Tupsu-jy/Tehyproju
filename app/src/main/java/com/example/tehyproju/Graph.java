package com.example.tehyproju;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tehyproju.db.QDao;
import com.example.tehyproju.db.Quest;
import com.example.tehyproju.db.QuestRDatabase;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.text.SimpleDateFormat;

/**
 * Luokka jonka avulla kaavio luodaan ja täytetään datalla.
 * @author Jaakko Ylinen
 * @version 9.12.2019
 */
public class Graph extends AppCompatActivity {

    /**
     * Metodi jonka avulla kaavio luodaan ja täytetään datalla.
     * Kyselyt haetaan tietokannasta siinä järjestyksessä kuin ne on sinne lisätty
     * @param savedInstanceState no se justiinsa
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        QDao dao=QuestRDatabase.getInstance().qDao();

        final Quest[] quests=dao.getQuestsByOrder();
        DataPoint[] data= new DataPoint[quests.length];

        for (int i = 0; i < quests.length; i++){
            data[i]=new DataPoint(( quests[i].getId()), ((double) quests[i].getPoints()));
        }

        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);

        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<DataPoint>(data);
        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setColor(Color.BLACK);
                paint.setTextSize(38);

                String pattern = "yyyy-MM-dd";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

                String date=simpleDateFormat.format(DateConverter.toDate(quests[((int) dataPoint.getX())].getDate()));
                canvas.drawText("X "+date, x, y, paint);
            }
        });

        graph.addSeries(series);
    }

}
