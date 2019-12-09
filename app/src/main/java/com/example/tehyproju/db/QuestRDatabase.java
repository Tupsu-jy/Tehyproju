package com.example.tehyproju.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * Room tietokanta. Tässä luokassa määritellään tietokannassa olevat oliot, käytettävä
 * dao ja versio.
 *
 * @author Jaakko Ylinen
 * @version 9.12.2019
 */


@Database(entities = {Quest.class}, version = 2, exportSchema = false)
public abstract class QuestRDatabase extends RoomDatabase {
    private static QuestRDatabase ourInstance = null;

    public abstract QDao qDao();

    /**
     * getteri metodi
     * @return tietokannan instanssin
     */

    static public QuestRDatabase getInstance() {
        return ourInstance;
    }

    /**
     * Metodilla luodaan tietokanta.
     * allowMainThreadQueries() ja fallbackToDestructiveMigration()
     * olivat kummatkin tarpeellisia jotta toimii. allowMainThreadQueries()
     * hidastaa sovellusta hiukan ja sille olisi hyvä vielä tehdä jotain.
     * fallbackToDestructiveMigration() vain meinaa että kun tietokannan muotoa
     * muutetaan niin kaikki sinne tallennettu tieto poistetaan
     * @param c Apin konteksti
     */
    public static void create(Context c){
        ourInstance=Room.databaseBuilder(c.getApplicationContext(),
                QuestRDatabase.class, "quest_database").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }

}
