package com.example.mambayamba.stackoverflowviewer.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mambayamba on 27.11.2016.
 */
public class Utility {
    public static String convertUnixTime(Integer unixTime){
        String dateString = unixTime.toString();
        long unixSeconds = Long.parseLong(dateString);
        Date date = new Date(unixSeconds*1000);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }
}
