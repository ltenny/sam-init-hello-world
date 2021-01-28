package project;

public class HelloWorld {
    String dbConnectString = System.getenv("DATABASE_CONNECT_STRING");
    public void handler(String s) {
        if (dbConnectString == null || dbConnectString.isEmpty())
            System.err.println("Hello, " + s + "(No connection string set!");
        else
            System.out.println("Hello, " + s + "(" + dbConnectString + ")");
    }
}
