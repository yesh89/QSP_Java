package com.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\HP-PC\\eclipse-workspace\\QSP_Java\\Test_pgms\\src\\example.txt";
		File textFile = new File(fileName);
		try {
			Scanner in = new Scanner(textFile);
			String value = in.nextLine();
			System.out.println(value);
			in.nextLine();
			int count = 1;
			while(in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(count+":"+line);
				count++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
