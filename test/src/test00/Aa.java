package test00;

import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.println(i);
			}
		}

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.println(i);
			}
		}

		int myAge = 50;

		if (myAge >= 40) {
			System.out.println("40대");
		} else if (myAge >= 30) {
			System.out.println("30대");
		} else if (myAge >= 20) {
			System.out.println("20대");
		} else if (myAge >= 10) {
			System.out.println("10대");
		} else {
			System.out.println("아가");
		}

		int max = 5;
		for (int i = 1; i <= max; i++) {
			if (i < max) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}
		
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			if (i != 5) {
				System.out.print(",");
			} else {
				System.out.println();
			}
		}
		
		int num = 32;
		if(num>=40) {
			System.out.println("40대");
		}else {
			if(num>=30) {
				System.out.println("30대");
			}else {
				if(num>=20) {
					System.out.println("20대");
				}
			}
			
		}
		
	
		
		


	}
}
