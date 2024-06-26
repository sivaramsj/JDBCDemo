package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public  static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/w3schools";
        String user="root";
        String password ="root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
