package com.bptn.course.self_and_instructor_led._06_week_practices.feedApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {

	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {

		Connection conn = null;

		try (Connection con = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName,
				userName, password);) {

			System.out.println("Opened database successfully");

		} catch (SQLException e) {

			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return conn;

	}

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {

		try {

			PreparedStatement stmt = null;
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate(); // Execute the query and get the result count
			System.out.println(resultCount + " record(s) inserted");

		} catch (SQLException ex) {
			// handle exception
			System.out.println("Exception:" + ex.getMessage());

		}

	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			if (conn != null)
				conn.close(); // Close the connection
			System.out.println("Connection closed successfully");

		} catch (SQLException ex) {
			flag = false;
			System.out.println("Exception: " + ex.getMessage());
		}

		return flag;

	}
}