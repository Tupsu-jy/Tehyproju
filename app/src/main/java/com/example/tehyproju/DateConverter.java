package com.example.tehyproju;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * DateConverter. Muuttaa Date muodosta Longiin ja toisinpäin.
 * Kopioitu sellaisenaan StackOverfolwsta
 * @author joku tyyppi StackOverfolws
 */

public class DateConverter {

    /**
     *Longista dateen
     * @param dateLong päivämäärä Longina
     * @return päivämäärä datena
     */
    @TypeConverter
    public static Date toDate(Long dateLong){
        return dateLong == null ? null: new Date(dateLong);
    }
    /**
     *Datesta longiin
     * @param date päivämäärä datena
     * @return päivämäärä Longina
     */
    @TypeConverter
    public static Long fromDate(Date date){
        return date == null ? null : date.getTime();
    }
}
