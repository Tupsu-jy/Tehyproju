package com.example.tehyproju.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class qpoints {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "points")
    public int points;

    @ColumnInfo(name = "date")
    public int date;

}
/*
@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;
}
*/