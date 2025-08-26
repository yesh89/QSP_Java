package com.inheritance;

class Vehicle {

	int noOfTyres;
	int noOfGears;

	Vehicle(int noOfTyres, int noOfGears) {
		this.noOfTyres = noOfTyres;
		this.noOfGears = noOfGears;
	}
}

class Bike extends Vehicle {
	String bikeName;

	Bike(int noOfTyres, int noOfGears, String bikeName) {
		super(noOfTyres, noOfGears);
		this.noOfTyres = noOfTyres;
		this.noOfGears = noOfGears;
		this.bikeName = bikeName;
	}

	public void displayBikeDetails() {
		System.out.println(
				"Bike Name" + ":" + bikeName + " " + "Tyres" + ":" + noOfTyres + " " + "Gears" + ":" + noOfGears);
	}

}

class Car extends Vehicle {
	String carName;

	Car(int noOfTyres, int noOfGears, String carName) {
		super(noOfTyres, noOfGears);
		this.noOfTyres = noOfTyres;
		this.noOfGears = noOfGears;
		this.carName = carName;
	}

	public void displayCarDetails() {
		System.out.println(
				"Car Name" + ":" + carName + " " + "Tyres" + ":" + noOfTyres + " " + "Gears" + ":" + noOfGears);
	}
}

public class RunVehicle {

	public static void main(String[] args) {
		Bike bk = new Bike(2, 5, "Royal Enfield");
		bk.displayBikeDetails();

		Car cr = new Car(4, 5, "Toyota HyRyder");
		cr.displayCarDetails();

	}

}
