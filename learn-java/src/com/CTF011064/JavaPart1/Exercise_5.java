package com.CTF011064.JavaPart1;

public class Exercise_5 {
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		greeting("Benz");
	}
	// Return Method
	public static int sum(int int1, int int2) {
		return int1 + int2;
	}
	// Non-return Method
	public static void greeting(String name) {
		System.out.println("I'm " + name + ", nice to meet cha! :)");
	}
}