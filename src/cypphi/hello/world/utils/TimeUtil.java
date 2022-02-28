package cypphi.hello.world.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
    static LocalDateTime currentDateAndTime = LocalDateTime.now();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    static String currentTime = currentDateAndTime.format(timeFormatter);
    static String currentTimeToString = currentTime;
    public static String timePrefix = "[" + currentTimeToString + "]";
}
