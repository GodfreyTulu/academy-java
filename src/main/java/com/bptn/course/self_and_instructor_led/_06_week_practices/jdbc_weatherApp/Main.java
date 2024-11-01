package com.bptn.course.self_and_instructor_led._06_week_practices.jdbc_weatherApp;

import java.sql.Connection; // Import java.sql.Connection


public class Main {

	public static void main(String[] args) {
		
		// Create an instance of WeatherAppUserInsertion and call the createConnection()
		WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();
		Connection conn = jdbc.createConnection(); // establish a database connection.
		
		// Call the addUser() method to insert a new user into the User table.
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		
		// call the closeConnection() method to close the database connection.
		jdbc.closeConnection(conn);

	}

}
