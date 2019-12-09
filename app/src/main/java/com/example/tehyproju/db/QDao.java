package com.example.tehyproju.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

/**
 * Data Access Object
 * Tähän määritellään kaikki tarvittavat sql kyselyt joita voi sitten kutsua.
 * @author Jaakko Ylinen
 * @version 9.12.2019
 */
@Dao
public interface QDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy

    /**
     * Metodi jolla tietokantaa lisätään yksittäisisä kyselyitä
     * ja jossa on konfilktin ratkaisu strategia jolloin sama voidaan lisätä monta kertaa
     * @param q kysely mikä lisätään
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Quest q);

    /**
     * Poistaa kaiken
     */
    @Query("DELETE FROM quest_table")
    void deleteAll();

    /**
     * Hakee kaikki tietokantaan laitetut kyselyt niiden id mukaan järjestettynä.
     * Id määräytyy sen mukaan koska kysely tehty joten ne palautuu myös aikajärjestyksessä.
     * @return taulukko kyselyitä
     */
    @Query("SELECT * from quest_table ORDER BY id ASC")
    Quest[] getQuestsByOrder();

    /**
     * Laskee montako riviä tietokannassa on
     * @return taulukon koko
     */
    @Query("SELECT count(*) FROM quest_table")
    int size();
}

