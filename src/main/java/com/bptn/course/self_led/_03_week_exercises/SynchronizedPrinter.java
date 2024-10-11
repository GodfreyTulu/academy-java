package com.bptn.course.self_led._03_week_exercises;

public class SynchronizedPrinter {

	// Synchronized method to ensure mutual exclusion
	synchronized void printNumbers() {
		System.out.println("Inside the synchronized block.");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
			try {
				Thread.sleep(500); // Sleep for 500 milliseconds
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}

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

public class Main {

	public static void main(String[] args) {

		SynchronizedPrinter printer = new SynchronizedPrinter();

		// Use the same printer object in both threads
		MyThread t1 = new MyThread(printer);
		MyThread t2 = new MyThread(printer);

		// Start the threads t1 and t2
		System.out.println("Start thread1");
		t1.start();
		System.out.println("Start thread2");
		t2.start();
	}
}
