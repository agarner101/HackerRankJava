package warmup.p8_time_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Time Conversion
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * <p>
 * Complete the timeConversion function which takes 1 argument, a string s and returns a string denoting the 24-hr formatted time.
 * <p>
 * Example:
 * input:  07:05:45PM
 * output: 19:05:45
 * <p>
 * https://www.hackerrank.com/challenges/time-conversion/problem
 * Created by andrewgarner on 3/30/18.
 */
public class TimeConversion {

    /**
     * Attempt 0
     */
    static String timeConversion0(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
        Date date = sdf.parse(s);
        sdf.applyPattern("HH:mm:ss");
        return sdf.format(date);
    }
}
