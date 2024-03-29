package services;

import entities.Account;
import entities.Triangle;

public class Show {
	public static void showTheAreaAndPerimeterOfTheTriangle(Triangle triangle) {
		System.out.printf("Perimeter %s: %.3f%n", triangle.getCode(), triangle.perimeter);
		System.out.printf("Area %s: %.3f%n", triangle.getCode(), triangle.area);
		System.out.println();
	}

	public static void showAccountData(Account account) {
		if (account.getNumbersDeposit() == 0) {
			System.out.printf(account.toString());
		} else {
			System.out.printf(account.toStringUpdated());
		}
	}
}
