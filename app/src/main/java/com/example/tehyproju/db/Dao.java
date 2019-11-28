package com.example.tehyproju.db;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {
    @Query("SELECT * FROM Qpoints")
    List<Qpoints> getAll();

    @Insert
    void insertAll(Qpoints... users);

    @Delete
    void delete(Qpoints user);
}
