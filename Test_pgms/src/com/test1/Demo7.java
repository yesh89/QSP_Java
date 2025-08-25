package com.test1;

class Machine {

	public void start() {
		System.out.println("Machine started");
	}

}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class Demo7 {
	public static void main(String[] args) {
		Machine mach = new Machine();
		mach.start();
		Camera cam = new Camera();
		cam.start();
		cam.snap();

		System.out.println("//////////");
		// Upcasting
		Machine m1 = new Camera();
		m1.start();

		// Downcasting

		Camera c = (Camera) m1;
		c.start();
		c.snap();

	}
}
