package com.example.tehyproju.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity(tableName = "quest")
public class Quest {


    @NonNull
    @ColumnInfo(name = "points")
    private int points;

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "date")
    private String date;


    public Quest(@NonNull int pojoi, @NonNull int pid, @NonNull String pdate) {
        this.points = pojoi;
        this.id=pid;
        this.date=pdate;
    }

    public int getPoints(){return this.points;}
}

