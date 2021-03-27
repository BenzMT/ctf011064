package com.CTF011064.JavaPart1;

public class Exercise_4_5 {
	public static void main(String[] args) {
		// Lab 9 Continue & For
		for (int count = 1; count <= 20; count++) {
			if (count == 11) {
				System.out.println(count);
				continue;
			}
			System.out.println("Outer = " + count);
		}

		//	Lab 10 Continue
		int i = 0;

		while (i < 20) {
			i++;
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}