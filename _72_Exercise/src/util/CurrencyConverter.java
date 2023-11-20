package util;

public class CurrencyConverter {

	public static double convert(double currencyPrice, double productPrice, double taxPercentage) {
		double priceAfterTax = productPrice * (1 + taxPercentage/100);
		return priceAfterTax * currencyPrice;
	}
	
}
