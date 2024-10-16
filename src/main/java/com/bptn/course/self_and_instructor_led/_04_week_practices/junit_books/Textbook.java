package com.bptn.course.self_and_instructor_led._04_week_practices.junit_books;

public class Textbook extends Book {

	int edition; // Declare attribute.

	// Create an constructor.
	public Textbook(String title, double price, int edition) {

		super(title, price); // Inherit superclass variables.
		this.edition = edition; // Initialize addition variable
	}

	@Override
	public String getBookInfo() {

		return super.getBookInfo() + "-" + edition; // Call getBookInfo method from superclass and concatenate edition
	}

	// Get edition method.
	public int getEdition() {

		return edition;

	}

	// Create method canSubstituteFor for checking given conditions.
	public boolean canSubstituteFor(Textbook other) {

		// Check if this Textbook can substitute for other by checking the edition.
		if (this.edition >= other.getEdition()) {

			return true;
		}

		// Check if this Textbook can substitute for other by checking the title.
		else if (this.getTitle().equals(other.getTitle())) {

			return true;

		}

		return false; // In case both conditions not met return false.

	}

}