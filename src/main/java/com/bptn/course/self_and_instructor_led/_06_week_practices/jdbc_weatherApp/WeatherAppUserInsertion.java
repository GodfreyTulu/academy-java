package com.bptn.course.self_and_instructor_led._06_week_practices.jdbc_weatherApp;


// Import the necessary packages for SQL:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// Create a class called WeatherAppUserInsertion to handle database operations.
public class WeatherAppUserInsertion {

	//  define static variables for the database connection
	private static final String userName = "doadmin";
	private static final String password = "AVNS_K3z7waWSuYG4Dmk__h7";
	private static final String dbName = "weatherDB";
	private static final String port = "25060";
	private static final String dbUrl = "jdbc:postgresql://academydb-c6-s1-t9-do-user-12484302-0.j.db.ondigitalocean.com:" + port + "/" + dbName;


	// Create a Connection method to establish a connection with the database using JDBC.
	public Connection createConnection() {

		// Declare a variable conn of type Connection which will hold the connection object and set it to null
		Connection conn = null;

		// Create a try block
		try {

			// Load the PostgreSQL JDBC driver using the
			Class.forName("org.postgresql.Driver");
			
			// Establish a connection to the database by passing the database URL, username, and password
			conn = DriverManager.getConnection(dbUrl, userName, password);

		} 
		// 2 Catch created, If an exception occurs the catch block will print the error message and exit the program:
		catch (SQLException | ClassNotFoundException e) {

			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		// If the connection is successful, print a message to the console.
		System.out.println("Opened database successfully");
		return conn;

	}
    
	// Create a method called addUser() to INSERT data into the User table using a PreparedStatement.
	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {

		// Create try block track exception.
		try {
			// Create a stmt object and set it to null.
			PreparedStatement stmt = null;
			
			// Create a SQL query string to INSERT data into the User table.
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

			// Create a PreparedStatement using the conn.prepareStatement() method and pass the SQL query string as a parameter.
			stmt = conn.prepareStatement(sql);
			
			// Set the values of the place-holders in the query
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			// Execute the query using the stmt.executeUpdate() method and store the result count in a variable resultCount
			int resultCount = stmt.executeUpdate();

			// Print the resultCount to the console to confirm that the data was inserted successfully.
			System.out.println(resultCount + " record(s) inserted");

			// Close the PreparedStatement using the stmt.close() method
			stmt.close();
			
		} 
		// Handle any exceptions that may occur using the catch block and print the error message.
		catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	// Create a method called closeConnection of return type boolean to close the database connection.
	public boolean closeConnection(Connection conn) {

		// Declare boolean flag = true;
		boolean flag = true;

		// Create a try block to track exceptions.
		try {
			if (conn != null) // Check for existing connections
				conn.close(); // Close the connection using the conn.close() method.

		} 
		// Handle any exceptions that may occur; the catch block will print the error message.
		catch (SQLException ex) {
			flag = false;
			// handle exception
			System.out.println("Exception:" + ex.getMessage());
		}
		return flag; // Return a boolean flag indicating whether the connection was closed successfully.

	}

}
