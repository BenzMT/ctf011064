package com.CTF011064.JavaPart1;

public class Exercise_2_2 {

	public static void bark() {
		String dogName = "Rocky";
		System.out.println("The Dog name = " + dogName + " bark");
	}

	public static void main(String[] args) {
		bark();

		int myIntNum = 100;
		float newFloatNum = (float) myIntNum;
		System.out.println("myIntNum is " + myIntNum + ", newFloatNum is " + newFloatNum);

		float myFloatNum = 12.5f;
		float newIntNum = (int) myFloatNum;
		System.out.println("myFloatNum is " + myFloatNum + ", newIntNum is " + newIntNum);

		double myDouble = 500000000;
		float newFloat = (float) myDouble;
		System.out.println("myDouble is " + myDouble + ", newFloat is " + newFloat);

		char myChar = 'B';
		int newInt = (int) myChar;
		System.out.println("myChar is " + myChar + ", newInt is " + newInt);
		
		final String hello = "Hello";
		hello = "World";
	}

}