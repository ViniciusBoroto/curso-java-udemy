package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char r = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (r == 'c') {
				System.out.print("number of employees: ");
				int employeeQty = sc.nextInt();
				payers.add(new LegalPerson(name, annualIncome, employeeQty));
			} else {
				System.out.print("Health Expenditures: ");
				double HealthExpenditures = sc.nextDouble();
				payers.add(new NaturalPerson(name, annualIncome, HealthExpenditures));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for (Person p : payers) {
			System.out.println(String.format("%s: $ %.2f", p.getName(), p.tax()));
			totalTaxes += p.tax();
		}
		System.out.println();
		System.out.println(String.format("TOTAL TAXES: $ %.2f", totalTaxes));
		
		sc.close();
	}

}
