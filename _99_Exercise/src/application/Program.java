package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Integer> idList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		List<Double> salaryList = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int employeesQuantity = sc.nextInt();

		for (int i = 0; i < employeesQuantity; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.println("Id: ");
			idList.add(sc.nextInt());

			System.out.println("Name: ");
			sc.nextLine();
			nameList.add(sc.nextLine());

			System.out.println("Salary: ");
			salaryList.add(sc.nextDouble());
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idToSearch = sc.nextInt();
		
		int employeeIndex =  idList.indexOf(idToSearch);
		
		if (employeeIndex == -1) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double increasePercentage = sc.nextDouble();
			salaryList.set(employeeIndex, salaryList.get(employeeIndex) * (1 + increasePercentage / 100));	
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (int i = 0; i < idList.size(); i++) {
			System.out.printf("%d, %s, %.2f%n", idList.get(i), nameList.get(i), salaryList.get(i));
		}
		
		
		sc.close();

	}

}
