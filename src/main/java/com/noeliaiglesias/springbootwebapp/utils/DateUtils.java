package com.noeliaiglesias.springbootwebapp.utils;

import java.time.LocalDate;

public class DateUtils {

    /*
     * Private constructor to avoid instantiation of this class
     */
    private DateUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getFormattedLocalDate(LocalDate localDate) {
        return localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
    }
}
