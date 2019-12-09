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

public class Graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.d("MyApp","I am here1111");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        QDao dao=QuestRDatabase.getInstance().qDao();

        final Quest[] quests=dao.getQuestsByOrder();
        //Log.i("gra", "gggg");

        DataPoint[] data= new DataPoint[quests.length];

        for (int i = 0; i < quests.length; i++){
            data[i]=new DataPoint(( quests[i].getId()), ((double) quests[i].getPoints()));
        }

        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);

        graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX);
                } else {
                    // show currency for y values
                    return super.formatLabel(value, isValueX);
                }
            }
        });

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
