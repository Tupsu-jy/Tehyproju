package com.example.tehyproju.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity(tableName = "quest_table")
public class Quest {


    @NonNull
    @ColumnInfo(name = "points")
    private int points;

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "date")
    private String date;


    public Quest(@NonNull int points, @NonNull int id, @NonNull String date) {
        this.points = points;
        this.id=id;
        this.date=date;
    }

    public int getPoints(){return this.points;}

    public int getId(){return this.id;}

    public String getDate(){return this.date;}
}

