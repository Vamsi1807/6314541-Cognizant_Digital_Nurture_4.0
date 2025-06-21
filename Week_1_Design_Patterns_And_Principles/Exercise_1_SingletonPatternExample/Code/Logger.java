

class Logger {
    private static volatile Logger logger = null; 

    private Logger() {
        System.out.println("Logger instance created");
    }

    public static Logger returnInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
