package com.bptn.course.knowledge_check._02_week_practices;

public class Vehicle {

	// declare instance variables- color and brand
	String color;
	String brand;

	Vehicle() {

		this("Black", "Tesla");
	}

	// add parameterized constructor

	Vehicle(String color, String brand) {

		this.color = color;
		this.brand = brand;
	}

	// Do not modify this code as we have parameters that pass the test case
	public static void main(String[] args) {
		Car car = new Car("White", "Audi", "Chromecoloured");
		Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
		System.out.println(car.color + " " + car.brand + " " + car.steeringWheel);
		System.out.println(bike.color + " " + bike.brand + " " + bike.bikeHandle);

	}

}

class Car extends Vehicle {

	String steeringWheel;

	Car(String color, String brand, String steeringWheel) {

		super(color, brand);
		this.steeringWheel = steeringWheel;
	}

}

class Bike extends Vehicle {

	String bikeHandle;

	Bike(String color, String brand, String bikeHandle) {

		super(color, brand);
		this.bikeHandle = bikeHandle;
	}

}
