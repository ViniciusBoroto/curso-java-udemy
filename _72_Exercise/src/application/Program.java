package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollares will be bought? ");
		double productPrice = sc.nextDouble();
		
		System.out.printf("Amout to be paid in reais = %.2f", CurrencyConverter.convert(dollarPrice, productPrice, 6.00));
		
		
		sc.close();
	}

}
