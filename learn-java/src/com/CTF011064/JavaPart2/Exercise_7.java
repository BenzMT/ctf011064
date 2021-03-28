package com.CTF011064.JavaPart2;

public class Exercise_7 {
	public static void main(String[] args) {
		String string1 = "You and Me";
		String string2 = " you and me ";

		// 1
		if (string1.equals(string2)) {
			System.out.println("String1 equals to String2");
		} else {
			System.out.println("String1 doesn't equal to String2");
		}

		// 2
		String string3 = "and";
		if (string1.contains(string3)) {
			System.out.println("It contains " + "\"" + string3 + "\"");
		} else {
			System.out.println("It dosen't contain " + "\"" + string3 + "\"");
		}

		// 3
		System.out.println(string2.length());

		// 4
		System.out.println(string1.substring(0, 4));

		// 5
		System.out.println(string2.trim());

		// 7
		System.out.println(string1.toUpperCase());

		// 6 Method Chaining
		System.out.println(string2.trim().toUpperCase());
	}
}
