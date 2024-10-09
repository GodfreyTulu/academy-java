package com.bptn.course.teachbacks._02_week_static;

/*
 * STATIC METHODS.
 *
 * A static method - is a method that belongs to the class rather than any specific instance of the class. 
 * It can be called using the class name without creating an object, and it can only access other static methods
 * or variables. 
 * Static methods are typically used for utility functions that are shared across all instances.
 * 
 */

public class BankAccount {

	// Declares attributes.
	private String accountHolderName;
	private double balance;
	private static double serviceCharge = 0.01; // Static variable for interest rate (1%)

	// Initializes parameterized constructor
	public BankAccount(String accountHolderName, double initialBalance) {
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
	}

	// Getters and Setters generated.
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getServiceCharge() {
		return serviceCharge;
	}

	public static void setServiceCharge(double serviceCharge) {
		BankAccount.serviceCharge = serviceCharge;
	}

	// Method to deposit money
	public void deposit(double amount) {
		balance = balance + amount; // Add the amount to the balance
		System.out.println(amount + " deposited. New balance: " + balance);
	}

	// Method to withdraw money
	public void withdraw(double amount) {
		balance = balance - amount; // Deduct the amount from the balance
		System.out.println(amount + " withdrawn. New balance: " + balance);
	}

	// Static method to calculate interest on a given amount
	public static double calculateCharge(double amount) {
		return amount * serviceCharge; // Calculates service charge based on the static service charge rate.
	}

	// Main method to test the BankAccount class
	public static void main(String[] args) {
		// Create new bank accounts
		BankAccount account1 = new BankAccount("Alice", 1000);

		// Performs transactions
		account1.deposit(200);
		account1.withdraw(150);

		// Calculate and display interest account
		double serviceChargeForAccount1 = BankAccount.calculateCharge(account1.balance);

		System.out.println("Service Charge on Alice's account: " + serviceChargeForAccount1);

	}
}
