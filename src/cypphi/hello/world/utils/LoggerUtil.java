package cypphi.hello.world.utils;

public class LoggerUtil {
    public static void Log(String s) {
        System.out.println("[Hello World] " + TimeUtil.timePrefix + " " + s);
    }
}
