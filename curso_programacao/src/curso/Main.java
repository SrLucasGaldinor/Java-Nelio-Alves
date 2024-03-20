package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Triangle;
import services.CurrencyConverter;
import services.Show;

public class Main {

	public static void main(String[] args) {
//		atividadeI();
//		atividadeII();
//		atividadeIII();
//		atividadeVI();
		atividadeV();
	}

	public static void atividadeI() {
		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf(
				"Product:%n%s, which price is $ %.2f%n%s, which price is %.2f%n%n"
						+ "Record: %d years old, code %d and gender: %s%n%nMeasure with "
						+ "eight decimal places: %.8f%nRouded (three decimal places): %.3f%n",
				product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

	public static void atividadeII() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

	public static void atividadeIII() {

		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		x.setCode("X");
		y.setCode("Y");

		System.out.println("Enter the measure of the Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measure of the Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		x.calculatePerimeter();
		y.calculatePerimeter();
		x.calculateAreaOfTheTriangle();
		y.calculateAreaOfTheTriangle();
		Show.showTheAreaAndPerimeterOfTheTriangle(x);
		Show.showTheAreaAndPerimeterOfTheTriangle(y);
		sc.close();
	}

	public static void atividadeVI() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollar = sc.nextDouble();
		
		double totalValue = CurrencyConverter.converterDollar(dollar, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", totalValue);
		
	}
	
	public static void atividadeV() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int id = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		
		Account acc = new Account(id, holder);

		System.out.println("Is there an initial deposit? (1-Yes) (2-No)");
		int option = sc.nextInt();
		
		if (option == 1) {
			System.out.println("Enter initial deposit value: ");
			acc.deposit(sc.nextDouble(), acc);
		}
		
		System.out.println("Enter a deposit value: ");
		acc.deposit(sc.nextDouble(), acc);
		
		System.out.println("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble(), acc);
		
		System.out.printf("Deposit numbers made: %d", acc.getNumbersDeposit());
		sc.close();
	}
}
