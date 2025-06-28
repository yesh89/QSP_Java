package com.abstraction;

interface Car {
	void startEngine();

	void accelerate();

	void changeGears();

	void applyBrakes();

	void stopEngine();
}

class Benz implements Car {
	public void startEngine() {
		System.out.println("Benz car started");
	}

	public void accelerate() {
		System.out.println("Car is accelerating");
	}

	@Override
	public void changeGears() {
		System.out.println("Car Gears changed");
	}

	public void applyBrakes() {
		System.out.println("Car Brakes are being applied");
	}

	public void stopEngine() {
		System.out.println("Car engines stopped");
	}
}

class MyCar {
	static Benz getCar() {
		return new Benz();
	}

}

public class RunAbstraction {
	public static void main(String[] args) {
		System.out.println("Program starts");
		Car car = MyCar.getCar();
		car.startEngine();
		car.accelerate();
		car.changeGears();
		car.applyBrakes();
		car.stopEngine();
		System.out.println("Program ends");
	}
}
