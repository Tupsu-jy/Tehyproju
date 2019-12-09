package com.example.tehyproju;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * DateConverter. Muuttaa Date muodosta Longiin ja toisinpäin.
 * Kopioitu sellaisenaan StackOverfolwsta
 */

public class DateConverter {

    @TypeConverter
    public static Date toDate(Long dateLong){
        return dateLong == null ? null: new Date(dateLong);
    }

    @TypeConverter
    public static Long fromDate(Date date){
        return date == null ? null : date.getTime();
    }
}
