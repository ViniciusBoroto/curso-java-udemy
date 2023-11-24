

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> idList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		List<Double> salaryList = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int employeesQuantity = sc.nextInt();

		for (int i = 0; i < employeesQuantity; i++) {
			System.out.println("Employee #" + i + ": ");

			System.out.println("Id: ");
			idList.add(sc.nextInt());

			System.out.println("Name: ");
			sc.nextLine();
			nameList.add(sc.nextLine());

			System.out.println("Salary: ");
			salaryList.add(sc.nextDouble());
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idToSearch;
		idToSearch = sc.nextInt();
		
		Integer employeeIndex =  idList.indexOf(idToSearch);
		
		if (employeeIndex == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double increasePercentage = sc.nextDouble();
			salaryList.set(employeeIndex, salaryList.get(employeeIndex) * increasePercentage / 100);	
		}
		
		System.out.println("List of employees: ");
		for (int i = 0; i < idList.size(); i++) {
			System.out.printf("%d, %s, %.2f", idList.get(i), nameList.get(i), salaryList.get(i));
		}
		
		
		sc.close();

	}

}
