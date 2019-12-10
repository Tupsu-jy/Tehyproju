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
     * Kyselyt haetaan tietokannasta siinä järjestyksessä kuin ne on sinne lisätty.
     * Kaavion merkeiksi kustomoidaan kyselyn päivämäärä
     * @param savedInstanceState no se justiinsa
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        QDao dao=QuestRDatabase.getInstance().qDao();

        final Quest[] quests=dao.getQuestsByOrder(); // Taulukusta haetaan kyselyt järjestyksessä
        DataPoint[] data= new DataPoint[quests.length];

        for (int i = 0; i < quests.length; i++){
            data[i]=new DataPoint(( quests[i].getId()), ((double) quests[i].getPoints()));
            //data taulukkoon laiteteaan Datapoint olioita joiden arvot ovat kydelyn id ja pisteet
        }

        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setVisibility(View.VISIBLE);

        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<DataPoint>(data);
        //seuraavaksi customoidan kaavion merkit
        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setColor(Color.BLACK);
                paint.setTextSize(38);

                String pattern = "yyyy-MM-dd";//valitaan formaatti missä päivämäärä esitetään
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String date=simpleDateFormat.format(DateConverter.toDate(quests[((int) dataPoint.getX())].getDate()));
                //yhdellä rivillä haetaan quests kysely taulukosta päivämäärä käyttäen kyselyn id:tä mikä on tallennettu
                //data taulukkoon. Päivämäärä saapuu longin joten se muutetaan dateksi jonka jälkeen se muutetaan stringiksi
                //ja haluttuun formaattiin.
                canvas.drawText("X "+date, x, y, paint);//tässä kaavion merkiksi valitaa päivämäärä jonka eteen
                //laitetaan X merkkaamaan tarkemmin mihin kohtaan viitataan
            }
        });
        minmax(graph, quests.length);
        graph.addSeries(series);
    }
    /**
     * Metodi jonka avulla kaaviolle asetetaan minimi ja maximi arvot
     * @param graph kaavio jonka arvoja muokataan
     * @param length kyselyiden määrä
     */
    public void minmax(GraphView graph, int length){

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(length+2);

        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(65);
    }

}
