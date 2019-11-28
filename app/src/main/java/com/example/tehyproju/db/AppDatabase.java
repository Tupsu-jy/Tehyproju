package com.example.tehyproju.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Qpoints.class}, version = 1)

abstract class AppDatabase extends RoomDatabase {
    public abstract Dao userDao();

    private AppDatabase() {
    }
}
