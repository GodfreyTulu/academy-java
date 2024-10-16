package com.bptn.course.self_and_instructor_led._03_week_practices.my_thread;

public class MyThread extends Thread {

	SynchronizedPrinter printer;

	// Create a constructor to initialize the printer instance variable
	MyThread(SynchronizedPrinter printer) {
		this.printer = printer; // Initialize the variable
	}

	// Override the run() method to call printNumbers() method of the printer
	// instance variable
	@Override
	public void run() {
		printer.printNumbers(); // Call printNumbers() on the printer object
	}
}