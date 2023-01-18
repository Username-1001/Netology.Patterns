import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Logger {
    protected int num = 1;
    protected DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    protected static Logger instance;

    private Logger() {

    };

    protected static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now().format(formatter) + " - " + num++ + "] " + message);
    }
}
