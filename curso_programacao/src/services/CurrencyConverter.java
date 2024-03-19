package services;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	public static double converterDollar(double dollarQuantity, double dollarPrice) {
		double value = dollarQuantity * dollarPrice;
		return value * IOF + value;
	}
}
