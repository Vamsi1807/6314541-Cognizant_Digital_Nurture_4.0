package SingletonPatternExample;

public class Tester {
    public static void main(String[] args) {
        Logger logger1 = Logger.returnInstance();
        Logger logger2 = Logger.returnInstance();

        """even though we call returnInstance() twice, it returns the same instance..i.e,
         we see only one "Logger instance created" message
        this is because of the Singleton design pattern implementation"""

        System.out.println("Same instance? " + (logger1 == logger2)); 
    }
}
