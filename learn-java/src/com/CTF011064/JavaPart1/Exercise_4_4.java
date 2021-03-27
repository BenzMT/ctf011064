package com.CTF011064.JavaPart1;

import java.util.Scanner;

public class Exercise_4_4 {
	public static void main(String[] args) {
		// Lab 6 While Loop
		// 1
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// 2
		int sum = 0;
		int num = 1;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);

		// 3
		i = 1;
		while (i <= 100) {
			if (i % 12 == 0)
				System.out.println(i);
			i++;
		}

		// 4
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int j : arr) {
			System.out.println(j);
		}

		// Lab 7 Do While Loop
		// 1
		i = 20;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);

		// 2
		Scanner in = new Scanner(System.in);
		int val;

		do {
			System.out.println("Enter an integer number: ");
			val = in.nextInt();
		} while (val % 2 != 1);
		System.out.println("Quit the loop");

		// Lab 8 Break & For
		for (int count = 1; count <= 20; count++) {
			if (count == 11) {
				System.out.println(count);
				break;
			}
			System.out.println("Outer = " + count);
		}
	}
}