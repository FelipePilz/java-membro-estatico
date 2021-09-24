package util;

public class CurrencyConverter {
	public static final double IOF = 0.06; //Taxa IOF sobre o valor do dolar
	
	public static double amountReais(double dollarPrice, double dollarAmount) {
		return (dollarPrice * dollarAmount) * IOF + dollarPrice * dollarAmount;
	}
}
