package com.example.tehyproju.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Quest word);

    @Query("DELETE FROM quest_table")
    void deleteAll();

    @Query("SELECT * from quest_table ORDER BY id ASC")
    LiveData<List<Quest>> getQuestsByOrder();

    @Query("SELECT MAX(id) FROM quest_table")
    int latest();

}

