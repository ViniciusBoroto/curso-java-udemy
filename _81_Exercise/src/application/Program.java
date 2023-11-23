package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number;
		char initialDeposit;
		String holder;
		double deposit;
		BankAccount bankAccount;
		
		System.out.println("Enter account number: ");
		number = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter account holder: ");
		holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)?");
		initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y' || initialDeposit == 'Y') {
			System.out.println("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			bankAccount = new BankAccount(number, holder, deposit);
		}
		else {
			bankAccount = new BankAccount(number, holder);
		}
		
		System.out.println();
		System.out.println("Acount data:");
		System.out.println(bankAccount.toString());
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		bankAccount.deposit(sc.nextDouble());
		System.out.println("Updated acount data:");
		System.out.println(bankAccount.toString());

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		bankAccount.withdraw(sc.nextDouble());
		System.out.println("Updated acount data:");
		System.out.println(bankAccount.toString());

		
		sc.close();
	}

}
