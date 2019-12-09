package com.example.tehyproju.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.tehyproju.DateConverter;

import java.util.Date;

/**
 * Määritellään tietokantaan menevä rivi.
 * @author Jaakko Ylinen
 */

@Entity(tableName = "quest_table")
public class Quest {

    /**
     * Kyselystä saatu tulos
     */
    @NonNull
    @ColumnInfo(name = "points")
    private int points;
    /**
     * Kyselyn yksilöivä id
     */
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;
    /**
     * Päivämäärä jolloin kysely täytetty
     * Long muotoa käytetään jotta tallentaminen onnistuisi.
     * Muokkaus datesta ja takasin date muotoon tehdään muualla.
     */
    @ColumnInfo(name = "date")
    private Long date;

    /**
     * Konstruktori metodi jolla syötetyt arvot asetetaan olion arvoiksi
     * @param points Kyselystä saatu tulos
     * @param id Kyselyn yksilöivä id
     * @param date Päivämäärä jolloin kysely täytetty
     */
    public Quest(@NonNull int points, @NonNull int id, @NonNull Long date) {
        this.points = points;
        this.id=id;
        this.date=date;
    }

    /**
     * getteri metodi kyselyn pisteille
     * @return points kyselyn pisteet
     */
    public int getPoints(){return this.points;}

    /**
     * getteri metodi kyselyn id:lle
     * @return id kyselyn id
     */
    public int getId(){return this.id;}

    /**
     * getteri metodi kyselyn päivämäärälle
     * @return date kyselyn päivämäärä
     */
    public Long getDate(){return this.date;}
}

