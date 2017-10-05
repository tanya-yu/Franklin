package com.example.tanyayuferova.franklin.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Tanya Yuferova on 10/5/2017.
 */

public class DateUtils {

    /**
     * Creates new date with added amount of days
     * @param date current date
     * @param days how many days to add to current date
     * @return date + days
     */
    public static Date addDaysToDate(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    /**
     * Gets first day of current week
     * @return date
     */
    public static Date getFirstDayOfWeek() {
        Calendar today = Calendar.getInstance();
        while (today.get(Calendar.DAY_OF_WEEK) != today.getFirstDayOfWeek()) {
            today.add(Calendar.DAY_OF_MONTH, -1);
        }
        return today.getTime();
    }
}