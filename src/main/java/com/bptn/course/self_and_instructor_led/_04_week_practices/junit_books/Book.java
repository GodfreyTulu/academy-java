package com.bptn.course.self_and_instructor_led._04_week_practices.junit_books;

public class Book {

	// Declare attribute or instance variables.
	private String title;
	private double price;

	// Create a parameterized constructor.
	Book(String title, double price) {

		// Initialize variables.
		this.title = title;
		this.price = price;
	}

	// Get title method as instructed.
	public String getTitle() {
		return title;
	}

	// Create get book info as instructed.
	public String getBookInfo() {

		return title + "-" + price;
	}

}