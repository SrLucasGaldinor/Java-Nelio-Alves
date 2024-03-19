package services;

import entities.Triangle;

public class Show {
	public void showTheAreaAndPerimeterOfTheTriangle(Triangle triangle) {
		System.out.printf("Perimeter %s: %.3f%n", triangle.getCode(), triangle.perimeter);
		System.out.printf("Area %s: %.3f%n", triangle.getCode(), triangle.area);
		System.out.println();
	}
}
