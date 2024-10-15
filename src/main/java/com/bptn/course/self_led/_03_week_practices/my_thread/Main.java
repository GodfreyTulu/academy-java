package com.bptn.course.self_led._03_week_practices.my_thread;

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


