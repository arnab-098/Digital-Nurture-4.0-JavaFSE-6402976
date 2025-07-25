public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger constructor is initiated");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void getLog() {
        System.out.println("Logging data...");
    }
}