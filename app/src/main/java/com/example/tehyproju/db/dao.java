package com.example.tehyproju.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tehyproju.db.qpoints;

import java.util.List;

@Dao
public interface dao {
    @Query("SELECT * FROM qpoints")
    List<qpoints> getAll();

    @Insert
    void insertAll(qpoints... users);

    @Delete
    void delete(qpoints user);
}
