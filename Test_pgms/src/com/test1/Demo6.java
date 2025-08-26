package com.test1;

class Plant {
	void grow() {
		System.out.println("Plant is growing");
	}
}

class Tree extends Plant {
	public void grow() {
		System.out.println("Tree is growing");
	}

	public void shedLeaves() {
		System.out.println("Tree sheds leaves");
	}
}

public class Demo6 {
	public static void main(String[] args) {
		Plant plant = new Plant();
		plant.grow();

		Tree tree1 = new Tree();
		tree1.grow();
		tree1.shedLeaves();

		Plant pl1 = new Tree();
		pl1.grow();
	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
