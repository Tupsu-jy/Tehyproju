package com.example.tehyproju.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Quest.class}, version = 2, exportSchema = false)
public abstract class QuestRDatabase extends RoomDatabase {
    private static QuestRDatabase ourInstance = null;

    public abstract QDao qDao();

    static public QuestRDatabase getInstance() {
        return ourInstance;
    }


    public static void create(Context c){
        ourInstance=Room.databaseBuilder(c.getApplicationContext(),
                QuestRDatabase.class, "quest_database").allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        //ourInstance.qDao().insert(new Quest(0,0,0));
    }

}
