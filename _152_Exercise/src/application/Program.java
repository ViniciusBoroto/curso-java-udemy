package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		String s_birth = sc.next();
		Date birthDate = sdf.parse(s_birth);
		System.out.println("");
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		String status = sc.next();
		System.out.println();
		Order order = new Order(new Date(), status);
		
		System.out.println("How many items to this order? ");
		int itemsQty = sc.nextInt();
		System.out.println();
		for (int i = 0; i < itemsQty; i++) {
			System.out.println("Enter #" + i + 1 + " item data: ");
			System.out.println("Product name: ");
			String prodName = sc.nextLine();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.println();
			System.out.println("Quantity: ");
			int qty = sc.nextInt();
			Product product = new Product(prodName, price);
			OrderItem orderItem = new OrderItem(qty, product.getPrice());
			order.addItem(orderItem);
		}
		System.out.println(order);
		
		sc.close();
	}

}
