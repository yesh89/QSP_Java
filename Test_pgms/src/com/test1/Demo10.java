package com.test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo10 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\HP-PC\\eclipse-workspace\\QSP_Java\\Test_pgms\\src\\file.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("This is line one");
			bw.newLine();
			bw.write("This is line two");
			bw.newLine();
			bw.write("This is last line");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}
}
