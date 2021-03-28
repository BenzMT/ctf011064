package com.CTF011064.JavaPart2;

public class Exercise_8 {
	public static void main(String[] args) {
		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 1
		for (int[] i : arr2D) {
			for (int j : i) {
				System.out.println(j);
			}
		}

		// 2
		int sum = 0;
		for (int[] i : arr2D) {
			sum += i[i.length - 1];
		}
		System.out.println(sum);
	}
}