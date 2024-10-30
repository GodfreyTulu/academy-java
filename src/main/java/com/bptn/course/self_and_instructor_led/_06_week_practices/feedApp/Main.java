package com.bptn.course.self_and_instructor_led._06_week_practices.feedApp;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        // Create an instance of FeedAppClass
        FeedAppClass jdbc = new FeedAppClass();
        
        // Establish a database connection
        Connection conn = jdbc.createConnection();
        
        if (conn != null) {
            // Insert a new user into the User table
            jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
            
            // Close the database connection
            boolean isClosed = jdbc.closeConnection(conn);
            
            // Verify if the connection was closed successfully
            if (isClosed) {
                System.out.println("Connection closed successfully.");
            } else {
                System.out.println("Failed to close the connection.");
            }
        } else {
            System.out.println("Failed to establish database connection.");
        }
    }
}


