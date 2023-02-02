package com.ojas.MediaFire.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String currentDateTimeInString() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDateTime = currentTime.format(formatter);
        return formattedDateTime;
    }
    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }
}
