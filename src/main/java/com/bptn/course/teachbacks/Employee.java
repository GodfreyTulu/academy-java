package com.bptn.course.teachbacks;

/*
 * STATIC VARIABLE.
 *
 * A static variable - is the variable that belongs to the class and is shared by all instances.
 * There is only one copy, and changes affect all instances.
 *
 */
public class Employee {
	// Declare Attributes
	private String name;
	private int empId;
	private static String manager; // Static variable for manager
	/*
	 * 1st scenario manager as static - static variables can be accessed by all
	 * classes and method 2nd scenario manager as non-static - Non-static variable
	 * cannot be accessed by static method the way to access them by changing it to
	 * static or using object.
	 */
	// Parameterized Constructor

	public Employee(String name, int empId, String manager) {
		this.name = name;
		this.empId = empId;
		Employee.manager = manager; // Assign static manager variable
		// they are called with class name instead of using object name
	}

	// Getters for the attributes
	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public static String getManager() {
		return manager; // Static getter for manager
	}

	public static void main(String[] args) {
		// main block is a static method, non static variables cannot be accessed from
		// static methods
		// Create a few instances/objects for Employee
		Employee emp1 = new Employee("Alice", 101, "Bob");
		Employee emp2 = new Employee("Charlie", 102, "Bob");
		Employee emp3 = new Employee("David", 103, "Bob");
		// Display employee details
		System.out.println("Name: " + emp1.getName() + " " + "Employee ID: " + emp1.getEmpId() + " " + "Manager: "
				+ Employee.getManager());
		System.out.println("Name: " + emp2.getName() + " " + "Employee ID: " + emp2.getEmpId() + " " + "Manager: "
				+ Employee.getManager());
		System.out.println("Name: " + emp3.getName() + " " + "Employee ID: " + emp3.getEmpId() + " " + "Manager: "
				+ Employee.getManager());
	}
}
// When trying to change names of manager for the first scenario it overrides managers for all employees