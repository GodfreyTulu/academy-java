package com.bptn.course.big_coding._02_week_exercises;

class Employee {

	private int salary; // Instance variable to store salary
	private int hoursPerDay; // Instance variable to store hours per day worked by employee

	// Constructor to set instance variables(salary and hoursPerDay) value
	Employee(int salary, int hoursPerDay) {

		/*
		 * Instead of using our normal this.salary = salary; to initialize variable we
		 * haave used setSalary(); to initialize variable because "set" doen't just get
		 * the int it provides encapsulation and validation logic. Ensures that the
		 * instance variables are set correctly based on defined rules
		 *
		 */

		setSalary(salary);
		setHoursPerDay(hoursPerDay);

	}

	// Set method to update salary

	public void setSalary(int salary) {

		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;
		}

	}

	// Set method to update hoursPerDay
	public void setHoursPerDay(int hoursPerDay) {

		if (hoursPerDay > 6) {
			this.salary += 5;
		} else {
			this.salary = salary;
		}

	}

	// Get method to return salary
	public int getSalary() {
		return this.salary;
	}

	public static void main(String[] args) {
		// create an instance of Employee class and initialize it with salary = 100 and
		// hoursPerDay = 8
		Employee student = new Employee(100, 8);

		// print the salary of the employee
		System.out.println(student.getSalary());
	}

}
