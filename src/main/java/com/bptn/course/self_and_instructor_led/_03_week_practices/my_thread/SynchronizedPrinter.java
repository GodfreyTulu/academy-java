package com.bptn.course.self_and_instructor_led._03_week_practices.my_thread;

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

