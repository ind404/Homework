package com.bayamp;

public class Hello {
	// Data Members (global variables)
	static int age = 20;
	int yourAge = 50;

	// what is method overloading
	// what is the
	public static void main() {
		age = 50;
		System.out.println("main with no args :" + age);
		// call the main method that takes int as an arguemnt
		
	}

	public static void mainTheProgram(int x) {
		System.out.println("main with int args :" + age);
		System.out.println("main with int args :" + x);
		main();
	}

	public static void main(String[] myargs) {
		System.out.println("main with array of strings : " + age);
		mainTheProgram(20);

	}

		void main(int[] myargs) {
			System.out.println("main with array of strings");

		}



}
