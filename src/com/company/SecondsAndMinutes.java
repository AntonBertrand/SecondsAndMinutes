package com.company;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "invalid value";

    public static String getDurationString (int minutes, int seconds) {

        if (minutes < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        if ((seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }


        int hrs = 0;
        int mins = 0;


        while (minutes > 60) {
            minutes = minutes - 60;
            hrs++;
        }
        mins = minutes;

        return hrs + "h " + mins + "m " + seconds + "secs";

    }

    public static String getDurationString (int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int mins = 0;

        while (seconds > 60) {

            seconds = seconds - 60;
            mins++;
        }

        return getDurationString(mins, seconds);

    }

}
