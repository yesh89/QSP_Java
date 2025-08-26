package com.test1;

enum Animal {
	CAT, DOG, MOUSE;
}

public class Demo11 {
	public static void main(String[] args) {
		Animal animal = Animal.DOG;
		switch (animal) {

		case DOG:
			System.out.println("DOG Barks");
			break;
		case CAT:
			System.out.println("Cat meows");
			break;
		case MOUSE:
			System.out.println("Mouse squeaks");
			break;
			default:
			break;
		}
		System.out.println(Animal.CAT);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.MOUSE instanceof Animal);
//		System.out.println(Animal.MOUSE.getName());
		
	}
}
