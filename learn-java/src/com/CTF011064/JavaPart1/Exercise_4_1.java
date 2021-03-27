package com.CTF011064.JavaPart1;

public class Exercise_4_1 {
	public static void main(String[] args) {

		// 1
		int score = 75;

		if (score >= 80) {
			System.out.println("Good");
		} else if ((score >= 50) || (score < 80)) {
			System.out.println("Normal");
		} else if (score < 50) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid!!");
		}

		// 2
		boolean isHandsome = true;
		
		if (isHandsome == true) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if ((score >= 50) || (score < 80)) {
				System.out.println("Normal");
			} else if (score < 50) {
				System.out.println("Fail");
			} else {
				System.out.println("Invalid!!");
			}
		}
	}
}