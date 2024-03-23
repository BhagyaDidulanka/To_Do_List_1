package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {
    private static DBConection dbConection;
    private Connection connection;

    private DBConection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConection getInstance(){
        if(dbConection==null){
             dbConection=new DBConection();
        }
        return dbConection;
    }

    public Connection getConnection(){
        return connection;
    }
}
