package com.example.tehyproju.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Quest.class}, version = 1, exportSchema = false)
public abstract class QuestRoomDatabase extends RoomDatabase {

    public abstract QDao qDao();

    private static volatile QuestRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static QuestRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (QuestRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            QuestRoomDatabase.class, "quest_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}