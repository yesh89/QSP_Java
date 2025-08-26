package com.test1;

//Multi Dimensional Array
public class Demo4 {
	public static void main(String[] args) {
		int[] numbers = { 4, 0, 3, 6, 2, 7, 9 };
		System.out.println(numbers[2]);
		int[][] grid = { { 3, 5, 2343 }, { 2, 4 }, { 1, 2, 3, 4 } };
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		String[][] texts = new String[2][3];
		texts[0][1] = "hello there";
		System.out.println(texts[0][1]);
		System.out.println(grid.length);
		System.out.println("******************************");
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
