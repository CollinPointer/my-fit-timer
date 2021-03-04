package spc.javajuniors.myfittimer;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "rootuser";
   
    Connection conn = null;
   
    // connects to the database
    public void connectDb() {
        try {
            // registers JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // opens the connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(JDBCConnection.DB_URL, 
                    JDBCConnection.USER, JDBCConnection.PASS);
            System.out.println("Connected database successfully...");
        } catch (Exception e){}
    }
}
