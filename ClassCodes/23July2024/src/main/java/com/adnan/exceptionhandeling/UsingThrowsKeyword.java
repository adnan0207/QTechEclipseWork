package com.adnan.exceptionhandeling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException {



		dummy();

	}

	public static void dummy() throws FileNotFoundException {

		PrintWriter out = new PrintWriter("abc.txt");
		out.println("Hello");


	}

}
