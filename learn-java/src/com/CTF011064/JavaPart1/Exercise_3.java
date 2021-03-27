package com.CTF011064.JavaPart1;

public class Exercise_3 {
	public static void main(String[] args) {
		int i = 20;
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println("Final result of increment = " + i);

		System.out.println(--i);
		System.out.println(--i);
		System.out.println(--i);
		System.out.println(--i);
		System.out.println(--i);
		System.out.println("Final result of decrement = " + i);

		float val1 = 2.5f;
		float val2 = 3.0f;
		System.out.println((val1 == val2) && (val1 != val2));

		char letter1 = 'a';
		char letter2 = 'A';
		System.out.println((letter1 == letter2) || (letter1 != letter2));
	}
}