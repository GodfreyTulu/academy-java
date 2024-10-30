package com.bptn.course.self_and_instructor_led._06_week_practices.jdbc_tuesday;

import java.sql.Connection;

public class Main {

	
	    public static void main(String[] args) {
	      StudentAppClass jdbc = new StudentAppClass();
	        Connection conn = jdbc.createConnection();
	        jdbc.getAllStudents(conn);
	        jdbc.closeConnection(conn);
	    }

}
